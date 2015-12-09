// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.user;

import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.spotlets.user:
//            InvitationCodeModel, PlaylistModel, TopArtistModel

public class ProfileV2Model
    implements JacksonModel
{

    public final InvitationCodeModel mInvitationCodes[];
    public final PlaylistModel mPlaylists[];
    public final TopArtistModel mTopArtists[];
    public final Integer mTotalInvitationCodes;

    public ProfileV2Model(PlaylistModel aplaylistmodel[], TopArtistModel atopartistmodel[], InvitationCodeModel ainvitationcodemodel[], Integer integer)
    {
        mPlaylists = aplaylistmodel;
        mTopArtists = atopartistmodel;
        mInvitationCodes = ainvitationcodemodel;
        mTotalInvitationCodes = integer;
    }
}
