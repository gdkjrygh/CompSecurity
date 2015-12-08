// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;


// Referenced classes of package com.worklight.androidgap.plugin:
//            DeviceAuthPlugin

private static final class  extends Enum
{

    private static final noValue ENUM$VALUES[];
    public static final noValue createCSR;
    public static final noValue createDeviceAuthHeader;
    public static final noValue init;
    public static final noValue isCertificateExists;
    public static final noValue noValue;

    public static  fromString(String s)
    {
        try
        {
            s = valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return noValue;
        }
        return s;
    }

    public static noValue valueOf(String s)
    {
        return (noValue)Enum.valueOf(com/worklight/androidgap/plugin/DeviceAuthPlugin$Command, s);
    }

    public static noValue[] values()
    {
        noValue anovalue[] = ENUM$VALUES;
        int i = anovalue.length;
        noValue anovalue1[] = new ENUM.VALUES[i];
        System.arraycopy(anovalue, 0, anovalue1, 0, i);
        return anovalue1;
    }

    static 
    {
        isCertificateExists = new <init>("isCertificateExists", 0);
        createDeviceAuthHeader = new <init>("createDeviceAuthHeader", 1);
        createCSR = new <init>("createCSR", 2);
        init = new <init>("init", 3);
        noValue = new <init>("noValue", 4);
        ENUM$VALUES = (new ENUM.VALUES[] {
            isCertificateExists, createDeviceAuthHeader, createCSR, init, noValue
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
