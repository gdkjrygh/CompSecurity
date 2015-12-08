// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.parameter;

import ezvcard.VCardVersion;
import java.util.Collection;

// Referenced classes of package ezvcard.parameter:
//            VersionedVCardParameter, VCardParameterCaseClasses

public class AddressType extends VersionedVCardParameter
{

    public static final AddressType DOM;
    public static final AddressType HOME = new AddressType("home", new VCardVersion[0]);
    public static final AddressType INTL;
    public static final AddressType PARCEL;
    public static final AddressType POSTAL;
    public static final AddressType PREF;
    public static final AddressType WORK = new AddressType("work", new VCardVersion[0]);
    private static final VCardParameterCaseClasses enums = new VCardParameterCaseClasses(ezvcard/parameter/AddressType);

    private transient AddressType(String s, VCardVersion avcardversion[])
    {
        super(s, avcardversion);
    }

    public static Collection all()
    {
        return enums.all();
    }

    public static AddressType find(String s)
    {
        return (AddressType)enums.find(s);
    }

    public static AddressType get(String s)
    {
        return (AddressType)enums.get(s);
    }

    static 
    {
        DOM = new AddressType("dom", new VCardVersion[] {
            VCardVersion.V2_1, VCardVersion.V3_0
        });
        INTL = new AddressType("intl", new VCardVersion[] {
            VCardVersion.V2_1, VCardVersion.V3_0
        });
        POSTAL = new AddressType("postal", new VCardVersion[] {
            VCardVersion.V2_1, VCardVersion.V3_0
        });
        PARCEL = new AddressType("parcel", new VCardVersion[] {
            VCardVersion.V2_1, VCardVersion.V3_0
        });
        PREF = new AddressType("pref", new VCardVersion[] {
            VCardVersion.V2_1, VCardVersion.V3_0
        });
    }
}
