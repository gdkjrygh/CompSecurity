// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class get extends Enum
{

    public static final get a;
    public static final get b;
    public static final get c;
    public static final get d;
    public static final get e;
    public static final get f;
    public static final get g;
    public static final get h;
    public static final get i;
    public static final get j;
    public static final get k;
    private static get l;
    private static final get m[];

    private get(String s, int i1)
    {
        super(s, i1);
    }

    public static get valueOf(String s)
    {
        return (get)Enum.valueOf(get, s);
    }

    public static get[] values()
    {
        return (get[])m.clone();
    }

    static 
    {
        a = new get("PERIODIC", 0);
        b = new get("TICKLE", 1);
        l = new get("MANUAL", 2);
        c = new get("BOOTSTRAP", 3);
        d = new get("POST_BOOTSTRAP", 4);
        e = new get("APP_FOREGROUND", 5);
        f = new get("ASSISTANT", 6);
        g = new get("COPY_TO_ALBUM", 7);
        h = new get("MOVIE_EDIT", 8);
        i = new get("USER_SCROLL", 9);
        j = new get("MISSING_STORY_MEDIA_COLLECTION", 10);
        k = new get("MEDIA_DETAILS", 11);
        m = (new get[] {
            a, b, l, c, d, e, f, g, h, i, 
            j, k
        });
    }
}
