// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


// Referenced classes of package com.nuance.b.b:
//            fr

public final class s
{

    private static final s j = new s(1, 0, 15, 7, 50, 5, 50, 100, 1);
    private static final s k;
    private static final s l;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    private s(int i1, int j1, int k1, int l1, int i2, int j2, int k2, 
            int l2, int i3)
    {
        a = i1;
        b = i3;
        c = k2;
        d = k1;
        e = l1;
        f = j1;
        g = i2;
        h = j2;
        i = l2;
    }

    private s(s s1)
    {
        this(s1.a, s1.f, s1.d, s1.e, s1.g, s1.h, s1.c, s1.i, s1.b);
    }

    public static s a()
    {
        return new s(j);
    }

    private static String a(StringBuilder stringbuilder, String s1, String s2, int i1, int j1)
    {
        if (i1 != j1)
        {
            stringbuilder.append(s1);
            stringbuilder.append("[");
            stringbuilder.append(s2);
            stringbuilder.append(" current: ");
            stringbuilder.append(i1);
            stringbuilder.append(", ");
            stringbuilder.append("default: ");
            stringbuilder.append(j1);
            stringbuilder.append("]");
            return ", ";
        } else
        {
            return "";
        }
    }

    private void a(s s1, String s2)
    {
        StringBuilder stringbuilder = new StringBuilder();
        a(stringbuilder, a(stringbuilder, a(stringbuilder, a(stringbuilder, a(stringbuilder, a(stringbuilder, a(stringbuilder, a(stringbuilder, a(stringbuilder, "", "stopOnEndOfSpeech", a, s1.a), "vadBeginDelay", f, s1.f), "vadBeginLength", d, s1.d), "vadBeginThreshold", e, s1.e), "vadEndLength", g, s1.g), "vadEndThreshold", h, s1.h), "vadHistoryLength", c, s1.c), "vadInterSpeechLength", i, s1.i), "vadLongUtterance", b, s1.b);
        if (stringbuilder.length() > 0)
        {
            stringbuilder.insert(0, " -- ");
            stringbuilder.insert(0, s2);
            stringbuilder.insert(0, "Non-default Endpointing Values detected for ");
            fr.d(stringbuilder.toString());
        }
    }

    private static void a(StringBuffer stringbuffer, String s1, int i1, String s2)
    {
        stringbuffer.append(s2);
        stringbuffer.append(s1);
        stringbuffer.append(": ");
        stringbuffer.append(i1);
    }

    public static s c()
    {
        return new s(k);
    }

    final void b()
    {
        a(j, "Dictation");
    }

    final void d()
    {
        a(k, "Speech Interpretation");
    }

    public final int e()
    {
        return a;
    }

    public final int f()
    {
        return b;
    }

    public final int g()
    {
        return c;
    }

    public final int h()
    {
        return d;
    }

    public final int i()
    {
        return e;
    }

    public final int j()
    {
        return f;
    }

    public final int k()
    {
        return g;
    }

    public final int l()
    {
        return h;
    }

    public final int m()
    {
        return i;
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        a(stringbuffer, "stopOnEndOfSpeech", a, "");
        a(stringbuffer, "vadLongUtterance", b, ", ");
        a(stringbuffer, "vadHistoryLength", c, ", ");
        a(stringbuffer, "vadBeginLength", d, ", ");
        a(stringbuffer, "vadBeginThreshold", e, ", ");
        a(stringbuffer, "vadBeginDelay", f, ", ");
        a(stringbuffer, "vadEndLength", g, ", ");
        a(stringbuffer, "vadEndThreshold", h, ", ");
        a(stringbuffer, "vadInterSpeechLength", i, ", ");
        return stringbuffer.toString();
    }

    static 
    {
        s s1 = new s(1, 0, 15, 7, 50, 5, 50, 35, 0);
        k = s1;
        l = s1;
    }
}
