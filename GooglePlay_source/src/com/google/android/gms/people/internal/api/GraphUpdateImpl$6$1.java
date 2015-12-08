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

final class val.status
    implements com.google.android.gms.people.eToCircleResult
{

    final val.status this$1;
    final Status val$status;

    public final Status getStatus()
    {
        return val$status;
    }

    nit>()
    {
        this$1 = final_nit>;
        val$status = Status.this;
        super();
    }

    // Unreferenced inner class com/google/android/gms/people/internal/api/GraphUpdateImpl$6

/* anonymous class */
    final class GraphUpdateImpl._cls6 extends com.google.android.gms.people.People.BasePeopleApiMethodImpl
    {

        final GraphUpdateImpl this$0;
        final String val$account;
        final String val$circleId;
        final String val$pageId = null;
        final List val$qualifiedPersonIds;

        protected final volatile Result createFailedResult(Status status1)
        {
            return status1. new GraphUpdateImpl._cls6._cls1();
        }

        protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            ((PeopleClientImpl)client).addPeopleToCircle(this, account, pageId, circleId, qualifiedPersonIds);
        }

            
            {
                this$0 = final_graphupdateimpl;
                account = s;
                circleId = String.this;
                qualifiedPersonIds = list;
                super(final_googleapiclient);
            }
    }

}
