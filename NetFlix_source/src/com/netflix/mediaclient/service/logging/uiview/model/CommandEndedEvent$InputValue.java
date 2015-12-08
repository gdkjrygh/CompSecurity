// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.uiview.model;


// Referenced classes of package com.netflix.mediaclient.service.logging.uiview.model:
//            CommandEndedEvent

private static final class  extends Enum
{

    private static final touch $VALUES[];
    public static final touch touch;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/service/logging/uiview/model/CommandEndedEvent$InputValue, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        touch = new <init>("touch", 0);
        $VALUES = (new .VALUES[] {
            touch
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
