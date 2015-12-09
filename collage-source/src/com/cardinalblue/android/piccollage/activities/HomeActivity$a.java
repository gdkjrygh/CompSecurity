// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.cardinalblue.android.piccollage.controller.network.f;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            HomeActivity

private class <init> extends AsyncTask
{

    final HomeActivity a;

    protected transient Void a(String as[])
    {
        as = as[0];
        if (!TextUtils.isEmpty(as))
        {
            try
            {
                f.a(a, as);
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                com.cardinalblue.android.piccollage.a.f.a(as);
            }
        }
        return null;
    }

    protected void a(Void void1)
    {
        HomeActivity.a(a, null);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    private (HomeActivity homeactivity)
    {
        a = homeactivity;
        super();
    }

    a(HomeActivity homeactivity, a a1)
    {
        this(homeactivity);
    }
}
