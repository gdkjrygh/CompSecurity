// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;


// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.gl:
//            SurfaceTextureChannel

static class urceState
{

    static final int $SwitchMap$com$skype$android$video$hw$codec$encoder$camera$gl$SurfaceTextureChannel$OutputType[];
    static final int $SwitchMap$com$skype$android$video$hw$codec$encoder$camera$gl$SurfaceTextureChannel$SourceState[];

    static 
    {
        $SwitchMap$com$skype$android$video$hw$codec$encoder$camera$gl$SurfaceTextureChannel$OutputType = new int[tputType.values().length];
        try
        {
            $SwitchMap$com$skype$android$video$hw$codec$encoder$camera$gl$SurfaceTextureChannel$OutputType[tputType.ENCODER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$android$video$hw$codec$encoder$camera$gl$SurfaceTextureChannel$OutputType[tputType.SCREEN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        $SwitchMap$com$skype$android$video$hw$codec$encoder$camera$gl$SurfaceTextureChannel$SourceState = new int[urceState.values().length];
        try
        {
            $SwitchMap$com$skype$android$video$hw$codec$encoder$camera$gl$SurfaceTextureChannel$SourceState[urceState.WAITING_FOR_FRAME.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$video$hw$codec$encoder$camera$gl$SurfaceTextureChannel$SourceState[urceState.INTERRUPTED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
