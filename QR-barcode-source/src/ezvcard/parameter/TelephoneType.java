// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.parameter;

import ezvcard.VCardVersion;
import java.util.Collection;

// Referenced classes of package ezvcard.parameter:
//            VersionedVCardParameter, VCardParameterCaseClasses

public class TelephoneType extends VersionedVCardParameter
{

    public static final TelephoneType BBS;
    public static final TelephoneType CAR;
    public static final TelephoneType CELL = new TelephoneType("cell", new VCardVersion[0]);
    public static final TelephoneType FAX = new TelephoneType("fax", new VCardVersion[0]);
    public static final TelephoneType HOME = new TelephoneType("home", new VCardVersion[0]);
    public static final TelephoneType ISDN;
    public static final TelephoneType MODEM;
    public static final TelephoneType MSG;
    public static final TelephoneType PAGER = new TelephoneType("pager", new VCardVersion[0]);
    public static final TelephoneType PCS;
    public static final TelephoneType PREF;
    public static final TelephoneType TEXT;
    public static final TelephoneType TEXTPHONE;
    public static final TelephoneType VIDEO = new TelephoneType("video", new VCardVersion[0]);
    public static final TelephoneType VOICE = new TelephoneType("voice", new VCardVersion[0]);
    public static final TelephoneType WORK = new TelephoneType("work", new VCardVersion[0]);
    private static final VCardParameterCaseClasses enums = new VCardParameterCaseClasses(ezvcard/parameter/TelephoneType);

    private transient TelephoneType(String s, VCardVersion avcardversion[])
    {
        super(s, avcardversion);
    }

    public static Collection all()
    {
        return enums.all();
    }

    public static TelephoneType find(String s)
    {
        return (TelephoneType)enums.find(s);
    }

    public static TelephoneType get(String s)
    {
        return (TelephoneType)enums.get(s);
    }

    static 
    {
        BBS = new TelephoneType("bbs", new VCardVersion[] {
            VCardVersion.V2_1, VCardVersion.V3_0
        });
        CAR = new TelephoneType("car", new VCardVersion[] {
            VCardVersion.V2_1, VCardVersion.V3_0
        });
        ISDN = new TelephoneType("isdn", new VCardVersion[] {
            VCardVersion.V2_1, VCardVersion.V3_0
        });
        MODEM = new TelephoneType("modem", new VCardVersion[] {
            VCardVersion.V2_1, VCardVersion.V3_0
        });
        MSG = new TelephoneType("msg", new VCardVersion[] {
            VCardVersion.V2_1, VCardVersion.V3_0
        });
        PCS = new TelephoneType("pcs", new VCardVersion[] {
            VCardVersion.V3_0
        });
        PREF = new TelephoneType("pref", new VCardVersion[] {
            VCardVersion.V2_1, VCardVersion.V3_0
        });
        TEXT = new TelephoneType("text", new VCardVersion[] {
            VCardVersion.V4_0
        });
        TEXTPHONE = new TelephoneType("textphone", new VCardVersion[] {
            VCardVersion.V4_0
        });
    }
}
