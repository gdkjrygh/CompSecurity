// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;

public final class agy extends agv
{

    agy(Context context, aio aio, akk akk1, ahc ahc)
    {
        super(context, aio, akk1, ahc);
    }

    protected final void b(long l)
    {
        Object obj = d.h();
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
        obj = new agw(this, d, i, j, (byte)0);
        ajc.a.post(new _cls1(((agw) (obj))));
        a(l);
        if (((agw) (obj)).c())
        {
            of.a("Ad-Network indicated no fill with passback URL.");
            throw new aha("AdNetwork sent passback url", 3);
        }
        if (!((agw) (obj)).d())
        {
            throw new aha("AdNetwork timed out", 2);
        } else
        {
            return;
        }
    }

    /* member class not found */
    class _cls1 {}

}
