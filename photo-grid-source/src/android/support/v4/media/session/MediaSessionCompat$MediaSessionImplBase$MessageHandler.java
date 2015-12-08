// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.RatingCompat;

class this._cls0 extends Handler
{

    private static final int MSG_ADJUST_VOLUME = 16;
    private static final int MSG_COMMAND = 15;
    private static final int MSG_CUSTOM_ACTION = 13;
    private static final int MSG_FAST_FORWARD = 9;
    private static final int MSG_MEDIA_BUTTON = 14;
    private static final int MSG_NEXT = 7;
    private static final int MSG_PAUSE = 5;
    private static final int MSG_PLAY = 1;
    private static final int MSG_PLAY_MEDIA_ID = 2;
    private static final int MSG_PLAY_SEARCH = 3;
    private static final int MSG_PREVIOUS = 8;
    private static final int MSG_RATE = 12;
    private static final int MSG_REWIND = 10;
    private static final int MSG_SEEK_TO = 11;
    private static final int MSG_SET_VOLUME = 17;
    private static final int MSG_SKIP_TO_ITEM = 4;
    private static final int MSG_STOP = 6;
    final obtainMessage this$0;

    public void handleMessage(Message message)
    {
        if (this._mth0(this._cls0.this) == null)
        {
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            this._mth0(this._cls0.this)._mth0();
            return;

        case 2: // '\002'
            this._mth0(this._cls0.this)._mth0((String)message.obj, message.getData());
            return;

        case 3: // '\003'
            this._mth0(this._cls0.this)._mth0((String)message.obj, message.getData());
            return;

        case 4: // '\004'
            this._mth0(this._cls0.this)._mth0(((Long)message.obj).longValue());
            return;

        case 5: // '\005'
            this._mth0(this._cls0.this)._mth0();
            return;

        case 6: // '\006'
            this._mth0(this._cls0.this)._mth0();
            return;

        case 7: // '\007'
            this._mth0(this._cls0.this)._mth0();
            return;

        case 8: // '\b'
            this._mth0(this._cls0.this)._mth0();
            return;

        case 9: // '\t'
            this._mth0(this._cls0.this)._mth0();
            return;

        case 10: // '\n'
            this._mth0(this._cls0.this)._mth0();
            return;

        case 11: // '\013'
            this._mth0(this._cls0.this)._mth0(((Long)message.obj).longValue());
            return;

        case 12: // '\f'
            this._mth0(this._cls0.this)._mth0((RatingCompat)message.obj);
            return;

        case 13: // '\r'
            this._mth0(this._cls0.this)._mth0((String)message.obj, message.getData());
            return;

        case 14: // '\016'
            this._mth0(this._cls0.this)._mth0((Intent)message.obj);
            return;

        case 15: // '\017'
            message = (this._cls0)message.obj;
            this._mth0(this._cls0.this)._mth0(((this._cls0) (message))., (() (message))., (() (message)).);
            return;

        case 16: // '\020'
            (this._cls0.this, ((Integer)message.obj).intValue(), 0);
            return;

        case 17: // '\021'
            this._mth0(this._cls0.this, ((Integer)message.obj).intValue(), 0);
            break;
        }
    }

    public void post(int i)
    {
        post(i, null);
    }

    public void post(int i, Object obj)
    {
        obtainMessage(i, obj).sendToTarget();
    }

    public void post(int i, Object obj, int j)
    {
        obtainMessage(i, j, 0, obj).sendToTarget();
    }

    public void post(int i, Object obj, Bundle bundle)
    {
        obj = obtainMessage(i, obj);
        ((Message) (obj)).setData(bundle);
        ((Message) (obj)).sendToTarget();
    }

    public (Looper looper)
    {
        this$0 = this._cls0.this;
        super(looper);
    }
}
