// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            h, InAppNotification, Survey, j, 
//            p

public static interface pNotification
{

    public abstract void a();

    public abstract void a(double d1, JSONObject jsonobject);

    public abstract void a(int i, Activity activity);

    public abstract void a(Activity activity);

    public abstract void a(InAppNotification inappnotification);

    public abstract void a(InAppNotification inappnotification, Activity activity);

    public abstract void a(Survey survey, Activity activity);

    public abstract void a(j j);

    public abstract void a(p p);

    public abstract void a(p p, Activity activity);

    public abstract void a(String s);

    public abstract void a(String s, double d1);

    public abstract void a(String s, InAppNotification inappnotification);

    public abstract void a(String s, Object obj);

    public abstract void a(String s, JSONArray jsonarray);

    public abstract void a(String s, JSONObject jsonobject);

    public abstract void a(Map map);

    public abstract void a(JSONObject jsonobject);

    public abstract void b();

    public abstract void b(int i, Activity activity);

    public abstract void b(Activity activity);

    public abstract void b(j j);

    public abstract void b(String s);

    public abstract void b(String s, Object obj);

    public abstract void b(Map map);

    public abstract void b(JSONObject jsonobject);

    public abstract void c();

    public abstract void c(String s);

    public abstract void c(String s, Object obj);

    public abstract void c(Map map);

    public abstract String d();

    public abstract void d(String s);

    public abstract pNotification e(String s);

    public abstract void e();

    public abstract Survey f();

    public abstract InAppNotification g();
}
