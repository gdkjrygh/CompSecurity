// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;


final class ac
{

    static final int a[];
    static final int b[];
    static final int c[];
    static final int d[];

    static 
    {
        d = new int[com.google.android.apps.unveil.textinput.TextInput.SnapMode.values().length];
        try
        {
            d[com.google.android.apps.unveil.textinput.TextInput.SnapMode.DEBUG_BOTH_HIGHRES.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            d[com.google.android.apps.unveil.textinput.TextInput.SnapMode.DEBUG_BOTH_LOWRES.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            d[com.google.android.apps.unveil.textinput.TextInput.SnapMode.RECENT_FRAME.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            d[com.google.android.apps.unveil.textinput.TextInput.SnapMode.TAKE_PICTURE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            d[com.google.android.apps.unveil.textinput.TextInput.SnapMode.EXTERNAL.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        c = new int[Camera2InputPopup.InputUIState.values().length];
        try
        {
            c[Camera2InputPopup.InputUIState.CLOUDHANCE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            c[Camera2InputPopup.InputUIState.FROZEN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            c[Camera2InputPopup.InputUIState.VIDEO.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            c[Camera2InputPopup.InputUIState.UNINITIALIZED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        b = new int[com.google.android.libraries.translate.offline.OfflinePackage.Status.values().length];
        try
        {
            b[com.google.android.libraries.translate.offline.OfflinePackage.Status.INPROGRESS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[com.google.android.libraries.translate.offline.OfflinePackage.Status.AVAILABLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[Camera2InputPopup.PausedFrameSource.values().length];
        try
        {
            a[Camera2InputPopup.PausedFrameSource.TAKE_SNAPSHOT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[Camera2InputPopup.PausedFrameSource.TEXTINPUT_VIDEO_FRAME.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[Camera2InputPopup.PausedFrameSource.WL_VIDEO_FRAME.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
