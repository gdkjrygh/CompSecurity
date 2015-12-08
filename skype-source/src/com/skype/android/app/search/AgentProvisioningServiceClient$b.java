// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;


// Referenced classes of package com.skype.android.app.search:
//            AgentProvisioningServiceClient

private static final class  extends Enum
{

    private static final DELETE $VALUES[];
    public static final DELETE DELETE;
    public static final DELETE GET;
    public static final DELETE PUT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/search/AgentProvisioningServiceClient$b, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        GET = new <init>("GET", 0);
        PUT = new <init>("PUT", 1);
        DELETE = new <init>("DELETE", 2);
        $VALUES = (new .VALUES[] {
            GET, PUT, DELETE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
