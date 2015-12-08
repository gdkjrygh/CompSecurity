// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl.constants;


public final class DNSLabel extends Enum
{

    private static final DNSLabel $VALUES[];
    public static final DNSLabel Compressed;
    public static final DNSLabel Extended;
    public static final DNSLabel Standard;
    public static final DNSLabel Unknown;
    private final String _externalName;
    private final int _index;

    private DNSLabel(String s, int i, String s1, int j)
    {
        super(s, i);
        _externalName = s1;
        _index = j;
    }

    public static DNSLabel labelForByte(int i)
    {
        DNSLabel adnslabel[] = values();
        int k = adnslabel.length;
        for (int j = 0; j < k; j++)
        {
            DNSLabel dnslabel = adnslabel[j];
            if (dnslabel._index == (i & 0xc0))
            {
                return dnslabel;
            }
        }

        return Unknown;
    }

    public static int labelValue(int i)
    {
        return i & 0x3f;
    }

    public static DNSLabel valueOf(String s)
    {
        return (DNSLabel)Enum.valueOf(javax/jmdns/impl/constants/DNSLabel, s);
    }

    public static DNSLabel[] values()
    {
        return (DNSLabel[])$VALUES.clone();
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
        Unknown = new DNSLabel("Unknown", 0, "", 128);
        Standard = new DNSLabel("Standard", 1, "standard label", 0);
        Compressed = new DNSLabel("Compressed", 2, "compressed label", 192);
        Extended = new DNSLabel("Extended", 3, "extended label", 64);
        $VALUES = (new DNSLabel[] {
            Unknown, Standard, Compressed, Extended
        });
    }
}
