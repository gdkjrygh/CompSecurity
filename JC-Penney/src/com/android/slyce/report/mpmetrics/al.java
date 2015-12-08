// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.app.Activity;
import android.util.Log;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            ak, ab, ao, k, 
//            UpdateDisplayState, af, an, f, 
//            o, InAppNotification, av, am, 
//            ag, Survey

class al
    implements ak
{

    final af a;

    private al(af af1)
    {
        a = af1;
        super();
    }

    al(af af1, ag ag)
    {
        this(af1);
    }

    private void a(InAppNotification inappnotification, Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            if (ab.a)
            {
                Log.v("MixpanelAPI.MixpanelAPI", "Will not show notifications, os version is too low.");
            }
            return;
        } else
        {
            activity.runOnUiThread(new ao(this, inappnotification, activity));
            return;
        }
    }

    private void a(Survey survey, Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16) goto _L2; else goto _L1
_L1:
        if (ab.a)
        {
            Log.v("MixpanelAPI.MixpanelAPI", "Will not show survey, os version is too low.");
        }
_L4:
        return;
_L2:
        if (k.b(activity.getApplicationContext()))
        {
            break; /* Loop/switch isn't completed */
        }
        if (ab.a)
        {
            Log.v("MixpanelAPI.MixpanelAPI", "Will not show survey, application isn't configured appropriately.");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        ReentrantLock reentrantlock;
        reentrantlock = UpdateDisplayState.a();
        reentrantlock.lock();
        boolean flag = UpdateDisplayState.b();
        Survey survey1;
        if (flag)
        {
            reentrantlock.unlock();
            return;
        }
        survey1 = survey;
        if (survey != null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        survey1 = b();
        if (survey1 == null)
        {
            reentrantlock.unlock();
            return;
        }
        int i;
        survey = new UpdateDisplayState.DisplayState.SurveyState(survey1);
        i = UpdateDisplayState.a(survey, c(), af.f(a));
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        Log.e("MixpanelAPI.MixpanelAPI", "DisplayState Lock is in an inconsistent state! Please report this issue to Mixpanel");
        reentrantlock.unlock();
        return;
        survey = new an(this, survey, activity, i);
        reentrantlock.unlock();
        f.a(activity, survey);
        return;
        survey;
        reentrantlock.unlock();
        throw survey;
    }

    private JSONObject b(String s, Object obj)
    {
        JSONObject jsonobject = new JSONObject();
        String s1 = c();
        jsonobject.put(s, obj);
        jsonobject.put("$token", af.f(a));
        jsonobject.put("$time", System.currentTimeMillis());
        if (s1 != null)
        {
            jsonobject.put("$distinct_id", c());
        }
        return jsonobject;
    }

    public InAppNotification a()
    {
        return af.b(a).b(af.e(a).h());
    }

    public void a(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            return;
        } else
        {
            a(((Survey) (null)), activity);
            return;
        }
    }

    public void a(InAppNotification inappnotification)
    {
        if (inappnotification == null)
        {
            return;
        }
        a("$campaign_delivery", inappnotification);
        ak ak1 = a.c().c(c());
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        JSONObject jsonobject = inappnotification.a();
        try
        {
            jsonobject.put("$time", simpledateformat.format(new Date()));
        }
        catch (JSONException jsonexception)
        {
            Log.e("MixpanelAPI.MixpanelAPI", "Exception trying to track an in app notification seen", jsonexception);
        }
        ak1.a("$campaigns", Integer.valueOf(inappnotification.b()));
        ak1.a("$notifications", jsonobject);
    }

    public void a(String s)
    {
        af.a(a).a(s);
        af.b(a).a(s);
        af.c(a);
    }

    public void a(String s, InAppNotification inappnotification)
    {
        a.a(s, inappnotification.a());
    }

    public void a(String s, Object obj)
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put(s, obj);
            s = b("$append", jsonobject);
            af.a(a, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("MixpanelAPI.MixpanelAPI", "Exception appending a property", s);
        }
    }

    public void a(String s, JSONArray jsonarray)
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put(s, jsonarray);
            s = b("$union", jsonobject);
            af.a(a, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("MixpanelAPI.MixpanelAPI", "Exception unioning a property");
        }
    }

    public void a(JSONObject jsonobject)
    {
        JSONObject jsonobject1;
        try
        {
            jsonobject1 = new JSONObject(af.d(a));
            String s;
            for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); jsonobject1.put(s, jsonobject.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("MixpanelAPI.MixpanelAPI", "Exception setting people properties", jsonobject);
            return;
        }
        jsonobject = b("$set", jsonobject1);
        af.a(a, jsonobject);
        return;
    }

    public Survey b()
    {
        return af.b(a).a(af.e(a).h());
    }

    public void b(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            return;
        } else
        {
            a(((InAppNotification) (null)), activity);
            return;
        }
    }

    public void b(String s)
    {
label0:
        {
            synchronized (af.a(a))
            {
                if (af.a(a).d() != null)
                {
                    break label0;
                }
            }
            return;
        }
        af.a(a).b(s);
        a("$android_devices", new JSONArray((new StringBuilder()).append("[").append(s).append("]").toString()));
_L1:
        av1;
        JVM INSTR monitorexit ;
        return;
        s;
        av1;
        JVM INSTR monitorexit ;
        throw s;
        s;
        Log.e("MixpanelAPI.MixpanelAPI", "set push registration id error", s);
          goto _L1
    }

    public ak c(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return new am(this, s);
        }
    }

    public String c()
    {
        return af.a(a).d();
    }
}
