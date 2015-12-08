// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dtn extends Enum
{

    public static final dtn a;
    public static final dtn b;
    public static final dtn c;
    private static final dtn d[];

    private dtn(String s, int i)
    {
        super(s, i);
    }

    public static dtn valueOf(String s)
    {
        return (dtn)Enum.valueOf(dtn, s);
    }

    public static dtn[] values()
    {
        return (dtn[])d.clone();
    }

    static 
    {
        a = new dtn("NONE", 0);
        b = new dtn("ONLY_WITH_GOOGLE_PLAY", 1);
        c = new dtn("ONLY_WITHOUT_GOOGLE_PLAY", 2);
        d = (new dtn[] {
            a, b, c
        });
    }
}
