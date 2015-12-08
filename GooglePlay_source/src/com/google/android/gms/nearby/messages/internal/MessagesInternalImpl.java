// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.messages.MessagesInternal;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            MessagesClientImpl, INearbyMessagesService

public final class MessagesInternalImpl
    implements MessagesInternal
{

    public static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();

    public MessagesInternalImpl()
    {
    }

    public final PendingResult setAppOptedIn(GoogleApiClient googleapiclient)
    {
        return googleapiclient.execute(new MessagesImpl.StatusMethodImpl(googleapiclient) {

            final MessagesInternalImpl this$0;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (MessagesClientImpl)client;
                client.checkConnected();
                ((INearbyMessagesService)client.getService()).setAppOptedIn(((MessagesClientImpl) (client)).mZeroPartyPackageName);
                setResult(Status.RESULT_SUCCESS);
            }

            
            {
                this$0 = MessagesInternalImpl.this;
                super(googleapiclient);
            }
        });
    }

}
