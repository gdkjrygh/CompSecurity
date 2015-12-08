// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;


// Referenced classes of package com.skype.android.res:
//            ChatText

private static final class q extends Enum
{

    public static final o a;
    public static final o b;
    public static final o c;
    public static final o d;
    public static final o e;
    public static final o f;
    public static final o g;
    public static final o h;
    public static final o i;
    public static final o j;
    public static final o k;
    public static final o l;
    public static final o m;
    public static final o n;
    public static final o o;
    private static final o r[];
    private final String p;
    private final boolean q;

    public static q valueOf(String s)
    {
        return (q)Enum.valueOf(com/skype/android/res/ChatText$b, s);
    }

    public static q[] values()
    {
        return (q[])r.clone();
    }

    public final boolean a()
    {
        return q;
    }

    public final String b()
    {
        return p;
    }

    static 
    {
        a = new <init>("BASE", 0, "**BASE**", false);
        b = new <init>("SS", 1, "ss", true);
        c = new <init>("FLAG", 2, "flag", true);
        d = new <init>("FONT", 3, "font", true);
        e = new <init>("A", 4, "a", true);
        f = new <init>("QUOTE", 5, "quote", true);
        g = new <init>("LEGACYQUOTE", 6, "legacyquote", true);
        h = new <init>("BOLD", 7, "b", true);
        i = new <init>("CODE", 8, "pre", true);
        j = new <init>("ITALIC", 9, "i", true);
        k = new <init>("STRIKETHROUGH", 10, "s", true);
        l = new <init>("UNKNOWN", 11, "**UNKNOWN**", false);
        m = new <init>("ALT", 12, "alt", false);
        n = new <init>("TYPE", 13, "type", false);
        o = new <init>("BR", 14, "br", true);
        r = (new r[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o
        });
    }

    private (String s, int i1, String s1, boolean flag)
    {
        super(s, i1);
        p = s1;
        q = flag;
    }
}
