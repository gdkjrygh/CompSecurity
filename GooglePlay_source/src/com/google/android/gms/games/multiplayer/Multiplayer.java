// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            ParticipantEntity

public interface Multiplayer
{

    public abstract Intent getParticipantListIntentRestricted(GoogleApiClient googleapiclient, ParticipantEntity aparticipantentity[], String s, String s1, String s2, Uri uri, Uri uri1);
}
