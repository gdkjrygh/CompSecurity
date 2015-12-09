// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;

// Referenced classes of package android.support.v4.os:
//            ResultReceiver

class this._cls0 extends this._cls0
{

    final ResultReceiver this$0;

    public void send(int i, Bundle bundle)
    {
        if (mHandler != null)
        {
            mHandler.post(new (ResultReceiver.this, i, bundle));
            return;
        } else
        {
            onReceiveResult(i, bundle);
            return;
        }
    }

    ()
    {
        this$0 = ResultReceiver.this;
        super();
    }
}
