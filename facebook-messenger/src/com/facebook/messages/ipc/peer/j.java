// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc.peer;


public final class j extends Enum
{

    private static final j $VALUES[];
    public static final j Dash;
    public static final j Fb4a;
    public static final j Messenger;
    public static final j PMA;

    private j(String s, int i)
    {
        super(s, i);
    }

    public static j valueOf(String s)
    {
        return (j)Enum.valueOf(com/facebook/messages/ipc/peer/j, s);
    }

    public static j[] values()
    {
        return (j[])$VALUES.clone();
    }

    static 
    {
        Dash = new j("Dash", 0);
        Messenger = new j("Messenger", 1);
        Fb4a = new j("Fb4a", 2);
        PMA = new j("PMA", 3);
        $VALUES = (new j[] {
            Dash, Messenger, Fb4a, PMA
        });
    }
}
