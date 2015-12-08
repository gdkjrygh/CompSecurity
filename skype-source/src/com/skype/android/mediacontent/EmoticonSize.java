// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public final class EmoticonSize extends Enum
{

    public static final EmoticonSize a;
    public static final EmoticonSize b;
    public static final EmoticonSize c;
    private static final EmoticonSize d[];

    private EmoticonSize(String s, int i)
    {
        super(s, i);
    }

    public static EmoticonSize valueOf(String s)
    {
        return (EmoticonSize)Enum.valueOf(com/skype/android/mediacontent/EmoticonSize, s);
    }

    public static EmoticonSize[] values()
    {
        return (EmoticonSize[])d.clone();
    }

    public final int a(Context context)
    {
        float f;
        int i;
        i = context.getResources().getDisplayMetrics().densityDpi;
        f = 30F;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[EmoticonSize.values().length];
                try
                {
                    a[EmoticonSize.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[EmoticonSize.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[EmoticonSize.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[ordinal()];
        JVM INSTR tableswitch 1 3: default 48
    //                   1 143
    //                   2 155
    //                   3 167;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_167;
_L5:
        int j;
        float f1;
        if (this == c)
        {
            context = new int[5];
            context;
            context[0] = 40;
            context[1] = 60;
            context[2] = 80;
            context[3] = 96;
            context[4] = 120;
        } else
        {
            context = new int[5];
            context;
            context[0] = 20;
            context[1] = 30;
            context[2] = 40;
            context[3] = 60;
            context[4] = 80;
        }
        j = 0;
        f1 = 2.147484E+09F;
        for (i = 0; i < 5;)
        {
            float f3 = Math.abs((float)context[i] - f);
            float f2 = f1;
            if (f3 < f1)
            {
                f2 = f3;
                j = i;
            }
            i++;
            f1 = f2;
        }

        break MISSING_BLOCK_LABEL_213;
_L2:
        f = (int)((float)i / 7F);
          goto _L5
_L3:
        f = (int)((float)i / 4F);
          goto _L5
        f = (int)((float)i / 3F);
          goto _L5
        return context[j];
    }

    final String b(Context context)
    {
        return (new StringBuilder("default_")).append(a(context)).toString();
    }

    static 
    {
        a = new EmoticonSize("SMALL", 0);
        b = new EmoticonSize("MEDIUM", 1);
        c = new EmoticonSize("LARGE", 2);
        d = (new EmoticonSize[] {
            a, b, c
        });
    }
}
