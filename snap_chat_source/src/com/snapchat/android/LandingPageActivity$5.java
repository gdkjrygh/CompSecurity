// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;


// Referenced classes of package com.snapchat.android:
//            LandingPageActivity

static final class ogEvent.DialogType
{

    static final int a[];

    static 
    {
        a = new int[com.snapchat.android.util.eventbus.Type.values().length];
        try
        {
            a[com.snapchat.android.util.eventbus.Type.ONE_BUTTON.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[com.snapchat.android.util.eventbus.Type.YES_NO_DIALOG.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.snapchat.android.util.eventbus.Type.YES_NO_DONTASK_DIALOG.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.snapchat.android.util.eventbus.Type.ONE_BUTTON_SC_DIALOG.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.snapchat.android.util.eventbus.Type.YES_NO_SC_DIALOG.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
