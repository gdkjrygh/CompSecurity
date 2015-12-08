// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm.model;


// Referenced classes of package com.netflix.mediaclient.service.logging.apm.model:
//            Display

public static final class I extends Enum
{

    private static final hdmi $VALUES[];
    public static final hdmi component;
    public static final hdmi composite;
    public static final hdmi hdmi;
    public static final hdmi internal;

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/netflix/mediaclient/service/logging/apm/model/Display$Connector, s);
    }

    public static I[] values()
    {
        return (I[])$VALUES.clone();
    }

    static 
    {
        internal = new <init>("internal", 0);
        component = new <init>("component", 1);
        composite = new <init>("composite", 2);
        hdmi = new <init>("hdmi", 3);
        $VALUES = (new .VALUES[] {
            internal, component, composite, hdmi
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
