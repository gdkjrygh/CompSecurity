// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.os.ResultReceiver;

// Referenced classes of package android.support.v4.media:
//            MediaBrowserCompat

class val.mediaId extends ResultReceiver
{

    final ed this$0;
    final ed val$cb;
    final String val$mediaId;

    protected void onReceiveResult(int i, Bundle bundle)
    {
        if (i != 0 || bundle == null || !bundle.containsKey("media_item"))
        {
            val$cb.cb(val$mediaId);
            return;
        }
        bundle = bundle.getParcelable("media_item");
        if (!(bundle instanceof val.mediaId))
        {
            val$cb.cb(val$mediaId);
            return;
        } else
        {
            val$cb.ed((ed)bundle);
            return;
        }
    }

    (String s)
    {
        this$0 = final_;
        val$cb = val.cb.this;
        val$mediaId = s;
        super(final_handler);
    }
}
