// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.AsyncTask;
import com.mixpanel.android.util.a;
import com.mixpanel.android.util.e;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            b

private static class d extends AsyncTask
{

    private final c a;
    private final Activity b;
    private Bitmap c;
    private int d;

    protected transient Void a(Void avoid[])
    {
        if (c != null)
        {
            try
            {
                e.a(c, 20);
                (new Canvas(c)).drawColor(com.mixpanel.android.mpmetrics.b.a(), android.graphics.erDuff.Mode.SRC_ATOP);
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                c = null;
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                c = null;
                return null;
            }
        }
        return null;
    }

    protected void a(Void void1)
    {
        a.a(c, d);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    protected void onPreExecute()
    {
        c = com.mixpanel.android.util.a.a(b, 2, 2, true);
        d = com.mixpanel.android.util.a.a(c);
    }

    public ption(Activity activity, ption ption)
    {
        b = activity;
        a = ption;
        d = 0xff000000;
    }
}
