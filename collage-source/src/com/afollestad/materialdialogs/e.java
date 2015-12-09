// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs;


public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    private static final boolean d;
    private static final e e[];

    private e(String s, int i)
    {
        super(s, i);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/afollestad/materialdialogs/e, s);
    }

    public static e[] values()
    {
        return (e[])e.clone();
    }

    public int a()
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[e.values().length];
                try
                {
                    a[e.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[e.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[e.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[ordinal()])
        {
        default:
            throw new IllegalStateException("Invalid gravity constant");

        case 1: // '\001'
            return !d ? 3 : 0x800003;

        case 2: // '\002'
            return 1;

        case 3: // '\003'
            break;
        }
        return !d ? 5 : 0x800005;
    }

    public int b()
    {
        switch (_cls1.a[ordinal()])
        {
        default:
            return 5;

        case 2: // '\002'
            return 4;

        case 3: // '\003'
            return 6;
        }
    }

    static 
    {
        boolean flag = true;
        a = new e("START", 0);
        b = new e("CENTER", 1);
        c = new e("END", 2);
        e = (new e[] {
            a, b, c
        });
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            flag = false;
        }
        d = flag;
    }
}
