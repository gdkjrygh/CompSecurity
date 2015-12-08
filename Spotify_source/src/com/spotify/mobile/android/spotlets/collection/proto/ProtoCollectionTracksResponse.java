// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import java.util.Collections;
import java.util.List;

public final class ProtoCollectionTracksResponse extends Message
{

    public static final List DEFAULT_ITEM = Collections.emptyList();
    public static final Boolean DEFAULT_LOADING_CONTENTS = Boolean.valueOf(false);
    public static final String DEFAULT_OFFLINE = "";
    public static final Integer DEFAULT_SYNC_PROGRESS = Integer.valueOf(0);
    public static final Integer DEFAULT_UNFILTERED_LENGTH = Integer.valueOf(0);
    public static final Integer DEFAULT_UNRANGED_LENGTH = Integer.valueOf(0);
    public final List item;
    public final Boolean loading_contents;
    public final String offline;
    public final Integer sync_progress;
    public final Integer unfiltered_length;
    public final Integer unranged_length;

    private ProtoCollectionTracksResponse(Builder builder)
    {
        super(builder);
        item = e(builder.item);
        unfiltered_length = builder.unfiltered_length;
        unranged_length = builder.unranged_length;
        loading_contents = builder.loading_contents;
        offline = builder.offline;
        sync_progress = builder.sync_progress;
    }

    ProtoCollectionTracksResponse(Builder builder, byte byte0)
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
            if (!(obj instanceof ProtoCollectionTracksResponse))
            {
                return false;
            }
            obj = (ProtoCollectionTracksResponse)obj;
            if (!a(item, ((ProtoCollectionTracksResponse) (obj)).item) || !a(unfiltered_length, ((ProtoCollectionTracksResponse) (obj)).unfiltered_length) || !a(unranged_length, ((ProtoCollectionTracksResponse) (obj)).unranged_length) || !a(loading_contents, ((ProtoCollectionTracksResponse) (obj)).loading_contents) || !a(offline, ((ProtoCollectionTracksResponse) (obj)).offline) || !a(sync_progress, ((ProtoCollectionTracksResponse) (obj)).sync_progress))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int k1 = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            int l;
            int i1;
            int j1;
            if (item != null)
            {
                i = item.hashCode();
            } else
            {
                i = 1;
            }
            if (unfiltered_length != null)
            {
                k = unfiltered_length.hashCode();
            } else
            {
                k = 0;
            }
            if (unranged_length != null)
            {
                l = unranged_length.hashCode();
            } else
            {
                l = 0;
            }
            if (loading_contents != null)
            {
                i1 = loading_contents.hashCode();
            } else
            {
                i1 = 0;
            }
            if (offline != null)
            {
                j1 = offline.hashCode();
            } else
            {
                j1 = 0;
            }
            if (sync_progress != null)
            {
                k1 = sync_progress.hashCode();
            }
            i = (j1 + (i1 + (l + (k + i * 37) * 37) * 37) * 37) * 37 + k1;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public List item;
        public Boolean loading_contents;
        public String offline;
        public Integer sync_progress;
        public Integer unfiltered_length;
        public Integer unranged_length;

        public final ProtoCollectionTracksResponse build()
        {
            return new ProtoCollectionTracksResponse(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder item(List list)
        {
            item = checkForNulls(list);
            return this;
        }

        public final Builder loading_contents(Boolean boolean1)
        {
            loading_contents = boolean1;
            return this;
        }

        public final Builder offline(String s)
        {
            offline = s;
            return this;
        }

        public final Builder sync_progress(Integer integer)
        {
            sync_progress = integer;
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

        public Builder(ProtoCollectionTracksResponse protocollectiontracksresponse)
        {
            super(protocollectiontracksresponse);
            if (protocollectiontracksresponse == null)
            {
                return;
            } else
            {
                item = ProtoCollectionTracksResponse.a(protocollectiontracksresponse.item);
                unfiltered_length = protocollectiontracksresponse.unfiltered_length;
                unranged_length = protocollectiontracksresponse.unranged_length;
                loading_contents = protocollectiontracksresponse.loading_contents;
                offline = protocollectiontracksresponse.offline;
                sync_progress = protocollectiontracksresponse.sync_progress;
                return;
            }
        }
    }

}
