// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.appprotocol.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.spotlets.appprotocol.model:
//            AppProtocol

public class longText
    implements JacksonModel
{

    public String longText;
    public String shortText;
    public int statusCode;

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

    public (int i, String s, String s1)
    {
        statusCode = i;
        shortText = s;
        longText = s1;
    }
}
