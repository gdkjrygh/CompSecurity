// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.internal.PeopleClientImpl;
import com.google.android.gms.people.model.CircleBuffer;

// Referenced classes of package com.google.android.gms.people.internal.api:
//            GraphImpl

final class dImpl extends com.google.android.gms.people.eopleApiMethodImpl
{

    final GraphImpl this$0;
    final String val$account;
    final com.google.android.gms.people.rclesOptions val$o;
    final String val$pageId = null;

    protected final volatile Result createFailedResult(final Status status)
    {
        return new com.google.android.gms.people.Graph.LoadCirclesResult() {

            final GraphImpl._cls3 this$1;
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
                this$1 = GraphImpl._cls3.this;
                status = status1;
                super();
            }
        };
    }

    protected final volatile void doExecute(com.google.android.gms.common.api.phImpl._cls3 _pcls3)
        throws RemoteException
    {
        ((PeopleClientImpl)_pcls3).loadCircles(this, val$account, val$pageId, null, val$o.mFilterCircleType, null, false);
    }

    _cls1.val.status(com.google.android.gms.people.rclesOptions rclesoptions)
    {
        this$0 = final_graphimpl;
        val$account = s;
        val$o = rclesoptions;
        super(final_googleapiclient);
    }
}
