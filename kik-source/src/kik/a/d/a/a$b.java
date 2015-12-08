// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d.a;


// Referenced classes of package kik.a.d.a:
//            a

public static final class g extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f h[];
    String g;

    public static ng valueOf(String s)
    {
        return (ng)Enum.valueOf(kik/a/d/a/a$b, s);
    }

    public static ng[] values()
    {
        return (ng[])h.clone();
    }

    public final String a()
    {
        return g;
    }

    public final boolean a(g g1)
    {
        if (g1 == null)
        {
            return false;
        } else
        {
            return g1.g.equals(g);
        }
    }

    static 
    {
        a = new <init>("CONTENT_LAYOUT_DEFAULT", 0, "");
        b = new <init>("CONTENT_LAYOUT_PHOTO", 1, "photo");
        c = new <init>("CONTENT_LAYOUT_ARTICLE", 2, "article");
        d = new <init>("CONTENT_LAYOUT_FULL_BLEED", 3, "full_bleed");
        e = new <init>("CONTENT_LAYOUT_VIDEO", 4, "video");
        f = new <init>("CONTENT_LAYOUT_BANNER", 5, "banner");
        h = (new h[] {
            a, b, c, d, e, f
        });
    }

    private ng(String s, int i, String s1)
    {
        super(s, i);
        g = s1;
    }
}
