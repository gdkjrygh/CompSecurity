// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cr;

import com.pandora.android.util.p;

// Referenced classes of package p.cr:
//            b

public static final class f extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d g[];
    public final p e;
    public final String f;

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/cr/b$a, s);
    }

    public static .String[] values()
    {
        return (.String[])g.clone();
    }

    static 
    {
        a = new <init>("artist", 0, p.D, "artist_detail");
        b = new <init>("track", 1, p.C, "track_detail");
        c = new <init>("album", 2, p.E, "album_detail");
        d = new <init>("profile", 3, p.l, "profile");
        g = (new g[] {
            a, b, c, d
        });
    }

    private .String(String s, int i, p p1, String s1)
    {
        super(s, i);
        e = p1;
        f = s1;
    }
}
