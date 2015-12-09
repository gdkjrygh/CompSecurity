// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            OnInvitationReceivedListener, InvitationBuffer

public interface Invitations
{
    public static interface LoadInvitationsResult
        extends Releasable, Result
    {

        public abstract InvitationBuffer getInvitations();
    }


    public abstract Intent getInvitationInboxIntent(GoogleApiClient googleapiclient);

    public abstract PendingResult loadInvitations(GoogleApiClient googleapiclient);

    public abstract PendingResult loadInvitations(GoogleApiClient googleapiclient, int i);

    public abstract void registerInvitationListener(GoogleApiClient googleapiclient, OnInvitationReceivedListener oninvitationreceivedlistener);

    public abstract void unregisterInvitationListener(GoogleApiClient googleapiclient);
}
