// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;


// Referenced classes of package com.worklight.androidgap.plugin:
//            ForegroundBinderPlugin

static final class  extends Enum
{

    private static final UNBIND_FROM_SERVICE $VALUES[];
    public static final UNBIND_FROM_SERVICE BIND_TO_SERVICE;
    public static final UNBIND_FROM_SERVICE UNBIND_FROM_SERVICE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/worklight/androidgap/plugin/ForegroundBinderPlugin$Action, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        BIND_TO_SERVICE = new <init>("BIND_TO_SERVICE", 0);
        UNBIND_FROM_SERVICE = new <init>("UNBIND_FROM_SERVICE", 1);
        $VALUES = (new .VALUES[] {
            BIND_TO_SERVICE, UNBIND_FROM_SERVICE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
