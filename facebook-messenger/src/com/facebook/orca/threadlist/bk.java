// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;


public final class bk extends Enum
{

    private static final bk $VALUES[];
    public static final bk MORE_THREADS;
    public static final bk THREAD_LIST;

    private bk(String s, int i)
    {
        super(s, i);
    }

    public static bk valueOf(String s)
    {
        return (bk)Enum.valueOf(com/facebook/orca/threadlist/bk, s);
    }

    public static bk[] values()
    {
        return (bk[])$VALUES.clone();
    }

    static 
    {
        THREAD_LIST = new bk("THREAD_LIST", 0);
        MORE_THREADS = new bk("MORE_THREADS", 1);
        $VALUES = (new bk[] {
            THREAD_LIST, MORE_THREADS
        });
    }
}
