// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.notification;


// Referenced classes of package com.snapchat.android.notification:
//            AndroidNotificationManager

public static final class pe
{

    public static final int a[];

    static 
    {
        a = new int[pe.values().length];
        try
        {
            a[pe.TYPING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            a[pe.CHAT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            a[pe.CHAT_SCREENSHOT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            a[pe.SNAP.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            a[pe.REPLAY.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            a[pe.SCREENSHOT.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            a[pe.HERE_SCREENSHOT.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            a[pe.CASH.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            a[pe.STORIES.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            a[pe.CASH_MESSAGE.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[pe.ADDFRIEND.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[pe.ADD_COLLABORATOR_TO_OWNER.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[pe.ADD_COLLABORATOR_TO_COLLABORATOR.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[pe.FAILED_SNAP_AND_CHAT.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[pe.FAILED_CHAT_NOT_FRIENDS.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[pe.FAILED_CASH.ordinal()] = 16;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
