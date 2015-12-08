// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.os.Handler;
import android.os.Message;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AlertController

class this._cls0
    implements android.view.er
{

    final AlertController this$0;

    public void onClick(View view)
    {
        if (view == AlertController.access$000(AlertController.this) && AlertController.access$100(AlertController.this) != null)
        {
            view = Message.obtain(AlertController.access$100(AlertController.this));
        } else
        if (view == AlertController.access$200(AlertController.this) && AlertController.access$300(AlertController.this) != null)
        {
            view = Message.obtain(AlertController.access$300(AlertController.this));
        } else
        if (view == AlertController.access$400(AlertController.this) && AlertController.access$500(AlertController.this) != null)
        {
            view = Message.obtain(AlertController.access$500(AlertController.this));
        } else
        {
            view = null;
        }
        if (view != null)
        {
            view.sendToTarget();
        }
        AlertController.access$700(AlertController.this).obtainMessage(1, AlertController.access$600(AlertController.this)).sendToTarget();
    }

    ()
    {
        this$0 = AlertController.this;
        super();
    }
}
