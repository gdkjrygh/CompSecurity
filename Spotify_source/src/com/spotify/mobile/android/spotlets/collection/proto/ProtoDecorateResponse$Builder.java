// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import gxc;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoDecorateResponse

public final class track extends gxc
{

    public List album;
    public List artist;
    public List track;

    public final track album(List list)
    {
        album = checkForNulls(list);
        return this;
    }

    public final checkForNulls artist(List list)
    {
        artist = checkForNulls(list);
        return this;
    }

    public final ProtoDecorateResponse build()
    {
        return new ProtoDecorateResponse(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build track(List list)
    {
        track = checkForNulls(list);
        return this;
    }

    public ()
    {
    }

    public (ProtoDecorateResponse protodecorateresponse)
    {
        super(protodecorateresponse);
        if (protodecorateresponse == null)
        {
            return;
        } else
        {
            album = ProtoDecorateResponse.a(protodecorateresponse.album);
            artist = ProtoDecorateResponse.b(protodecorateresponse.artist);
            track = ProtoDecorateResponse.c(protodecorateresponse.track);
            return;
        }
    }
}
