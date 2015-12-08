// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cys extends Enum
{

    public static final cys a;
    public static final cys b;
    public static final cys c;
    public static final cys d;
    public static final cys e;
    public static final cys f;
    public static final cys g;
    public static final cys h;
    private static final cys i[];

    private cys(String s, int j)
    {
        super(s, j);
    }

    public static cys valueOf(String s)
    {
        return (cys)Enum.valueOf(cys, s);
    }

    public static cys[] values()
    {
        return (cys[])i.clone();
    }

    static 
    {
        a = new cys("CLIP_SELECTION", 0);
        b = new cys("ALL_USER_EDITS", 1);
        c = new cys("PARTIAL_USER_EDITS", 2);
        d = new cys("THEME_APPLICATION", 3);
        e = new cys("EFFECTS", 4);
        f = new cys("BEAT_MATCHING", 5);
        g = new cys("TITLE", 6);
        h = new cys("NONE", 7);
        i = (new cys[] {
            a, b, c, d, e, f, g, h
        });
    }
}
