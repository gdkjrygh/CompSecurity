// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import gxc;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoShowResponse, ProtoShowRequestHeader, ProtoOnlineData

public final class _length extends gxc
{

    public ProtoShowRequestHeader header;
    public List item;
    public Integer length;
    public Boolean loading_contents;
    public ProtoOnlineData online_data;
    public Integer unfiltered_length;
    public Integer unranged_length;

    public final ProtoShowResponse build()
    {
        return new ProtoShowResponse(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build header(ProtoShowRequestHeader protoshowrequestheader)
    {
        header = protoshowrequestheader;
        return this;
    }

    public final header item(List list)
    {
        item = checkForNulls(list);
        return this;
    }

    public final checkForNulls length(Integer integer)
    {
        length = integer;
        return this;
    }

    public final length loading_contents(Boolean boolean1)
    {
        loading_contents = boolean1;
        return this;
    }

    public final loading_contents online_data(ProtoOnlineData protoonlinedata)
    {
        online_data = protoonlinedata;
        return this;
    }

    public final online_data unfiltered_length(Integer integer)
    {
        unfiltered_length = integer;
        return this;
    }

    public final unfiltered_length unranged_length(Integer integer)
    {
        unranged_length = integer;
        return this;
    }

    public ()
    {
    }

    public (ProtoShowResponse protoshowresponse)
    {
        super(protoshowresponse);
        if (protoshowresponse == null)
        {
            return;
        } else
        {
            item = ProtoShowResponse.a(protoshowresponse.item);
            header = protoshowresponse.header;
            online_data = protoshowresponse.online_data;
            unfiltered_length = protoshowresponse.unfiltered_length;
            length = protoshowresponse.length;
            loading_contents = protoshowresponse.loading_contents;
            unranged_length = protoshowresponse.unranged_length;
            return;
        }
    }
}
