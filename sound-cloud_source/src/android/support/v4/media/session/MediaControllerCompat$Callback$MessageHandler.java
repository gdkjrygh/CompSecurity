// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//            MediaControllerCompat, PlaybackStateCompat

private class this._cls0 extends Handler
{

    private static final int MSG_DESTROYED = 8;
    private static final int MSG_EVENT = 1;
    private static final int MSG_UPDATE_EXTRAS = 7;
    private static final int MSG_UPDATE_METADATA = 3;
    private static final int MSG_UPDATE_PLAYBACK_STATE = 2;
    private static final int MSG_UPDATE_QUEUE = 5;
    private static final int MSG_UPDATE_QUEUE_TITLE = 6;
    private static final int MSG_UPDATE_VOLUME = 4;
    final obtainMessage this$0;

    public void handleMessage(Message message)
    {
        if (!this._mth0(this._cls0.this))
        {
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            _mth0((String)message.obj, message.getData());
            return;

        case 2: // '\002'
            Changed((PlaybackStateCompat)message.obj);
            return;

        case 3: // '\003'
            ed((MediaMetadataCompat)message.obj);
            return;

        case 5: // '\005'
            ed((List)message.obj);
            return;

        case 6: // '\006'
            nged((CharSequence)message.obj);
            return;

        case 7: // '\007'
            ((Bundle)message.obj);
            return;

        case 4: // '\004'
            ged((ged)message.obj);
            return;

        case 8: // '\b'
            yed();
            break;
        }
    }

    public void post(int i, Object obj, Bundle bundle)
    {
        obtainMessage(i, obj).sendToTarget();
    }

    public (Looper looper)
    {
        this$0 = this._cls0.this;
        super(looper);
    }
}
