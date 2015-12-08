// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.data.DataHolder;

public abstract class DataHolderNotifier
    implements ListenerHolder.Notifier
{

    private final DataHolder mDataHolder;

    public DataHolderNotifier(DataHolder dataholder)
    {
        mDataHolder = dataholder;
    }

    public final void notifyListener(Object obj)
    {
        notifyListener(obj, mDataHolder);
    }

    public abstract void notifyListener(Object obj, DataHolder dataholder);

    public final void onNotifyListenerFailed()
    {
        if (mDataHolder != null)
        {
            mDataHolder.close();
        }
    }
}
