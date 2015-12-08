// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.os.Handler;
import android.os.Message;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AlertController

final class this._cls0
    implements android.view.er
{

    final AlertController this$0;

    public final void onClick(View view)
    {
        if (view == mButtonPositive && mButtonPositiveMessage != null)
        {
            view = Message.obtain(mButtonPositiveMessage);
        } else
        if (view == mButtonNegative && mButtonNegativeMessage != null)
        {
            view = Message.obtain(mButtonNegativeMessage);
        } else
        if (view == mButtonNeutral && mButtonNeutralMessage != null)
        {
            view = Message.obtain(mButtonNeutralMessage);
        } else
        {
            view = null;
        }
        if (view != null)
        {
            view.sendToTarget();
        }
        mHandler.obtainMessage(1, mDialog).sendToTarget();
    }

    ()
    {
        this$0 = AlertController.this;
        super();
    }
}
