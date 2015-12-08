// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;


// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            THMStatusCode

public class ProfilingResult
{

    private String a;
    private THMStatusCode b;

    ProfilingResult(String s, THMStatusCode thmstatuscode)
    {
        a = s;
        b = thmstatuscode;
    }

    public String a()
    {
        return a;
    }

    public THMStatusCode b()
    {
        return b;
    }
}
