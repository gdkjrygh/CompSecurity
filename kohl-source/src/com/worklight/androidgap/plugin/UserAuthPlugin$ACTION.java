// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;


// Referenced classes of package com.worklight.androidgap.plugin:
//            UserAuthPlugin

public static final class  extends Enum
{

    private static final clean $VALUES[];
    public static final clean clean;
    public static final clean init;
    public static final clean isCertificateExists;
    public static final clean saveCertificate;
    public static final clean send;
    public static final clean signCsr;
    public static final clean signDeviceAuth;

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
        return (valueOf)Enum.valueOf(com/worklight/androidgap/plugin/UserAuthPlugin$ACTION, s);
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
        send = new <init>("send", 5);
        clean = new <init>("clean", 6);
        $VALUES = (new .VALUES[] {
            init, isCertificateExists, signDeviceAuth, signCsr, saveCertificate, send, clean
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
