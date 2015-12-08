// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.media.VolumeProvider;

// Referenced classes of package android.support.v4.media:
//            VolumeProviderCompatApi21

static final class val.delegate extends VolumeProvider
{

    final legate val$delegate;

    public void onAdjustVolume(int i)
    {
        val$delegate.onAdjustVolume(i);
    }

    public void onSetVolumeTo(int i)
    {
        val$delegate.onSetVolumeTo(i);
    }

    legate(int i, int j, int k, legate legate)
    {
        val$delegate = legate;
        super(i, j, k);
    }
}
