// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.contextmenu.delegates.flags;


public final class CanSendToFacebookRecipient extends Enum
{

    public static final CanSendToFacebookRecipient a;
    public static final CanSendToFacebookRecipient b;
    private static final CanSendToFacebookRecipient c[];

    private CanSendToFacebookRecipient(String s, int i)
    {
        super(s, i);
    }

    public static CanSendToFacebookRecipient valueOf(String s)
    {
        return (CanSendToFacebookRecipient)Enum.valueOf(com/spotify/mobile/android/ui/contextmenu/delegates/flags/CanSendToFacebookRecipient, s);
    }

    public static CanSendToFacebookRecipient[] values()
    {
        return (CanSendToFacebookRecipient[])c.clone();
    }

    static 
    {
        a = new CanSendToFacebookRecipient("Yes", 0);
        b = new CanSendToFacebookRecipient("No", 1);
        c = (new CanSendToFacebookRecipient[] {
            a, b
        });
    }
}
