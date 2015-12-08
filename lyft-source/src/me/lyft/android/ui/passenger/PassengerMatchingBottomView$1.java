// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.widget.TextView;
import java.util.concurrent.TimeUnit;
import rx.functions.Action0;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerMatchingBottomView

class this._cls0
    implements Action0
{

    final PassengerMatchingBottomView this$0;

    public void call()
    {
        String s = PassengerMatchingBottomView.access$000(PassengerMatchingBottomView.this);
        messageTextView.setText(s);
        if (!worker.d())
        {
            worker.worker(this, 10L, TimeUnit.SECONDS);
        }
        return;
        Exception exception;
        exception;
        if (!worker.d())
        {
            worker.worker(this, 10L, TimeUnit.SECONDS);
        }
        throw exception;
    }

    ()
    {
        this$0 = PassengerMatchingBottomView.this;
        super();
    }
}
