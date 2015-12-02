// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;


public final class cn extends Enum
{

    private static final cn $VALUES[];
    public static final cn MORE_MESSAGES;
    public static final cn THREAD_VIEW;

    private cn(String s, int i)
    {
        super(s, i);
    }

    public static cn valueOf(String s)
    {
        return (cn)Enum.valueOf(com/facebook/orca/threadview/cn, s);
    }

    public static cn[] values()
    {
        return (cn[])$VALUES.clone();
    }

    static 
    {
        THREAD_VIEW = new cn("THREAD_VIEW", 0);
        MORE_MESSAGES = new cn("MORE_MESSAGES", 1);
        $VALUES = (new cn[] {
            THREAD_VIEW, MORE_MESSAGES
        });
    }
}
