// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.widget.ImageView;

// Referenced classes of package com.google.userfeedback.android.api:
//            g, m, ah, f, 
//            UserFeedbackActivity

final class r extends AsyncTask
{

    int a;
    ImageView b;
    final Activity c;
    final UserFeedbackActivity d;

    r(UserFeedbackActivity userfeedbackactivity, Activity activity)
    {
        d = userfeedbackactivity;
        c = activity;
        super();
    }

    private transient Void a()
    {
        b = (ImageView)c.findViewById(g.gf_app_icon);
        Object obj = m.c.a.a;
        String s = ((Context) (obj)).getPackageName();
        obj = ((Context) (obj)).getPackageManager();
        a = f.gf_icon;
        try
        {
            a = ((PackageManager) (obj)).getApplicationInfo(s, 0).icon;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception) { }
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        b.setImageResource(a);
    }
}
