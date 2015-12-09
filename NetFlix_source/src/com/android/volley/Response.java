// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            VolleyError

public class Response
{
    public static interface ErrorListener
    {

        public abstract void onErrorResponse(VolleyError volleyerror);
    }

    public static interface Listener
    {

        public abstract void onResponse(Object obj);
    }


    public final Cache.Entry cacheEntry;
    public final VolleyError error;
    public boolean intermediate;
    public final Object result;

    private Response(VolleyError volleyerror)
    {
        intermediate = false;
        result = null;
        cacheEntry = null;
        error = volleyerror;
    }

    private Response(Object obj, Cache.Entry entry)
    {
        intermediate = false;
        result = obj;
        cacheEntry = entry;
        error = null;
    }

    public static Response error(VolleyError volleyerror)
    {
        return new Response(volleyerror);
    }

    public static Response success(Object obj, Cache.Entry entry)
    {
        return new Response(obj, entry);
    }

    public boolean isSuccess()
    {
        return error == null;
    }
}
