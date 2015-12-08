// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.internal.PeopleClientImpl;
import java.util.List;

// Referenced classes of package com.google.android.gms.people.internal.api:
//            GraphUpdateImpl

final class <init> extends com.google.android.gms.people.piMethodImpl
{

    final GraphUpdateImpl this$0;
    final String val$account;
    final List val$circleIdsToAdd = null;
    final List val$circleIdsToRemove;
    final String val$pageId = null;
    final String val$qualifiedId;
    final FavaDiagnosticsEntity val$startView = null;

    protected final volatile Result createFailedResult(final Status status)
    {
        return new com.google.android.gms.people.GraphUpdate.UpdatePersonCircleResult() {

            final GraphUpdateImpl._cls7 this$1;
            final Status val$status;

            public final Status getStatus()
            {
                return status;
            }

            
            {
                this$1 = GraphUpdateImpl._cls7.this;
                status = status1;
                super();
            }
        };
    }

    protected final volatile void doExecute(com.google.android.gms.common.api.teImpl._cls7 _pcls7)
        throws RemoteException
    {
        ((PeopleClientImpl)_pcls7).updatePersonCircles(this, val$account, val$pageId, val$qualifiedId, val$circleIdsToAdd, val$circleIdsToRemove, val$startView);
    }

    _cls1.val.status(FavaDiagnosticsEntity favadiagnosticsentity)
    {
        this$0 = final_graphupdateimpl;
        val$account = s;
        val$qualifiedId = s2;
        val$circleIdsToRemove = List.this;
        super(final_googleapiclient);
    }
}
