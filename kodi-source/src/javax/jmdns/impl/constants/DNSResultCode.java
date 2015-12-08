// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl.constants;


public final class DNSResultCode extends Enum
{

    private static final DNSResultCode $VALUES[];
    public static final DNSResultCode FormErr;
    public static final DNSResultCode NXDomain;
    public static final DNSResultCode NXRRSet;
    public static final DNSResultCode NoError;
    public static final DNSResultCode NotAuth;
    public static final DNSResultCode NotImp;
    public static final DNSResultCode NotZone;
    public static final DNSResultCode Refused;
    public static final DNSResultCode ServFail;
    public static final DNSResultCode Unknown;
    public static final DNSResultCode YXDomain;
    public static final DNSResultCode YXRRSet;
    private final String _externalName;
    private final int _index;

    private DNSResultCode(String s, int i, String s1, int j)
    {
        super(s, i);
        _externalName = s1;
        _index = j;
    }

    public static DNSResultCode resultCodeForFlags(int i, int j)
    {
        DNSResultCode adnsresultcode[] = values();
        int l = adnsresultcode.length;
        for (int k = 0; k < l; k++)
        {
            DNSResultCode dnsresultcode = adnsresultcode[k];
            if (dnsresultcode._index == (j >> 28 & 0xff | i & 0xf))
            {
                return dnsresultcode;
            }
        }

        return Unknown;
    }

    public static DNSResultCode valueOf(String s)
    {
        return (DNSResultCode)Enum.valueOf(javax/jmdns/impl/constants/DNSResultCode, s);
    }

    public static DNSResultCode[] values()
    {
        return (DNSResultCode[])$VALUES.clone();
    }

    public int indexValue()
    {
        return _index;
    }

    public String toString()
    {
        return (new StringBuilder()).append(name()).append(" index ").append(indexValue()).toString();
    }

    static 
    {
        Unknown = new DNSResultCode("Unknown", 0, "Unknown", 65535);
        NoError = new DNSResultCode("NoError", 1, "No Error", 0);
        FormErr = new DNSResultCode("FormErr", 2, "Format Error", 1);
        ServFail = new DNSResultCode("ServFail", 3, "Server Failure", 2);
        NXDomain = new DNSResultCode("NXDomain", 4, "Non-Existent Domain", 3);
        NotImp = new DNSResultCode("NotImp", 5, "Not Implemented", 4);
        Refused = new DNSResultCode("Refused", 6, "Query Refused", 5);
        YXDomain = new DNSResultCode("YXDomain", 7, "Name Exists when it should not", 6);
        YXRRSet = new DNSResultCode("YXRRSet", 8, "RR Set Exists when it should not", 7);
        NXRRSet = new DNSResultCode("NXRRSet", 9, "RR Set that should exist does not", 8);
        NotAuth = new DNSResultCode("NotAuth", 10, "Server Not Authoritative for zone", 9);
        NotZone = new DNSResultCode("NotZone", 11, "NotZone Name not contained in zone", 10);
        $VALUES = (new DNSResultCode[] {
            Unknown, NoError, FormErr, ServFail, NXDomain, NotImp, Refused, YXDomain, YXRRSet, NXRRSet, 
            NotAuth, NotZone
        });
    }
}
