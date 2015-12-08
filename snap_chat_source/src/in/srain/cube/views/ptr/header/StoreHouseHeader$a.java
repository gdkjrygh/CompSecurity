// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package in.srain.cube.views.ptr.header;

import afF;
import java.util.ArrayList;

// Referenced classes of package in.srain.cube.views.ptr.header:
//            StoreHouseHeader

final class <init>
    implements Runnable
{

    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private StoreHouseHeader f;

    static void a(<init> <init>1)
    {
        <init>1.e = true;
        <init>1.a = 0;
        <init>1.d = StoreHouseHeader.a(<init>1.f) / <init>1.f.a.size();
        <init>1.b = StoreHouseHeader.b(<init>1.f) / <init>1.d;
        <init>1.c = <init>1.f.a.size() / <init>1.b + 1;
        <init>1.run();
    }

    static void b(run run1)
    {
        run1.e = false;
        run1.f.removeCallbacks(run1);
    }

    public final void run()
    {
        int j = a;
        int k = b;
        for (int i = 0; i < c; i++)
        {
            int l = b * i + j % k;
            if (l <= a)
            {
                int i1 = f.a.size();
                afF aff = (afF)f.a.get(l % i1);
                aff.setFillAfter(false);
                aff.setFillEnabled(true);
                aff.setFillBefore(false);
                aff.setDuration(StoreHouseHeader.c(f));
                aff.a(StoreHouseHeader.d(f), StoreHouseHeader.e(f));
            }
        }

        a = a + 1;
        if (e)
        {
            f.postDelayed(this, d);
        }
    }

    private (StoreHouseHeader storehouseheader)
    {
        f = storehouseheader;
        super();
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = true;
    }

    e(StoreHouseHeader storehouseheader, byte byte0)
    {
        this(storehouseheader);
    }
}
