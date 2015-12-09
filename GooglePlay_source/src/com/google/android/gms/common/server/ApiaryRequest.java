// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.server:
//            BaseApiaryRequest

public class ApiaryRequest extends BaseApiaryRequest
{

    private final Class mResponseClass;
    private final Object mResponseClassParam;

    public ApiaryRequest(int i, String s, Object obj, Class class1, Object obj1, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener, 
            String s1, String s2, boolean flag, HashMap hashmap, int j, int k)
    {
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = obj.toString();
        }
        this(i, s, ((String) (obj)), class1, obj1, listener, errorlistener, s1, s2, flag, hashmap, j, k);
    }

    private ApiaryRequest(int i, String s, String s1, Class class1, Object obj, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener, 
            String s2, String s3, boolean flag, HashMap hashmap, int j, int k)
    {
        super(i, s, s1, listener, errorlistener, s2, s3, flag, hashmap, j, k);
        mResponseClass = class1;
        mResponseClassParam = obj;
    }

    public Response parseNetworkResponse(NetworkResponse networkresponse)
    {
        com.android.volley.Cache.Entry entry;
        if (!shouldCache())
        {
            break MISSING_BLOCK_LABEL_153;
        }
        entry = HttpHeaderParser.parseCacheHeaders(networkresponse);
_L1:
        FastJsonResponse fastjsonresponse;
        if (mResponseClassParam == null)
        {
            fastjsonresponse = (FastJsonResponse)mResponseClass.newInstance();
        } else
        {
            fastjsonresponse = (FastJsonResponse)mResponseClass.getConstructor(new Class[] {
                mResponseClassParam.getClass()
            }).newInstance(new Object[] {
                mResponseClassParam
            });
        }
        fastjsonresponse.parseNetworkResponse(networkresponse.statusCode, networkresponse.data);
        return Response.success(fastjsonresponse, entry);
        networkresponse;
        return Response.error(new ParseError(networkresponse));
        networkresponse;
        throw new RuntimeException(networkresponse);
        networkresponse;
        throw new RuntimeException(networkresponse);
        networkresponse;
        throw new RuntimeException(networkresponse);
        networkresponse;
        throw new RuntimeException(networkresponse);
        networkresponse;
        throw new RuntimeException(networkresponse);
        entry = null;
          goto _L1
    }
}
