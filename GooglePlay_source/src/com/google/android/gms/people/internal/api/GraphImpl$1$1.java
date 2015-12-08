// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.internal.PeopleClientImpl;
import com.google.android.gms.people.model.OwnerBuffer;

// Referenced classes of package com.google.android.gms.people.internal.api:
//            GraphImpl

final class val.status
    implements com.google.android.gms.people.rsResult
{

    final val.status this$1;
    final Status val$status;

    public final OwnerBuffer getOwners()
    {
        return null;
    }

    public final Status getStatus()
    {
        return val$status;
    }

    public final void release()
    {
    }

    mpl()
    {
        this$1 = final_mpl;
        val$status = Status.this;
        super();
    }

    // Unreferenced inner class com/google/android/gms/people/internal/api/GraphImpl$1

/* anonymous class */
    final class GraphImpl._cls1 extends com.google.android.gms.people.People.BasePeopleApiMethodImpl
    {

        final GraphImpl this$0;
        final com.google.android.gms.people.Graph.LoadOwnersOptions val$o;

        protected final volatile Result createFailedResult(Status status1)
        {
            return status1. new GraphImpl._cls1._cls1();
        }

        protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            ((PeopleClientImpl)client).loadOwners$30345e6e(this, false, 0);
        }

            
            {
                this$0 = final_graphimpl;
                o = loadownersoptions;
                super(GoogleApiClient.this);
            }
    }

}
