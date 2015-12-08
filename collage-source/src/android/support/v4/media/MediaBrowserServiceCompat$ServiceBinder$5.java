// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.support.v4.os.ResultReceiver;

// Referenced classes of package android.support.v4.media:
//            MediaBrowserServiceCompat

class val.receiver
    implements Runnable
{

    final val.receiver this$1;
    final String val$mediaId;
    final ResultReceiver val$receiver;

    public void run()
    {
        MediaBrowserServiceCompat.access$500(_fld0, val$mediaId, val$receiver);
    }

    ()
    {
        this$1 = final_;
        val$mediaId = s;
        val$receiver = ResultReceiver.this;
        super();
    }
}
