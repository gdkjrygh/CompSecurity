// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sony.snei.np.android.account.oauth;


public final class InstallationStatus extends Enum
{

    public static final InstallationStatus a;
    public static final InstallationStatus b;
    public static final InstallationStatus c;
    public static final InstallationStatus d;
    private static final InstallationStatus e[];

    private InstallationStatus(String s, int i)
    {
        super(s, i);
    }

    public static InstallationStatus valueOf(String s)
    {
        return (InstallationStatus)Enum.valueOf(com/sony/snei/np/android/account/oauth/InstallationStatus, s);
    }

    public static InstallationStatus[] values()
    {
        return (InstallationStatus[])e.clone();
    }

    static 
    {
        a = new InstallationStatus("INSTALLED_3", 0);
        b = new InstallationStatus("INSTALLED_2", 1);
        c = new InstallationStatus("UNKNOWN", 2);
        d = new InstallationStatus("NOT_INSTALLED", 3);
        e = (new InstallationStatus[] {
            a, b, c, d
        });
    }
}
