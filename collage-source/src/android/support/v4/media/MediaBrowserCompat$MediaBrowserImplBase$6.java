// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.util.Log;

// Referenced classes of package android.support.v4.media:
//            MediaBrowserCompat, IMediaBrowserServiceCompatCallbacks

class val.callback
    implements Runnable
{

    final nnectionFailed this$0;
    final IMediaBrowserServiceCompatCallbacks val$callback;

    public void run()
    {
        Log.e("MediaBrowserCompat", (new StringBuilder()).append("onConnectFailed for ").append(cess._mth1400(this._cls0.this)).toString());
        if (!cess._mth500(this._cls0.this, val$callback, "onConnectFailed"))
        {
            return;
        }
        if (cess._mth600(this._cls0.this) != 1)
        {
            Log.w("MediaBrowserCompat", (new StringBuilder()).append("onConnect from service while mState=").append(cess._mth700(cess._mth600(this._cls0.this))).append("... ignoring").toString());
            return;
        } else
        {
            cess._mth300(this._cls0.this);
            cess._mth400(this._cls0.this).nnectionFailed();
            return;
        }
    }

    ()
    {
        this$0 = final_;
        val$callback = IMediaBrowserServiceCompatCallbacks.this;
        super();
    }
}
