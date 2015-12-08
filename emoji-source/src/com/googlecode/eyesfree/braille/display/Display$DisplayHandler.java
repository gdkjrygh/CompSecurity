// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.display;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

// Referenced classes of package com.googlecode.eyesfree.braille.display:
//            Display, BrailleDisplayProperties, BrailleInputEvent

private class this._cls0 extends Handler
{

    private static final int MSG_REBIND_SERVICE = 3;
    private static final int MSG_REPORT_CONNECTION_STATE = 1;
    private static final int MSG_REPORT_INPUT_EVENT = 2;
    final Display this$0;

    private void handleRebindService()
    {
        if (Display.access$1100(Display.this) != null)
        {
            Display.access$1200(Display.this);
        }
        Display.access$1300(Display.this);
    }

    private void handleReportConnectionState(int i, BrailleDisplayProperties brailledisplayproperties)
    {
        Display.access$702(Display.this, brailledisplayproperties);
        if (i != Display.access$800(Display.this) && Display.access$900(Display.this) != null)
        {
            Display.access$900(Display.this).onConnectionStateChanged(i);
        }
        Display.access$802(Display.this, i);
    }

    private void handleReportInputEvent(BrailleInputEvent brailleinputevent)
    {
        tener tener = Display.access$1000(Display.this);
        if (tener != null)
        {
            tener.onInputEvent(brailleinputevent);
        }
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            handleReportConnectionState(message.arg1, (BrailleDisplayProperties)message.obj);
            return;

        case 2: // '\002'
            handleReportInputEvent((BrailleInputEvent)message.obj);
            return;

        case 3: // '\003'
            handleRebindService();
            break;
        }
    }

    public void reportConnectionState(int i, BrailleDisplayProperties brailledisplayproperties)
    {
        obtainMessage(1, i, 0, brailledisplayproperties).sendToTarget();
    }

    public void reportInputEvent(BrailleInputEvent brailleinputevent)
    {
        obtainMessage(2, brailleinputevent).sendToTarget();
    }

    public void scheduleRebind()
    {
        this;
        JVM INSTR monitorenter ;
        if (Display.access$400(Display.this) >= 5)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        int i = 500 << Display.access$400(Display.this);
        sendEmptyMessageDelayed(3, i);
        Display.access$404(Display.this);
        Log.w(Display.access$100(), String.format("Will rebind to braille service in %d ms.", new Object[] {
            Integer.valueOf(i)
        }));
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        reportConnectionState(-1, null);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public s()
    {
        this$0 = Display.this;
        super();
    }

    public this._cls0(Handler handler)
    {
        this$0 = Display.this;
        super(handler.getLooper());
    }
}
