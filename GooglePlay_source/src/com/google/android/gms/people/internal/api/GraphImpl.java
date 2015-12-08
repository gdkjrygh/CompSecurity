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
import com.google.android.gms.people.Graph;
import com.google.android.gms.people.internal.PeopleCallLog;
import com.google.android.gms.people.internal.PeopleClientImpl;
import com.google.android.gms.people.model.CircleBuffer;
import com.google.android.gms.people.model.OwnerBuffer;
import com.google.android.gms.people.model.PersonBuffer;

public final class GraphImpl
    implements Graph
{

    public GraphImpl()
    {
    }

    public final PendingResult loadCircles$3c0ce7d1(final GoogleApiClient final_googleapiclient, final String account, com.google.android.gms.people.Graph.LoadCirclesOptions loadcirclesoptions)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            PeopleCallLog.log("loadCircles", new Object[] {
                account, null, loadcirclesoptions
            });
        }
        if (loadcirclesoptions == null)
        {
            loadcirclesoptions = com.google.android.gms.people.Graph.LoadCirclesOptions.DEFAULT;
        }
        return final_googleapiclient.enqueue(new com.google.android.gms.people.People.BasePeopleApiMethodImpl(loadcirclesoptions) {

            final GraphImpl this$0;
            final String val$account;
            final com.google.android.gms.people.Graph.LoadCirclesOptions val$o;
            final String val$pageId = null;

            protected final volatile Result createFailedResult(Status status)
            {
                return status. new com.google.android.gms.people.Graph.LoadCirclesResult() {

                    final _cls3 this$1;
                    final Status val$status;

                    public final CircleBuffer getCircles()
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
                this$1 = final__pcls3;
                status = Status.this;
                super();
            }
                };
            }

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((PeopleClientImpl)client).loadCircles(this, account, pageId, null, o.mFilterCircleType, null, false);
            }

            
            {
                this$0 = GraphImpl.this;
                account = s;
                o = loadcirclesoptions;
                super(final_googleapiclient);
            }
        });
    }

    public final PendingResult loadOwners(final GoogleApiClient final_googleapiclient, com.google.android.gms.people.Graph.LoadOwnersOptions loadownersoptions)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            PeopleCallLog.log("loadOwners", new Object[] {
                loadownersoptions
            });
        }
        return final_googleapiclient.enqueue(new com.google.android.gms.people.People.BasePeopleApiMethodImpl(loadownersoptions) {

            final GraphImpl this$0;
            final com.google.android.gms.people.Graph.LoadOwnersOptions val$o;

            protected final volatile Result createFailedResult(Status status)
            {
                return status. new com.google.android.gms.people.Graph.LoadOwnersResult() {

                    final _cls1 this$1;
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
                this$1 = final__pcls1;
                status = Status.this;
                super();
            }
                };
            }

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((PeopleClientImpl)client).loadOwners$30345e6e(this, false, 0);
            }

            
            {
                this$0 = GraphImpl.this;
                o = loadownersoptions;
                super(final_googleapiclient);
            }
        });
    }

    public final PendingResult loadPeople$7acb640d(final GoogleApiClient final_googleapiclient, final String account, com.google.android.gms.people.Graph.LoadPeopleOptions loadpeopleoptions)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            PeopleCallLog.log("loadPeople", new Object[] {
                account, null, loadpeopleoptions
            });
        }
        return final_googleapiclient.enqueue(new com.google.android.gms.people.People.BasePeopleApiMethodImpl(loadpeopleoptions) {

            final GraphImpl this$0;
            final String val$account;
            final com.google.android.gms.people.Graph.LoadPeopleOptions val$options;
            final String val$pageId = null;

            protected final volatile Result createFailedResult(Status status)
            {
                return status. new com.google.android.gms.people.Graph.LoadPeopleResult() {

                    final _cls4 this$1;
                    final Status val$status;

                    public final PersonBuffer getPeople()
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
                this$1 = final__pcls4;
                status = Status.this;
                super();
            }
                };
            }

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((PeopleClientImpl)client).loadPeople(this, account, pageId, options);
            }

            
            {
                this$0 = GraphImpl.this;
                account = s;
                options = loadpeopleoptions;
                super(final_googleapiclient);
            }
        });
    }
}
