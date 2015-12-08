// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.android.audio.AudioRoute;
import com.skype.android.calling.CameraFacing;

// Referenced classes of package com.skype.android.app.calling:
//            CallControlsView

static final class 
{

    static final int $SwitchMap$com$skype$android$audio$AudioRoute[];
    static final int $SwitchMap$com$skype$android$calling$CameraFacing[];

    static 
    {
        $SwitchMap$com$skype$android$calling$CameraFacing = new int[CameraFacing.values().length];
        try
        {
            $SwitchMap$com$skype$android$calling$CameraFacing[CameraFacing.c.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$android$calling$CameraFacing[CameraFacing.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$android$calling$CameraFacing[CameraFacing.a.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        $SwitchMap$com$skype$android$audio$AudioRoute = new int[AudioRoute.values().length];
        try
        {
            $SwitchMap$com$skype$android$audio$AudioRoute[AudioRoute.b.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$android$audio$AudioRoute[AudioRoute.c.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$android$audio$AudioRoute[AudioRoute.e.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$android$audio$AudioRoute[AudioRoute.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$audio$AudioRoute[AudioRoute.a.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
