// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;


public final class ChartPointDeclaration
{
    public static final class Usage extends Enum
    {

        public static final Usage a;
        public static final Usage b;
        public static final Usage c;
        public static final Usage d;
        public static final Usage e;
        public static final Usage f;
        public static final Usage g;
        private static final Usage h[];

        public static Usage valueOf(String s)
        {
            return (Usage)Enum.valueOf(com/artfulbits/aiCharts/Base/ChartPointDeclaration$Usage, s);
        }

        public static Usage[] values()
        {
            return (Usage[])h.clone();
        }

        static 
        {
            a = new Usage("YValue", 0);
            b = new Usage("SizeValue", 1);
            c = new Usage("LowValue", 2);
            d = new Usage("HighValue", 3);
            e = new Usage("OpenValue", 4);
            f = new Usage("CloseValue", 5);
            g = new Usage("MarkerValue", 6);
            h = (new Usage[] {
                a, b, c, d, e, f, g
            });
        }

        private Usage(String s, int i)
        {
            super(s, i);
        }
    }


    public static final ChartPointDeclaration a = new ChartPointDeclaration();
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    private ChartPointDeclaration()
    {
        b = 0;
        h = 0;
        c = 1;
        d = 0;
        e = 1;
        f = 2;
        g = 3;
    }

    public transient ChartPointDeclaration(Usage ausage[])
    {
        if (ausage == null)
        {
            throw new NullPointerException("usages");
        } else
        {
            b = a(ausage, Usage.a);
            c = a(ausage, Usage.b);
            d = a(ausage, Usage.c);
            e = a(ausage, Usage.d);
            f = a(ausage, Usage.e);
            g = a(ausage, Usage.f);
            h = a(ausage, Usage.g);
            return;
        }
    }

    public ChartPointDeclaration(Usage ausage[], int ai[])
    {
        if (ausage == null)
        {
            throw new NullPointerException("usages");
        }
        if (ai == null)
        {
            throw new NullPointerException("indices");
        }
        if (ai.length != ausage.length)
        {
            throw new ArrayIndexOutOfBoundsException("usages and indices arrays should be the same size");
        } else
        {
            b = ai[a(ausage, Usage.a)];
            c = ai[a(ausage, Usage.b)];
            d = ai[a(ausage, Usage.c)];
            e = ai[a(ausage, Usage.d)];
            f = ai[a(ausage, Usage.e)];
            g = ai[a(ausage, Usage.f)];
            h = ai[a(ausage, Usage.g)];
            return;
        }
    }

    private static int a(Usage ausage[], Usage usage)
    {
        for (int i = 0; i < ausage.length; i++)
        {
            if (usage == ausage[i])
            {
                return i;
            }
        }

        return -1;
    }

    public final transient int[] a(Usage ausage[])
    {
        int ai[];
        int i;
        ai = new int[ausage.length];
        i = 0;
_L10:
        if (i >= ai.length)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Usage.values().length];
                try
                {
                    a[Usage.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[Usage.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[Usage.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[Usage.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Usage.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Usage.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Usage.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[ausage[i].ordinal()];
        JVM INSTR tableswitch 1 7: default 64
    //                   1 71
    //                   2 81
    //                   3 91
    //                   4 101
    //                   5 111
    //                   6 121
    //                   7 131;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_131;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L11:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
        ai[i] = b;
          goto _L11
_L3:
        ai[i] = c;
          goto _L11
_L4:
        ai[i] = d;
          goto _L11
_L5:
        ai[i] = e;
          goto _L11
_L6:
        ai[i] = f;
          goto _L11
_L7:
        ai[i] = g;
          goto _L11
        ai[i] = h;
          goto _L11
        return ai;
    }

}
