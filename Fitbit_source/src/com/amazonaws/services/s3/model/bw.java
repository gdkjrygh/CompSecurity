// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.services.s3.model;

import com.amazonaws.internal.c;
import com.amazonaws.internal.e;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.d;
import com.amazonaws.services.s3.b.a;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.methods.HttpRequestBase;

public class bw extends e
{

    private final HttpRequestBase a;

    public bw(InputStream inputstream)
    {
        this(inputstream, null);
    }

    public bw(InputStream inputstream, HttpRequestBase httprequestbase)
    {
        this(inputstream, httprequestbase, a(inputstream));
    }

    public bw(InputStream inputstream, HttpRequestBase httprequestbase, boolean flag)
    {
        Object obj = inputstream;
        if (flag)
        {
            obj = new d(a.f, inputstream);
        }
        super(((InputStream) (obj)));
        a = httprequestbase;
    }

    private static boolean a(InputStream inputstream)
    {
        boolean flag1 = true;
        boolean flag;
        if (!AwsSdkMetrics.g())
        {
            flag = false;
        } else
        {
            flag = flag1;
            if (inputstream instanceof c)
            {
                flag = flag1;
                if (((c)inputstream).d())
                {
                    return false;
                }
            }
        }
        return flag;
    }

    public HttpRequestBase a()
    {
        return a;
    }

    public void c()
    {
        try
        {
            close();
            return;
        }
        catch (IOException ioexception)
        {
            LogFactory.getLog(getClass()).debug("FYI", ioexception);
        }
    }
}
