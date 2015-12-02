// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;


final class ad extends Enum
{

    private static final ad $VALUES[];
    public static final ad CONNECTING;
    public static final ad IN_CALL;
    public static final ad NONE;

    private ad(String s, int i)
    {
        super(s, i);
    }

    public static ad valueOf(String s)
    {
        return (ad)Enum.valueOf(com/facebook/orca/fbwebrtc/ad, s);
    }

    public static ad[] values()
    {
        return (ad[])$VALUES.clone();
    }

    static 
    {
        NONE = new ad("NONE", 0);
        CONNECTING = new ad("CONNECTING", 1);
        IN_CALL = new ad("IN_CALL", 2);
        $VALUES = (new ad[] {
            NONE, CONNECTING, IN_CALL
        });
    }
}
