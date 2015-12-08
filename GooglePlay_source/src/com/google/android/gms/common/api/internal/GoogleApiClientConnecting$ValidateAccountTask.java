// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientConnecting

private final class mClients extends mClients
{

    private final ArrayList mClients;
    final GoogleApiClientConnecting this$0;

    public final void runLocked()
    {
        for (Iterator iterator = mClients.iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.ountTask.mClients)iterator.next()).mClients(mResolvedAccountAccessor)) { }
    }

    public (ArrayList arraylist)
    {
        this$0 = GoogleApiClientConnecting.this;
        super(GoogleApiClientConnecting.this, (byte)0);
        mClients = arraylist;
    }
}
