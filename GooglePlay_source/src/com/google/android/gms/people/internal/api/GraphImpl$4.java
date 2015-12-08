// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.internal.PeopleClientImpl;
import com.google.android.gms.people.model.PersonBuffer;

// Referenced classes of package com.google.android.gms.people.internal.api:
//            GraphImpl

final class dImpl extends com.google.android.gms.people.eopleApiMethodImpl
{

    final GraphImpl this$0;
    final String val$account;
    final com.google.android.gms.people.opleOptions val$options;
    final String val$pageId = null;

    protected final volatile Result createFailedResult(final Status status)
    {
        return new com.google.android.gms.people.Graph.LoadPeopleResult() {

            final GraphImpl._cls4 this$1;
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
                this$1 = GraphImpl._cls4.this;
                status = status1;
                super();
            }
        };
    }

    protected final volatile void doExecute(com.google.android.gms.common.api.phImpl._cls4 _pcls4)
        throws RemoteException
    {
        ((PeopleClientImpl)_pcls4).loadPeople(this, val$account, val$pageId, val$options);
    }

    _cls1.val.status(com.google.android.gms.people.opleOptions opleoptions)
    {
        this$0 = final_graphimpl;
        val$account = s;
        val$options = opleoptions;
        super(final_googleapiclient);
    }
}
