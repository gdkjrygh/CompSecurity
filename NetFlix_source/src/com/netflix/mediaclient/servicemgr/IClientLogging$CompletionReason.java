// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            IClientLogging

public static final class  extends Enum
{

    private static final failed $VALUES[];
    public static final failed canceled;
    public static final failed failed;
    public static final failed success;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/servicemgr/IClientLogging$CompletionReason, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        success = new <init>("success", 0);
        canceled = new <init>("canceled", 1);
        failed = new <init>("failed", 2);
        $VALUES = (new .VALUES[] {
            success, canceled, failed
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
