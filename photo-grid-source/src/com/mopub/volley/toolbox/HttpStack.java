// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import com.mopub.volley.Request;
import java.util.Map;
import org.apache.http.HttpResponse;

public interface HttpStack
{

    public abstract HttpResponse performRequest(Request request, Map map);
}
