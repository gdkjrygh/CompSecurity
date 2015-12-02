// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor;

import com.google.android.exoplayer.drm.DrmInitData;

// Referenced classes of package com.google.android.exoplayer.extractor:
//            SeekMap, TrackOutput

public interface ExtractorOutput
{

    public abstract void a();

    public abstract void a(DrmInitData drminitdata);

    public abstract void a(SeekMap seekmap);

    public abstract TrackOutput a_(int i);
}
