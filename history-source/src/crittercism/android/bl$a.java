// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


// Referenced classes of package crittercism.android:
//            bl

public static final class c extends Enum
{

    public static final b a;
    public static final b b;
    private static final b d[];
    private String c;

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(crittercism/android/bl$a, s);
    }

    public static c[] values()
    {
        return (c[])d.clone();
    }

    public final String a()
    {
        return c;
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
