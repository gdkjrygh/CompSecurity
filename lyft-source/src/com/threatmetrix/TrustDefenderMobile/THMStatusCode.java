// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;


public final class THMStatusCode extends Enum
{

    public static final THMStatusCode a;
    public static final THMStatusCode b;
    public static final THMStatusCode c;
    public static final THMStatusCode d;
    public static final THMStatusCode e;
    public static final THMStatusCode f;
    public static final THMStatusCode g;
    public static final THMStatusCode h;
    public static final THMStatusCode i;
    public static final THMStatusCode j;
    public static final THMStatusCode k;
    private static final THMStatusCode l[];
    private final String desc;
    private final String label;

    private THMStatusCode(String s, int i1, String s1, String s2)
    {
        super(s, i1);
        label = s1;
        desc = s2;
    }

    public static THMStatusCode valueOf(String s)
    {
        return (THMStatusCode)Enum.valueOf(com/threatmetrix/TrustDefenderMobile/THMStatusCode, s);
    }

    public static THMStatusCode[] values()
    {
        return (THMStatusCode[])l.clone();
    }

    public String a()
    {
        return desc;
    }

    public String toString()
    {
        return label;
    }

    static 
    {
        a = new THMStatusCode("THM_NotYet", 0, "Not Yet", "Profile request has successfully started but is not completed");
        b = new THMStatusCode("THM_OK", 1, "Okay", "Completed, No errors");
        c = new THMStatusCode("THM_Connection_Error", 2, "Connection Error", "There has been a connection issue, profiling aborted");
        d = new THMStatusCode("THM_HostNotFound_Error", 3, "Host Not Found", "Unable to resolve the host name");
        e = new THMStatusCode("THM_NetworkTimeout_Error", 4, "Network Timeout", "Communications layer timed out");
        f = new THMStatusCode("THM_Internal_Error", 5, "Internal Error", "Internal Error, profiling incomplete or interrupted");
        g = new THMStatusCode("THM_HostVerification_Error", 6, "Host Verification Error", "Certificate verification failure! Potential MITM attack");
        h = new THMStatusCode("THM_Interrupted_Error", 7, "Interrupted", "Request was cancelled");
        i = new THMStatusCode("THM_InvalidOrgID", 8, "Invalid ORG ID", "Request contained an invalid org id");
        j = new THMStatusCode("THM_ConfigurationError", 9, "Configuration Error", "Failed to retrieve configuration from server");
        k = new THMStatusCode("THM_PartialProfile", 10, "Partial Profile", "Connection error, only partial profile completed");
        l = (new THMStatusCode[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
