// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            OnInvitationReceivedListener, InvitationBuffer

public interface Invitations
{
    public static interface LoadInvitationsResult
        extends Releasable, Result
    {

        public abstract InvitationBuffer getInvitations();
    }


    public abstract Intent getPublicInvitationListIntentRestricted(GoogleApiClient googleapiclient, ZInvitationCluster zinvitationcluster, String s, String s1);

    public abstract PendingResult loadInvitationFirstParty(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult loadInvitations$385d8060(GoogleApiClient googleapiclient);

    public abstract PendingResult loadInvitationsFirstParty$b85066a(GoogleApiClient googleapiclient, String s);

    public abstract void registerInvitationListener(GoogleApiClient googleapiclient, OnInvitationReceivedListener oninvitationreceivedlistener);

    public abstract void registerInvitationListenerFirstParty(GoogleApiClient googleapiclient, OnInvitationReceivedListener oninvitationreceivedlistener, String s);

    public abstract void registerInvitationPopupListenerRestricted(GoogleApiClient googleapiclient);

    public abstract void unregisterInvitationListener(GoogleApiClient googleapiclient);

    public abstract void unregisterInvitationListenerFirstParty(GoogleApiClient googleapiclient, String s);
}
