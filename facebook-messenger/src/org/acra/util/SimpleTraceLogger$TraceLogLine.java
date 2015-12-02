// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra.util;


public class time
{

    public final long time;
    public final String trace;

    public String toString()
    {
        return String.format("[%d] %s", new Object[] {
            Long.valueOf(time), trace
        });
    }

    (String s, long l)
    {
        trace = s;
        time = l;
    }
}
