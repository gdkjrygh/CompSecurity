// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.support.v4.media.VolumeProviderCompat;

class this._cls1 extends VolumeProviderCompat
{

    final _cls1 this$1;

    public void onAdjustVolume(final int direction)
    {
        class _cls2
            implements Runnable
        {

            final MediaRouter.GlobalMediaRouter.MediaSessionRecord._cls1 this$2;
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
                this$2 = MediaRouter.GlobalMediaRouter.MediaSessionRecord._cls1.this;
                direction = i;
                super();
            }
        }

        _cls2.val.direction(_fld0)._mth0(new _cls2());
    }

    public void onSetVolumeTo(final int volume)
    {
        class _cls1
            implements Runnable
        {

            final MediaRouter.GlobalMediaRouter.MediaSessionRecord._cls1 this$2;
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
                this$2 = MediaRouter.GlobalMediaRouter.MediaSessionRecord._cls1.this;
                volume = i;
                super();
            }
        }

        _cls1.val.volume(_fld0)._mth0(new _cls1());
    }

    _cls1(int i, int j, int k)
    {
        this$1 = this._cls1.this;
        super(i, j, k);
    }
}
