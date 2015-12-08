// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


final class kf extends Enum
{

    public static final kf a;
    public static final kf b;
    public static final kf c;
    private static final kf d[];

    private kf(String s, int i)
    {
        super(s, i);
    }

    public static kf valueOf(String s)
    {
        return (kf)Enum.valueOf(b/a/kf, s);
    }

    public static kf[] values()
    {
        return (kf[])d.clone();
    }

    static 
    {
        a = new kf("NONE", 0);
        b = new kf("TYPE", 1);
        c = new kf("INSTANCE", 2);
        d = (new kf[] {
            a, b, c
        });
    }
}
