// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public final class ffw extends Enum
{

    public static final ffw a;
    public static final ffw b;
    public static final ffw c;
    public static final ffw d;
    public static final ffw e;
    public static final ffw f;
    public static final ffw g;
    public static final ffw h;
    public static final ffw i;
    public static final ffw j;
    public static final ffw k;
    private static final ffw p[];
    final msp l;
    final Integer m;
    private final Integer n;
    private final Integer o;

    private ffw(String s, int i1, Integer integer, Integer integer1, msp msp)
    {
        this(s, i1, integer, integer1, msp, null);
    }

    private ffw(String s, int i1, Integer integer, Integer integer1, msp msp, Integer integer2)
    {
        super(s, i1);
        n = integer;
        o = integer1;
        l = msp;
        m = integer2;
    }

    public static ffw a(faz faz1)
    {
        switch (ffx.a[faz1.ordinal()])
        {
        default:
            faz1 = String.valueOf(faz1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(faz1).length() + 27)).append("Unknown PhotosDestination: ").append(faz1).toString());

        case 1: // '\001'
            return b;

        case 2: // '\002'
            return a;

        case 3: // '\003'
            return c;
        }
    }

    public static ffw valueOf(String s)
    {
        return (ffw)Enum.valueOf(ffw, s);
    }

    public static ffw[] values()
    {
        return (ffw[])p.clone();
    }

    public final String a(Context context)
    {
        return context.getResources().getString(n.intValue());
    }

    public final boolean a()
    {
        return m != null;
    }

    public final Drawable b(Context context)
    {
        return context.getResources().getDrawable(o.intValue());
    }

    static 
    {
        a = new ffw("PHOTOS", 0, Integer.valueOf(b.oq), Integer.valueOf(p.G), pwv.g);
        b = new ffw("ASSISTANT", 1, Integer.valueOf(b.ol), Integer.valueOf(p.E), pwv.h);
        c = new ffw("COLLECTIONS", 2, Integer.valueOf(b.om), Integer.valueOf(p.F), pwv.i);
        d = new ffw("SEARCH", 3, Integer.valueOf(b.or), Integer.valueOf(p.L), pwv.l, Integer.valueOf(b.os));
        e = new ffw("SHARED_LINKS", 4, Integer.valueOf(b.ov), Integer.valueOf(p.K), pwv.n);
        f = new ffw("SHARED_ALBUMS", 5, Integer.valueOf(b.ou), Integer.valueOf(p.K), pwv.n);
        g = new ffw("DEVICE_FOLDERS", 6, Integer.valueOf(b.on), Integer.valueOf(p.I), pwv.k);
        h = new ffw("TRASH", 7, Integer.valueOf(b.ow), Integer.valueOf(p.H), pwv.o);
        i = new ffw("SETTINGS", 8, Integer.valueOf(b.ot), Integer.valueOf(p.M), pwv.m);
        j = new ffw("HELP", 9, Integer.valueOf(b.oo), Integer.valueOf(p.J), pwv.j);
        k = new ffw("DIVIDER", 10, null, null, null);
        p = (new ffw[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
