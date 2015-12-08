// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cnt extends Enum
{

    public static final cnt a;
    public static final cnt b;
    public static final cnt c;
    public static final cnt d;
    public static final cnt e;
    public static final cnt f;
    private static final cnt h[];
    public final int g;

    private cnt(String s, int i, int j)
    {
        super(s, i);
        g = j;
    }

    public static cnt a(int i)
    {
        switch (i)
        {
        case 5: // '\005'
        case 6: // '\006'
        default:
            throw b.a((new StringBuilder(34)).append("Unsupported clip type: ").append(i).toString());

        case 1: // '\001'
            return a;

        case 2: // '\002'
            return b;

        case 3: // '\003'
            return c;

        case 7: // '\007'
            return e;

        case 4: // '\004'
            return d;
        }
    }

    public static cnt valueOf(String s)
    {
        return (cnt)Enum.valueOf(cnt, s);
    }

    public static cnt[] values()
    {
        return (cnt[])h.clone();
    }

    static 
    {
        a = new cnt("VIDEO", 0, 1);
        b = new cnt("AUDIO", 1, 2);
        c = new cnt("PHOTO", 2, 3);
        d = new cnt("EMPTY_VIDEO", 3, 4);
        e = new cnt("END_CARD", 4, 7);
        f = new cnt("DELETED", 5, -1);
        h = (new cnt[] {
            a, b, c, d, e, f
        });
    }
}
