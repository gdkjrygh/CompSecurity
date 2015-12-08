// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.nuance.b.e.a.a;
import com.nuance.b.e.a.b;
import com.nuance.b.e.a.d;
import com.nuance.b.e.a.e;
import com.nuance.b.e.a.f;
import com.nuance.b.e.a.g;
import com.nuance.b.e.a.h;
import com.nuance.b.e.aa;
import com.nuance.b.e.c;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.dominos.nina.persona:
//            NinaView, NinaHintsAdapter, Typefaces

public final class DominosNinaPersona
    implements b
{

    private static final String LOGTAG = "DominosNinaPersona";
    private static final int MAX_WAIT_EXIT_ANIMATION_MS = 700;
    private static final int MAX_WAIT_START_ANIMATION_MS = 700;
    private static final int MS_SHOW_RECOGNIZED_TEXT = 1000;
    private static final int NINA_VIEW_ANIMATION_DURATION_MS = 350;
    private static final int TIME_SHOW_ERROR_MESSAGE_BEFORE_EXIT_MS = 3000;
    private static AtomicInteger instanceCount = new AtomicInteger(0);
    private final ViewGroup agencyViewLocation;
    private final AtomicReference currentMode = new AtomicReference();
    private AtomicBoolean destroyed;
    private int errorCount;
    private final int errorCountLimit = 3;
    private CountDownLatch finishedLatch;
    private final FrameLayout hintsContainer;
    private final ListView legacyHintsView;
    private final aa nina = c.m();
    private final NinaView ninaView;
    private final ViewGroup ninaViewContainer;
    final android.view.ViewGroup.LayoutParams ninaViewContainerParams = new android.view.ViewGroup.LayoutParams(-1, -1);
    WeakReference ninaViewParentReference;
    private NoiseHeardHandler noiseHeardHandler;
    private boolean preventFocusReset;
    private final AtomicBoolean startedFinishing = new AtomicBoolean(false);
    private CountDownLatch startedLatch;
    private final AtomicBoolean startedLeavingWithError = new AtomicBoolean(false);
    private final Handler uiThreadHandler = new Handler(Looper.getMainLooper());
    private boolean userStoppedPrompts;
    private CountDownLatch waitForUserLatch;

    public DominosNinaPersona(Context context)
    {
        startedLatch = new CountDownLatch(1);
        finishedLatch = new CountDownLatch(1);
        userStoppedPrompts = false;
        waitForUserLatch = null;
        ninaViewParentReference = null;
        destroyed = new AtomicBoolean(false);
        ninaViewContainer = new _cls1(context);
        int i = instanceCount.getAndIncrement();
        if (i > 0)
        {
            Log.w("DominosNinaPersona", (new StringBuilder("Detected multiple instances (")).append(i).append(")").toString());
        }
        LayoutInflater layoutinflater = LayoutInflater.from(context);
        ninaViewContainer.addView(layoutinflater.inflate(R.layout.nina_dominos_persona, null));
        ninaViewContainer.setVisibility(4);
        legacyHintsView = new ListView(context);
        hintsContainer = (FrameLayout)ninaViewContainer.findViewById(R.id.nina_hints);
        ninaView = (NinaView)ninaViewContainer.findViewById(R.id.nina_view);
        ninaView.setNinaViewListener(new PersonaNinaViewListener());
        agencyViewLocation = (ViewGroup)ninaViewContainer.findViewById(R.id.nina_agency_frame);
        NinaHintsAdapter.initializeListView(legacyHintsView);
        legacyHintsView.setOnItemClickListener(new _cls2());
        i = ninaView.getHandleHeight();
        context = (android.widget.FrameLayout.LayoutParams)agencyViewLocation.getLayoutParams();
        context.bottomMargin = i;
        agencyViewLocation.setLayoutParams(context);
        setMode(e.a);
    }

    private void doCloseAnimation(final Runnable onAnimationFinished)
    {
        onAnimationFinished = new Thread(new _cls4());
        onAnimationFinished.setName("ReferenceNinaPersona.doCloseAnimation");
        onAnimationFinished.start();
    }

    private void doOpenAnimation(final Runnable onAnimationFinished)
    {
        TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, ninaView.getHandleHeight(), 0.0F);
        translateanimation.setDuration(350L);
        translateanimation.setAnimationListener(new _cls3());
        ninaView.setAnimation(translateanimation);
        Log.d("DominosNinaPersona", "Open animation set.");
    }

    private boolean errorPrompt(List list, List list1)
    {
        return prompt(list, list1, NinaView.PromptTypes.ALERT, false);
    }

    private String getPromptMessage(List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                String s = (String)list.next();
                if (s != null)
                {
                    stringbuilder.append(s);
                    stringbuilder.append("\n");
                }
            } while (true);
        }
        return stringbuilder.toString().trim();
    }

    private String getStringResource(int i)
    {
        return nina.q().getString(i);
    }

    private void handleError()
    {
        nina.d(getStringResource(R.string.nina_unrecoverable_error_message));
    }

    private CountDownLatch playSound(int i)
    {
        CountDownLatch countdownlatch = new CountDownLatch(1);
        nina.a(i, countdownlatch);
        return countdownlatch;
    }

    private boolean prompt(List list, List list1, NinaView.PromptTypes prompttypes, boolean flag)
    {
        list1 = getPromptMessage(list1);
        ninaView.prompt(list1, prompttypes, flag);
        if (list != null && list.size() > 0)
        {
            list1 = new CountDownLatch(1);
            userStoppedPrompts = false;
            Log.d("DominosNinaPersona", "Playing voice prompts...");
            nina.a(list, list1);
            Log.d("DominosNinaPersona", "Waiting for voice prompts to finish playing...");
            list1.await();
            Log.d("DominosNinaPersona", "Voice prompts finished playing");
        }
        return !userStoppedPrompts;
    }

    private boolean prompt(List list, List list1, boolean flag)
    {
        NinaView.PromptTypes prompttypes;
        if (flag)
        {
            prompttypes = NinaView.PromptTypes.ALERT;
        } else
        {
            prompttypes = NinaView.PromptTypes.NORMAL;
        }
        return prompt(list, list1, prompttypes, true);
    }

    private CountDownLatch recognitionComplete(h h1, int i)
    {
        String s = "";
        if (h1 instanceof f)
        {
            s = ((f)h1).c();
        }
        h1 = new CountDownLatch(0);
        if (i >= 0)
        {
            h1 = playSound(i);
        }
        ninaView.processingComplete(s);
        if (s != null && s.length() > 0)
        {
            delay(1000L);
        }
        return h1;
    }

    private boolean removeFromParentIfNecessary(Object obj)
    {
        if (ninaViewParentReference == null || ninaViewParentReference.get() != obj)
        {
            ninaViewParentReference = new WeakReference(obj);
            obj = (ViewGroup)ninaViewContainer.getParent();
            if (obj != null)
            {
                ((ViewGroup) (obj)).removeView(ninaViewContainer);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public final void addErrorCount()
    {
        errorCount = errorCount + 1;
    }

    public final void attachContentView(Activity activity)
    {
        if (removeFromParentIfNecessary(activity))
        {
            activity.addContentView(ninaViewContainer, ninaViewContainerParams);
        }
    }

    public final void attachContentView(ViewGroup viewgroup)
    {
        if (removeFromParentIfNecessary(viewgroup))
        {
            viewgroup.addView(ninaViewContainer, ninaViewContainerParams);
        }
    }

    public final void changeHints(final List hints)
    {
        uiThreadHandler.post(new _cls5());
    }

    public final boolean delay(long l)
    {
        try
        {
            Thread.sleep(l);
        }
        catch (InterruptedException interruptedexception)
        {
            Log.w("DominosNinaPersona", "Interrupted while sleeping.");
            return false;
        }
        return true;
    }

    public final void destroy()
    {
        Log.d("DominosNinaPersona", "Destroying...");
        if (!destroyed.getAndSet(true))
        {
            instanceCount.decrementAndGet();
        }
        NinaView ninaview = ninaView;
        if (ninaview != null)
        {
            ninaview.destroy();
        }
        Typefaces.recycle();
    }

    public final void dismiss()
    {
        Log.d("DominosNinaPersona", "NinaPersona.dismiss()");
        if (startedFinishing.getAndSet(true))
        {
            Log.w("DominosNinaPersona", "NinaPersona.dismiss(): Already finishing, abort.");
            return;
        } else
        {
            doCloseAnimation(null);
            return;
        }
    }

    public final void dismissWithError(String s)
    {
        Log.i("DominosNinaPersona", "Leaving Nina with error.");
        if (startedLeavingWithError.getAndSet(true))
        {
            Log.w("DominosNinaPersona", "NinaActivity.leaveNinaWithError(): Already leaving with an error, abort.");
            return;
        }
        if (!startedLatch.await(700L, TimeUnit.MILLISECONDS))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        ninaView.toLimbo(s);
        try
        {
            Thread.sleep(3000L);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                Log.w("DominosNinaPersona", "Interrupted while sleeping to have prompt error show.");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.w("DominosNinaPersona", "Interrupted while waiting for Nina.");
            }
        }
_L1:
        dismiss();
        return;
        Log.e("DominosNinaPersona", (new StringBuilder("Nina didn't start in time to be able to show the error message: ")).append(s).toString());
          goto _L1
    }

    public final void displayHints()
    {
        ninaView.raiseHints();
    }

    public final void enable(boolean flag)
    {
    }

    public final int getErrorCount()
    {
        return errorCount;
    }

    public final int getErrorCountLimit()
    {
        return 3;
    }

    public final boolean handleBackPress()
    {
        if (ninaView.isOpened())
        {
            ninaView.animateClose();
        } else
        if (!ninaView.isMoving())
        {
            return false;
        }
        return true;
    }

    public final void hideHints()
    {
        ninaView.closeHints();
    }

    public final boolean isErrorCountLimitReached()
    {
        return errorCount >= 3;
    }

    public final boolean isPreventFocusReset()
    {
        return preventFocusReset;
    }

    public final void pause()
    {
        Log.d("DominosNinaPersona", "Pausing...");
        ninaView.pause();
    }

    public final void registerNoiseHeardHandler(NoiseHeardHandler noiseheardhandler)
    {
        noiseHeardHandler = noiseheardhandler;
    }

    public final void reportAudioEnergyLevel$558c7aa6(int i, float f1)
    {
        ninaView.setVolumeIntensity(f1);
    }

    public final void reportNinaEvent(d d1)
    {
        switch (_cls7..SwitchMap.com.nuance.nina.ui.persona.NinaPersona.NinaEvents[d1.ordinal()])
        {
        default:
            Log.d("DominosNinaPersona", (new StringBuilder("reportNinaEvent: Nothing to do for event ")).append(d1).toString());
            // fall through

        case 6: // '\006'
            return;

        case 1: // '\001'
            playSound(R.raw.start_dictation);
            return;

        case 2: // '\002'
            ninaView.prepareToListen();
            playSound(R.raw.start_listening);
            return;

        case 3: // '\003'
            playSound(R.raw.start_listening);
            return;

        case 4: // '\004'
            ninaView.toListening();
            return;

        case 5: // '\005'
            ninaView.toProcessing();
            break;
        }
    }

    public final boolean reportResult(h h1)
    {
        if (h1 == null)
        {
            throw new NullPointerException("resultObject may not be null");
        }
        this;
        JVM INSTR monitorenter ;
        CountDownLatch countdownlatch;
        boolean flag;
        countdownlatch = new CountDownLatch(0);
        flag = h1.d();
        if (!(h1 instanceof f)) goto _L2; else goto _L1
_L1:
        f f1;
        f1 = (f)h1;
        Log.d("DominosNinaPersona", (new StringBuilder("recognitionResult type: ")).append(f1.b()).toString());
        _cls7..SwitchMap.com.nuance.nina.ui.persona.RecognitionResultObject.RecognitionType[f1.b().ordinal()];
        JVM INSTR tableswitch 1 2: default 272
    //                   1 198
    //                   2 210;
           goto _L2 _L3 _L4
_L2:
        Log.d("DominosNinaPersona", "Waiting for soundLatch...");
        countdownlatch.await();
        Log.d("DominosNinaPersona", "soundLatch complete");
        if (!(h1 instanceof a)) goto _L6; else goto _L5
_L5:
        flag = errorPrompt(h1.f(), h1.e());
_L7:
        Log.d("DominosNinaPersona", "prompt complete");
        if (h1 instanceof a)
        {
            Log.e("DominosNinaPersona", (new StringBuilder("Error reported to NinaPersona: ")).append(h1.a()).toString());
            handleError();
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        countdownlatch = recognitionComplete(h1, R.raw.successful_recognition);
          goto _L2
_L4:
        countdownlatch = recognitionComplete(h1, R.raw.nomatch);
        flag = true;
          goto _L2
_L6:
        flag = prompt(h1.f(), h1.e(), flag);
          goto _L7
        h1;
        Log.i("DominosNinaPersona", "Interrupted while waiting in recognitionComplete()");
        nina.o();
        this;
        JVM INSTR monitorexit ;
        return false;
        h1;
        this;
        JVM INSTR monitorexit ;
        throw h1;
          goto _L2
    }

    public final void requestTextInput()
    {
    }

    public final void resetErrorCount()
    {
        errorCount = 0;
    }

    public final void resume()
    {
        Log.d("DominosNinaPersona", "Resuming...");
        ninaView.resume();
    }

    public final void setAgencyView(final View v)
    {
        if (v == null || v != agencyViewLocation.getChildAt(0))
        {
            uiThreadHandler.post(new _cls6());
        }
    }

    public final void setClickFilter(boolean flag)
    {
        ninaViewContainer.setClickable(flag);
    }

    public final void setDisposition(Enum enum)
    {
    }

    public final void setMode(e e1)
    {
        if (!e1.equals((e)currentMode.getAndSet(e1)))
        {
            ninaView.setMode(e1);
        }
    }

    public final void setPreventFocusReset(boolean flag)
    {
        preventFocusReset = flag;
    }

    public final void show()
    {
        ninaView.reset();
        finishedLatch.countDown();
        finishedLatch = new CountDownLatch(1);
        startedLeavingWithError.set(false);
        startedFinishing.set(false);
        ninaViewContainer.setVisibility(0);
        doOpenAnimation(null);
    }

    public final void waitForDismissComplete()
    {
        finishedLatch.await();
    }

    public final void waitForStartingComplete()
    {
        startedLatch.await();
    }

    public final void waitForUser(String s, CountDownLatch countdownlatch)
    {
        boolean flag;
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        waitForUserLatch = countdownlatch;
        ninaView.toSleep(s);
        if (flag && noiseHeardHandler != null)
        {
            noiseHeardHandler.handleNoiseHeard();
        }
    }

    public final void waitForUser(CountDownLatch countdownlatch)
    {
        waitForUserLatch = countdownlatch;
        ninaView.toSleep();
    }






/*
    static boolean access$1102(DominosNinaPersona dominosninapersona, boolean flag)
    {
        dominosninapersona.userStoppedPrompts = flag;
        return flag;
    }

*/



/*
    static CountDownLatch access$202(DominosNinaPersona dominosninapersona, CountDownLatch countdownlatch)
    {
        dominosninapersona.startedLatch = countdownlatch;
        return countdownlatch;
    }

*/








    private class _cls1 extends FrameLayout
    {

        final DominosNinaPersona this$0;

        public void onDetachedFromWindow()
        {
            super.onDetachedFromWindow();
            ninaViewParentReference = null;
        }

        _cls1(Context context)
        {
            this$0 = DominosNinaPersona.this;
            super(context);
        }
    }


    private class PersonaNinaViewListener
        implements NinaView.NinaViewListener
    {

        final DominosNinaPersona this$0;

        public void cancelInterpretation()
        {
            nina.u();
        }

        public void exit()
        {
            nina.r();
        }

        public void interpret(String s)
        {
            nina.c(s);
        }

        public void stopListening()
        {
            nina.w();
        }

        public void stopPrompts()
        {
            userStoppedPrompts = true;
            nina.o();
        }

        public void wakeUp()
        {
            if (currentMode.get() != e.a) goto _L2; else goto _L1
_L1:
            nina.v();
_L4:
            if (waitForUserLatch != null)
            {
                waitForUserLatch.countDown();
            }
            return;
_L2:
            if (currentMode.get() == e.c)
            {
                ((c)nina).d();
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        PersonaNinaViewListener()
        {
            this$0 = DominosNinaPersona.this;
            super();
        }
    }


    private class _cls2
        implements android.widget.AdapterView.OnItemClickListener
    {

        final DominosNinaPersona this$0;

        public void onItemClick(final AdapterView parent, View view, final int position, long l)
        {
            class _cls1
                implements Runnable
            {

                final _cls2 this$1;
                final AdapterView val$parent;
                final int val$position;

                public void run()
                {
                    ninaView.closeHints();
                    nina.n();
                    String s = (String)parent.getItemAtPosition(position);
                    nina.b(s);
                }

                _cls1()
                {
                    this$1 = _cls2.this;
                    parent = adapterview;
                    position = i;
                    super();
                }
            }

            (new Thread(new _cls1())).start();
        }

        _cls2()
        {
            this$0 = DominosNinaPersona.this;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final DominosNinaPersona this$0;
        final Runnable val$onAnimationFinished;

        private Animation getAnimation()
        {
            int i = ninaView.getAnimationHeight();
            if (i == 0)
            {
                return new TranslateAnimation(0, 0.0F, 0, 0.0F, 2, 0.0F, 2, 1.0F);
            } else
            {
                return new TranslateAnimation(0.0F, 0.0F, 0.0F, i);
            }
        }

        private void runCloseAnimation()
        {
            Animation animation;
            animation = getAnimation();
            animation.setDuration(350L);
            class _cls1
                implements android.view.animation.Animation.AnimationListener
            {

                final _cls4 this$1;

                public void onAnimationEnd(Animation animation1)
                {
                    Log.d("DominosNinaPersona", "Exit animation ended.");
                    finishedLatch.countDown();
                    ninaViewContainer.setVisibility(4);
                }

                public void onAnimationRepeat(Animation animation1)
                {
                }

                public void onAnimationStart(Animation animation1)
                {
                    Log.d("DominosNinaPersona", "Exit animation started.");
                }

                _cls1()
                {
                    this$1 = _cls4.this;
                    super();
                }
            }

            animation.setAnimationListener(new _cls1());
            if (!startedLatch.await(700L, TimeUnit.MILLISECONDS))
            {
                break MISSING_BLOCK_LABEL_185;
            }
            ninaView.setAnimation(animation);
            class _cls2
                implements Runnable
            {

                final _cls4 this$1;

                public void run()
                {
                    agencyViewLocation.removeAllViews();
                    ninaView.invalidate();
                }

                _cls2()
                {
                    this$1 = _cls4.this;
                    super();
                }
            }

            uiThreadHandler.post(new _cls2());
            Log.d("DominosNinaPersona", "Exit animation set.");
            try
            {
                if (!finishedLatch.await(700L, TimeUnit.MILLISECONDS))
                {
                    Log.w("DominosNinaPersona", "Exit animation took too long.  Just closing.");
                    finishedLatch.countDown();
                }
            }
            catch (InterruptedException interruptedexception)
            {
                try
                {
                    Log.w("DominosNinaPersona", "Interrupted while waiting for exit animation to finish.");
                }
                catch (InterruptedException interruptedexception1)
                {
                    Log.e("DominosNinaPersona", "Interrupted while waiting for start animation to finish before starting close animation.");
                }
            }
_L1:
            startedLatch.countDown();
            startedLatch = new CountDownLatch(1);
            if (onAnimationFinished != null)
            {
                onAnimationFinished.run();
            }
            return;
            Log.i("DominosNinaPersona", "Skipping close animation because start animation didn't finish in time.");
            finishedLatch.countDown();
              goto _L1
        }

        public void run()
        {
            runCloseAnimation();
        }

        _cls4()
        {
            this$0 = DominosNinaPersona.this;
            onAnimationFinished = runnable;
            super();
        }
    }


    private class _cls3
        implements android.view.animation.Animation.AnimationListener
    {

        final DominosNinaPersona this$0;
        final Runnable val$onAnimationFinished;

        public void onAnimationEnd(Animation animation)
        {
            Log.d("DominosNinaPersona", "Start animation finished.");
            startedLatch.countDown();
            if (onAnimationFinished != null)
            {
                (new Thread(onAnimationFinished)).start();
            }
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
            Log.d("DominosNinaPersona", "Start animation started.");
        }

        _cls3()
        {
            this$0 = DominosNinaPersona.this;
            onAnimationFinished = runnable;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final LayoutInflater inflater;
        final DominosNinaPersona this$0;
        final List val$hints;

        public void run()
        {
            boolean flag = false;
            hintsContainer.removeAllViews();
            if (hints.size() <= 0)
            {
                break MISSING_BLOCK_LABEL_398;
            }
            Object obj = (String)hints.get(0);
            if ('{' != ((String) (obj)).charAt(0))
            {
                break MISSING_BLOCK_LABEL_398;
            }
            Object obj1;
            Object obj2;
            JSONArray jsonarray;
            TextView textview;
            int i;
            try
            {
                obj1 = new JSONObject(((String) (obj)));
                obj = inflater.inflate(R.layout.nina_dominos_hints, hintsContainer, false);
                ((TextView)((View) (obj)).findViewById(R.id.nina_hints_title_text)).setText(((JSONObject) (obj1)).getString("title"));
                ((TextView)((View) (obj)).findViewById(R.id.nina_hints_task_header_text)).setText(((JSONObject) (obj1)).getString("task_header"));
                obj2 = (LinearLayout)((View) (obj)).findViewById(R.id.nina_hints_task_contents_container);
                jsonarray = ((JSONObject) (obj1)).optJSONArray("task_content");
            }
            catch (JSONException jsonexception)
            {
                Log.w("DominosNinaPersona", "JSONException parsing hints");
                return;
            }
            if (jsonarray == null) goto _L2; else goto _L1
_L1:
            if (jsonarray.length() <= 0) goto _L2; else goto _L3
_L3:
            i = 0;
_L5:
            if (i >= jsonarray.length())
            {
                break; /* Loop/switch isn't completed */
            }
            textview = (TextView)inflater.inflate(R.layout.nina_dominos_hint_item, ((ViewGroup) (obj2)), false);
            textview.setText(jsonarray.getString(i));
            ((LinearLayout) (obj2)).addView(textview);
            i++;
            if (true) goto _L5; else goto _L4
_L2:
            ((LinearLayout) (obj2)).setVisibility(8);
_L4:
            ((TextView)((View) (obj)).findViewById(R.id.nina_hints_nav_header_text)).setText(((JSONObject) (obj1)).getString("nav_header"));
            obj2 = (LinearLayout)((View) (obj)).findViewById(R.id.nina_hints_nav_contents_container);
            jsonarray = ((JSONObject) (obj1)).optJSONArray("nav_content");
            if (jsonarray == null) goto _L7; else goto _L6
_L6:
            if (jsonarray.length() <= 0) goto _L7; else goto _L8
_L8:
            i = ((flag) ? 1 : 0);
_L10:
            if (i >= jsonarray.length())
            {
                break; /* Loop/switch isn't completed */
            }
            textview = (TextView)inflater.inflate(R.layout.nina_dominos_hint_item, ((ViewGroup) (obj2)), false);
            textview.setText(jsonarray.getString(i));
            ((LinearLayout) (obj2)).addView(textview);
            i++;
            if (true) goto _L10; else goto _L9
_L7:
            ((LinearLayout) (obj2)).setVisibility(8);
_L9:
            obj2 = (TextView)((View) (obj)).findViewById(R.id.nina_hints_footer_text);
            obj1 = ((JSONObject) (obj1)).optString("footer");
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_356;
            }
            if (!"".equals(obj1))
            {
                break MISSING_BLOCK_LABEL_380;
            }
            ((View) (obj)).findViewById(R.id.nina_hints_footer_container).setVisibility(8);
_L12:
            hintsContainer.addView(((View) (obj)));
            return;
            ((TextView) (obj2)).setText(((CharSequence) (obj1)));
            if (true) goto _L12; else goto _L11
_L11:
            NinaHintsAdapter ninahintsadapter = new NinaHintsAdapter(legacyHintsView.getContext(), new ArrayList(hints));
            legacyHintsView.setAdapter(ninahintsadapter);
            hintsContainer.addView(legacyHintsView);
            return;
        }

        _cls5()
        {
            this$0 = DominosNinaPersona.this;
            hints = list;
            super();
            inflater = LayoutInflater.from(ninaView.getContext());
        }
    }


    private class _cls7
    {

        static final int $SwitchMap$com$nuance$nina$ui$persona$NinaPersona$NinaEvents[];
        static final int $SwitchMap$com$nuance$nina$ui$persona$RecognitionResultObject$RecognitionType[];

        static 
        {
            $SwitchMap$com$nuance$nina$ui$persona$RecognitionResultObject$RecognitionType = new int[g.values().length];
            try
            {
                $SwitchMap$com$nuance$nina$ui$persona$RecognitionResultObject$RecognitionType[g.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$nuance$nina$ui$persona$RecognitionResultObject$RecognitionType[g.c.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$nuance$nina$ui$persona$RecognitionResultObject$RecognitionType[g.b.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            $SwitchMap$com$nuance$nina$ui$persona$NinaPersona$NinaEvents = new int[d.values().length];
            try
            {
                $SwitchMap$com$nuance$nina$ui$persona$NinaPersona$NinaEvents[d.h.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$nuance$nina$ui$persona$NinaPersona$NinaEvents[d.a.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$nuance$nina$ui$persona$NinaPersona$NinaEvents[d.f.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$nuance$nina$ui$persona$NinaPersona$NinaEvents[d.b.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$nuance$nina$ui$persona$NinaPersona$NinaEvents[d.j.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$nuance$nina$ui$persona$NinaPersona$NinaEvents[d.k.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls6
        implements Runnable
    {

        final DominosNinaPersona this$0;
        final View val$v;

        public void run()
        {
            agencyViewLocation.removeAllViews();
            if (v != null)
            {
                agencyViewLocation.addView(v);
            }
        }

        _cls6()
        {
            this$0 = DominosNinaPersona.this;
            v = view;
            super();
        }
    }


    private class NoiseHeardHandler
    {

        public abstract void handleNoiseHeard();
    }

}
