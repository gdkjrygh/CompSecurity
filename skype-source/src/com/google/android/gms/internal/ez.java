// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.b;

// Referenced classes of package com.google.android.gms.internal:
//            ex, hi, ey, gm, 
//            hj

public final class ez extends ex
{

    ez(Context context, gb.a a, hi hi1, fc.a a1)
    {
        super(context, a, hi1, a1);
    }

    protected final void b(long l)
        throws fa.a
    {
        Object obj = d.i();
        int i;
        int j;
        if (((AdSizeParcel) (obj)).e)
        {
            i = c.getResources().getDisplayMetrics().widthPixels;
            j = c.getResources().getDisplayMetrics().heightPixels;
        } else
        {
            i = ((AdSizeParcel) (obj)).g;
            j = ((AdSizeParcel) (obj)).d;
        }
        obj = new ey(this, d, i, j, (byte)0);
        gm.a.post(new Runnable(((ey) (obj))) {

            final ey a;
            final ez b;

            public final void run()
            {
label0:
                {
                    synchronized (b.e)
                    {
                        if (b.h.e == -2)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                b.d.j().a(b);
                a.a(b.h);
                obj1;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj1;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                b = ez.this;
                a = ey1;
                super();
            }
        });
        a(l);
        if (((ey) (obj)).c())
        {
            com.google.android.gms.ads.internal.util.client.b.a(3);
            throw new fa.a("AdNetwork sent passback url", 3);
        }
        if (!((ey) (obj)).d())
        {
            throw new fa.a("AdNetwork timed out", 2);
        } else
        {
            return;
        }
    }
}
