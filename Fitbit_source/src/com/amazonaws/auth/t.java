// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import java.io.IOException;

// Referenced classes of package com.amazonaws.auth:
//            h, ac, g

public class t
    implements h
{

    private static String a = "AwsCredentials.properties";
    private final String b;

    public t()
    {
        this(a);
    }

    public t(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Credentials file path cannot be null");
        }
        if (!s.startsWith("/"))
        {
            b = (new StringBuilder()).append("/").append(s).toString();
            return;
        } else
        {
            b = s;
            return;
        }
    }

    public g a()
    {
        Object obj = getClass().getResourceAsStream(b);
        if (obj == null)
        {
            throw new AmazonClientException((new StringBuilder()).append("Unable to load AWS credentials from the ").append(b).append(" file on the classpath").toString());
        }
        try
        {
            obj = new ac(((java.io.InputStream) (obj)));
        }
        catch (IOException ioexception)
        {
            throw new AmazonClientException((new StringBuilder()).append("Unable to load AWS credentials from the ").append(b).append(" file on the classpath").toString(), ioexception);
        }
        return ((g) (obj));
    }

    public void b()
    {
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("(").append(b).append(")").toString();
    }

}
