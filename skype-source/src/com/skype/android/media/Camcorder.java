// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import java.io.File;

// Referenced classes of package com.skype.android.media:
//            AudioFilter, CamcorderCallback, Size

public interface Camcorder
{

    public abstract void a(AudioFilter audiofilter);

    public abstract boolean a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void setAudioBitRate(int i);

    public abstract void setAudioChannels(int i);

    public abstract void setAudioSource(int i);

    public abstract void setCamcorderCallback(CamcorderCallback camcordercallback);

    public abstract void setCameraFacing(int i);

    public abstract void setMaxDuration(int i);

    public abstract void setRecordingFile(File file);

    public abstract void setTargetVideoSize(Size size);

    public abstract void setVideoBitRate(int i);
}
