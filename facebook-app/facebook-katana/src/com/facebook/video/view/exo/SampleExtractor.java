// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import com.google.android.exoplayer.MediaFormatHolder;
import com.google.android.exoplayer.SampleHolder;
import com.google.android.exoplayer.TrackInfo;

public interface SampleExtractor
{

    public abstract int a(int i, SampleHolder sampleholder);

    public abstract void a(int i, MediaFormatHolder mediaformatholder);

    public abstract boolean a();

    public abstract TrackInfo[] b();

    public abstract long c();

    public abstract void d();
}
