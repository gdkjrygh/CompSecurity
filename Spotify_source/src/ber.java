// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.client.AdSizeParcel;

public final class ber
{

    public static final ber a = new ber(320, 50, "320x50_mb");
    public static final ber b = new ber(468, 60, "468x60_as");
    public static final ber c = new ber(320, 100, "320x100_as");
    public static final ber d = new ber(728, 90, "728x90_as");
    public static final ber e = new ber(300, 250, "300x250_as");
    public static final ber f = new ber(160, 600, "160x600_as");
    public static final ber g = new ber(-1, -2, "smart_banner");
    public static final ber h = new ber(-3, -4, "fluid");
    public final int i;
    public final int j;
    private final String k;

    public ber(int l, int i1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (l == -1)
        {
            s = "FULL";
        } else
        {
            s = String.valueOf(l);
        }
        stringbuilder = stringbuilder.append(s).append("x");
        if (i1 == -2)
        {
            s = "AUTO";
        } else
        {
            s = String.valueOf(i1);
        }
        this(l, i1, stringbuilder.append(s).append("_as").toString());
    }

    ber(int l, int i1, String s)
    {
        if (l < 0 && l != -1 && l != -3)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid width for AdSize: ")).append(l).toString());
        }
        if (i1 < 0 && i1 != -2 && i1 != -4)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid height for AdSize: ")).append(i1).toString());
        } else
        {
            i = l;
            j = i1;
            k = s;
            return;
        }
    }

    public final int a(Context context)
    {
        switch (j)
        {
        default:
            bfq.a();
            return bjz.a(context, j);

        case -2: 
            return AdSizeParcel.b(context.getResources().getDisplayMetrics());

        case -4: 
        case -3: 
            return -1;
        }
    }

    public final int b(Context context)
    {
        switch (i)
        {
        case -2: 
        default:
            bfq.a();
            return bjz.a(context, i);

        case -1: 
            return AdSizeParcel.a(context.getResources().getDisplayMetrics());

        case -4: 
        case -3: 
            return -1;
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ber))
            {
                return false;
            }
            obj = (ber)obj;
            if (i != ((ber) (obj)).i || j != ((ber) (obj)).j || !k.equals(((ber) (obj)).k))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return k.hashCode();
    }

    public final String toString()
    {
        return k;
    }

}
