// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.support.v4.media.VolumeProviderCompat;
import android.support.v4.media.session.MediaSessionCompat;

// Referenced classes of package android.support.v7.media:
//            MediaRouter

private final class mMsCompat
{

    private int mControlType;
    private int mMaxVolume;
    private final MediaSessionCompat mMsCompat;
    private VolumeProviderCompat mVpCompat;
    final mMsCompat this$0;

    public final void clearVolumeHandling()
    {
        mMsCompat.setPlaybackToLocal(mMsCompat(this._cls0.this).ream);
        mVpCompat = null;
    }

    public final void configureVolume(int i, int j, int k)
    {
        if (mVpCompat != null && i == mControlType && j == mMaxVolume)
        {
            mVpCompat.setCurrentVolume(k);
            return;
        } else
        {
            class _cls1 extends VolumeProviderCompat
            {

                final MediaRouter.GlobalMediaRouter.MediaSessionRecord this$1;

                public void onAdjustVolume(final int direction)
                {
                    class _cls2
                        implements Runnable
                    {

                        final _cls1 this$2;
                        final int val$direction;

                        public void run()
                        {
                            if (MediaRouter.GlobalMediaRouter.access$1200(this$0) != null)
                            {
                                MediaRouter.GlobalMediaRouter.access$1200(this$0).requestUpdateVolume(direction);
                            }
                        }

                            _cls2()
                            {
                                this$2 = _cls1.this;
                                direction = i;
                                super();
                            }
                    }

                    MediaRouter.GlobalMediaRouter.access$1300(this$0).post(new _cls2());
                }

                public void onSetVolumeTo(final int volume)
                {
                    class _cls1
                        implements Runnable
                    {

                        final _cls1 this$2;
                        final int val$volume;

                        public void run()
                        {
                            if (MediaRouter.GlobalMediaRouter.access$1200(this$0) != null)
                            {
                                MediaRouter.GlobalMediaRouter.access$1200(this$0).requestSetVolume(volume);
                            }
                        }

                            _cls1()
                            {
                                this$2 = _cls1.this;
                                volume = i;
                                super();
                            }
                    }

                    MediaRouter.GlobalMediaRouter.access$1300(this$0).post(new _cls1());
                }

            _cls1(int i, int j, int k)
            {
                this$1 = MediaRouter.GlobalMediaRouter.MediaSessionRecord.this;
                super(i, j, k);
            }
            }

            mVpCompat = new _cls1(i, j, k);
            mMsCompat.setPlaybackToRemote(mVpCompat);
            return;
        }
    }

    public final android.support.v4.media.session.t getToken()
    {
        return mMsCompat.getSessionToken();
    }

    public _cls1(Object obj)
    {
        this$0 = this._cls0.this;
        super();
        mMsCompat = MediaSessionCompat.obtain(mMsCompat(mMsCompat.this), obj);
    }
}
