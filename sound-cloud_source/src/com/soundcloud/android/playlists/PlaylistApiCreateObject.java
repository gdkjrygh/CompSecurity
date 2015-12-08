// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.soundcloud.android.api.legacy.model.PublicApiPlaylist;
import com.soundcloud.android.api.legacy.model.PublicApiTrack;
import com.soundcloud.android.api.legacy.model.ScModel;
import com.soundcloud.android.api.model.Sharing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlaylistApiCreateObject
{

    String sharing;
    String title;
    public List tracks;

    public PlaylistApiCreateObject(PublicApiPlaylist publicapiplaylist)
    {
        title = publicapiplaylist.getTitle();
        Object obj;
        if (publicapiplaylist.getSharing() == Sharing.PRIVATE)
        {
            obj = "private";
        } else
        {
            obj = "public";
        }
        sharing = ((String) (obj));
        tracks = new ArrayList();
        for (publicapiplaylist = publicapiplaylist.getTracks().iterator(); publicapiplaylist.hasNext(); tracks.add(new ScModel(((PublicApiTrack) (obj)).getId())))
        {
            obj = (PublicApiTrack)publicapiplaylist.next();
        }

    }

    public String toJson()
        throws JsonProcessingException
    {
        return (new ObjectMapper()).configure(SerializationFeature.WRAP_ROOT_VALUE, true).writeValueAsString(this);
    }
}
