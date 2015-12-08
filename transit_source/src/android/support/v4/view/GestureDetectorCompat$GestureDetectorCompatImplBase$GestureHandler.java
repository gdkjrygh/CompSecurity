// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v4.view:
//            GestureDetectorCompat

private class this._cls0 extends Handler
{

    final this._cls0 this$0;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 59
    //                   2 79
    //                   3 87;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new RuntimeException((new StringBuilder()).append("Unknown message ").append(message).toString());
_L2:
        this._mth0(this._cls0.this)._mth0(this._mth0(this._cls0.this));
_L6:
        return;
_L3:
        this._mth0(this._cls0.this);
        return;
_L4:
        if (this._mth0(this._cls0.this) != null)
        {
            if (!this._mth0(this._cls0.this))
            {
                this._mth0(this._cls0.this)._mth0(this._mth0(this._cls0.this));
                return;
            } else
            {
                this._mth0(this._cls0.this, true);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }

    this._cls0(Handler handler)
    {
        this$0 = this._cls0.this;
        super(handler.getLooper());
    }
}
