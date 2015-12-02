// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;


final class c extends Enum
{

    private static final c $VALUES[];
    public static final c ALLOW;
    public static final c CANCEL;

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/facebook/orca/camera/c, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
    }

    static 
    {
        CANCEL = new c("CANCEL", 0);
        ALLOW = new c("ALLOW", 1);
        $VALUES = (new c[] {
            CANCEL, ALLOW
        });
    }
}
