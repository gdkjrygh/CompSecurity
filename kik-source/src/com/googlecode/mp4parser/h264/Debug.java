// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.h264;

import java.io.PrintStream;
import java.nio.ShortBuffer;

public class Debug
{

    public static final boolean debug = false;

    public Debug()
    {
    }

    public static void print(int i)
    {
    }

    public static void print(String s)
    {
    }

    public static void print(short aword0[])
    {
        int i;
        int j;
        j = 0;
        i = 0;
_L2:
        if (j >= 8)
        {
            return;
        }
        int k = 0;
        do
        {
label0:
            {
                if (k < 8)
                {
                    break label0;
                }
                System.out.println();
                j++;
            }
            if (true)
            {
                continue;
            }
            System.out.printf("%3d, ", new Object[] {
                Short.valueOf(aword0[i])
            });
            i++;
            k++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static final void print8x8(ShortBuffer shortbuffer)
    {
        int i = 0;
_L2:
        if (i >= 8)
        {
            return;
        }
        int j = 0;
        do
        {
label0:
            {
                if (j < 8)
                {
                    break label0;
                }
                System.out.println();
                i++;
            }
            if (true)
            {
                continue;
            }
            System.out.printf("%3d, ", new Object[] {
                Short.valueOf(shortbuffer.get())
            });
            j++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static final void print8x8(int ai[])
    {
        int i;
        int j;
        j = 0;
        i = 0;
_L2:
        if (j >= 8)
        {
            return;
        }
        int k = 0;
        do
        {
label0:
            {
                if (k < 8)
                {
                    break label0;
                }
                System.out.println();
                j++;
            }
            if (true)
            {
                continue;
            }
            System.out.printf("%3d, ", new Object[] {
                Integer.valueOf(ai[i])
            });
            i++;
            k++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static final void print8x8(short aword0[])
    {
        int i;
        int j;
        j = 0;
        i = 0;
_L2:
        if (j >= 8)
        {
            return;
        }
        int k = 0;
        do
        {
label0:
            {
                if (k < 8)
                {
                    break label0;
                }
                System.out.println();
                j++;
            }
            if (true)
            {
                continue;
            }
            System.out.printf("%3d, ", new Object[] {
                Short.valueOf(aword0[i])
            });
            i++;
            k++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void println(String s)
    {
    }

    public static transient void trace(String s, Object aobj[])
    {
    }
}
