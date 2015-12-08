// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import java.util.concurrent.atomic.AtomicReference;
import rx.X;
import rx.h.f;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncResult

public class ResultReceiverAdapter extends ResultReceiver
{

    public static final String SYNC_RESULT = "syncResult";
    private static final String TAG = "RxResultReceiver";
    private final AtomicReference subscriberRef;

    public ResultReceiverAdapter(X x, Looper looper)
    {
        super(new Handler(looper));
        subscriberRef = new AtomicReference(x);
        x.add(f.a(new _cls1()));
    }

    protected void onReceiveResult(int i, Bundle bundle)
    {
        X x = (X)subscriberRef.get();
        if (x != null && !x.isUnsubscribed())
        {
            (new StringBuilder("delivering result: ")).append(bundle);
            bundle = (SyncResult)bundle.getParcelable("syncResult");
            if (bundle.wasSuccess())
            {
                x.onNext(bundle);
                x.onCompleted();
                return;
            } else
            {
                x.onError(bundle.getException());
                return;
            }
        } else
        {
            (new StringBuilder("observer is gone, dropping result: ")).append(bundle);
            return;
        }
    }


    private class _cls1
        implements a
    {

        final ResultReceiverAdapter this$0;

        public void call()
        {
            subscriberRef.set(null);
        }

        _cls1()
        {
            this$0 = ResultReceiverAdapter.this;
            super();
        }
    }

}
