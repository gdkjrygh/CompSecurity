// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.appprotocol.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.spotlets.appprotocol.model:
//            AppProtocol

public class rating
    implements JacksonModel
{

    public static final rating DEFAULT = new <init>(0);
    public static final int NONE = 0;
    public static final int THUMB_DOWN = -1;
    public static final int THUMB_UP = 1;
    public int rating;

    public String toString()
    {
        String s;
        try
        {
            s = AppProtocol.a().writeValueAsString(this);
        }
        catch (JsonProcessingException jsonprocessingexception)
        {
            return (new StringBuilder("{")).append(getClass().getSimpleName()).append("}").toString();
        }
        return s;
    }


    public ()
    {
    }

    public (int i)
    {
        rating = i;
    }
}
