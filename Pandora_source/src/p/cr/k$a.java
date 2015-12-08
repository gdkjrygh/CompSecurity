// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cr;

import android.net.Uri;

// Referenced classes of package p.cr:
//            k, c, f, i, 
//            h, b, l, e, 
//            g, j, m, a, 
//            n, o

private static final class n extends Enum
{

    public static final m a;
    public static final m b;
    public static final m c;
    public static final m d;
    public static final m e;
    public static final m f;
    public static final m g;
    public static final m h;
    public static final m i;
    public static final m j;
    public static final m k;
    public static final m l;
    public static final m m;
    private static final m o[];
    private m n;

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/cr/k$a, s);
    }

    public static .String[] values()
    {
        return (.String[])o.clone();
    }

    public p.cp.et.Uri a(Uri uri)
    {
        return n.a(uri);
    }

    static 
    {
        a = new <init>("createStation", 0, new c());
        b = new <init>("openGenrePicker", 1, new f());
        c = new <init>("offerUpgrade", 2, new i());
        d = new <init>("landing", 3, new h());
        e = new <init>("backstage", 4, new b());
        f = new <init>("showPrivacySettings", 5, new l());
        g = new <init>("feed", 6, new e());
        h = new <init>("inbox", 7, new g());
        i = new <init>("one", 8, new j());
        j = new <init>("profile", 9, new m());
        k = new <init>("account", 10, new a());
        l = new <init>("station", 11, new n());
        m = new <init>("stations", 12, new o());
        o = (new o[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m
        });
    }

    private .String(String s, int i1, .String s1)
    {
        super(s, i1);
        n = s1;
    }
}
