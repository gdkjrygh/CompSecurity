// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.api;


// Referenced classes of package com.adobe.adobepass.accessenabler.api:
//            PassiveAuthnService

public static final class Q extends Enum
{

    private static final PASSIVE_STOPPED $VALUES[];
    public static final PASSIVE_STOPPED PASSIVE_IN_PROGRESS;
    public static final PASSIVE_STOPPED PASSIVE_STOPPED;

    public static Q valueOf(String s)
    {
        return (Q)Enum.valueOf(com/adobe/adobepass/accessenabler/api/PassiveAuthnService$PassiveAuthnState, s);
    }

    public static Q[] values()
    {
        return (Q[])$VALUES.clone();
    }

    static 
    {
        PASSIVE_IN_PROGRESS = new <init>("PASSIVE_IN_PROGRESS", 0);
        PASSIVE_STOPPED = new <init>("PASSIVE_STOPPED", 1);
        $VALUES = (new .VALUES[] {
            PASSIVE_IN_PROGRESS, PASSIVE_STOPPED
        });
    }

    private Q(String s, int i)
    {
        super(s, i);
    }
}
