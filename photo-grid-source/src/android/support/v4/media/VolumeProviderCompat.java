// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;


// Referenced classes of package android.support.v4.media:
//            VolumeProviderCompatApi21

public abstract class VolumeProviderCompat
{

    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;
    private Callback mCallback;
    private final int mControlType;
    private int mCurrentVolume;
    private final int mMaxVolume;
    private Object mVolumeProviderObj;

    public VolumeProviderCompat(int i, int j, int k)
    {
        mControlType = i;
        mMaxVolume = j;
        mCurrentVolume = k;
    }

    public final int getCurrentVolume()
    {
        return mCurrentVolume;
    }

    public final int getMaxVolume()
    {
        return mMaxVolume;
    }

    public final int getVolumeControl()
    {
        return mControlType;
    }

    public Object getVolumeProvider()
    {
        if (mVolumeProviderObj != null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return mVolumeProviderObj;
        } else
        {
            mVolumeProviderObj = VolumeProviderCompatApi21.createVolumeProvider(mControlType, mMaxVolume, mCurrentVolume, new _cls1());
            return mVolumeProviderObj;
        }
    }

    public void onAdjustVolume(int i)
    {
    }

    public void onSetVolumeTo(int i)
    {
    }

    public void setCallback(Callback callback)
    {
        mCallback = callback;
    }

    public final void setCurrentVolume(int i)
    {
        if (mCallback != null)
        {
            mCallback.onVolumeChanged(this);
        }
    }

    private class _cls1
        implements VolumeProviderCompatApi21.Delegate
    {

        final VolumeProviderCompat this$0;

        public void onAdjustVolume(int i)
        {
            VolumeProviderCompat.this.onAdjustVolume(i);
        }

        public void onSetVolumeTo(int i)
        {
            VolumeProviderCompat.this.onSetVolumeTo(i);
        }

        _cls1()
        {
            this$0 = VolumeProviderCompat.this;
            super();
        }
    }


    private class Callback
    {

        public abstract void onVolumeChanged(VolumeProviderCompat volumeprovidercompat);

        public Callback()
        {
        }
    }

}
