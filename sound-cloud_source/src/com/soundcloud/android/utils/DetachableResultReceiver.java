// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DetachableResultReceiver extends ResultReceiver
{
    private class PendingResult
    {

        int resultCode;
        Bundle resultData;
        final DetachableResultReceiver this$0;

        public PendingResult(int i, Bundle bundle)
        {
            this$0 = DetachableResultReceiver.this;
            super();
            resultCode = i;
            resultData = bundle;
        }
    }

    public static interface Receiver
    {

        public abstract void onReceiveResult(int i, Bundle bundle);
    }


    private final List pendingResults = new ArrayList();
    private Receiver receiver;

    public DetachableResultReceiver(Handler handler)
    {
        super(handler);
    }

    private void addPendingResult(int i, Bundle bundle)
    {
        pendingResults.add(new PendingResult(i, bundle));
    }

    protected void onReceiveResult(int i, Bundle bundle)
    {
        if (receiver != null)
        {
            receiver.onReceiveResult(i, bundle);
            return;
        } else
        {
            addPendingResult(i, bundle);
            return;
        }
    }

    public void setReceiver(Receiver receiver1)
    {
        receiver = receiver1;
        if (pendingResults.size() > 0)
        {
            PendingResult pendingresult;
            for (receiver1 = pendingResults.iterator(); receiver1.hasNext(); receiver.onReceiveResult(pendingresult.resultCode, pendingresult.resultData))
            {
                pendingresult = (PendingResult)receiver1.next();
            }

            pendingResults.clear();
        }
    }
}
