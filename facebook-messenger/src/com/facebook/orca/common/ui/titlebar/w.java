// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;


public final class w extends Enum
{

    private static final w $VALUES[];
    public static final w FACEBOOK;
    public static final w SMS_ONLY;

    private w(String s, int i)
    {
        super(s, i);
    }

    public static w valueOf(String s)
    {
        return (w)Enum.valueOf(com/facebook/orca/common/ui/titlebar/w, s);
    }

    public static w[] values()
    {
        return (w[])$VALUES.clone();
    }

    static 
    {
        FACEBOOK = new w("FACEBOOK", 0);
        SMS_ONLY = new w("SMS_ONLY", 1);
        $VALUES = (new w[] {
            FACEBOOK, SMS_ONLY
        });
    }
}
