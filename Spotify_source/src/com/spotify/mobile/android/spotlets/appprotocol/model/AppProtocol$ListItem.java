// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.appprotocol.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.spotlets.appprotocol.model:
//            AppProtocol

public class hasChildren
    implements JacksonModel
{

    public boolean hasChildren;
    public String id;
    public String imageId;
    public boolean playable;
    public String subtitle;
    public String title;
    public String uri;

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

    public (String s, String s1, String s2, String s3, String s4, boolean flag, boolean flag1)
    {
        id = s;
        uri = s1;
        imageId = s2;
        title = s3;
        subtitle = s4;
        playable = flag;
        hasChildren = flag1;
    }
}
