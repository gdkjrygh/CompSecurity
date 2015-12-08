// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoShowRequestHeader, ProtoOnlineData

public final class ProtoShowResponse extends Message
{

    public static final List DEFAULT_ITEM = Collections.emptyList();
    public static final Integer DEFAULT_LENGTH = Integer.valueOf(0);
    public static final Boolean DEFAULT_LOADING_CONTENTS = Boolean.valueOf(false);
    public static final Integer DEFAULT_UNFILTERED_LENGTH = Integer.valueOf(0);
    public static final Integer DEFAULT_UNRANGED_LENGTH = Integer.valueOf(0);
    public final ProtoShowRequestHeader header;
    public final List item;
    public final Integer length;
    public final Boolean loading_contents;
    public final ProtoOnlineData online_data;
    public final Integer unfiltered_length;
    public final Integer unranged_length;

    private ProtoShowResponse(Builder builder)
    {
        super(builder);
        item = e(builder.item);
        header = builder.header;
        online_data = builder.online_data;
        unfiltered_length = builder.unfiltered_length;
        length = builder.length;
        loading_contents = builder.loading_contents;
        unranged_length = builder.unranged_length;
    }

    ProtoShowResponse(Builder builder, byte byte0)
    {
        this(builder);
    }

    static List a(List list)
    {
        return d(list);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoShowResponse))
            {
                return false;
            }
            obj = (ProtoShowResponse)obj;
            if (!a(item, ((ProtoShowResponse) (obj)).item) || !a(header, ((ProtoShowResponse) (obj)).header) || !a(online_data, ((ProtoShowResponse) (obj)).online_data) || !a(unfiltered_length, ((ProtoShowResponse) (obj)).unfiltered_length) || !a(length, ((ProtoShowResponse) (obj)).length) || !a(loading_contents, ((ProtoShowResponse) (obj)).loading_contents) || !a(unranged_length, ((ProtoShowResponse) (obj)).unranged_length))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l1 = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            int l;
            int i1;
            int j1;
            int k1;
            if (item != null)
            {
                i = item.hashCode();
            } else
            {
                i = 1;
            }
            if (header != null)
            {
                k = header.hashCode();
            } else
            {
                k = 0;
            }
            if (online_data != null)
            {
                l = online_data.hashCode();
            } else
            {
                l = 0;
            }
            if (unfiltered_length != null)
            {
                i1 = unfiltered_length.hashCode();
            } else
            {
                i1 = 0;
            }
            if (length != null)
            {
                j1 = length.hashCode();
            } else
            {
                j1 = 0;
            }
            if (loading_contents != null)
            {
                k1 = loading_contents.hashCode();
            } else
            {
                k1 = 0;
            }
            if (unranged_length != null)
            {
                l1 = unranged_length.hashCode();
            }
            i = (k1 + (j1 + (i1 + (l + (k + i * 37) * 37) * 37) * 37) * 37) * 37 + l1;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
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

        public final Builder header(ProtoShowRequestHeader protoshowrequestheader)
        {
            header = protoshowrequestheader;
            return this;
        }

        public final Builder item(List list)
        {
            item = checkForNulls(list);
            return this;
        }

        public final Builder length(Integer integer)
        {
            length = integer;
            return this;
        }

        public final Builder loading_contents(Boolean boolean1)
        {
            loading_contents = boolean1;
            return this;
        }

        public final Builder online_data(ProtoOnlineData protoonlinedata)
        {
            online_data = protoonlinedata;
            return this;
        }

        public final Builder unfiltered_length(Integer integer)
        {
            unfiltered_length = integer;
            return this;
        }

        public final Builder unranged_length(Integer integer)
        {
            unranged_length = integer;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoShowResponse protoshowresponse)
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

}
