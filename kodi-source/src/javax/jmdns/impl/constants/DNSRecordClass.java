// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl.constants;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class DNSRecordClass extends Enum
{

    private static final DNSRecordClass $VALUES[];
    public static final DNSRecordClass CLASS_ANY;
    public static final DNSRecordClass CLASS_CH;
    public static final DNSRecordClass CLASS_CS;
    public static final DNSRecordClass CLASS_HS;
    public static final DNSRecordClass CLASS_IN;
    public static final DNSRecordClass CLASS_NONE;
    public static final DNSRecordClass CLASS_UNKNOWN;
    private static Logger logger = Logger.getLogger(javax/jmdns/impl/constants/DNSRecordClass.getName());
    private final String _externalName;
    private final int _index;

    private DNSRecordClass(String s, int i, String s1, int j)
    {
        super(s, i);
        _externalName = s1;
        _index = j;
    }

    public static DNSRecordClass classForIndex(int i)
    {
        DNSRecordClass adnsrecordclass[] = values();
        int k = adnsrecordclass.length;
        for (int j = 0; j < k; j++)
        {
            DNSRecordClass dnsrecordclass = adnsrecordclass[j];
            if (dnsrecordclass._index == (i & 0x7fff))
            {
                return dnsrecordclass;
            }
        }

        logger.log(Level.WARNING, (new StringBuilder()).append("Could not find record class for index: ").append(i).toString());
        return CLASS_UNKNOWN;
    }

    public static DNSRecordClass valueOf(String s)
    {
        return (DNSRecordClass)Enum.valueOf(javax/jmdns/impl/constants/DNSRecordClass, s);
    }

    public static DNSRecordClass[] values()
    {
        return (DNSRecordClass[])$VALUES.clone();
    }

    public int indexValue()
    {
        return _index;
    }

    public boolean isUnique(int i)
    {
        return this != CLASS_UNKNOWN && (0x8000 & i) != 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append(name()).append(" index ").append(indexValue()).toString();
    }

    static 
    {
        CLASS_UNKNOWN = new DNSRecordClass("CLASS_UNKNOWN", 0, "?", 0);
        CLASS_IN = new DNSRecordClass("CLASS_IN", 1, "in", 1);
        CLASS_CS = new DNSRecordClass("CLASS_CS", 2, "cs", 2);
        CLASS_CH = new DNSRecordClass("CLASS_CH", 3, "ch", 3);
        CLASS_HS = new DNSRecordClass("CLASS_HS", 4, "hs", 4);
        CLASS_NONE = new DNSRecordClass("CLASS_NONE", 5, "none", 254);
        CLASS_ANY = new DNSRecordClass("CLASS_ANY", 6, "any", 255);
        $VALUES = (new DNSRecordClass[] {
            CLASS_UNKNOWN, CLASS_IN, CLASS_CS, CLASS_CH, CLASS_HS, CLASS_NONE, CLASS_ANY
        });
    }
}
