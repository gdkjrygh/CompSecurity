// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ntd extends Enum
{

    public static final ntd a;
    public static final ntd b;
    public static final ntd c;
    private static final ntd d[];

    private ntd(String s, int i, int j)
    {
        super(s, i);
    }

    public static ntd valueOf(String s)
    {
        return (ntd)Enum.valueOf(ntd, s);
    }

    public static ntd[] values()
    {
        return (ntd[])d.clone();
    }

    static 
    {
        a = new ntd("IMPORTANT", 0, 1);
        b = new ntd("UNREAD", 1, 2);
        c = new ntd("OTHER", 2, 3);
        d = (new ntd[] {
            a, b, c
        });
        ntn.a(ntd);
    }
}
