// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


// Referenced classes of package retrofit:
//            Endpoint, Endpoints

private static class name
    implements Endpoint
{

    private final String apiUrl;
    private final String name;

    public String getName()
    {
        return name;
    }

    public String getUrl()
    {
        return apiUrl;
    }

    (String s, String s1)
    {
        apiUrl = s;
        name = s1;
    }
}
