// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            ScanCodeTabFragment

public static final class f extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e g[];
    private final String f;

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(kik/android/chat/fragment/ScanCodeTabFragment$c, s);
    }

    public static f[] values()
    {
        return (f[])g.clone();
    }

    public final String a()
    {
        return f;
    }

    static 
    {
        a = new <init>("PULL", 0, "Pull");
        b = new <init>("SETTINGS", 1, "Settings");
        c = new <init>("FIND_PEOPLE", 2, "Find People");
        d = new <init>("GROUP", 3, "Group Info");
        e = new <init>("DEEP_LINK", 4, "Deep Link");
        g = (new g[] {
            a, b, c, d, e
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        f = s1;
    }
}
