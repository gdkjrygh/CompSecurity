// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.wearable.view;

import android.os.Handler;
import android.os.Message;
import java.util.Calendar;

// Referenced classes of package android.support.wearable.view:
//            DelayedConfirmationView

class this._cls0 extends Handler
{

    final DelayedConfirmationView this$0;

    public void handleMessage(Message message)
    {
        DelayedConfirmationView.access$002(DelayedConfirmationView.this, Calendar.getInstance().getTimeInMillis());
        invalidate();
        if (DelayedConfirmationView.access$000(DelayedConfirmationView.this) - DelayedConfirmationView.access$100(DelayedConfirmationView.this) < DelayedConfirmationView.access$200(DelayedConfirmationView.this))
        {
            DelayedConfirmationView.access$400(DelayedConfirmationView.this).sendEmptyMessageDelayed(0, DelayedConfirmationView.access$300(DelayedConfirmationView.this));
        } else
        if (DelayedConfirmationView.access$500(DelayedConfirmationView.this) != null)
        {
            DelayedConfirmationView.access$500(DelayedConfirmationView.this).onTimerFinished(DelayedConfirmationView.this);
            return;
        }
    }

    layedConfirmationListener()
    {
        this$0 = DelayedConfirmationView.this;
        super();
    }
}
