// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.AsyncTask;
import com.android.slyce.report.b.a;
import com.android.slyce.report.b.d;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            f, i

class h extends AsyncTask
{

    private final i a;
    private final Activity b;
    private Bitmap c;
    private int d;

    public h(Activity activity, i j)
    {
        b = activity;
        a = j;
        d = 0xff000000;
    }

    protected transient Void a(Void avoid[])
    {
        if (c != null)
        {
            try
            {
                com.android.slyce.report.b.d.a(c, 20);
                (new Canvas(c)).drawColor(com.android.slyce.report.mpmetrics.f.a(), android.graphics.PorterDuff.Mode.SRC_ATOP);
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
        c = com.android.slyce.report.b.a.a(b, 2, 2, true);
        d = com.android.slyce.report.b.a.a(c);
    }
}
