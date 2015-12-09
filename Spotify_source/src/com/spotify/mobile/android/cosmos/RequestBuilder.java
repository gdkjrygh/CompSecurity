// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos;

import android.text.TextUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Request;
import ctz;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.cosmos:
//            JacksonSerializer, JacksonModel

public class RequestBuilder
{

    static final String HERMES_CACHE_IDENTIFIER_KEY = "cache-identifier";
    private final Request mRequest;

    private RequestBuilder(String s, String s1)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "Request method cannot not be null");
        if (!TextUtils.isEmpty(s1))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "Request URI cannot be null");
        mRequest = new Request(s, s1, new HashMap(), Request.EMPTY_BODY);
    }

    private RequestBuilder(String s, String s1, byte abyte0[])
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "Request method cannot not be null");
        if (!TextUtils.isEmpty(s1))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "Request URI cannot be null");
        mRequest = new Request(s, s1, new HashMap(), abyte0);
    }

    public static RequestBuilder delete(String s)
    {
        return new RequestBuilder("DELETE", s);
    }

    public static RequestBuilder delete(String s, JacksonModel jacksonmodel)
    {
        return new RequestBuilder("DELETE", s, JacksonSerializer.toBytes(jacksonmodel));
    }

    public static RequestBuilder get(String s)
    {
        return new RequestBuilder("GET", s);
    }

    public static RequestBuilder post(String s)
    {
        return new RequestBuilder("POST", s);
    }

    public static RequestBuilder post(String s, JacksonModel jacksonmodel)
    {
        return post(s, jacksonmodel, null);
    }

    public static RequestBuilder post(String s, JacksonModel jacksonmodel, ObjectMapper objectmapper)
    {
        ctz.a(jacksonmodel);
        return new RequestBuilder("POST", s, JacksonSerializer.toBytes(jacksonmodel, objectmapper));
    }

    public static RequestBuilder postBytes(String s, byte abyte0[])
    {
        return new RequestBuilder("POST", s, abyte0);
    }

    public static RequestBuilder put(String s)
    {
        return new RequestBuilder("PUT", s);
    }

    public static RequestBuilder put(String s, JacksonModel jacksonmodel)
    {
        return put(s, jacksonmodel, null);
    }

    public static RequestBuilder put(String s, JacksonModel jacksonmodel, ObjectMapper objectmapper)
    {
        ctz.a(jacksonmodel);
        return new RequestBuilder("PUT", s, JacksonSerializer.toBytes(jacksonmodel, objectmapper));
    }

    public static RequestBuilder putBytes(String s, byte abyte0[])
    {
        return new RequestBuilder("PUT", s, abyte0);
    }

    public static RequestBuilder subscribe(String s)
    {
        return new RequestBuilder("SUB", s);
    }

    public static RequestBuilder subscribe(String s, JacksonModel jacksonmodel)
    {
        return subscribe(s, jacksonmodel, null);
    }

    public static RequestBuilder subscribe(String s, JacksonModel jacksonmodel, ObjectMapper objectmapper)
    {
        ctz.a(jacksonmodel);
        return new RequestBuilder("SUB", s, JacksonSerializer.toBytes(jacksonmodel, objectmapper));
    }

    public static RequestBuilder subscribeBytes(String s, byte abyte0[])
    {
        return new RequestBuilder("SUB", s, abyte0);
    }

    public Request build()
    {
        return mRequest;
    }

    public RequestBuilder setHermesCacheIdentifier(String s)
    {
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "Cache identifier cannot be empty");
        mRequest.getHeaders().put("cache-identifier", s);
        return this;
    }

    public RequestBuilder with(String s, String s1)
    {
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "Header key cannot be empty");
        ctz.a(s1);
        mRequest.getHeaders().put(s, s1);
        return this;
    }
}
