// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.contextmenu.delegates.flags;


public final class CanSendToRecipient extends Enum
{

    public static final CanSendToRecipient a;
    private static CanSendToRecipient b;
    private static final CanSendToRecipient c[];

    private CanSendToRecipient(String s, int i)
    {
        super(s, i);
    }

    public static CanSendToRecipient valueOf(String s)
    {
        return (CanSendToRecipient)Enum.valueOf(com/spotify/mobile/android/ui/contextmenu/delegates/flags/CanSendToRecipient, s);
    }

    public static CanSendToRecipient[] values()
    {
        return (CanSendToRecipient[])c.clone();
    }

    static 
    {
        a = new CanSendToRecipient("Yes", 0);
        b = new CanSendToRecipient("No", 1);
        c = (new CanSendToRecipient[] {
            a, b
        });
    }
}
