// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;


public final class p extends Enum
{

    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final p h;
    public static final p i;
    public static final p j;
    public static final p k;
    private static final p n[];
    private final String l;
    private final String m;

    private p(String s, int i1, String s1, String s2)
    {
        super(s, i1);
        l = s1;
        m = s2;
    }

    public static p valueOf(String s)
    {
        return (p)Enum.valueOf(com/threatmetrix/TrustDefenderMobile/p, s);
    }

    public static p[] values()
    {
        return (p[])n.clone();
    }

    public final String a()
    {
        return m;
    }

    public final String toString()
    {
        return l;
    }

    static 
    {
        a = new p("THM_NotYet", 0, "Not Yet", "Profile request has successfully started but is not completed");
        b = new p("THM_OK", 1, "Okay", "Completed, No errors");
        c = new p("THM_Connection_Error", 2, "Connection Error", "There has been a connection issue, profiling aborted");
        d = new p("THM_HostNotFound_Error", 3, "Host Not Found", "Unable to resolve the host name");
        e = new p("THM_NetworkTimeout_Error", 4, "Network Timeout", "Communications layer timed out");
        f = new p("THM_Internal_Error", 5, "Internal Error", "Internal Error, profiling incomplete or interrupted");
        g = new p("THM_HostVerification_Error", 6, "Host Verification Error", "Certificate verification failure! Potential MITM attack");
        h = new p("THM_Interrupted_Error", 7, "Interrupted", "Request was cancelled");
        i = new p("THM_InvalidOrgID", 8, "Invalid ORG ID", "Request contained an invalid org id");
        j = new p("THM_ConfigurationError", 9, "Configuration Error", "Failed to retrieve configuration from server");
        k = new p("THM_PartialProfile", 10, "Partial Profile", "Connection error, only partial profile completed");
        n = (new p[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
