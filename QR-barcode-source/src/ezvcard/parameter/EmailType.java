// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.parameter;

import ezvcard.VCardVersion;
import java.util.Collection;

// Referenced classes of package ezvcard.parameter:
//            VersionedVCardParameter, VCardParameterCaseClasses

public class EmailType extends VersionedVCardParameter
{

    public static final EmailType AOL;
    public static final EmailType APPLELINK;
    public static final EmailType ATTMAIL;
    public static final EmailType CIS;
    public static final EmailType EWORLD;
    public static final EmailType HOME;
    public static final EmailType IBMMAIL;
    public static final EmailType INTERNET;
    public static final EmailType MCIMAIL;
    public static final EmailType POWERSHARE;
    public static final EmailType PREF;
    public static final EmailType PRODIGY;
    public static final EmailType TLX;
    public static final EmailType WORK;
    public static final EmailType X400;
    private static final VCardParameterCaseClasses enums = new VCardParameterCaseClasses(ezvcard/parameter/EmailType);

    private transient EmailType(String s, VCardVersion avcardversion[])
    {
        super(s, avcardversion);
    }

    public static Collection all()
    {
        return enums.all();
    }

    public static EmailType find(String s)
    {
        return (EmailType)enums.find(s);
    }

    public static EmailType get(String s)
    {
        return (EmailType)enums.get(s);
    }

    static 
    {
        INTERNET = new EmailType("internet", new VCardVersion[] {
            VCardVersion.V2_1, VCardVersion.V3_0
        });
        X400 = new EmailType("x400", new VCardVersion[] {
            VCardVersion.V2_1, VCardVersion.V3_0
        });
        PREF = new EmailType("pref", new VCardVersion[] {
            VCardVersion.V2_1, VCardVersion.V3_0
        });
        AOL = new EmailType("aol", new VCardVersion[] {
            VCardVersion.V2_1
        });
        APPLELINK = new EmailType("applelink", new VCardVersion[] {
            VCardVersion.V2_1
        });
        ATTMAIL = new EmailType("attmail", new VCardVersion[] {
            VCardVersion.V2_1
        });
        CIS = new EmailType("cis", new VCardVersion[] {
            VCardVersion.V2_1
        });
        EWORLD = new EmailType("eworld", new VCardVersion[] {
            VCardVersion.V2_1
        });
        IBMMAIL = new EmailType("ibmmail", new VCardVersion[] {
            VCardVersion.V2_1
        });
        MCIMAIL = new EmailType("mcimail", new VCardVersion[] {
            VCardVersion.V2_1
        });
        POWERSHARE = new EmailType("powershare", new VCardVersion[] {
            VCardVersion.V2_1
        });
        PRODIGY = new EmailType("prodigy", new VCardVersion[] {
            VCardVersion.V2_1
        });
        TLX = new EmailType("tlx", new VCardVersion[] {
            VCardVersion.V2_1
        });
        HOME = new EmailType("home", new VCardVersion[] {
            VCardVersion.V4_0
        });
        WORK = new EmailType("work", new VCardVersion[] {
            VCardVersion.V4_0
        });
    }
}
