// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.client.AdSizeParcel;

public final class jnr
{

    public final int a;
    public final int b;
    private final String c;

    public jnr(int i, int j)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (i == -1)
        {
            s = "FULL";
        } else
        {
            s = String.valueOf(i);
        }
        stringbuilder = stringbuilder.append(s).append("x");
        if (j == -2)
        {
            s = "AUTO";
        } else
        {
            s = String.valueOf(j);
        }
        this(i, j, stringbuilder.append(s).append("_as").toString());
    }

    public jnr(int i, int j, String s)
    {
        if (i < 0 && i != -1)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid width for AdSize: ")).append(i).toString());
        }
        if (j < 0 && j != -2)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid height for AdSize: ")).append(j).toString());
        } else
        {
            a = i;
            b = j;
            c = s;
            return;
        }
    }

    public final int a(Context context)
    {
        if (b == -2)
        {
            return AdSizeParcel.b(context.getResources().getDisplayMetrics());
        } else
        {
            return jof.a().a(context, b);
        }
    }

    public final int b(Context context)
    {
        if (a == -1)
        {
            return AdSizeParcel.a(context.getResources().getDisplayMetrics());
        } else
        {
            return jof.a().a(context, a);
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof jnr))
            {
                return false;
            }
            obj = (jnr)obj;
            if (a != ((jnr) (obj)).a || b != ((jnr) (obj)).b || !c.equals(((jnr) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return c.hashCode();
    }

    public final String toString()
    {
        return c;
    }

    static 
    {
        new jnr(320, 50, "320x50_mb");
        new jnr(468, 60, "468x60_as");
        new jnr(320, 100, "320x100_as");
        new jnr(728, 90, "728x90_as");
        new jnr(300, 250, "300x250_as");
        new jnr(160, 600, "160x600_as");
        new jnr(-1, -2, "smart_banner");
    }
}
