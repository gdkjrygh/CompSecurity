// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.parameter;

import ezvcard.VCardVersion;
import java.util.Collection;

// Referenced classes of package ezvcard.parameter:
//            VersionedVCardParameter, VCardParameterCaseClasses

public class Encoding extends VersionedVCardParameter
{

    public static final Encoding B;
    public static final Encoding BASE64;
    public static final Encoding QUOTED_PRINTABLE;
    public static final Encoding _7BIT;
    public static final Encoding _8BIT;
    private static final VCardParameterCaseClasses enums = new VCardParameterCaseClasses(ezvcard/parameter/Encoding);

    private transient Encoding(String s, VCardVersion avcardversion[])
    {
        super(s, avcardversion);
    }

    public static Collection all()
    {
        return enums.all();
    }

    public static Encoding find(String s)
    {
        return (Encoding)enums.find(s);
    }

    public static Encoding get(String s)
    {
        return (Encoding)enums.get(s);
    }

    static 
    {
        QUOTED_PRINTABLE = new Encoding("quoted-printable", new VCardVersion[] {
            VCardVersion.V2_1
        });
        BASE64 = new Encoding("base64", new VCardVersion[] {
            VCardVersion.V2_1
        });
        _8BIT = new Encoding("8bit", new VCardVersion[] {
            VCardVersion.V2_1
        });
        _7BIT = new Encoding("7bit", new VCardVersion[] {
            VCardVersion.V2_1
        });
        B = new Encoding("b", new VCardVersion[] {
            VCardVersion.V3_0
        });
    }
}
