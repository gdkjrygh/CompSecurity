// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.jamendo.api;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.yong.jamendo.api:
//            JamendoMusic

public class JamendoMusicBuilder
{

    public JamendoMusicBuilder()
    {
    }

    public JamendoMusic build(JSONObject jsonobject)
        throws JSONException
    {
        JamendoMusic jamendomusic = new JamendoMusic();
        jamendomusic.setId_music(jsonobject.getInt("id"));
        jamendomusic.setDuration(jsonobject.getInt("duration"));
        jamendomusic.setArtistName(jsonobject.getString("artist_name"));
        jamendomusic.setAlbum_name(jsonobject.getString("album_name"));
        jamendomusic.setMusic_name(jsonobject.getString("name"));
        jamendomusic.setAlbum_image(jsonobject.getString("album_image"));
        jamendomusic.setAudio_link(jsonobject.getString("audio"));
        return jamendomusic;
    }
}
