// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.util;


// Referenced classes of package ly.kite.util:
//            HTTPJSONRequest

public static final class methodName extends Enum
{

    private static final PATCH $VALUES[];
    public static final PATCH GET;
    public static final PATCH PATCH;
    public static final PATCH POST;
    private final String methodName;

    public static methodName valueOf(String s)
    {
        return (methodName)Enum.valueOf(ly/kite/util/HTTPJSONRequest$HttpMethod, s);
    }

    public static methodName[] values()
    {
        return (methodName[])$VALUES.clone();
    }

    static 
    {
        POST = new <init>("POST", 0, "POST");
        GET = new <init>("GET", 1, "GET");
        PATCH = new <init>("PATCH", 2, "PATCH");
        $VALUES = (new .VALUES[] {
            POST, GET, PATCH
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        methodName = s1;
    }
}
