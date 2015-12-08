// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


// Referenced classes of package retrofit:
//            Profiler

public static final class contentType
{

    private final String baseUrl;
    private final long contentLength;
    private final String contentType;
    private final String method;
    private final String relativePath;

    public String getBaseUrl()
    {
        return baseUrl;
    }

    public long getContentLength()
    {
        return contentLength;
    }

    public String getContentType()
    {
        return contentType;
    }

    public String getMethod()
    {
        return method;
    }

    public String getRelativePath()
    {
        return relativePath;
    }

    public (String s, String s1, String s2, long l, String s3)
    {
        method = s;
        baseUrl = s1;
        relativePath = s2;
        contentLength = l;
        contentType = s3;
    }
}
