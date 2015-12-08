// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;


public final class VCardVersion extends Enum
{

    private static final VCardVersion $VALUES[];
    public static final VCardVersion V2_1;
    public static final VCardVersion V3_0;
    public static final VCardVersion V4_0;
    private final String version;
    private final String xmlNamespace;

    private VCardVersion(String s, int i, String s1, String s2)
    {
        super(s, i);
        version = s1;
        xmlNamespace = s2;
    }

    public static VCardVersion valueOf(String s)
    {
        return (VCardVersion)Enum.valueOf(ezvcard/VCardVersion, s);
    }

    public static VCardVersion valueOfByStr(String s)
    {
        VCardVersion avcardversion[] = values();
        int j = avcardversion.length;
        for (int i = 0; i < j; i++)
        {
            VCardVersion vcardversion = avcardversion[i];
            if (vcardversion.getVersion().equals(s))
            {
                return vcardversion;
            }
        }

        return null;
    }

    public static VCardVersion valueOfByXmlNamespace(String s)
    {
        VCardVersion avcardversion[] = values();
        int j = avcardversion.length;
        for (int i = 0; i < j; i++)
        {
            VCardVersion vcardversion = avcardversion[i];
            String s1 = vcardversion.getXmlNamespace();
            if (s1 != null && s1.equals(s))
            {
                return vcardversion;
            }
        }

        return null;
    }

    public static VCardVersion[] values()
    {
        return (VCardVersion[])$VALUES.clone();
    }

    public String getVersion()
    {
        return version;
    }

    public String getXmlNamespace()
    {
        return xmlNamespace;
    }

    public String toString()
    {
        return version;
    }

    static 
    {
        V2_1 = new VCardVersion("V2_1", 0, "2.1", null);
        V3_0 = new VCardVersion("V3_0", 1, "3.0", null);
        V4_0 = new VCardVersion("V4_0", 2, "4.0", "urn:ietf:params:xml:ns:vcard-4.0");
        $VALUES = (new VCardVersion[] {
            V2_1, V3_0, V4_0
        });
    }
}
