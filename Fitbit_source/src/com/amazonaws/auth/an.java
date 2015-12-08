// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;

// Referenced classes of package com.amazonaws.auth:
//            h, q, g

public class an
    implements h
{

    public an()
    {
    }

    public g a()
    {
        if (System.getProperty("aws.accessKeyId") != null && System.getProperty("aws.secretKey") != null)
        {
            return new q(System.getProperty("aws.accessKeyId"), System.getProperty("aws.secretKey"));
        } else
        {
            throw new AmazonClientException("Unable to load AWS credentials from Java system properties (aws.accessKeyId and aws.secretKey)");
        }
    }

    public void b()
    {
    }

    public String toString()
    {
        return getClass().getSimpleName();
    }
}
