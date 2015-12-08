// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.content.Context;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            fp, cg, ct, az

public class fv extends fp
    implements com.tremorvideo.sdk.android.a.i.b
{
    public class a
        implements Runnable
    {

        Context a;
        com.tremorvideo.sdk.android.a.i.b b;
        cg c;
        final fv d;

        public void run()
        {
            c.a(a, b);
        }

        public a(Context context, com.tremorvideo.sdk.android.a.i.b b1, cg cg1)
        {
            d = fv.this;
            super();
            a = context;
            b = b1;
            c = cg1;
        }
    }


    boolean a;
    Context b;
    az c;
    cg d;

    public fv(fp.a a1, Context context, az az1)
    {
        super(a1);
        a = false;
        b = context;
        c = az1;
    }

    public void a(boolean flag, boolean flag1)
    {
        if (d != null)
        {
            d.f();
        }
        if (flag)
        {
            a(fp.b.b);
            return;
        }
        if (flag1)
        {
            ct.d("Xml Validation timed out");
            a(fp.b.c);
            return;
        } else
        {
            ct.d("Buy It Now Xml invalid");
            a(fp.b.c);
            return;
        }
    }

    protected void e()
    {
        d = c.y();
        if (d != null)
        {
            d.a(b);
            d.e();
            a a1 = new a(b, this, d);
            ((Activity)b).runOnUiThread(a1);
        }
    }

    protected void f()
    {
        a(fp.b.e);
    }

    protected void g()
    {
        d = c.y();
        if (d != null)
        {
            d.a(b);
            d.e();
            a a1 = new a(b, this, d);
            ((Activity)b).runOnUiThread(a1);
        }
    }

    public String toString()
    {
        return "JobProcessBuyItNow";
    }
}
