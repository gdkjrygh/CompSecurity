// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


// Referenced classes of package retrofit:
//            Endpoint

public final class Endpoints
{
    private static class FixedEndpoint
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

        FixedEndpoint(String s, String s1)
        {
            apiUrl = s;
            name = s1;
        }
    }


    private static final String DEFAULT_NAME = "default";

    private Endpoints()
    {
    }

    public static Endpoint newFixedEndpoint(String s)
    {
        return new FixedEndpoint(s, "default");
    }

    public static Endpoint newFixedEndpoint(String s, String s1)
    {
        return new FixedEndpoint(s, s1);
    }
}
