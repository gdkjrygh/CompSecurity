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

final class dImpl extends com.google.android.gms.people.eopleApiMethodImpl
{

    final GraphImpl this$0;
    final com.google.android.gms.people.nersOptions val$o;

    protected final volatile Result createFailedResult(final Status status)
    {
        return new com.google.android.gms.people.Graph.LoadOwnersResult() {

            final GraphImpl._cls1 this$1;
            final Status val$status;

            public final OwnerBuffer getOwners()
            {
                return null;
            }

            public final Status getStatus()
            {
                return status;
            }

            public final void release()
            {
            }

            
            {
                this$1 = GraphImpl._cls1.this;
                status = status1;
                super();
            }
        };
    }

    protected final volatile void doExecute(com.google.android.gms.common.api.phImpl._cls1 _pcls1)
        throws RemoteException
    {
        ((PeopleClientImpl)_pcls1).loadOwners$30345e6e(this, false, 0);
    }

    _cls1.val.status(com.google.android.gms.people.nersOptions nersoptions)
    {
        this$0 = final_graphimpl;
        val$o = nersoptions;
        super(GoogleApiClient.this);
    }
}
