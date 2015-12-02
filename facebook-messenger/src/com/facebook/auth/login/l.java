// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;


public final class l extends Enum
{

    private static final l $VALUES[];
    public static final l LOGO_SLIDE;
    public static final l NONE;

    private l(String s, int i)
    {
        super(s, i);
    }

    public static l valueOf(String s)
    {
        return (l)Enum.valueOf(com/facebook/auth/login/l, s);
    }

    public static l[] values()
    {
        return (l[])$VALUES.clone();
    }

    static 
    {
        NONE = new l("NONE", 0);
        LOGO_SLIDE = new l("LOGO_SLIDE", 1);
        $VALUES = (new l[] {
            NONE, LOGO_SLIDE
        });
    }
}
