// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.soundcloud.android.api.legacy.model.ScModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class PlaylistApiUpdateObject
{

    List tracks;

    public PlaylistApiUpdateObject(Collection collection)
    {
        tracks = new ArrayList(collection.size());
        Long long1;
        for (collection = collection.iterator(); collection.hasNext(); tracks.add(new ScModel(long1.longValue())))
        {
            long1 = (Long)collection.next();
        }

    }

    public String toJson()
        throws IOException
    {
        return (new ObjectMapper()).configure(SerializationFeature.WRAP_ROOT_VALUE, true).writeValueAsString(this);
    }
}
