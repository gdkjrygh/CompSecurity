// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.mixpanel.android.surveys.SurveyActivity;
import com.mixpanel.android.viewcrawler.g;
import com.mixpanel.android.viewcrawler.i;
import com.mixpanel.android.viewcrawler.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            n, t, k, d, 
//            a, c, g, i, 
//            s, o, InAppNotification, Survey, 
//            j, p, UpdateDisplayState, b, 
//            f

public class h
{
    static interface a
    {

        public abstract void a(h h1);
    }

    public static interface b
    {

        public abstract void a();

        public abstract void a(double d1, JSONObject jsonobject);

        public abstract void a(int i1, Activity activity);

        public abstract void a(Activity activity);

        public abstract void a(InAppNotification inappnotification);

        public abstract void a(InAppNotification inappnotification, Activity activity);

        public abstract void a(Survey survey, Activity activity);

        public abstract void a(com.mixpanel.android.mpmetrics.j j1);

        public abstract void a(p p1);

        public abstract void a(p p1, Activity activity);

        public abstract void a(String s1);

        public abstract void a(String s1, double d1);

        public abstract void a(String s1, InAppNotification inappnotification);

        public abstract void a(String s1, Object obj);

        public abstract void a(String s1, JSONArray jsonarray);

        public abstract void a(String s1, JSONObject jsonobject);

        public abstract void a(Map map);

        public abstract void a(JSONObject jsonobject);

        public abstract void b();

        public abstract void b(int i1, Activity activity);

        public abstract void b(Activity activity);

        public abstract void b(com.mixpanel.android.mpmetrics.j j1);

        public abstract void b(String s1);

        public abstract void b(String s1, Object obj);

        public abstract void b(Map map);

        public abstract void b(JSONObject jsonobject);

        public abstract void c();

        public abstract void c(String s1);

        public abstract void c(String s1, Object obj);

        public abstract void c(Map map);

        public abstract String d();

        public abstract void d(String s1);

        public abstract b e(String s1);

        public abstract void e();

        public abstract Survey f();

        public abstract InAppNotification g();
    }

    private class c
        implements b
    {

        final h a;

        private void b(InAppNotification inappnotification, Activity activity)
        {
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                if (com.mixpanel.android.mpmetrics.g.b)
                {
                    Log.v("MixpanelAPI.API", "Will not show notifications, os version is too low.");
                }
                return;
            } else
            {
                activity.runOnUiThread(new Runnable(this, inappnotification, activity) {

                    final InAppNotification a;
                    final Activity b;
                    final c c;

                    public void run()
                    {
                        ReentrantLock reentrantlock;
                        reentrantlock = UpdateDisplayState.a();
                        reentrantlock.lock();
                        if (!UpdateDisplayState.b())
                        {
                            break MISSING_BLOCK_LABEL_33;
                        }
                        if (com.mixpanel.android.mpmetrics.g.b)
                        {
                            Log.v("MixpanelAPI.API", "DisplayState is locked, will not show notifications.");
                        }
                        reentrantlock.unlock();
                        return;
                        InAppNotification inappnotification = a;
                        if (inappnotification != null)
                        {
                            break MISSING_BLOCK_LABEL_50;
                        }
                        inappnotification = c.g();
                        if (inappnotification != null)
                        {
                            break MISSING_BLOCK_LABEL_73;
                        }
                        if (com.mixpanel.android.mpmetrics.g.b)
                        {
                            Log.v("MixpanelAPI.API", "No notification available, will not show.");
                        }
                        reentrantlock.unlock();
                        return;
                        InAppNotification.Type type;
                        type = inappnotification.e();
                        if (type != InAppNotification.Type.c || com.mixpanel.android.mpmetrics.c.c(b.getApplicationContext()))
                        {
                            break MISSING_BLOCK_LABEL_117;
                        }
                        if (com.mixpanel.android.mpmetrics.g.b)
                        {
                            Log.v("MixpanelAPI.API", "Application is not configured to show takeover notifications, none will be shown.");
                        }
                        reentrantlock.unlock();
                        return;
                        int i1 = UpdateDisplayState.a(new UpdateDisplayState.DisplayState.InAppNotificationState(inappnotification, com.mixpanel.android.util.a.a(b)), c.d(), com.mixpanel.android.mpmetrics.h.i(c.a));
                        if (i1 > 0)
                        {
                            break MISSING_BLOCK_LABEL_172;
                        }
                        Log.e("MixpanelAPI.API", "DisplayState Lock in inconsistent state! Please report this issue to Mixpanel");
                        reentrantlock.unlock();
                        return;
                        static class _cls3
                        {

                            static final int a[];

                            static 
                            {
                                a = new int[InAppNotification.Type.values().length];
                                try
                                {
                                    a[InAppNotification.Type.b.ordinal()] = 1;
                                }
                                catch (NoSuchFieldError nosuchfielderror1) { }
                                try
                                {
                                    a[InAppNotification.Type.c.ordinal()] = 2;
                                }
                                catch (NoSuchFieldError nosuchfielderror)
                                {
                                    return;
                                }
                            }
                        }

                        _cls3.a[type.ordinal()];
                        JVM INSTR tableswitch 1 2: default 457
                    //                                   1 263
                    //                                   2 389;
                           goto _L1 _L2 _L3
_L3:
                        break MISSING_BLOCK_LABEL_389;
_L1:
                        Log.e("MixpanelAPI.API", (new StringBuilder()).append("Unrecognized notification type ").append(type).append(" can't be shown").toString());
_L4:
                        if (!h.e(c.a).i())
                        {
                            c.a(inappnotification);
                        }
                        reentrantlock.unlock();
                        return;
_L2:
                        Object obj = UpdateDisplayState.b(i1);
                        if (obj != null)
                        {
                            break MISSING_BLOCK_LABEL_294;
                        }
                        if (com.mixpanel.android.mpmetrics.g.b)
                        {
                            Log.v("MixpanelAPI.API", "Notification's display proposal was already consumed, no notification will be shown.");
                        }
                        reentrantlock.unlock();
                        return;
                        com.mixpanel.android.mpmetrics.f f1 = new com.mixpanel.android.mpmetrics.f();
                        f1.a(c.a, i1, (UpdateDisplayState.DisplayState.InAppNotificationState)((UpdateDisplayState) (obj)).c());
                        f1.setRetainInstance(true);
                        if (com.mixpanel.android.mpmetrics.g.b)
                        {
                            Log.v("MixpanelAPI.API", "Attempting to show mini notification.");
                        }
                        obj = b.getFragmentManager().beginTransaction();
                        ((FragmentTransaction) (obj)).setCustomAnimations(0, com.mixpanel.android.R.anim.com_mixpanel_android_slide_down);
                        ((FragmentTransaction) (obj)).add(0x1020002, f1);
                        ((FragmentTransaction) (obj)).commit();
                          goto _L4
                        Exception exception;
                        exception;
                        reentrantlock.unlock();
                        throw exception;
                        if (com.mixpanel.android.mpmetrics.g.b)
                        {
                            Log.v("MixpanelAPI.API", "Sending intent for takeover notification.");
                        }
                        Intent intent = new Intent(b.getApplicationContext(), com/mixpanel/android/surveys/SurveyActivity);
                        intent.addFlags(0x10000000);
                        intent.addFlags(0x20000);
                        intent.putExtra("com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY", i1);
                        b.startActivity(intent);
                          goto _L4
                    }

            
            {
                c = c1;
                a = inappnotification;
                b = activity;
                super();
            }
                });
                return;
            }
        }

        private void b(Survey survey, Activity activity)
        {
            if (android.os.Build.VERSION.SDK_INT >= 16) goto _L2; else goto _L1
_L1:
            if (com.mixpanel.android.mpmetrics.g.b)
            {
                Log.v("MixpanelAPI.API", "Will not show survey, os version is too low.");
            }
_L4:
            return;
_L2:
            if (com.mixpanel.android.mpmetrics.c.c(activity.getApplicationContext()))
            {
                break; /* Loop/switch isn't completed */
            }
            if (com.mixpanel.android.mpmetrics.g.b)
            {
                Log.v("MixpanelAPI.API", "Will not show survey, application isn't configured appropriately.");
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
            survey1 = f();
            if (survey1 == null)
            {
                reentrantlock.unlock();
                return;
            }
            int i1;
            survey = new UpdateDisplayState.DisplayState.SurveyState(survey1);
            i1 = UpdateDisplayState.a(survey, d(), com.mixpanel.android.mpmetrics.h.i(a));
            if (i1 > 0)
            {
                break MISSING_BLOCK_LABEL_140;
            }
            Log.e("MixpanelAPI.API", "DisplayState Lock is in an inconsistent state! Please report this issue to Mixpanel");
            reentrantlock.unlock();
            return;
            survey = new b.b(this, survey, activity, i1) {

                final UpdateDisplayState.DisplayState.SurveyState a;
                final Activity b;
                final int c;
                final c d;

                public void a(Bitmap bitmap, int i1)
                {
                    a.a(bitmap);
                    a.a(i1);
                    bitmap = new Intent(b.getApplicationContext(), com/mixpanel/android/surveys/SurveyActivity);
                    bitmap.addFlags(0x10000000);
                    bitmap.addFlags(0x20000);
                    bitmap.putExtra("com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY", c);
                    b.startActivity(bitmap);
                }

            
            {
                d = c1;
                a = surveystate;
                b = activity;
                c = i1;
                super();
            }
            };
            reentrantlock.unlock();
            com.mixpanel.android.mpmetrics.b.a(activity, survey);
            return;
            survey;
            reentrantlock.unlock();
            throw survey;
        }

        private JSONObject d(String s1, Object obj)
            throws JSONException
        {
            JSONObject jsonobject = new JSONObject();
            String s2 = d();
            jsonobject.put(s1, obj);
            jsonobject.put("$token", com.mixpanel.android.mpmetrics.h.i(a));
            jsonobject.put("$time", System.currentTimeMillis());
            if (s2 != null)
            {
                jsonobject.put("$distinct_id", s2);
            }
            return jsonobject;
        }

        private void f(String s1)
        {
            com.mixpanel.android.mpmetrics.h.j(a).a(s1);
        }

        private void g(String s1)
        {
            try
            {
                if (com.mixpanel.android.mpmetrics.g.b)
                {
                    Log.v("MixpanelAPI.API", "Registering a new push id");
                }
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.putExtra("app", PendingIntent.getBroadcast(com.mixpanel.android.mpmetrics.h.g(a), 0, new Intent(), 0));
                intent.putExtra("sender", s1);
                com.mixpanel.android.mpmetrics.h.g(a).startService(intent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                Log.w("MixpanelAPI.API", s1);
            }
        }

        public void a()
        {
            b("$transactions");
        }

        public void a(double d1, JSONObject jsonobject)
        {
            JSONObject jsonobject1;
            Object obj = new Date();
            Object obj1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            ((DateFormat) (obj1)).setTimeZone(TimeZone.getTimeZone("UTC"));
            try
            {
                jsonobject1 = new JSONObject();
                jsonobject1.put("$amount", d1);
                jsonobject1.put("$time", ((DateFormat) (obj1)).format(((Date) (obj))));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.API", "Exception creating new charge", jsonobject);
                return;
            }
            if (jsonobject == null)
            {
                break MISSING_BLOCK_LABEL_127;
            }
            for (obj = jsonobject.keys(); ((Iterator) (obj)).hasNext(); jsonobject1.put(((String) (obj1)), jsonobject.get(((String) (obj1)))))
            {
                obj1 = (String)((Iterator) (obj)).next();
            }

            c("$transactions", jsonobject1);
            return;
        }

        public void a(int i1, Activity activity)
        {
            Survey survey = h.b(a).a(i1, h.e(a).i());
            if (survey != null)
            {
                b(survey, activity);
            }
        }

        public void a(Activity activity)
        {
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                return;
            } else
            {
                b(((Survey) (null)), activity);
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
            b b1 = a.e().e(d());
            SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            JSONObject jsonobject = inappnotification.b();
            try
            {
                jsonobject.put("$time", simpledateformat.format(new Date()));
            }
            catch (JSONException jsonexception)
            {
                Log.e("MixpanelAPI.API", "Exception trying to track an in-app notification seen", jsonexception);
            }
            b1.c("$campaigns", Integer.valueOf(inappnotification.c()));
            b1.c("$notifications", jsonobject);
        }

        public void a(InAppNotification inappnotification, Activity activity)
        {
            if (inappnotification != null)
            {
                b(inappnotification, activity);
            }
        }

        public void a(Survey survey, Activity activity)
        {
            b(survey, activity);
        }

        public void a(com.mixpanel.android.mpmetrics.j j1)
        {
            h.h(a).a(j1);
        }

        public void a(p p1)
        {
            Log.i("MixpanelAPI.API", "MixpanelAPI.checkForSurvey is deprecated. Calling is now a no-op.\n    to query surveys, call MixpanelAPI.getPeople().getSurveyIfAvailable()");
        }

        public void a(p p1, Activity activity)
        {
            Log.i("MixpanelAPI.API", "MixpanelAPI.checkForSurvey is deprecated. Calling is now a no-op.\n    to query surveys, call MixpanelAPI.getPeople().getSurveyIfAvailable()");
        }

        public void a(String s1)
        {
            synchronized (h.a(a))
            {
                h.a(a).b(s1);
                h.b(a).a(s1);
            }
            h.c(a);
            return;
            s1;
            k1;
            JVM INSTR monitorexit ;
            throw s1;
        }

        public void a(String s1, double d1)
        {
            HashMap hashmap = new HashMap();
            hashmap.put(s1, Double.valueOf(d1));
            c(hashmap);
        }

        public void a(String s1, InAppNotification inappnotification)
        {
            a.a(s1, inappnotification.b());
        }

        public void a(String s1, Object obj)
        {
            try
            {
                a((new JSONObject()).put(s1, obj));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                Log.e("MixpanelAPI.API", "set", s1);
            }
        }

        public void a(String s1, JSONArray jsonarray)
        {
            try
            {
                JSONObject jsonobject = new JSONObject();
                jsonobject.put(s1, jsonarray);
                s1 = d("$union", jsonobject);
                h.a(a, s1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                Log.e("MixpanelAPI.API", "Exception unioning a property");
            }
        }

        public void a(String s1, JSONObject jsonobject)
        {
            JSONObject jsonobject1 = new JSONObject();
            try
            {
                jsonobject1.put(s1, jsonobject);
                s1 = d("$merge", jsonobject1);
                h.a(a, s1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                Log.e("MixpanelAPI.API", "Exception merging a property", s1);
            }
        }

        public void a(Map map)
        {
            if (map == null)
            {
                Log.e("MixpanelAPI.API", "setMap does not accept null properties");
                return;
            }
            try
            {
                a(new JSONObject(map));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                Log.w("MixpanelAPI.API", "Can't have null keys in the properties of setMap!");
            }
        }

        public void a(JSONObject jsonobject)
        {
            JSONObject jsonobject1;
            try
            {
                jsonobject1 = new JSONObject(h.d(a));
                String s1;
                for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); jsonobject1.put(s1, jsonobject.get(s1)))
                {
                    s1 = (String)iterator.next();
                }

            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.API", "Exception setting people properties", jsonobject);
                return;
            }
            jsonobject = d("$set", jsonobject1);
            h.a(a, jsonobject);
            return;
        }

        public void b()
        {
            try
            {
                JSONObject jsonobject = d("$delete", JSONObject.NULL);
                h.a(a, jsonobject);
                return;
            }
            catch (JSONException jsonexception)
            {
                Log.e("MixpanelAPI.API", "Exception deleting a user");
            }
        }

        public void b(int i1, Activity activity)
        {
            a(h.b(a).b(i1, h.e(a).i()), activity);
        }

        public void b(Activity activity)
        {
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                return;
            } else
            {
                b(((InAppNotification) (null)), activity);
                return;
            }
        }

        public void b(com.mixpanel.android.mpmetrics.j j1)
        {
            h.h(a).b(j1);
        }

        public void b(String s1)
        {
            try
            {
                JSONArray jsonarray = new JSONArray();
                jsonarray.put(s1);
                s1 = d("$unset", jsonarray);
                h.a(a, s1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                Log.e("MixpanelAPI.API", "Exception unsetting a property", s1);
            }
        }

        public void b(String s1, Object obj)
        {
            try
            {
                b((new JSONObject()).put(s1, obj));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                Log.e("MixpanelAPI.API", "set", s1);
            }
        }

        public void b(Map map)
        {
            if (map == null)
            {
                Log.e("MixpanelAPI.API", "setOnceMap does not accept null properties");
                return;
            }
            try
            {
                b(new JSONObject(map));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                Log.w("MixpanelAPI.API", "Can't have null keys in the properties setOnceMap!");
            }
        }

        public void b(JSONObject jsonobject)
        {
            try
            {
                jsonobject = d("$set_once", jsonobject);
                h.a(a, jsonobject);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.API", "Exception setting people properties");
            }
        }

        public void c()
        {
            h.a(a).f();
            a("$android_devices", new JSONArray());
        }

        public void c(String s1)
        {
            if (!com.mixpanel.android.mpmetrics.c.b(com.mixpanel.android.mpmetrics.h.g(a)))
            {
                Log.i("MixpanelAPI.API", "Can't register for push notification services. Push notifications will not work.");
                Log.i("MixpanelAPI.API", (new StringBuilder()).append("See log tagged ").append(com.mixpanel.android.mpmetrics.c.a).append(" above for details.").toString());
                return;
            }
            String s2 = h.a(a).g();
            if (s2 == null)
            {
                if (android.os.Build.VERSION.SDK_INT >= 21)
                {
                    f(s1);
                    return;
                } else
                {
                    g(s1);
                    return;
                }
            } else
            {
                h.a(new a(this, s2) {

                    final String a;
                    final c b;

                    public void a(h h1)
                    {
                        if (com.mixpanel.android.mpmetrics.g.b)
                        {
                            Log.v("MixpanelAPI.API", (new StringBuilder()).append("Using existing pushId ").append(a).toString());
                        }
                        h1.e().d(a);
                    }

            
            {
                b = c1;
                a = s1;
                super();
            }
                });
                return;
            }
        }

        public void c(String s1, Object obj)
        {
            try
            {
                JSONObject jsonobject = new JSONObject();
                jsonobject.put(s1, obj);
                s1 = d("$append", jsonobject);
                h.a(a, s1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                Log.e("MixpanelAPI.API", "Exception appending a property", s1);
            }
        }

        public void c(Map map)
        {
            map = new JSONObject(map);
            try
            {
                map = d("$add", map);
                h.a(a, map);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                Log.e("MixpanelAPI.API", "Exception incrementing properties", map);
            }
        }

        public String d()
        {
            return h.a(a).c();
        }

        public void d(String s1)
        {
label0:
            {
                synchronized (h.a(a))
                {
                    if (h.a(a).c() != null)
                    {
                        break label0;
                    }
                }
                return;
            }
            h.a(a).c(s1);
            JSONArray jsonarray = new JSONArray();
            jsonarray.put(s1);
            a("$android_devices", jsonarray);
            k1;
            JVM INSTR monitorexit ;
            return;
            s1;
            k1;
            JVM INSTR monitorexit ;
            throw s1;
        }

        public b e(String s1)
        {
            if (s1 == null)
            {
                return null;
            } else
            {
                return new c(this, s1) {

                    final String b;
                    final c c;

                    public void a(String s1)
                    {
                        throw new RuntimeException("This MixpanelPeople object has a fixed, constant distinctId");
                    }

                    public String d()
                    {
                        return b;
                    }

            
            {
                c = c1;
                b = s1;
                super(c1.a);
            }
                };
            }
        }

        public void e()
        {
            JSONArray jsonarray = h.b(a).c();
            if (jsonarray != null)
            {
                h.f(a).b(jsonarray);
            }
        }

        public Survey f()
        {
            return h.b(a).a(h.e(a).i());
        }

        public InAppNotification g()
        {
            return h.b(a).b(h.e(a).i());
        }

        private c()
        {
            a = h.this;
            super();
        }

    }

    private class d
        implements g, Runnable
    {

        final h a;
        private final Set b;
        private final Executor c;

        public void a()
        {
            c.execute(this);
        }

        public void a(com.mixpanel.android.mpmetrics.j j1)
        {
            this;
            JVM INSTR monitorenter ;
            if (h.b(a).d())
            {
                a();
            }
            b.add(j1);
            this;
            JVM INSTR monitorexit ;
            return;
            j1;
            throw j1;
        }

        public void b(com.mixpanel.android.mpmetrics.j j1)
        {
            this;
            JVM INSTR monitorenter ;
            b.remove(j1);
            this;
            JVM INSTR monitorexit ;
            return;
            j1;
            throw j1;
        }

        public void run()
        {
            this;
            JVM INSTR monitorenter ;
            for (Iterator iterator = b.iterator(); iterator.hasNext(); ((com.mixpanel.android.mpmetrics.j)iterator.next()).a()) { }
            break MISSING_BLOCK_LABEL_43;
            Exception exception;
            exception;
            throw exception;
            this;
            JVM INSTR monitorexit ;
        }

        private d()
        {
            a = h.this;
            super();
            b = new HashSet();
            c = Executors.newSingleThreadExecutor();
        }

    }

    private class e
        implements i
    {

        final h a;
        private final t b;

        public void a()
        {
        }

        public void a(JSONArray jsonarray)
        {
        }

        public t b()
        {
            return b;
        }

        public void b(JSONArray jsonarray)
        {
        }

        public e(t t1)
        {
            a = h.this;
            super();
            b = t1;
        }
    }

    private class f
        implements g
    {

        final h a;

        public void a()
        {
        }

        public void a(com.mixpanel.android.mpmetrics.j j1)
        {
        }

        public void b(com.mixpanel.android.mpmetrics.j j1)
        {
        }

        private f()
        {
            a = h.this;
            super();
        }

    }

    private static interface g
        extends d.a
    {

        public abstract void a(com.mixpanel.android.mpmetrics.j j1);

        public abstract void b(com.mixpanel.android.mpmetrics.j j1);
    }


    public static final String a = "4.6.0";
    private static final Map n = new HashMap();
    private static final n o = new n();
    private static final t p = new t();
    private static Future q;
    private static final String r = "MixpanelAPI.API";
    private static final String s = "MixpanelAPI.AL";
    private static final String t = "yyyy-MM-dd'T'HH:mm:ss";
    private final Context b;
    private final com.mixpanel.android.mpmetrics.a c = j();
    private final com.mixpanel.android.mpmetrics.g d = k();
    private final String e;
    private final c f = new c();
    private final i g;
    private final k h;
    private final g i = l();
    private final com.mixpanel.android.viewcrawler.g j = m();
    private final com.mixpanel.android.mpmetrics.d k;
    private final Map l;
    private final Map m = new HashMap();

    h(Context context, Future future, String s1)
    {
        b = context;
        e = s1;
        HashMap hashmap = new HashMap();
        hashmap.put("$android_lib_version", "4.6.0");
        hashmap.put("$android_os", "Android");
        Object obj;
        if (android.os.Build.VERSION.RELEASE == null)
        {
            obj = "UNKNOWN";
        } else
        {
            obj = android.os.Build.VERSION.RELEASE;
        }
        hashmap.put("$android_os_version", obj);
        if (Build.MANUFACTURER == null)
        {
            obj = "UNKNOWN";
        } else
        {
            obj = Build.MANUFACTURER;
        }
        hashmap.put("$android_manufacturer", obj);
        if (Build.BRAND == null)
        {
            obj = "UNKNOWN";
        } else
        {
            obj = Build.BRAND;
        }
        hashmap.put("$android_brand", obj);
        if (Build.MODEL == null)
        {
            obj = "UNKNOWN";
        } else
        {
            obj = Build.MODEL;
        }
        hashmap.put("$android_model", obj);
        try
        {
            obj = b.getPackageManager().getPackageInfo(b.getPackageName(), 0);
            hashmap.put("$android_app_version", ((PackageInfo) (obj)).versionName);
            hashmap.put("$android_app_version_code", Integer.toString(((PackageInfo) (obj)).versionCode));
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Log.e("MixpanelAPI.API", "Exception getting app version name", namenotfoundexception);
        }
        l = Collections.unmodifiableMap(hashmap);
        g = b(context, s1);
        h = a(context, future, s1);
        k = a(s1, i, g);
        future = h.c();
        context = future;
        if (future == null)
        {
            context = h.b();
        }
        k.a(context);
        c.a(k);
        i();
        if (n())
        {
            a("$app_open", ((JSONObject) (null)));
        }
        g.a();
    }

    public static h a(Context context, String s1)
    {
        if (s1 == null || context == null)
        {
            return null;
        }
        Map map = n;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        Context context1;
        context1 = context.getApplicationContext();
        if (q == null)
        {
            q = o.a(context, "com.mixpanel.android.mpmetrics.ReferralInfo", null);
        }
        obj = (Map)n.get(s1);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        obj = new HashMap();
        n.put(s1, obj);
        h h2 = (h)((Map) (obj)).get(context1);
        h h1;
        h1 = h2;
        if (h2 != null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        h1 = h2;
        if (com.mixpanel.android.mpmetrics.c.a(context1))
        {
            h1 = new h(context1, q, s1);
            a(context, h1);
            ((Map) (obj)).put(context1, h1);
        }
        a(context);
        map;
        JVM INSTR monitorexit ;
        return h1;
        context;
        map;
        JVM INSTR monitorexit ;
        throw context;
    }

    static k a(h h1)
    {
        return h1.h;
    }

    public static s a(String s1, byte byte0)
    {
        return p.a(s1, byte0);
    }

    public static s a(String s1, double d1)
    {
        return p.a(s1, d1);
    }

    public static s a(String s1, float f1)
    {
        return p.a(s1, f1);
    }

    public static s a(String s1, int i1)
    {
        return p.a(s1, i1);
    }

    public static s a(String s1, long l1)
    {
        return p.a(s1, l1);
    }

    public static s a(String s1, String s2)
    {
        return p.a(s1, s2);
    }

    public static s a(String s1, short word0)
    {
        return p.a(s1, word0);
    }

    public static s a(String s1, boolean flag)
    {
        return p.a(s1, flag);
    }

    private static void a(Context context)
    {
        if (context instanceof Activity)
        {
            try
            {
                Class class1 = Class.forName("bolts.d");
                Intent intent = ((Activity)context).getIntent();
                class1.getMethod("getTargetUrlFromInboundIntent", new Class[] {
                    android/content/Context, android/content/Intent
                }).invoke(null, new Object[] {
                    context, intent
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.d("MixpanelAPI.AL", "Failed to invoke bolts.AppLinks.getTargetUrlFromInboundIntent() -- Unable to detect inbound App Links", context);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.d("MixpanelAPI.AL", (new StringBuilder()).append("Please install the Bolts library >= 1.1.2 to track App Links: ").append(context.getMessage()).toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.d("MixpanelAPI.AL", (new StringBuilder()).append("Please install the Bolts library >= 1.1.2 to track App Links: ").append(context.getMessage()).toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.d("MixpanelAPI.AL", (new StringBuilder()).append("Unable to detect inbound App Links: ").append(context.getMessage()).toString());
            }
            return;
        } else
        {
            Log.d("MixpanelAPI.AL", "Context is not an instance of Activity. To detect inbound App Links, pass an instance of an Activity to getInstance.");
            return;
        }
    }

    public static void a(Context context, long l1)
    {
        Log.i("MixpanelAPI.API", "MixpanelAPI.setFlushInterval is deprecated. Calling is now a no-op.\n    To set a custom Mixpanel flush interval for your application, add\n    <meta-data android:name=\"com.mixpanel.android.MPConfig.FlushInterval\" android:value=\"YOUR_INTERVAL\" />\n    to the <application> section of your AndroidManifest.xml.");
    }

    private static void a(Context context, h h1)
    {
        try
        {
            Class class1 = Class.forName("android.support.v4.content.LocalBroadcastManager");
            Method method = class1.getMethod("getInstance", new Class[] {
                android/content/Context
            });
            class1.getMethod("registerReceiver", new Class[] {
                android/content/BroadcastReceiver, android/content/IntentFilter
            }).invoke(method.invoke(null, new Object[] {
                context
            }), new Object[] {
                new BroadcastReceiver(h1) {

                    final h a;

                    public void onReceive(Context context1, Intent intent)
                    {
                        context1 = new JSONObject();
                        Bundle bundle = intent.getBundleExtra("event_args");
                        if (bundle != null)
                        {
                            for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext();)
                            {
                                String s1 = (String)iterator.next();
                                try
                                {
                                    context1.put(s1, bundle.get(s1));
                                }
                                catch (JSONException jsonexception)
                                {
                                    Log.e("MixpanelAPI.AL", (new StringBuilder()).append("failed to add key \"").append(s1).append("\" to properties for tracking bolts event").toString(), jsonexception);
                                }
                            }

                        }
                        a.a((new StringBuilder()).append("$").append(intent.getStringExtra("event_name")).toString(), context1);
                    }

            
            {
                a = h1;
                super();
            }
                }, new IntentFilter("com.parse.bolts.measurement_event")
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.d("MixpanelAPI.AL", "Failed to invoke LocalBroadcastManager.registerReceiver() -- App Links tracking will not be enabled due to this exception", context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.d("MixpanelAPI.AL", (new StringBuilder()).append("To enable App Links tracking android.support.v4 must be installed: ").append(context.getMessage()).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.d("MixpanelAPI.AL", (new StringBuilder()).append("To enable App Links tracking android.support.v4 must be installed: ").append(context.getMessage()).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.d("MixpanelAPI.AL", (new StringBuilder()).append("App Links tracking will not be enabled due to this exception: ").append(context.getMessage()).toString());
        }
    }

    public static void a(Context context, boolean flag)
    {
        Log.i("MixpanelAPI.API", "MixpanelAPI.enableFallbackServer is deprecated. This call is a no-op.\n    To enable fallback in your application, add\n    <meta-data android:name=\"com.mixpanel.android.MPConfig.DisableFallback\" android:value=\"false\" />\n    to the <application> section of your AndroidManifest.xml.");
    }

    static void a(a a1)
    {
        Map map = n;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = n.values().iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((Map)iterator.next()).values().iterator();
            while (iterator1.hasNext()) 
            {
                a1.a((h)iterator1.next());
            }
        }

        break MISSING_BLOCK_LABEL_81;
        a1;
        map;
        JVM INSTR monitorexit ;
        throw a1;
        map;
        JVM INSTR monitorexit ;
    }

    static void a(h h1, JSONArray jsonarray)
    {
        h1.a(jsonarray);
    }

    static void a(h h1, JSONObject jsonobject)
    {
        h1.c(jsonobject);
    }

    private void a(JSONArray jsonarray)
    {
        int i1 = 0;
        while (i1 < jsonarray.length()) 
        {
            try
            {
                JSONObject jsonobject = jsonarray.getJSONObject(i1);
                c.a(jsonobject);
            }
            catch (JSONException jsonexception)
            {
                Log.e("MixpanelAPI.API", "Malformed people record stored pending identity, will not send it.", jsonexception);
            }
            i1++;
        }
    }

    static com.mixpanel.android.mpmetrics.d b(h h1)
    {
        return h1.k;
    }

    static void c(h h1)
    {
        h1.o();
    }

    private void c(JSONObject jsonobject)
    {
        if (jsonobject.has("$distinct_id"))
        {
            c.a(jsonobject);
            return;
        } else
        {
            h.b(jsonobject);
            return;
        }
    }

    static Map d(h h1)
    {
        return h1.l;
    }

    static com.mixpanel.android.mpmetrics.g e(h h1)
    {
        return h1.d;
    }

    static i f(h h1)
    {
        return h1.g;
    }

    static Context g(h h1)
    {
        return h1.b;
    }

    static g h(h h1)
    {
        return h1.i;
    }

    static String i(h h1)
    {
        return h1.e;
    }

    static com.mixpanel.android.mpmetrics.a j(h h1)
    {
        return h1.c;
    }

    private void o()
    {
        JSONArray jsonarray = h.d();
        if (jsonarray != null)
        {
            a(jsonarray);
        }
    }

    com.mixpanel.android.mpmetrics.d a(String s1, d.a a1, i i1)
    {
        return new com.mixpanel.android.mpmetrics.d(s1, a1, i1);
    }

    k a(Context context, Future future, String s1)
    {
        n.b b1 = new n.b() {

            final h a;

            public void a(SharedPreferences sharedpreferences)
            {
                sharedpreferences = com.mixpanel.android.mpmetrics.k.a(sharedpreferences);
                if (sharedpreferences != null)
                {
                    h.a(a, sharedpreferences);
                }
            }

            
            {
                a = h.this;
                super();
            }
        };
        s1 = (new StringBuilder()).append("com.mixpanel.android.mpmetrics.MixpanelAPI_").append(s1).toString();
        return new k(future, o.a(context, s1, b1));
    }

    public void a()
    {
        c.a();
    }

    public void a(o o1)
    {
        h.a(o1);
    }

    public void a(String s1)
    {
        k k1 = h;
        k1;
        JVM INSTR monitorenter ;
        String s2;
        h.a(s1);
        s2 = h.c();
        s1 = s2;
        if (s2 != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        s1 = h.b();
        k.a(s1);
        k1;
        JVM INSTR monitorexit ;
        return;
        s1;
        k1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public void a(String s1, Map map)
    {
        if (map == null)
        {
            a(s1, ((JSONObject) (null)));
            return;
        }
        try
        {
            a(s1, new JSONObject(map));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.w("MixpanelAPI.API", "Can't have null keys in the properties of trackMap!");
        }
    }

    public void a(String s1, JSONObject jsonobject)
    {
        Long long1;
        synchronized (m)
        {
            long1 = (Long)m.get(s1);
            m.remove(s1);
        }
        obj = new JSONObject();
        java.util.Map.Entry entry;
        for (Iterator iterator1 = h.a().entrySet().iterator(); iterator1.hasNext(); ((JSONObject) (obj)).put((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator1.next();
        }

          goto _L1
        jsonobject;
        Log.e("MixpanelAPI.API", (new StringBuilder()).append("Exception tracking event ").append(s1).toString(), jsonobject);
_L2:
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
_L1:
        double d1;
        h.a(((JSONObject) (obj)));
        d1 = (double)System.currentTimeMillis() / 1000D;
        ((JSONObject) (obj)).put("time", (long)d1);
        ((JSONObject) (obj)).put("distinct_id", c());
        if (long1 == null)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        ((JSONObject) (obj)).put("$duration", d1 - (double)long1.longValue() / 1000D);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        String s2;
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); ((JSONObject) (obj)).put(s2, jsonobject.get(s2)))
        {
            s2 = (String)iterator.next();
        }

        jsonobject = new a.a(s1, ((JSONObject) (obj)), e);
        c.a(jsonobject);
        if (j != null)
        {
            j.a(s1);
            return;
        }
          goto _L2
    }

    public void a(Map map)
    {
        if (map == null)
        {
            Log.e("MixpanelAPI.API", "registerSuperPropertiesMap does not accept null properties");
            return;
        }
        try
        {
            a(new JSONObject(map));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            Log.w("MixpanelAPI.API", "Can't have null keys in the properties of registerSuperPropertiesMap!");
        }
    }

    public void a(JSONObject jsonobject)
    {
        h.c(jsonobject);
    }

    i b(Context context, String s1)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            Log.i("MixpanelAPI.API", "Web Configuration, A/B Testing, and Dynamic Tweaks are not supported on this Android OS Version");
            return new e(p);
        } else
        {
            return new j(b, e, this, p);
        }
    }

    public JSONObject b()
    {
        JSONObject jsonobject = new JSONObject();
        h.a(jsonobject);
        return jsonobject;
    }

    public void b(String s1)
    {
        long l1 = System.currentTimeMillis();
        synchronized (m)
        {
            m.put(s1, Long.valueOf(l1));
        }
        return;
        s1;
        map;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public void b(String s1, String s2)
    {
        String s3 = s2;
        if (s2 == null)
        {
            s3 = c();
        }
        if (s1.equals(s3))
        {
            Log.w("MixpanelAPI.API", (new StringBuilder()).append("Attempted to alias identical distinct_ids ").append(s1).append(". Alias message will not be sent.").toString());
            return;
        }
        try
        {
            s2 = new JSONObject();
            s2.put("alias", s1);
            s2.put("original", s3);
            a("$create_alias", s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.e("MixpanelAPI.API", "Failed to alias", s1);
        }
        a();
    }

    public void b(Map map)
    {
        if (map == null)
        {
            Log.e("MixpanelAPI.API", "registerSuperPropertiesOnceMap does not accept null properties");
            return;
        }
        try
        {
            b(new JSONObject(map));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            Log.w("MixpanelAPI.API", "Can't have null keys in the properties of registerSuperPropertiesOnce!");
        }
    }

    public void b(JSONObject jsonobject)
    {
        h.d(jsonobject);
    }

    public String c()
    {
        return h.b();
    }

    public void c(String s1)
    {
        a(s1, ((JSONObject) (null)));
    }

    public void d()
    {
        h.h();
    }

    public void d(String s1)
    {
        h.d(s1);
    }

    public b e()
    {
        return f;
    }

    public void f()
    {
        h.e();
    }

    public Map g()
    {
        return l;
    }

    public void h()
    {
        Log.i("MixpanelAPI.API", "MixpanelAPI.logPosts() is deprecated.\n    To get verbose debug level logging, add\n    <meta-data android:name=\"com.mixpanel.android.MPConfig.EnableDebugLogging\" value=\"true\" />\n    to the <application> section of your AndroidManifest.xml.");
    }

    void i()
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 16 && d.p())
            {
                if (!(b.getApplicationContext() instanceof Application))
                {
                    break label0;
                }
                ((Application)b.getApplicationContext()).registerActivityLifecycleCallbacks(new com.mixpanel.android.mpmetrics.i(this));
            }
            return;
        }
        Log.i("MixpanelAPI.API", "Context is not an Application, Mixpanel will not automatically show surveys, in-app notifications, or A/B test experiments.");
    }

    com.mixpanel.android.mpmetrics.a j()
    {
        return com.mixpanel.android.mpmetrics.a.a(b);
    }

    com.mixpanel.android.mpmetrics.g k()
    {
        return com.mixpanel.android.mpmetrics.g.a(b);
    }

    g l()
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            Log.i("MixpanelAPI.API", "Surveys and Notifications are not supported on this Android OS Version");
            return new f();
        } else
        {
            return new d();
        }
    }

    com.mixpanel.android.viewcrawler.g m()
    {
        if (g instanceof j)
        {
            return (com.mixpanel.android.viewcrawler.g)g;
        } else
        {
            return null;
        }
    }

    boolean n()
    {
        return !d.h();
    }

}
