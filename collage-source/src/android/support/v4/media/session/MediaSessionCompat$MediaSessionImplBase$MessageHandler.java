// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;

// Referenced classes of package android.support.v4.media.session:
//            MediaSessionCompat, PlaybackStateCompat

private class this._cls0 extends Handler
{

    private static final int KEYCODE_MEDIA_PAUSE = 127;
    private static final int KEYCODE_MEDIA_PLAY = 126;
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
    private static final int MSG_PLAY_URI = 18;
    private static final int MSG_PREVIOUS = 8;
    private static final int MSG_RATE = 12;
    private static final int MSG_REWIND = 10;
    private static final int MSG_SEEK_TO = 11;
    private static final int MSG_SET_VOLUME = 17;
    private static final int MSG_SKIP_TO_ITEM = 4;
    private static final int MSG_STOP = 6;
    final obtainMessage this$0;

    private void onMediaButtonEvent(KeyEvent keyevent)
    {
        if (keyevent != null && keyevent.getAction() == 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        boolean flag1;
        long l;
        if (this._mth0(this._cls0.this) == null)
        {
            l = 0L;
        } else
        {
            l = this._mth0(this._cls0.this).getActions();
        }
        keyevent.getKeyCode();
        JVM INSTR lookupswitch 9: default 112
    //                   79: 113
    //                   85: 113
    //                   86: 289
    //                   87: 245
    //                   88: 267
    //                   89: 331
    //                   90: 309
    //                   126: 201
    //                   127: 223;
           goto _L3 _L4 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L8:
        continue; /* Loop/switch isn't completed */
_L3:
        return;
_L4:
        boolean flag2;
        if (this._mth0(this._cls0.this) != null && this._mth0(this._cls0.this).getState() == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((516L & l) != 0L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((l & 514L) != 0L)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag && flag2)
        {
            this._mth0(this._cls0.this)._mth0();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if ((l & 4L) == 0L) goto _L1; else goto _L12
_L12:
        this._mth0(this._cls0.this)._mth0();
        return;
_L11:
        if ((l & 2L) == 0L) goto _L1; else goto _L13
_L13:
        this._mth0(this._cls0.this)._mth0();
        return;
_L6:
        if ((l & 32L) == 0L) goto _L1; else goto _L14
_L14:
        this._mth0(this._cls0.this)._mth0();
        return;
_L7:
        if ((l & 16L) == 0L) goto _L1; else goto _L15
_L15:
        this._mth0(this._cls0.this)._mth0();
        return;
_L5:
        if ((l & 1L) == 0L) goto _L1; else goto _L16
_L16:
        this._mth0(this._cls0.this)._mth0();
        return;
_L9:
        if ((l & 64L) == 0L) goto _L1; else goto _L17
_L17:
        this._mth0(this._cls0.this)._mth0();
        return;
        if ((l & 8L) == 0L) goto _L1; else goto _L18
_L18:
        this._mth0(this._cls0.this)._mth0();
        return;
        if (flag || !flag1) goto _L1; else goto _L19
_L19:
        this._mth0(this._cls0.this)._mth0();
        return;
    }

    public void handleMessage(Message message)
    {
        if (this._mth0(this._cls0.this) != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
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

        case 18: // '\022'
            this._mth0(this._cls0.this)._mth0((Uri)message.obj, message.getData());
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
            message = (KeyEvent)message.obj;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.putExtra("android.intent.extra.KEY_EVENT", message);
            if (!this._mth0(this._cls0.this)._mth0(intent))
            {
                onMediaButtonEvent(message);
                return;
            }
            break;

        case 15: // '\017'
            message = (onMediaButtonEvent)message.obj;
            onMediaButtonEvent(this._cls0.this)._mth0(((this._cls0) (message))., (() (message))., (() (message)).);
            return;

        case 16: // '\020'
            (this._cls0.this, ((Integer)message.obj).intValue(), 0);
            return;

        case 17: // '\021'
            this._mth0(this._cls0.this, ((Integer)message.obj).intValue(), 0);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
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
