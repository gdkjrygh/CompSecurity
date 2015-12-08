// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.nuance.b.e.a.e;

// Referenced classes of package com.dominos.nina.persona:
//            NinaAnimatedIcon, Typefaces, NinaVoiceBioView, NinaView

public class NinaBar extends ViewGroup
{

    private final DictationListeningHandler dictationListeningHandler;
    final android.widget.SlidingDrawer.OnDrawerCloseListener drawerCloseListener;
    final android.widget.SlidingDrawer.OnDrawerOpenListener drawerOpenListener;
    private final int editLeftMargin;
    private boolean editVisible;
    private boolean editing;
    private final int gripImageHeight;
    private final int gripImageWidth;
    private final int gripMeasurementHeight;
    final int handleHeight;
    private final View hintsGripBottom;
    private final View hintsGripTop;
    private final InputMethodManager inputMethodManager;
    private boolean listening;
    private boolean locked;
    private final NinaAnimatedIcon ninaAnimatedIcon;
    private final EditText ninaEdit;
    private final String ninaEditHintEditing;
    private String ninaEditHintNormal;
    private final String ninaEditHintShowingHints;
    private final String ninaPromptAsleep;
    private final String ninaPromptWaking;
    private final TextView ninaText;
    NinaView ninaView;
    private e personaMode;
    private final ProcessingStatusHandler processingStatusHandler;
    private boolean prompting;
    private final int rightMargin;
    private boolean sleeping;
    private final int textLeftMargin;
    private final NinaVoiceBioView voiceBioView;

    public NinaBar(Context context)
    {
        this(context, null);
    }

    public NinaBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NinaBar(final Context context, final AttributeSet r, int i)
    {
        super(context, r, i);
        drawerOpenListener = new _cls1();
        drawerCloseListener = new _cls2();
        processingStatusHandler = new ProcessingStatusHandler();
        dictationListeningHandler = new DictationListeningHandler();
        r = getResources();
        ninaEditHintNormal = r.getString(R.string.nina_edit_hint_normal);
        ninaEditHintEditing = r.getString(R.string.nina_edit_hint_editing);
        ninaEditHintShowingHints = r.getString(R.string.nina_edit_hint_showing_hints);
        ninaPromptAsleep = r.getString(R.string.nina_prompt_asleep);
        ninaPromptWaking = r.getString(R.string.nina_prompt_waking);
        rightMargin = r.getDimensionPixelOffset(R.dimen.nina_bar_right_margin);
        textLeftMargin = r.getDimensionPixelOffset(R.dimen.nina_bar_text_left_margin);
        editLeftMargin = r.getDimensionPixelOffset(R.dimen.nina_bar_edit_left_margin);
        setBackgroundColor(r.getColor(R.color.nina_bar_background));
        i = r.getIdentifier(r.getString(R.string.nina_view_grip_ref), "drawable", context.getPackageName());
        final _cls4 listenerRunnableListeningAborted = BitmapFactory.decodeResource(getResources(), i);
        gripImageHeight = listenerRunnableListeningAborted.getHeight();
        gripImageWidth = listenerRunnableListeningAborted.getWidth();
        listenerRunnableListeningAborted.recycle();
        hintsGripTop = new View(getContext());
        hintsGripTop.setBackgroundResource(i);
        addView(hintsGripTop);
        hintsGripBottom = new _cls3(getContext());
        hintsGripBottom.setBackgroundResource(i);
        addView(hintsGripBottom);
        listenerRunnableListeningAborted = new _cls4();
        final _cls5 listenerRunnableListeningStopped = new _cls5();
        final _cls6 listenerRunnableImpatientUser = new _cls6();
        ninaAnimatedIcon = new NinaAnimatedIcon(getContext());
        addView(ninaAnimatedIcon);
        gripMeasurementHeight = r.getDimensionPixelSize(R.dimen.nina_view_grip_height);
        handleHeight = gripMeasurementHeight + ninaAnimatedIcon.iconHeight;
        ninaText = new TextView(getContext());
        ninaText.setGravity(16);
        ninaText.setTypeface(Typefaces.get(context, Typefaces.Id.TEXT_VIEW));
        float f = r.getDimension(R.dimen.nina_bar_text_size);
        ninaText.setTextSize(0, f);
        i = r.getColor(R.color.nina_text_color);
        ninaText.setTextColor(i);
        android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-1, -1);
        ninaText.setLayoutParams(layoutparams);
        addView(ninaText);
        inputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
        ninaEdit = new _cls7(getContext());
        ninaEdit.addTextChangedListener(new _cls8());
        i = r.getColor(R.color.nina_edit_text_color_editing);
        ninaEdit.setTextColor(i);
        i = r.getColor(R.color.nina_edit_text_color_hint);
        ninaEdit.setHintTextColor(i);
        ninaEdit.setImeOptions(6);
        ninaEdit.setSingleLine(false);
        addView(ninaEdit);
        voiceBioView = new NinaVoiceBioView(getContext());
        voiceBioView.setVisibility(4);
        addView(voiceBioView);
        ninaEdit.setOnEditorActionListener(new _cls9());
        ninaEdit.setOnFocusChangeListener(new _cls10());
        setOnFocusChangeListener(new _cls11());
        setOnTouchListener(new _cls12());
    }

    private void displayEditHint(String s)
    {
        ninaEdit.setText("");
        ninaEdit.setHint(s);
    }

    private void focusAndShowSoftInputWindow()
    {
        requestFocus();
        inputMethodManager.showSoftInput(ninaEdit, 0);
    }

    private void hideEdit()
    {
        if (editVisible)
        {
            Animation animation = ninaEdit.getAnimation();
            if (animation == null || animation.hasEnded())
            {
                int i = getResources().getInteger(R.integer.nina_bar_edit_hide_show_animation_duration);
                AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
                alphaanimation.setDuration(i);
                alphaanimation.setAnimationListener(new _cls14());
                ninaEdit.startAnimation(alphaanimation);
            }
        }
    }

    private void hideSoftInputWindow()
    {
        inputMethodManager.hideSoftInputFromWindow(ninaEdit.getApplicationWindowToken(), 2);
        ninaEdit.setFocusable(false);
    }

    private void showEdit()
    {
        ninaEdit.setAnimation(null);
        editVisible = true;
        ninaEdit.setVisibility(0);
        ninaText.setText("");
    }

    private void stateCleanup()
    {
        sleeping = false;
        listening = false;
        prompting = false;
        editing = false;
        processingStatusHandler.stop();
        dictationListeningHandler.stop();
    }

    private void toStopping()
    {
        listening = false;
        ninaAnimatedIcon.toLimbo();
        hintsGripTop.setVisibility(4);
        ninaEdit.setFocusable(false);
        (new Thread(new _cls20())).start();
    }

    private void toWaking()
    {
        sleeping = false;
        ninaAnimatedIcon.toLimbo();
        ninaText.setText(ninaPromptWaking);
    }

    void cleanupEdit()
    {
        ninaEdit.clearFocus();
        ninaEdit.setText("");
        hideSoftInputWindow();
        editing = false;
    }

    void destroy()
    {
        processingStatusHandler.stop();
        dictationListeningHandler.stop();
        Handler handler = getHandler();
        if (handler != null)
        {
            handler.removeCallbacksAndMessages(null);
        }
        ninaAnimatedIcon.destroy();
        voiceBioView.destroy();
        ninaView = null;
    }

    boolean isEditing()
    {
        return editing;
    }

    void lock()
    {
        locked = true;
        post(new _cls16());
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ninaEdit.setBackgroundColor(getResources().getColor(R.color.nina_text_color));
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (flag)
        {
            j = getContext().getResources().getDimensionPixelSize(R.dimen.nina_bar_text_layout_margin_bottom);
            l = k - i;
            i = l - gripImageWidth >> 1;
            hintsGripTop.layout(i, 0, gripImageWidth + i, gripImageHeight + 0);
            k = gripImageHeight + 0;
            ninaAnimatedIcon.layout(0, k, ninaAnimatedIcon.iconWidth, ninaAnimatedIcon.iconHeight + k);
            l -= rightMargin;
            ninaEdit.layout(ninaAnimatedIcon.iconWidth, k, l, j + ((ninaAnimatedIcon.iconHeight + k) - k));
            ninaText.layout(ninaAnimatedIcon.iconWidth + textLeftMargin, k, l, ninaAnimatedIcon.iconHeight + k);
            voiceBioView.getClass();
            j = ninaAnimatedIcon.iconHeight + 0 >> 1;
            voiceBioView.layout(ninaAnimatedIcon.iconWidth, k + j, l, j + k + 0);
            j = ninaAnimatedIcon.iconHeight + k;
            hintsGripBottom.layout(i, j, gripImageWidth + i, gripImageHeight + j);
        }
    }

    protected void onMeasure(int i, int j)
    {
        i = android.view.View.MeasureSpec.getSize(i);
        int k = i - ninaAnimatedIcon.iconWidth - rightMargin;
        j = android.view.View.MeasureSpec.makeMeasureSpec(ninaAnimatedIcon.iconHeight, 0x40000000);
        int l = android.view.View.MeasureSpec.makeMeasureSpec(k - textLeftMargin, 0x40000000);
        measureChild(ninaText, l, j);
        k = android.view.View.MeasureSpec.makeMeasureSpec(k - editLeftMargin, 0x40000000);
        measureChild(ninaEdit, k, j);
        setMeasuredDimension(i, handleHeight + gripMeasurementHeight);
    }

    void pause()
    {
        ninaAnimatedIcon.pause();
        voiceBioView.pause();
    }

    void prepareToListen()
    {
    }

    void processingComplete(final String resultText)
    {
        stateCleanup();
        ninaAnimatedIcon.processingComplete();
        post(new _cls24());
    }

    void prompt(final String prompt, boolean flag)
    {
        stateCleanup();
        prompting = true;
        if (flag)
        {
            ninaAnimatedIcon.alert();
        } else
        {
            ninaAnimatedIcon.prompt();
        }
        post(new _cls18());
    }

    void reset()
    {
        stateCleanup();
        editVisible = false;
        ninaAnimatedIcon.reset();
        post(new _cls15());
    }

    void resume()
    {
        ninaAnimatedIcon.resume();
        voiceBioView.resume();
    }

    public void setCustomHint(String s)
    {
        ninaEditHintNormal = s;
    }

    void setMode(final e mode)
    {
        personaMode = mode;
        post(new _cls13());
    }

    void setVolumeIntensity(float f)
    {
        ninaAnimatedIcon.setVolumeIntensity(f);
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }

    void toLimbo(final String prompt)
    {
        stateCleanup();
        ninaAnimatedIcon.toLimbo();
        post(new _cls21());
    }

    void toListening()
    {
        stateCleanup();
        listening = true;
        ninaAnimatedIcon.toListening();
        voiceBioView.fadeRestore();
        post(new _cls23());
    }

    void toProcessing()
    {
        stateCleanup();
        ninaAnimatedIcon.toProcessing();
        if (e.a == personaMode)
        {
            processingStatusHandler.reset();
            processingStatusHandler.start();
        }
        post(new _cls22());
    }

    void toSleep()
    {
        toSleep(ninaPromptAsleep);
    }

    void toSleep(final String message)
    {
        stateCleanup();
        sleeping = true;
        ninaAnimatedIcon.toSleep();
        post(new _cls19());
    }

    void unlock()
    {
        locked = false;
        post(new _cls17());
    }



/*
    static boolean access$002(NinaBar ninabar, boolean flag)
    {
        ninabar.listening = flag;
        return flag;
    }

*/





/*
    static boolean access$1102(NinaBar ninabar, boolean flag)
    {
        ninabar.editing = flag;
        return flag;
    }

*/






/*
    static boolean access$1502(NinaBar ninabar, boolean flag)
    {
        ninabar.editVisible = flag;
        return flag;
    }

*/




















    private class _cls1
        implements android.widget.SlidingDrawer.OnDrawerOpenListener
    {

        final NinaBar this$0;

        public void onDrawerOpened()
        {
            if (listening)
            {
                ninaAnimatedIcon.hintsRaised();
            }
            hintsGripTop.setVisibility(4);
            if (!inputMethodManager.isActive(ninaEdit))
            {
                ninaEdit.setHint(ninaEditHintShowingHints);
            }
        }

        _cls1()
        {
            this$0 = NinaBar.this;
            super();
        }
    }


    private class _cls2
        implements android.widget.SlidingDrawer.OnDrawerCloseListener
    {

        final NinaBar this$0;

        public void onDrawerClosed()
        {
            ninaAnimatedIcon.popAnimSet();
            if (!locked)
            {
                hintsGripTop.setVisibility(0);
            }
            if (!inputMethodManager.isActive(ninaEdit))
            {
                ninaEdit.setHint(ninaEditHintNormal);
            }
        }

        _cls2()
        {
            this$0 = NinaBar.this;
            super();
        }
    }


    private class ProcessingStatusHandler
        implements Runnable
    {

        private int index;
        private final int messageDelay;
        private final String messages[];
        private final AtomicBoolean running = new AtomicBoolean(false);
        final NinaBar this$0;

        void reset()
        {
            index = 0;
        }

        public void run()
        {
            this;
            JVM INSTR monitorenter ;
            int i = index;
            if (messages.length > i)
            {
                ninaEdit.setHint(messages[i]);
            }
            index = index + 1;
            if (running.get() && messages.length > index)
            {
                postDelayed(this, messageDelay);
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        void start()
        {
            this;
            JVM INSTR monitorenter ;
            if (!running.getAndSet(true))
            {
                post(this);
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        void stop()
        {
            this;
            JVM INSTR monitorenter ;
            if (running.getAndSet(false))
            {
                removeCallbacks(this);
            }
            reset();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        ProcessingStatusHandler()
        {
            this$0 = NinaBar.this;
            super();
            ninabar = getResources();
            messages = getStringArray(R.array.nina_processing_edit_hints);
            messageDelay = getInteger(R.integer.nina_processing_status_delay);
            reset();
        }
    }


    private class DictationListeningHandler
        implements Runnable
    {

        private int cycle;
        private final int delay;
        private final AtomicBoolean running = new AtomicBoolean(false);
        private final String text;
        final NinaBar this$0;

        void reset()
        {
            cycle = 0;
        }

        public void run()
        {
            this;
            JVM INSTR monitorenter ;
            StringBuilder stringbuilder;
            cycle = cycle & 3;
            stringbuilder = new StringBuilder(text);
            int i = 0;
_L2:
            if (i >= cycle)
            {
                break; /* Loop/switch isn't completed */
            }
            stringbuilder.append('.');
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            cycle = cycle + 1;
            ninaText.setText(stringbuilder.toString());
            if (running.get())
            {
                postDelayed(this, delay);
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        void start()
        {
            this;
            JVM INSTR monitorenter ;
            if (!running.getAndSet(true))
            {
                post(this);
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        void stop()
        {
            this;
            JVM INSTR monitorenter ;
            if (running.getAndSet(false))
            {
                removeCallbacks(this);
            }
            reset();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        DictationListeningHandler()
        {
            this$0 = NinaBar.this;
            super();
            ninabar = getResources();
            text = getString(R.string.nina_dictation_listening_text);
            delay = getInteger(R.integer.nina_dictation_listening_text_animation_delay);
            reset();
        }
    }


    private class _cls3 extends View
    {

        final float cx;
        final float cy;
        final NinaBar this$0;

        public void draw(Canvas canvas)
        {
            canvas.scale(1.0F, -1F, cx, cy);
            super.draw(canvas);
        }

        _cls3(Context context)
        {
            this$0 = NinaBar.this;
            super(context);
            cx = gripImageWidth >> 1;
            cy = gripImageHeight >> 1;
        }
    }


    private class _cls4
        implements Runnable
    {

        final NinaBar this$0;

        public void run()
        {
            if (ninaView.listener != null)
            {
                ninaView.listener.cancelInterpretation();
            }
        }

        _cls4()
        {
            this$0 = NinaBar.this;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final NinaBar this$0;

        public void run()
        {
            if (ninaView.listener != null)
            {
                ninaView.listener.stopListening();
            }
        }

        _cls5()
        {
            this$0 = NinaBar.this;
            super();
        }
    }


    private class _cls6
        implements Runnable
    {

        final NinaBar this$0;

        public void run()
        {
            if (ninaView.listener != null)
            {
                ninaView.listener.stopPrompts();
            }
        }

        _cls6()
        {
            this$0 = NinaBar.this;
            super();
        }
    }


    private class _cls7 extends EditText
    {

        private Animation detachAnimation;
        final NinaBar this$0;

        protected void onAttachedToWindow()
        {
            if (getAnimation() == null)
            {
                if (detachAnimation != null)
                {
                    detachAnimation.reset();
                }
                setAnimation(detachAnimation);
            }
            if (editing)
            {
                focusAndShowSoftInputWindow();
            }
            super.onAttachedToWindow();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorinfo)
        {
            InputConnection inputconnection = super.onCreateInputConnection(editorinfo);
            editorinfo.imeOptions = editorinfo.imeOptions & 0xbfffffff;
            return inputconnection;
        }

        protected void onDetachedFromWindow()
        {
            detachAnimation = getAnimation();
            super.onDetachedFromWindow();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyevent)
        {
            if (4 == i && 1 == keyevent.getAction())
            {
                editing = false;
                clearFocus();
                toSleep();
            }
            return super.onKeyPreIme(i, keyevent);
        }

        public boolean onTouchEvent(MotionEvent motionevent)
        {
            if (editing)
            {
                return super.onTouchEvent(motionevent);
            } else
            {
                return false;
            }
        }

        _cls7(Context context)
        {
            this$0 = NinaBar.this;
            super(context);
            detachAnimation = null;
        }
    }


    private class _cls8
        implements TextWatcher
    {

        final float editTextSizeEditing;
        final float editTextSizeHint;
        final Typeface editTextStyleEditing;
        final Typeface editTextStyleHint;
        final NinaBar this$0;
        final Context val$context;
        final Resources val$r;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            if (charsequence.length() == 0)
            {
                ninaEdit.setTextSize(0, editTextSizeHint);
                ninaEdit.setTypeface(editTextStyleHint);
            } else
            if (j == 0)
            {
                ninaEdit.setTextSize(0, editTextSizeEditing);
                ninaEdit.setTypeface(editTextStyleEditing);
                return;
            }
        }

        _cls8()
        {
            this$0 = NinaBar.this;
            r = resources;
            context = context1;
            super();
            editTextSizeEditing = r.getDimension(R.dimen.nina_edit_text_size_editing);
            editTextStyleEditing = Typefaces.get(context, Typefaces.Id.EDIT_TEXT_EDITING);
            editTextSizeHint = r.getDimension(R.dimen.nina_edit_text_size_hint);
            editTextStyleHint = Typefaces.get(context, Typefaces.Id.EDIT_TEXT_HINT);
        }
    }


    private class _cls9
        implements android.widget.TextView.OnEditorActionListener
    {

        final NinaBar this$0;

        public boolean onEditorAction(final TextView string, int i, KeyEvent keyevent)
        {
            string = string.getText().toString();
            cleanupEdit();
            class _cls1
                implements Runnable
            {

                final _cls9 this$1;
                final String val$string;

                public void run()
                {
                    if (ninaView.listener != null)
                    {
                        ninaView.listener.interpret(string);
                    }
                }

                _cls1()
                {
                    this$1 = _cls9.this;
                    string = s;
                    super();
                }
            }

            (new Thread(new _cls1())).start();
            return true;
        }

        _cls9()
        {
            this$0 = NinaBar.this;
            super();
        }
    }


    private class _cls10
        implements android.view.View.OnFocusChangeListener
    {

        final NinaBar this$0;
        final Runnable val$listenerRunnableListeningAborted;

        public void onFocusChange(View view, boolean flag)
        {
            if (flag && !editing)
            {
                editing = true;
                listening = false;
                ninaAnimatedIcon.toEditing();
                ninaEdit.setHint(ninaEditHintEditing);
                focusAndShowSoftInputWindow();
                (new Thread(listenerRunnableListeningAborted)).start();
            } else
            if (!flag && inputMethodManager.isActive(ninaEdit))
            {
                cleanupEdit();
                return;
            }
        }

        _cls10()
        {
            this$0 = NinaBar.this;
            listenerRunnableListeningAborted = runnable;
            super();
        }
    }


    private class _cls11
        implements android.view.View.OnFocusChangeListener
    {

        final NinaBar this$0;

        public void onFocusChange(View view, boolean flag)
        {
            if (flag)
            {
                hideSoftInputWindow();
            }
        }

        _cls11()
        {
            this$0 = NinaBar.this;
            super();
        }
    }


    private class _cls12
        implements android.view.View.OnTouchListener
    {

        final Runnable listenerRunnableWakeup = new _cls1();
        final Rect rect = new Rect();
        final NinaBar this$0;
        final Runnable val$listenerRunnableImpatientUser;
        final Runnable val$listenerRunnableListeningStopped;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            boolean flag1;
            boolean flag2;
            flag1 = true;
            flag2 = true;
            if (1 != motionevent.getAction()) goto _L2; else goto _L1
_L1:
            view = rect;
            ninaEdit.getHitRect(view);
            if (view.contains((int)motionevent.getX(), (int)motionevent.getY()) && editVisible)
            {
                ninaEdit.setFocusableInTouchMode(true);
                ninaEdit.requestFocus();
            }
            if (personaMode != e.b && personaMode != e.c) goto _L4; else goto _L3
_L3:
            if (!sleeping) goto _L6; else goto _L5
_L5:
            boolean flag;
            (new Thread(listenerRunnableWakeup)).start();
            flag = flag2;
_L8:
            flag1 = flag;
            if (flag)
            {
                requestFocus();
                flag1 = flag;
            }
_L2:
            return flag1;
_L6:
            if (listening)
            {
                (new Thread(listenerRunnableListeningStopped)).start();
                flag = flag2;
            } else
            {
                flag = flag2;
                if (prompting)
                {
                    (new Thread(listenerRunnableImpatientUser)).start();
                    flag = flag2;
                }
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (!locked)
            {
                flag = flag2;
                if (!editing)
                {
                    if (sleeping)
                    {
                        (new Thread(listenerRunnableWakeup)).start();
                        toWaking();
                        flag = flag2;
                    } else
                    if (listening)
                    {
                        (new Thread(listenerRunnableListeningStopped)).start();
                        toStopping();
                        flag = flag2;
                    } else
                    {
                        flag = flag2;
                        if (prompting)
                        {
                            (new Thread(listenerRunnableImpatientUser)).start();
                            flag = flag2;
                        }
                    }
                }
            } else
            {
                flag = false;
            }
            if (true) goto _L8; else goto _L7
_L7:
        }

        _cls12()
        {
            this$0 = NinaBar.this;
            listenerRunnableListeningStopped = runnable;
            listenerRunnableImpatientUser = runnable1;
            super();
            class _cls1
                implements Runnable
            {

                final _cls12 this$1;

                public void run()
                {
                    if (ninaView.listener != null)
                    {
                        ninaView.listener.wakeUp();
                    }
                }

                _cls1()
                {
                    this$1 = _cls12.this;
                    super();
                }
            }

        }
    }


    private class _cls14
        implements android.view.animation.Animation.AnimationListener
    {

        final NinaBar this$0;

        public void onAnimationEnd(Animation animation)
        {
            ninaEdit.setVisibility(4);
            editVisible = false;
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        _cls14()
        {
            this$0 = NinaBar.this;
            super();
        }
    }


    private class _cls20
        implements Runnable
    {

        final NinaBar this$0;

        public void run()
        {
            ninaView.superLock();
        }

        _cls20()
        {
            this$0 = NinaBar.this;
            super();
        }
    }


    private class _cls16
        implements Runnable
    {

        final NinaBar this$0;

        public void run()
        {
            hintsGripTop.setVisibility(4);
            ninaEdit.setFocusable(false);
        }

        _cls16()
        {
            this$0 = NinaBar.this;
            super();
        }
    }


    private class _cls24
        implements Runnable
    {

        final NinaBar this$0;
        final String val$resultText;

        public void run()
        {
            switch (_cls25..SwitchMap.com.nuance.nina.ui.persona.NinaPersona.NinaPersonaMode[personaMode.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                ninaView.close();
                showEdit();
                ninaEdit.setText(resultText);
                return;

            case 2: // '\002'
                voiceBioView.setVisibility(0);
                break;
            }
            voiceBioView.fadeOut();
            ninaText.setVisibility(0);
            ninaText.setText(resultText);
        }

        _cls24()
        {
            this$0 = NinaBar.this;
            resultText = s;
            super();
        }

        private class _cls25
        {

            static final int $SwitchMap$com$nuance$nina$ui$persona$NinaPersona$NinaPersonaMode[];

            static 
            {
                $SwitchMap$com$nuance$nina$ui$persona$NinaPersona$NinaPersonaMode = new int[e.values().length];
                try
                {
                    $SwitchMap$com$nuance$nina$ui$persona$NinaPersona$NinaPersonaMode[e.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$nuance$nina$ui$persona$NinaPersona$NinaPersonaMode[e.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$nuance$nina$ui$persona$NinaPersona$NinaPersonaMode[e.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }


    private class _cls18
        implements Runnable
    {

        final NinaBar this$0;
        final String val$prompt;

        public void run()
        {
            _cls25..SwitchMap.com.nuance.nina.ui.persona.NinaPersona.NinaPersonaMode[personaMode.ordinal()];
            JVM INSTR tableswitch 1 2: default 36
        //                       1 51
        //                       2 71;
               goto _L1 _L2 _L3
_L1:
            ninaText.setText(prompt);
            return;
_L2:
            ninaView.close();
            hideEdit();
            continue; /* Loop/switch isn't completed */
_L3:
            voiceBioView.setVisibility(4);
            voiceBioView.blank();
            ninaText.setVisibility(0);
            if (true) goto _L1; else goto _L4
_L4:
        }

        _cls18()
        {
            this$0 = NinaBar.this;
            prompt = s;
            super();
        }
    }


    private class _cls15
        implements Runnable
    {

        final NinaBar this$0;

        public void run()
        {
            ninaView.close();
            ninaEdit.setVisibility(4);
            displayEditHint(ninaEditHintNormal);
        }

        _cls15()
        {
            this$0 = NinaBar.this;
            super();
        }
    }


    private class _cls13
        implements Runnable
    {

        final NinaBar this$0;
        final e val$mode;

        public void run()
        {
            switch (_cls25..SwitchMap.com.nuance.nina.ui.persona.NinaPersona.NinaPersonaMode[mode.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                ninaAnimatedIcon.setDictationMode(false);
                voiceBioView.setVisibility(4);
                return;

            case 2: // '\002'
                ninaAnimatedIcon.setDictationMode(false);
                ninaEdit.setVisibility(4);
                lock();
                return;

            case 3: // '\003'
                ninaAnimatedIcon.setDictationMode(true);
                break;
            }
            voiceBioView.setVisibility(4);
            hideEdit();
            lock();
        }

        _cls13()
        {
            this$0 = NinaBar.this;
            mode = e1;
            super();
        }
    }


    private class _cls21
        implements Runnable
    {

        final NinaBar this$0;
        final String val$prompt;

        public void run()
        {
            _cls25..SwitchMap.com.nuance.nina.ui.persona.NinaPersona.NinaPersonaMode[personaMode.ordinal()];
            JVM INSTR tableswitch 1 2: default 36
        //                       1 51
        //                       2 71;
               goto _L1 _L2 _L3
_L1:
            ninaText.setText(prompt);
            return;
_L2:
            ninaView.close();
            hideEdit();
            continue; /* Loop/switch isn't completed */
_L3:
            voiceBioView.setVisibility(4);
            voiceBioView.blank();
            if (true) goto _L1; else goto _L4
_L4:
        }

        _cls21()
        {
            this$0 = NinaBar.this;
            prompt = s;
            super();
        }
    }


    private class _cls23
        implements Runnable
    {

        final NinaBar this$0;

        public void run()
        {
            switch (_cls25..SwitchMap.com.nuance.nina.ui.persona.NinaPersona.NinaPersonaMode[personaMode.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                if (ninaView.isOpened())
                {
                    displayEditHint(ninaEditHintShowingHints);
                } else
                {
                    displayEditHint(ninaEditHintNormal);
                }
                showEdit();
                return;

            case 2: // '\002'
                voiceBioView.setVisibility(0);
                voiceBioView.fadeRestore();
                ninaText.setVisibility(4);
                return;

            case 3: // '\003'
                dictationListeningHandler.start();
                return;
            }
        }

        _cls23()
        {
            this$0 = NinaBar.this;
            super();
        }
    }


    private class _cls22
        implements Runnable
    {

        final NinaBar this$0;

        public void run()
        {
            switch (_cls25..SwitchMap.com.nuance.nina.ui.persona.NinaPersona.NinaPersonaMode[personaMode.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                showEdit();
                ninaEdit.setText("");
                return;

            case 2: // '\002'
                voiceBioView.setVisibility(0);
                break;
            }
            voiceBioView.fadeRestore();
            voiceBioView.fadeInWaves();
        }

        _cls22()
        {
            this$0 = NinaBar.this;
            super();
        }
    }


    private class _cls19
        implements Runnable
    {

        final NinaBar this$0;
        final String val$message;

        public void run()
        {
            _cls25..SwitchMap.com.nuance.nina.ui.persona.NinaPersona.NinaPersonaMode[personaMode.ordinal()];
            JVM INSTR tableswitch 1 2: default 36
        //                       1 65
        //                       2 75;
               goto _L1 _L2 _L3
_L1:
            break; /* Loop/switch isn't completed */
_L3:
            break MISSING_BLOCK_LABEL_75;
_L4:
            TextView textview = ninaText;
            String s;
            if (message == null)
            {
                s = ninaPromptAsleep;
            } else
            {
                s = message;
            }
            textview.setText(s);
            return;
_L2:
            hideEdit();
              goto _L4
            voiceBioView.setVisibility(4);
            voiceBioView.blank();
            ninaText.setVisibility(0);
              goto _L4
        }

        _cls19()
        {
            this$0 = NinaBar.this;
            message = s;
            super();
        }
    }


    private class _cls17
        implements Runnable
    {

        final NinaBar this$0;

        public void run()
        {
            NinaView ninaview = ninaView;
            if (ninaview != null && !ninaview.isOpened())
            {
                hintsGripTop.setVisibility(0);
            }
        }

        _cls17()
        {
            this$0 = NinaBar.this;
            super();
        }
    }

}
