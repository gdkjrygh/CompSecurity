// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.media.VolumeProvider;

class VolumeProviderCompatApi21
{

    VolumeProviderCompatApi21()
    {
    }

    public static Object createVolumeProvider(final int final_i, int i, int j, Delegate delegate1)
    {
        return new _cls1(i, j, delegate1);
    }

    public static void setCurrentVolume(Object obj, int i)
    {
        ((VolumeProvider)obj).setCurrentVolume(i);
    }

    private class _cls1 extends VolumeProvider
    {

        final Delegate val$delegate;

        public final void onAdjustVolume(int i)
        {
            delegate.onAdjustVolume(i);
        }

        public final void onSetVolumeTo(int i)
        {
            delegate.onSetVolumeTo(i);
        }

        _cls1(int j, int k, Delegate delegate1)
        {
            delegate = delegate1;
            super(final_i, j, k);
        }

        private class Delegate
        {

            public abstract void onAdjustVolume(int i);

            public abstract void onSetVolumeTo(int i);
        }

    }

}
