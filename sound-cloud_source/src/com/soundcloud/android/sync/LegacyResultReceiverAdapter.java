// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import rx.X;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncFailedException

class LegacyResultReceiverAdapter extends ResultReceiver
{

    final Uri contentUris[];
    private final X subscriber;

    public transient LegacyResultReceiverAdapter(X x, Uri auri[])
    {
        super(new Handler(Looper.getMainLooper()));
        subscriber = x;
        contentUris = auri;
    }

    private boolean checkForUpdates(Bundle bundle)
    {
        boolean flag1 = false;
        Uri auri[] = contentUris;
        int j = auri.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!bundle.getBoolean(auri[i].toString()))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public void onReceiveResult(int i, Bundle bundle)
    {
        switch (i)
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unexpected sync state: ")).append(i).toString());

        case 3: // '\003'
        case 5: // '\005'
            boolean flag = checkForUpdates(bundle);
            subscriber.onNext(Boolean.valueOf(flag));
            subscriber.onCompleted();
            return;

        case 2: // '\002'
        case 4: // '\004'
            subscriber.onError(new SyncFailedException(bundle));
            return;
        }
    }
}
