// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.uiview.model;


// Referenced classes of package com.netflix.mediaclient.service.logging.uiview.model:
//            CommandEndedEvent

private static final class  extends Enum
{

    private static final pointer $VALUES[];
    public static final pointer gesture;
    public static final pointer key;
    public static final pointer pointer;
    public static final pointer voice;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/service/logging/uiview/model/CommandEndedEvent$InputMethod, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        key = new <init>("key", 0);
        voice = new <init>("voice", 1);
        gesture = new <init>("gesture", 2);
        pointer = new <init>("pointer", 3);
        $VALUES = (new .VALUES[] {
            key, voice, gesture, pointer
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
