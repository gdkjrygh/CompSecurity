// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.internal.PeopleClientImpl;
import java.util.List;

// Referenced classes of package com.google.android.gms.people.internal.api:
//            GraphUpdateImpl

final class <init> extends com.google.android.gms.people.piMethodImpl
{

    final GraphUpdateImpl this$0;
    final String val$account;
    final String val$circleId;
    final String val$pageId = null;
    final List val$qualifiedPersonIds;

    protected final volatile Result createFailedResult(final Status status)
    {
        return new com.google.android.gms.people.GraphUpdate.AddPeopleToCircleResult() {

            final GraphUpdateImpl._cls6 this$1;
            final Status val$status;

            public final Status getStatus()
            {
                return status;
            }

            
            {
                this$1 = GraphUpdateImpl._cls6.this;
                status = status1;
                super();
            }
        };
    }

    protected final volatile void doExecute(com.google.android.gms.common.api.teImpl._cls6 _pcls6)
        throws RemoteException
    {
        ((PeopleClientImpl)_pcls6).addPeopleToCircle(this, val$account, val$pageId, val$circleId, val$qualifiedPersonIds);
    }

    _cls1.val.status(List list)
    {
        this$0 = final_graphupdateimpl;
        val$account = s;
        val$circleId = String.this;
        val$qualifiedPersonIds = list;
        super(final_googleapiclient);
    }
}
