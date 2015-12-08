// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;


public final class  extends Enum
{

    private static final Closed $VALUES[];
    public static final Closed Closed;
    public static final Closed Open;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Open = new <init>("Open", 0);
        Closed = new <init>("Closed", 1);
        $VALUES = (new .VALUES[] {
            Open, Closed
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
