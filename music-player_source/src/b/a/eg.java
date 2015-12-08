// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


public final class eg extends Enum
{

    public static final eg a;
    public static final eg b;
    public static final eg c;
    public static final eg d;
    private static final eg f[];
    private final int e;

    private eg(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static eg a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return b;

        case 2: // '\002'
            return c;

        case 3: // '\003'
            return d;
        }
    }

    public static eg valueOf(String s)
    {
        return (eg)Enum.valueOf(b/a/eg, s);
    }

    public static eg[] values()
    {
        return (eg[])f.clone();
    }

    public final int a()
    {
        return e;
    }

    static 
    {
        a = new eg("ANDROID", 0, 0);
        b = new eg("IOS", 1, 1);
        c = new eg("WINDOWS_PHONE", 2, 2);
        d = new eg("WINDOWS_RT", 3, 3);
        f = (new eg[] {
            a, b, c, d
        });
    }
}
