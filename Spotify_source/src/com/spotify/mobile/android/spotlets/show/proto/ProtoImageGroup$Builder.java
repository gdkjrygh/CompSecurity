// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoImageGroup

public final class ink extends gxc
{

    public String large_link;
    public String small_link;
    public String standard_link;
    public String xlarge_link;

    public final ProtoImageGroup build()
    {
        return new ProtoImageGroup(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build large_link(String s)
    {
        large_link = s;
        return this;
    }

    public final large_link small_link(String s)
    {
        small_link = s;
        return this;
    }

    public final small_link standard_link(String s)
    {
        standard_link = s;
        return this;
    }

    public final standard_link xlarge_link(String s)
    {
        xlarge_link = s;
        return this;
    }

    public ()
    {
    }

    public (ProtoImageGroup protoimagegroup)
    {
        super(protoimagegroup);
        if (protoimagegroup == null)
        {
            return;
        } else
        {
            standard_link = protoimagegroup.standard_link;
            small_link = protoimagegroup.small_link;
            large_link = protoimagegroup.large_link;
            xlarge_link = protoimagegroup.xlarge_link;
            return;
        }
    }
}
