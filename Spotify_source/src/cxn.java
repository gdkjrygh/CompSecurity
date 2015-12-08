// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import com.mixpanel.android.mpmetrics.InAppNotification;
import com.mixpanel.android.mpmetrics.UpdateDisplayState;
import com.mixpanel.android.surveys.SurveyActivity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class cxn
    implements cxm
{

    final cxk a;

    private cxn(cxk cxk1)
    {
        a = cxk1;
        super();
    }

    cxn(cxk cxk1, byte byte0)
    {
        this(cxk1);
    }

    private JSONObject c(String s, Object obj)
    {
        JSONObject jsonobject = new JSONObject();
        String s1 = a();
        jsonobject.put(s, obj);
        jsonobject.put("$token", cxk.g(a));
        jsonobject.put("$time", System.currentTimeMillis());
        if (s1 != null)
        {
            jsonobject.put("$distinct_id", s1);
        }
        return jsonobject;
    }

    public String a()
    {
        return cxk.a(a).c();
    }

    public final void a(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            break; /* Loop/switch isn't completed */
        }
        if (cxi.a)
        {
            Log.v("MixpanelAPI.API", "Will not show survey, os version is too low.");
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (cxc.b(activity.getApplicationContext()))
        {
            break; /* Loop/switch isn't completed */
        }
        if (cxi.a)
        {
            Log.v("MixpanelAPI.API", "Will not show survey, application isn't configured appropriately.");
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        ReentrantLock reentrantlock;
        reentrantlock = UpdateDisplayState.a();
        reentrantlock.lock();
        boolean flag = UpdateDisplayState.b();
        if (flag)
        {
            reentrantlock.unlock();
            return;
        }
        Object obj = cxk.b(a).a(cxk.e(a).f);
        if (obj == null)
        {
            reentrantlock.unlock();
            return;
        }
        int i;
        obj = new com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState(((com.mixpanel.android.mpmetrics.Survey) (obj)));
        i = UpdateDisplayState.a(((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState) (obj)), a(), cxk.g(a));
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        Log.e("MixpanelAPI.API", "DisplayState Lock is in an inconsistent state! Please report this issue to Mixpanel");
        reentrantlock.unlock();
        return;
        obj = new cxb(((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj)), activity, i) {

            private com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState a;
            private Activity b;
            private int c;

            public final void a(Bitmap bitmap, int j)
            {
                a.c = bitmap;
                a.d = j;
                bitmap = new Intent(b.getApplicationContext(), com/mixpanel/android/surveys/SurveyActivity);
                bitmap.addFlags(0x10000000);
                bitmap.addFlags(0x20000);
                bitmap.putExtra("com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY", c);
                b.startActivity(bitmap);
            }

            
            {
                a = surveystate;
                b = activity;
                c = i;
                super();
            }
        };
        reentrantlock.unlock();
        cwz.a(activity, ((cxb) (obj)));
        return;
        activity;
        reentrantlock.unlock();
        throw activity;
    }

    public void a(String s)
    {
        synchronized (cxk.a(a))
        {
            cxk.a(a).b(s);
            cxk.b(a).a(s);
        }
        cxk.c(a);
        return;
        s;
        cxt1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a(String s, InAppNotification inappnotification)
    {
        a.a(s, inappnotification.a());
    }

    public final void a(String s, Object obj)
    {
        try
        {
            a((new JSONObject()).put(s, obj));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("MixpanelAPI.API", "set", s);
        }
    }

    public final void a(String s, JSONObject jsonobject)
    {
        JSONObject jsonobject1 = new JSONObject();
        try
        {
            jsonobject1.put(s, jsonobject);
            s = c("$merge", jsonobject1);
            cxk.a(a, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("MixpanelAPI.API", "Exception merging a property", s);
        }
    }

    public final void a(JSONObject jsonobject)
    {
        JSONObject jsonobject1;
        try
        {
            jsonobject1 = new JSONObject(cxk.d(a));
            String s;
            for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); jsonobject1.put(s, jsonobject.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("MixpanelAPI.API", "Exception setting people properties", jsonobject);
            return;
        }
        jsonobject = c("$set", jsonobject1);
        cxk.a(a, jsonobject);
        return;
    }

    public final void b()
    {
        JSONArray jsonarray = cxk.b(a).b();
        if (jsonarray != null)
        {
            cxk.f(a).b(jsonarray);
        }
    }

    public final void b(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                if (cxi.a)
                {
                    Log.v("MixpanelAPI.API", "Will not show notifications, os version is too low.");
                    return;
                }
            } else
            {
                activity.runOnUiThread(new Runnable(activity) {

                    private Activity a;
                    private cxn b;

                    public final void run()
                    {
                        ReentrantLock reentrantlock;
                        reentrantlock = UpdateDisplayState.a();
                        reentrantlock.lock();
                        if (!UpdateDisplayState.b())
                        {
                            break MISSING_BLOCK_LABEL_33;
                        }
                        if (cxi.a)
                        {
                            Log.v("MixpanelAPI.API", "DisplayState is locked, will not show notifications.");
                        }
                        reentrantlock.unlock();
                        return;
                        Object obj;
                        obj = b;
                        obj = cxk.b(((cxn) (obj)).a).b(cxk.e(((cxn) (obj)).a).f);
                        if (obj != null)
                        {
                            break MISSING_BLOCK_LABEL_82;
                        }
                        if (cxi.a)
                        {
                            Log.v("MixpanelAPI.API", "No notification available, will not show.");
                        }
                        reentrantlock.unlock();
                        return;
                        Object obj1;
                        obj1 = ((InAppNotification) (obj)).b();
                        if (obj1 != com.mixpanel.android.mpmetrics.InAppNotification.Type.c || cxc.b(a.getApplicationContext()))
                        {
                            break MISSING_BLOCK_LABEL_126;
                        }
                        if (cxi.a)
                        {
                            Log.v("MixpanelAPI.API", "Application is not configured to show takeover notifications, none will be shown.");
                        }
                        reentrantlock.unlock();
                        return;
                        Object obj2 = a;
                        int i = 0xff000000;
                        obj2 = cyk.a(((Activity) (obj2)), 1, 1, false);
                        if (obj2 == null)
                        {
                            break MISSING_BLOCK_LABEL_160;
                        }
                        i = ((Bitmap) (obj2)).getPixel(0, 0);
                        i = UpdateDisplayState.a(new com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.InAppNotificationState(((InAppNotification) (obj)), cyk.a(i)), b.a(), cxk.g(b.a));
                        if (i > 0)
                        {
                            break MISSING_BLOCK_LABEL_213;
                        }
                        Log.e("MixpanelAPI.API", "DisplayState Lock in inconsistent state! Please report this issue to Mixpanel");
                        reentrantlock.unlock();
                        return;
                        cxk._cls3.a[((com.mixpanel.android.mpmetrics.InAppNotification.Type) (obj1)).ordinal()];
                        JVM INSTR tableswitch 1 2: default 619
                    //                                   1 390
                    //                                   2 533;
                           goto _L1 _L2 _L3
_L1:
                        Log.e("MixpanelAPI.API", (new StringBuilder("Unrecognized notification type ")).append(obj1).append(" can't be shown").toString());
_L9:
                        if (cxk.e(b.a).f) goto _L5; else goto _L4
_L4:
                        obj1 = b;
                        if (obj == null) goto _L5; else goto _L6
_L6:
                        Object obj4;
                        ((cxn) (obj1)).a("$campaign_delivery", ((InAppNotification) (obj)));
                        obj1 = ((cxn) (obj1)).a.b.c(((cxn) (obj1)).a());
                        obj4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                        obj2 = ((InAppNotification) (obj)).a();
                        ((JSONObject) (obj2)).put("$time", ((DateFormat) (obj4)).format(new Date()));
_L10:
                        ((cxm) (obj1)).b("$campaigns", Integer.valueOf(((InAppNotification) (obj)).b));
                        ((cxm) (obj1)).b("$notifications", obj2);
_L5:
                        reentrantlock.unlock();
                        return;
_L2:
                        obj4 = UpdateDisplayState.b(i);
                        if (obj4 != null) goto _L8; else goto _L7
_L7:
                        if (cxi.a)
                        {
                            Log.v("MixpanelAPI.API", "Notification's display proposal was already consumed, no notification will be shown.");
                        }
                        reentrantlock.unlock();
                        return;
_L8:
                        cxg cxg1 = new cxg();
                        Object obj3 = b.a;
                        obj4 = (com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.InAppNotificationState)((UpdateDisplayState) (obj4)).c;
                        cxg1.a = ((cxk) (obj3));
                        cxg1.b = i;
                        cxg1.c = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.InAppNotificationState) (obj4));
                        cxg1.setRetainInstance(true);
                        if (cxi.a)
                        {
                            Log.v("MixpanelAPI.API", "Attempting to show mini notification.");
                        }
                        obj3 = a.getFragmentManager().beginTransaction();
                        ((FragmentTransaction) (obj3)).setCustomAnimations(0, 0x7f040015);
                        ((FragmentTransaction) (obj3)).add(0x1020002, cxg1);
                        ((FragmentTransaction) (obj3)).commit();
                          goto _L9
                        Exception exception;
                        exception;
                        reentrantlock.unlock();
                        throw exception;
_L3:
                        if (cxi.a)
                        {
                            Log.v("MixpanelAPI.API", "Sending intent for takeover notification.");
                        }
                        Intent intent = new Intent(a.getApplicationContext(), com/mixpanel/android/surveys/SurveyActivity);
                        intent.addFlags(0x10000000);
                        intent.addFlags(0x20000);
                        intent.putExtra("com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY", i);
                        a.startActivity(intent);
                          goto _L9
                        JSONException jsonexception;
                        jsonexception;
                        Log.e("MixpanelAPI.API", "Exception trying to track an in-app notification seen", jsonexception);
                          goto _L10
                    }

            
            {
                b = cxn.this;
                a = activity;
                super();
            }
                });
                return;
            }
        }
    }

    public final void b(String s)
    {
label0:
        {
            synchronized (cxk.a(a))
            {
                if (cxk.a(a).c() != null)
                {
                    break label0;
                }
            }
            return;
        }
        JSONArray jsonarray;
        cxk.a(a).c(s);
        jsonarray = new JSONArray();
        jsonarray.put(s);
        s = new JSONObject();
        s.put("$android_devices", jsonarray);
        s = c("$union", s);
        cxk.a(a, s);
_L1:
        cxt1;
        JVM INSTR monitorexit ;
        return;
        s;
        cxt1;
        JVM INSTR monitorexit ;
        throw s;
        s;
        Log.e("MixpanelAPI.API", "Exception unioning a property");
          goto _L1
    }

    public final void b(String s, Object obj)
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put(s, obj);
            s = c("$append", jsonobject);
            cxk.a(a, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("MixpanelAPI.API", "Exception appending a property", s);
        }
    }

    public final cxm c(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return new cxn(s) {

                private String b;

                public final String a()
                {
                    return b;
                }

                public final void a(String s1)
                {
                    throw new RuntimeException("This MixpanelPeople object has a fixed, constant distinctId");
                }

            
            {
                b = s;
                super(cxn.this.a, (byte)0);
            }
            };
        }
    }
}
