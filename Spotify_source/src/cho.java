// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;

public final class cho extends chl
{

    private chm e;

    cho(Context context, ciu ciu, ckw ckw1, chq chq)
    {
        super(context, ciu, ckw1, chq);
    }

    protected final void a()
    {
        Object obj = b.j();
        int i;
        int j;
        if (((AdSizeParcel) (obj)).e)
        {
            obj = a.getResources().getDisplayMetrics();
            i = ((DisplayMetrics) (obj)).widthPixels;
            j = ((DisplayMetrics) (obj)).heightPixels;
        } else
        {
            i = ((AdSizeParcel) (obj)).g;
            j = ((AdSizeParcel) (obj)).d;
        }
        e = new chm(this, b, i, j, (byte)0);
        b.k().d = this;
        e.a(c);
    }

    protected final int b()
    {
        if (e.b())
        {
            bka.a("Ad-Network indicated no fill with passback URL.");
            return 3;
        }
        return e.c() ? -2 : 2;
    }
}
