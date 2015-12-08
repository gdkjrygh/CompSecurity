// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;


// Referenced classes of package com.worklight.androidgap.plugin:
//            DeviceAuthPlugin

public static final class  extends Enum
{

    private static final clearDeviceCertCredentials $VALUES[];
    public static final clearDeviceCertCredentials clearDeviceCertCredentials;
    public static final clearDeviceCertCredentials getDeviceUUID;
    public static final clearDeviceCertCredentials init;
    public static final clearDeviceCertCredentials isCertificateExists;
    public static final clearDeviceCertCredentials saveCertificate;
    public static final clearDeviceCertCredentials signCsr;
    public static final clearDeviceCertCredentials signDeviceAuth;

    public static  fromString(String s)
    {
        try
        {
            s = valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static valueOf valueOf(String s)
    {
        return (valueOf)Enum.valueOf(com/worklight/androidgap/plugin/DeviceAuthPlugin$ACTION, s);
    }

    public static valueOf[] values()
    {
        return (valueOf[])$VALUES.clone();
    }

    static 
    {
        init = new <init>("init", 0);
        isCertificateExists = new <init>("isCertificateExists", 1);
        signDeviceAuth = new <init>("signDeviceAuth", 2);
        signCsr = new <init>("signCsr", 3);
        saveCertificate = new <init>("saveCertificate", 4);
        getDeviceUUID = new <init>("getDeviceUUID", 5);
        clearDeviceCertCredentials = new <init>("clearDeviceCertCredentials", 6);
        $VALUES = (new .VALUES[] {
            init, isCertificateExists, signDeviceAuth, signCsr, saveCertificate, getDeviceUUID, clearDeviceCertCredentials
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
