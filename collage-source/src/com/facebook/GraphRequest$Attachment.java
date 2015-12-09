// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            GraphRequest

private static class value
{

    private final GraphRequest request;
    private final Object value;

    public GraphRequest getRequest()
    {
        return request;
    }

    public Object getValue()
    {
        return value;
    }

    public (GraphRequest graphrequest, Object obj)
    {
        request = graphrequest;
        value = obj;
    }
}
