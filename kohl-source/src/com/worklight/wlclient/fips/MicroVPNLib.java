// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.fips;


public class MicroVPNLib
{

    public MicroVPNLib()
    {
    }

    public native int FIPSInit();

    public native int checkStatus(long l);

    public native int closeMicroVPNConnection(long l);

    public native int closeSocket(String s);

    public native int curlCleanup(long l);

    public native byte[] curlExecute(long l, long l1, String s, String s1, String s2, 
            String as[], String as1[]);

    public native long curlInit();

    public native long openMicroVPNConnection(String s, String s1, String s2, String s3);

    public native int openSocket(String s, String s1, String s2);

    public native int resetCookies();

    public native String testWLServer(long l, String s, String s1);

    static 
    {
        System.loadLibrary("uvpn");
    }
}
