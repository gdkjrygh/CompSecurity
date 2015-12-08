// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import gxc;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoDecorateResponse

public final class episode extends gxc
{

    public List episode;
    public List show;

    public final ProtoDecorateResponse build()
    {
        return new ProtoDecorateResponse(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build episode(List list)
    {
        episode = checkForNulls(list);
        return this;
    }

    public final checkForNulls show(List list)
    {
        show = checkForNulls(list);
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
            show = ProtoDecorateResponse.a(protodecorateresponse.show);
            episode = ProtoDecorateResponse.b(protodecorateresponse.episode);
            return;
        }
    }
}
