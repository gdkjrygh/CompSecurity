// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class c extends Enum
{

    public static final b a;
    public static final b b;
    private static final b d[];
    String c;

    public static ang.String valueOf(String s)
    {
        return (f)Enum.valueOf(aab$a, s);
    }

    public static ang.String[] values()
    {
        return ([])d.clone();
    }

    static 
    {
        a = new <init>("FOREGROUND", 0, "foregrounded");
        b = new <init>("BACKGROUND", 1, "backgrounded");
        d = (new d[] {
            a, b
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        c = s1;
    }
}
