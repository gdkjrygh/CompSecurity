// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl.constants;


public final class DNSOptionCode extends Enum
{

    private static final DNSOptionCode $VALUES[];
    public static final DNSOptionCode LLQ;
    public static final DNSOptionCode NSID;
    public static final DNSOptionCode Owner;
    public static final DNSOptionCode UL;
    public static final DNSOptionCode Unknown;
    private final String _externalName;
    private final int _index;

    private DNSOptionCode(String s, int i, String s1, int j)
    {
        super(s, i);
        _externalName = s1;
        _index = j;
    }

    public static DNSOptionCode resultCodeForFlags(int i)
    {
        DNSOptionCode adnsoptioncode[] = values();
        int k = adnsoptioncode.length;
        for (int j = 0; j < k; j++)
        {
            DNSOptionCode dnsoptioncode = adnsoptioncode[j];
            if (dnsoptioncode._index == i)
            {
                return dnsoptioncode;
            }
        }

        return Unknown;
    }

    public static DNSOptionCode valueOf(String s)
    {
        return (DNSOptionCode)Enum.valueOf(javax/jmdns/impl/constants/DNSOptionCode, s);
    }

    public static DNSOptionCode[] values()
    {
        return (DNSOptionCode[])$VALUES.clone();
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
        Unknown = new DNSOptionCode("Unknown", 0, "Unknown", 65535);
        LLQ = new DNSOptionCode("LLQ", 1, "LLQ", 1);
        UL = new DNSOptionCode("UL", 2, "UL", 2);
        NSID = new DNSOptionCode("NSID", 3, "NSID", 3);
        Owner = new DNSOptionCode("Owner", 4, "Owner", 4);
        $VALUES = (new DNSOptionCode[] {
            Unknown, LLQ, UL, NSID, Owner
        });
    }
}
