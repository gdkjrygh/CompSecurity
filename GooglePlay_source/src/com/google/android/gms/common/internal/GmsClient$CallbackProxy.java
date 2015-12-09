// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.internal:
//            GmsClient

protected abstract class mCallbackDelivered
{

    boolean mCallbackDelivered;
    Object mListener;
    final GmsClient this$0;

    public abstract void deliverCallback(Object obj);

    public abstract void onDeliverCallbackFailed();

    public final void removeListener()
    {
        this;
        JVM INSTR monitorenter ;
        mListener = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void unregister()
    {
        removeListener();
        synchronized (GmsClient.access$500(GmsClient.this))
        {
            GmsClient.access$500(GmsClient.this).remove(this);
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public (Object obj)
    {
        this$0 = GmsClient.this;
        super();
        mListener = obj;
        mCallbackDelivered = false;
    }
}
