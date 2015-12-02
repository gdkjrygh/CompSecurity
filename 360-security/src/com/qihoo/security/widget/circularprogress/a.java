// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.circularprogress;


class a
{

    static void a(float f)
    {
        if (f <= 0.0F)
        {
            throw new IllegalArgumentException("Speed must be >= 0");
        } else
        {
            return;
        }
    }

    static void a(float f, String s)
    {
        if (f < 0.0F)
        {
            throw new IllegalArgumentException(String.format("%s %d must be positive", new Object[] {
                s, Float.valueOf(f)
            }));
        } else
        {
            return;
        }
    }

    static void a(int i)
    {
        if (i < 0 || i > 360)
        {
            throw new IllegalArgumentException(String.format("Illegal angle %d: must be >=0 and <= 360", new Object[] {
                Integer.valueOf(i)
            }));
        } else
        {
            return;
        }
    }

    static void a(int ai[])
    {
        if (ai == null || ai.length == 0)
        {
            throw new IllegalArgumentException("You must provide at least 1 color");
        } else
        {
            return;
        }
    }
}
