// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal.api;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.GraphUpdate;
import com.google.android.gms.people.internal.PeopleCallLog;
import com.google.android.gms.people.internal.PeopleClientImpl;
import java.util.List;

public final class GraphUpdateImpl
    implements GraphUpdate
{

    public GraphUpdateImpl()
    {
    }

    public final PendingResult addPeopleToCircle$6bf529d6(final GoogleApiClient final_googleapiclient, final String account, String s, List list)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            PeopleCallLog.log("addPeopleToCircle", new Object[] {
                account, null, s, list
            });
        }
        return final_googleapiclient.execute(new com.google.android.gms.people.People.BasePeopleApiMethodImpl(list) {

            final GraphUpdateImpl this$0;
            final String val$account;
            final String val$circleId;
            final String val$pageId = null;
            final List val$qualifiedPersonIds;

            protected final volatile Result createFailedResult(Status status)
            {
                return status. new com.google.android.gms.people.GraphUpdate.AddPeopleToCircleResult() {

                    final _cls6 this$1;
                    final Status val$status;

                    public final Status getStatus()
                    {
                        return status;
                    }

            
            {
                this$1 = final__pcls6;
                status = Status.this;
                super();
            }
                };
            }

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((PeopleClientImpl)client).addPeopleToCircle(this, account, pageId, circleId, qualifiedPersonIds);
            }

            
            {
                this$0 = GraphUpdateImpl.this;
                account = s;
                circleId = s2;
                qualifiedPersonIds = list;
                super(final_googleapiclient);
            }
        });
    }

    public final PendingResult updatePersonCircles$50c1611b(final GoogleApiClient final_googleapiclient, final String account, String s, List list)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            PeopleCallLog.log("updatePersonCircles", new Object[] {
                account, null, s, null, list, null
            });
        }
        return final_googleapiclient.execute(new com.google.android.gms.people.People.BasePeopleApiMethodImpl(null) {

            final GraphUpdateImpl this$0;
            final String val$account;
            final List val$circleIdsToAdd = null;
            final List val$circleIdsToRemove;
            final String val$pageId = null;
            final String val$qualifiedId;
            final FavaDiagnosticsEntity val$startView = null;

            protected final volatile Result createFailedResult(Status status)
            {
                return status. new com.google.android.gms.people.GraphUpdate.UpdatePersonCircleResult() {

                    final _cls7 this$1;
                    final Status val$status;

                    public final Status getStatus()
                    {
                        return status;
                    }

            
            {
                this$1 = final__pcls7;
                status = Status.this;
                super();
            }
                };
            }

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((PeopleClientImpl)client).updatePersonCircles(this, account, pageId, qualifiedId, circleIdsToAdd, circleIdsToRemove, startView);
            }

            
            {
                this$0 = GraphUpdateImpl.this;
                account = s;
                qualifiedId = s2;
                circleIdsToRemove = list1;
                super(final_googleapiclient);
            }
        });
    }
}
