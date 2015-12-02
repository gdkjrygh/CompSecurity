// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import android.os.AsyncTask;
import android.os.SystemClock;
import com.qihoo.security.dialog.g;
import com.qihoo.security.leak.c;
import com.qihoo360.mobilesafe.b.d;
import com.qihoo360.mobilesafe.b.q;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            LeakDetailActivity

private class <init> extends AsyncTask
{

    final LeakDetailActivity a;
    private g b;

    protected transient Boolean a(Integer ainteger[])
    {
        long l = 0L;
        if (LeakDetailActivity.a(a) == null)
        {
            return Boolean.valueOf(false);
        }
        long l1 = SystemClock.elapsedRealtime();
        LeakDetailActivity.a(a).f();
        l1 = SystemClock.elapsedRealtime() - l1;
        if (l1 >= 0L)
        {
            l = l1;
        }
        if (l < 800L)
        {
            try
            {
                Thread.sleep(800L - l);
            }
            // Misplaced declaration of an exception variable
            catch (Integer ainteger[]) { }
        }
        return Boolean.valueOf(LeakDetailActivity.a(a).c());
    }

    protected void a(Boolean boolean1)
    {
        d.b(b);
        q.a().a(0x7f0c0139);
        LeakDetailActivity.b(a);
        LeakDetailActivity.a(a, null);
    }

    protected transient void a(c ac[])
    {
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Integer[])aobj);
    }

    protected void onCancelled()
    {
        super.onCancelled();
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }

    protected void onPreExecute()
    {
        if (b == null)
        {
            b = new g(a);
            b.a(0x7f0c00b7);
            b.setCancelable(false);
            b.setCanceledOnTouchOutside(false);
        }
        d.a(b);
    }

    protected void onProgressUpdate(Object aobj[])
    {
        a((c[])aobj);
    }

    private (LeakDetailActivity leakdetailactivity)
    {
        a = leakdetailactivity;
        super();
    }

    a(LeakDetailActivity leakdetailactivity, a a1)
    {
        this(leakdetailactivity);
    }
}
