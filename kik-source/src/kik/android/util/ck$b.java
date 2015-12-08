// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;


// Referenced classes of package kik.android.util:
//            ck

public static final class f extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c g[];
    public final String d;
    public final String e;
    public final String f;

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(kik/android/util/ck$b, s);
    }

    public static [] values()
    {
        return ([])g.clone();
    }

    static 
    {
        a = new <init>("PROMOTED", 0, "promoted", "Promoted Chat Add", "Promoted Chat Message");
        b = new <init>("SUGGESTED", 1, "suggested", "Suggested Chat Add", "Suggested Chat Message");
        c = new <init>("PREMIUM", 2, "premium", "Premium Promoted Chat Add", "Premium Promoted Chat Message");
        g = (new g[] {
            a, b, c
        });
    }

    private (String s, int i, String s1, String s2, String s3)
    {
        super(s, i);
        d = s1;
        e = s2;
        f = s3;
    }
}
