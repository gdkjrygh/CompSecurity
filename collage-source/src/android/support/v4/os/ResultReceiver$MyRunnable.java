// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.os;

import android.os.Bundle;

// Referenced classes of package android.support.v4.os:
//            ResultReceiver

class mResultData
    implements Runnable
{

    final int mResultCode;
    final Bundle mResultData;
    final ResultReceiver this$0;

    public void run()
    {
        onReceiveResult(mResultCode, mResultData);
    }

    (int i, Bundle bundle)
    {
        this$0 = ResultReceiver.this;
        super();
        mResultCode = i;
        mResultData = bundle;
    }
}
