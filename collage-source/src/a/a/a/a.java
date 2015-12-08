// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a;

import a.a.c.b;
import org.apache.http.HttpRequest;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package a.a.a:
//            b

public class a extends a.a.a
{

    public a(String s, String s1)
    {
        super(s, s1);
    }

    protected b b(Object obj)
    {
        if (!(obj instanceof HttpRequest))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("This consumer expects requests of type ").append(org/apache/http/HttpRequest.getCanonicalName()).toString());
        } else
        {
            return new a.a.a.b((HttpUriRequest)obj);
        }
    }
}
