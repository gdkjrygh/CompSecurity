// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import java.util.Collections;
import java.util.List;

public final class ProtoDecorateResponse extends Message
{

    public static final List DEFAULT_EPISODE = Collections.emptyList();
    public static final List DEFAULT_SHOW = Collections.emptyList();
    public final List episode;
    public final List show;

    private ProtoDecorateResponse(Builder builder)
    {
        super(builder);
        show = e(builder.show);
        episode = e(builder.episode);
    }

    ProtoDecorateResponse(Builder builder, byte byte0)
    {
        this(builder);
    }

    static List a(List list)
    {
        return d(list);
    }

    static List b(List list)
    {
        return d(list);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoDecorateResponse))
            {
                return false;
            }
            obj = (ProtoDecorateResponse)obj;
            if (!a(show, ((ProtoDecorateResponse) (obj)).show) || !a(episode, ((ProtoDecorateResponse) (obj)).episode))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 1;
        int k = hashCode;
        int i = k;
        if (k == 0)
        {
            if (show != null)
            {
                i = show.hashCode();
            } else
            {
                i = 1;
            }
            if (episode != null)
            {
                j = episode.hashCode();
            }
            i = i * 37 + j;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
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

        public final Builder episode(List list)
        {
            episode = checkForNulls(list);
            return this;
        }

        public final Builder show(List list)
        {
            show = checkForNulls(list);
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoDecorateResponse protodecorateresponse)
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

}
