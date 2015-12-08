// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.capture;

import com.skype.android.video.hw.codec.encoder.camera.SurfaceObserver;
import com.skype.android.video.hw.format.Resolution;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.capture:
//            Capturer

public static interface 
    extends SurfaceObserver
{

    public abstract void setEnabled(boolean flag);

    public abstract void setFitFactor(float f);

    public abstract void setFlipped(boolean flag, boolean flag1);

    public abstract void setResolution(Resolution resolution);

    public abstract void setRotationAngle(int i);
}
