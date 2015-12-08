// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.party.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.party.json:
//            AlbumJacksonModel, AudioJacksonModel

public class TrackJacksonModel
    implements JacksonModel
{

    public final AlbumJacksonModel album;
    public final List artists;
    public final AudioJacksonModel audio;
    public final String duration;
    public final boolean explicit;
    public final String mediaManifest;
    public final String name;
    public final boolean playable;
    public final List proofedUsernames;
    public final String uri;

    public TrackJacksonModel(AlbumJacksonModel albumjacksonmodel, List list, AudioJacksonModel audiojacksonmodel, String s, Boolean boolean1, JsonNode jsonnode, String s1, 
            Boolean boolean2, List list1, String s2)
    {
        album = (AlbumJacksonModel)ctz.a(albumjacksonmodel);
        artists = (List)ctz.a(list);
        audio = (AudioJacksonModel)ctz.a(audiojacksonmodel);
        duration = (String)Optional.c(s).a("?");
        explicit = ((Boolean)Optional.c(boolean1).a(Boolean.valueOf(false))).booleanValue();
        if (jsonnode == null || jsonnode.isNull())
        {
            albumjacksonmodel = null;
        } else
        {
            albumjacksonmodel = jsonnode.toString();
        }
        mediaManifest = albumjacksonmodel;
        name = (String)ctz.a(s1);
        playable = ((Boolean)ctz.a(boolean2)).booleanValue();
        proofedUsernames = (List)Optional.c(list1).a(new ArrayList());
        uri = (String)ctz.a(s2);
    }
}
