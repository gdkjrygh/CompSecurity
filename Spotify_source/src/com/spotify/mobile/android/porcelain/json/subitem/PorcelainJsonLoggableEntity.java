// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.subitem;

import android.os.Parcel;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.spotify.mobile.android.cosmos.JacksonModel;
import drw;
import drx;
import gen;

public class PorcelainJsonLoggableEntity
    implements JacksonModel, drx
{

    protected static final String KEY_LOGGING_EXTRA_DATA = "loggingData";
    private final JsonNode mExtraData;
    private final String mUri;

    public PorcelainJsonLoggableEntity(String s, JsonNode jsonnode)
    {
        mUri = s;
        if (jsonnode == null || jsonnode.isNull())
        {
            jsonnode = MissingNode.getInstance();
        }
        mExtraData = jsonnode;
    }

    final JsonNode getExtraData()
    {
        return mExtraData;
    }

    public drw getLoggingData()
    {
        if (mUri == null)
        {
            return null;
        } else
        {
            return new drw() {

                private PorcelainJsonLoggableEntity a;

                public final String a()
                {
                    return a.mUri;
                }

                public final JsonNode b()
                {
                    return a.mExtraData;
                }

            
            {
                a = PorcelainJsonLoggableEntity.this;
                super();
            }
            };
        }
    }

    final void writeExtraDataToParcel(Parcel parcel)
    {
        gen.a(parcel, mExtraData);
    }


}
