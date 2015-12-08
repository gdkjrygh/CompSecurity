// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl.constants;

import java.util.logging.Logger;

public final class DNSRecordType extends Enum
{

    private static final DNSRecordType $VALUES[];
    public static final DNSRecordType TYPE_A;
    public static final DNSRecordType TYPE_A6;
    public static final DNSRecordType TYPE_AAAA;
    public static final DNSRecordType TYPE_AFSDB;
    public static final DNSRecordType TYPE_ANY;
    public static final DNSRecordType TYPE_APL;
    public static final DNSRecordType TYPE_ATMA;
    public static final DNSRecordType TYPE_AXFR;
    public static final DNSRecordType TYPE_CERT;
    public static final DNSRecordType TYPE_CNAME;
    public static final DNSRecordType TYPE_DNAME;
    public static final DNSRecordType TYPE_DNSKEY;
    public static final DNSRecordType TYPE_DS;
    public static final DNSRecordType TYPE_EID;
    public static final DNSRecordType TYPE_GID;
    public static final DNSRecordType TYPE_GPOS;
    public static final DNSRecordType TYPE_HINFO;
    public static final DNSRecordType TYPE_IGNORE;
    public static final DNSRecordType TYPE_ISDN;
    public static final DNSRecordType TYPE_IXFR;
    public static final DNSRecordType TYPE_KEY;
    public static final DNSRecordType TYPE_KX;
    public static final DNSRecordType TYPE_LOC;
    public static final DNSRecordType TYPE_MAILA;
    public static final DNSRecordType TYPE_MAILB;
    public static final DNSRecordType TYPE_MB;
    public static final DNSRecordType TYPE_MD;
    public static final DNSRecordType TYPE_MF;
    public static final DNSRecordType TYPE_MG;
    public static final DNSRecordType TYPE_MINFO;
    public static final DNSRecordType TYPE_MR;
    public static final DNSRecordType TYPE_MX;
    public static final DNSRecordType TYPE_NAPTR;
    public static final DNSRecordType TYPE_NIMLOC;
    public static final DNSRecordType TYPE_NS;
    public static final DNSRecordType TYPE_NSAP;
    public static final DNSRecordType TYPE_NSAP_PTR;
    public static final DNSRecordType TYPE_NSEC;
    public static final DNSRecordType TYPE_NULL;
    public static final DNSRecordType TYPE_NXT;
    public static final DNSRecordType TYPE_OPT;
    public static final DNSRecordType TYPE_PTR;
    public static final DNSRecordType TYPE_PX;
    public static final DNSRecordType TYPE_RP;
    public static final DNSRecordType TYPE_RRSIG;
    public static final DNSRecordType TYPE_RT;
    public static final DNSRecordType TYPE_SIG;
    public static final DNSRecordType TYPE_SINK;
    public static final DNSRecordType TYPE_SOA;
    public static final DNSRecordType TYPE_SRV;
    public static final DNSRecordType TYPE_SSHFP;
    public static final DNSRecordType TYPE_TKEY;
    public static final DNSRecordType TYPE_TSIG;
    public static final DNSRecordType TYPE_TXT;
    public static final DNSRecordType TYPE_UID;
    public static final DNSRecordType TYPE_UINFO;
    public static final DNSRecordType TYPE_UNSPEC;
    public static final DNSRecordType TYPE_WKS;
    public static final DNSRecordType TYPE_X25;
    private static Logger logger = Logger.getLogger(javax/jmdns/impl/constants/DNSRecordType.getName());
    private final String _externalName;
    private final int _index;

    private DNSRecordType(String s, int i, String s1, int j)
    {
        super(s, i);
        _externalName = s1;
        _index = j;
    }

    public static DNSRecordType typeForIndex(int i)
    {
        DNSRecordType adnsrecordtype[] = values();
        int k = adnsrecordtype.length;
        for (int j = 0; j < k; j++)
        {
            DNSRecordType dnsrecordtype = adnsrecordtype[j];
            if (dnsrecordtype._index == i)
            {
                return dnsrecordtype;
            }
        }

        logger.severe((new StringBuilder()).append("Could not find record type for index: ").append(i).toString());
        return TYPE_IGNORE;
    }

    public static DNSRecordType valueOf(String s)
    {
        return (DNSRecordType)Enum.valueOf(javax/jmdns/impl/constants/DNSRecordType, s);
    }

    public static DNSRecordType[] values()
    {
        return (DNSRecordType[])$VALUES.clone();
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
        TYPE_IGNORE = new DNSRecordType("TYPE_IGNORE", 0, "ignore", 0);
        TYPE_A = new DNSRecordType("TYPE_A", 1, "a", 1);
        TYPE_NS = new DNSRecordType("TYPE_NS", 2, "ns", 2);
        TYPE_MD = new DNSRecordType("TYPE_MD", 3, "md", 3);
        TYPE_MF = new DNSRecordType("TYPE_MF", 4, "mf", 4);
        TYPE_CNAME = new DNSRecordType("TYPE_CNAME", 5, "cname", 5);
        TYPE_SOA = new DNSRecordType("TYPE_SOA", 6, "soa", 6);
        TYPE_MB = new DNSRecordType("TYPE_MB", 7, "mb", 7);
        TYPE_MG = new DNSRecordType("TYPE_MG", 8, "mg", 8);
        TYPE_MR = new DNSRecordType("TYPE_MR", 9, "mr", 9);
        TYPE_NULL = new DNSRecordType("TYPE_NULL", 10, "null", 10);
        TYPE_WKS = new DNSRecordType("TYPE_WKS", 11, "wks", 11);
        TYPE_PTR = new DNSRecordType("TYPE_PTR", 12, "ptr", 12);
        TYPE_HINFO = new DNSRecordType("TYPE_HINFO", 13, "hinfo", 13);
        TYPE_MINFO = new DNSRecordType("TYPE_MINFO", 14, "minfo", 14);
        TYPE_MX = new DNSRecordType("TYPE_MX", 15, "mx", 15);
        TYPE_TXT = new DNSRecordType("TYPE_TXT", 16, "txt", 16);
        TYPE_RP = new DNSRecordType("TYPE_RP", 17, "rp", 17);
        TYPE_AFSDB = new DNSRecordType("TYPE_AFSDB", 18, "afsdb", 18);
        TYPE_X25 = new DNSRecordType("TYPE_X25", 19, "x25", 19);
        TYPE_ISDN = new DNSRecordType("TYPE_ISDN", 20, "isdn", 20);
        TYPE_RT = new DNSRecordType("TYPE_RT", 21, "rt", 21);
        TYPE_NSAP = new DNSRecordType("TYPE_NSAP", 22, "nsap", 22);
        TYPE_NSAP_PTR = new DNSRecordType("TYPE_NSAP_PTR", 23, "nsap-otr", 23);
        TYPE_SIG = new DNSRecordType("TYPE_SIG", 24, "sig", 24);
        TYPE_KEY = new DNSRecordType("TYPE_KEY", 25, "key", 25);
        TYPE_PX = new DNSRecordType("TYPE_PX", 26, "px", 26);
        TYPE_GPOS = new DNSRecordType("TYPE_GPOS", 27, "gpos", 27);
        TYPE_AAAA = new DNSRecordType("TYPE_AAAA", 28, "aaaa", 28);
        TYPE_LOC = new DNSRecordType("TYPE_LOC", 29, "loc", 29);
        TYPE_NXT = new DNSRecordType("TYPE_NXT", 30, "nxt", 30);
        TYPE_EID = new DNSRecordType("TYPE_EID", 31, "eid", 31);
        TYPE_NIMLOC = new DNSRecordType("TYPE_NIMLOC", 32, "nimloc", 32);
        TYPE_SRV = new DNSRecordType("TYPE_SRV", 33, "srv", 33);
        TYPE_ATMA = new DNSRecordType("TYPE_ATMA", 34, "atma", 34);
        TYPE_NAPTR = new DNSRecordType("TYPE_NAPTR", 35, "naptr", 35);
        TYPE_KX = new DNSRecordType("TYPE_KX", 36, "kx", 36);
        TYPE_CERT = new DNSRecordType("TYPE_CERT", 37, "cert", 37);
        TYPE_A6 = new DNSRecordType("TYPE_A6", 38, "a6", 38);
        TYPE_DNAME = new DNSRecordType("TYPE_DNAME", 39, "dname", 39);
        TYPE_SINK = new DNSRecordType("TYPE_SINK", 40, "sink", 40);
        TYPE_OPT = new DNSRecordType("TYPE_OPT", 41, "opt", 41);
        TYPE_APL = new DNSRecordType("TYPE_APL", 42, "apl", 42);
        TYPE_DS = new DNSRecordType("TYPE_DS", 43, "ds", 43);
        TYPE_SSHFP = new DNSRecordType("TYPE_SSHFP", 44, "sshfp", 44);
        TYPE_RRSIG = new DNSRecordType("TYPE_RRSIG", 45, "rrsig", 46);
        TYPE_NSEC = new DNSRecordType("TYPE_NSEC", 46, "nsec", 47);
        TYPE_DNSKEY = new DNSRecordType("TYPE_DNSKEY", 47, "dnskey", 48);
        TYPE_UINFO = new DNSRecordType("TYPE_UINFO", 48, "uinfo", 100);
        TYPE_UID = new DNSRecordType("TYPE_UID", 49, "uid", 101);
        TYPE_GID = new DNSRecordType("TYPE_GID", 50, "gid", 102);
        TYPE_UNSPEC = new DNSRecordType("TYPE_UNSPEC", 51, "unspec", 103);
        TYPE_TKEY = new DNSRecordType("TYPE_TKEY", 52, "tkey", 249);
        TYPE_TSIG = new DNSRecordType("TYPE_TSIG", 53, "tsig", 250);
        TYPE_IXFR = new DNSRecordType("TYPE_IXFR", 54, "ixfr", 251);
        TYPE_AXFR = new DNSRecordType("TYPE_AXFR", 55, "axfr", 252);
        TYPE_MAILA = new DNSRecordType("TYPE_MAILA", 56, "mails", 253);
        TYPE_MAILB = new DNSRecordType("TYPE_MAILB", 57, "mailb", 254);
        TYPE_ANY = new DNSRecordType("TYPE_ANY", 58, "any", 255);
        $VALUES = (new DNSRecordType[] {
            TYPE_IGNORE, TYPE_A, TYPE_NS, TYPE_MD, TYPE_MF, TYPE_CNAME, TYPE_SOA, TYPE_MB, TYPE_MG, TYPE_MR, 
            TYPE_NULL, TYPE_WKS, TYPE_PTR, TYPE_HINFO, TYPE_MINFO, TYPE_MX, TYPE_TXT, TYPE_RP, TYPE_AFSDB, TYPE_X25, 
            TYPE_ISDN, TYPE_RT, TYPE_NSAP, TYPE_NSAP_PTR, TYPE_SIG, TYPE_KEY, TYPE_PX, TYPE_GPOS, TYPE_AAAA, TYPE_LOC, 
            TYPE_NXT, TYPE_EID, TYPE_NIMLOC, TYPE_SRV, TYPE_ATMA, TYPE_NAPTR, TYPE_KX, TYPE_CERT, TYPE_A6, TYPE_DNAME, 
            TYPE_SINK, TYPE_OPT, TYPE_APL, TYPE_DS, TYPE_SSHFP, TYPE_RRSIG, TYPE_NSEC, TYPE_DNSKEY, TYPE_UINFO, TYPE_UID, 
            TYPE_GID, TYPE_UNSPEC, TYPE_TKEY, TYPE_TSIG, TYPE_IXFR, TYPE_AXFR, TYPE_MAILA, TYPE_MAILB, TYPE_ANY
        });
    }
}
