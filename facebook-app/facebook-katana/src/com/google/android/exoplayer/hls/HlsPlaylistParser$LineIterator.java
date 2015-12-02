// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.hls;

import java.io.BufferedReader;
import java.util.Queue;

class a
{

    private final BufferedReader a;
    private final Queue b;
    private String c;

    public final boolean a()
    {
        if (c != null)
        {
            return true;
        }
        if (!b.isEmpty())
        {
            c = (String)b.poll();
            return true;
        }
        do
        {
            String s = a.readLine();
            c = s;
            if (s != null)
            {
                c = c.trim();
                if (!c.isEmpty())
                {
                    return true;
                }
            } else
            {
                return false;
            }
        } while (true);
    }

    public final String b()
    {
        if (a())
        {
            String s = c;
            c = null;
            return s;
        } else
        {
            return null;
        }
    }

    public (Queue queue, BufferedReader bufferedreader)
    {
        b = queue;
        a = bufferedreader;
    }
}
