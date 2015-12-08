// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;


// Referenced classes of package android.support.v7.media:
//            MediaRouter, RemoteControlClientCompat

private final class updatePlaybackInfo
    implements updatePlaybackInfo
{

    private boolean mDisconnected;
    private final RemoteControlClientCompat mRccCompat;
    final this._cls0 this$0;

    public void disconnect()
    {
        mDisconnected = true;
        mRccCompat.setVolumeCallback(null);
    }

    public Object getRemoteControlClient()
    {
        return mRccCompat.getRemoteControlClient();
    }

    public void onVolumeSetRequest(int i)
    {
        if (!mDisconnected && mDisconnected(this._cls0.this) != null)
        {
            this._mth0(this._cls0.this)._mth0(i);
        }
    }

    public void onVolumeUpdateRequest(int i)
    {
        if (!mDisconnected && mDisconnected(this._cls0.this) != null)
        {
            this._mth0(this._cls0.this)._mth0(i);
        }
    }

    public void updatePlaybackInfo()
    {
        mRccCompat.setPlaybackInfo(mRccCompat(this._cls0.this));
    }

    public (Object obj)
    {
        this$0 = this._cls0.this;
        super();
        mRccCompat = RemoteControlClientCompat.obtain(mRccCompat(mRccCompat.this), obj);
        mRccCompat.setVolumeCallback(this);
        updatePlaybackInfo();
    }
}
