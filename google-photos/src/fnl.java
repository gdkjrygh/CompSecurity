// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fnl extends Enum
{

    public static final fnl a;
    public static final fnl b;
    public static final fnl c;
    public static final fnl d;
    public static final fnl e;
    public static final fnl f;
    public static final fnl g;
    public static final fnl h;
    public static final fnl i;
    public static final fnl j;
    public static final fnl k;
    public static final fnl l;
    public static final fnl m;
    private static fnl n;
    private static final fnl p[];
    private final String o;

    private fnl(String s, int i1, String s1)
    {
        super(s, i1);
        o = s1;
    }

    public static fnl a(faz faz1)
    {
        switch (fnm.a[faz1.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return a;

        case 2: // '\002'
            return c;

        case 3: // '\003'
            return d;
        }
    }

    public static fnl valueOf(String s)
    {
        return (fnl)Enum.valueOf(fnl, s);
    }

    public static fnl[] values()
    {
        return (fnl[])p.clone();
    }

    public final String toString()
    {
        return o;
    }

    static 
    {
        a = new fnl("ASSISTANT", 0, "assistant");
        b = new fnl("CREATIONS", 1, "creations");
        c = new fnl("PHOTOS", 2, "photos");
        d = new fnl("COLLECTIONS", 3, "collections");
        e = new fnl("DEVICE_FOLDERS", 4, "device");
        f = new fnl("DELETE", 5, "delete");
        g = new fnl("EDITOR", 6, "editor");
        n = new fnl("SHARED", 7, "shared");
        h = new fnl("TRASH", 8, "trash");
        i = new fnl("SETTINGS", 9, "settings");
        j = new fnl("SEARCH", 10, "search");
        k = new fnl("FACE_GROUPING", 11, "face");
        l = new fnl("AUTO_BACKUP", 12, "abmobile");
        m = new fnl("STORAGE", 13, "storage");
        p = (new fnl[] {
            a, b, c, d, e, f, g, n, h, i, 
            j, k, l, m
        });
    }
}
