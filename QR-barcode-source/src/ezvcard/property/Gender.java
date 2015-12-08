// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package ezvcard.property:
//            VCardProperty

public class Gender extends VCardProperty
{

    public static final String FEMALE = "F";
    public static final String MALE = "M";
    public static final String NONE = "N";
    public static final String OTHER = "O";
    public static final String UNKNOWN = "U";
    private String gender;
    private String text;

    public Gender(String s)
    {
        gender = s;
    }

    public static Gender female()
    {
        return new Gender("F");
    }

    public static Gender male()
    {
        return new Gender("M");
    }

    public static Gender none()
    {
        return new Gender("N");
    }

    public static Gender other()
    {
        return new Gender("O");
    }

    public static Gender unknown()
    {
        return new Gender("U");
    }

    public Set _supportedVersions()
    {
        return EnumSet.of(VCardVersion.V4_0);
    }

    protected void _validate(List list, VCardVersion vcardversion, VCard vcard)
    {
        if (gender == null)
        {
            list.add("Property value is null.");
        }
    }

    public String getGender()
    {
        return gender;
    }

    public String getText()
    {
        return text;
    }

    public boolean isFemale()
    {
        return "F".equals(gender);
    }

    public boolean isMale()
    {
        return "M".equals(gender);
    }

    public boolean isNone()
    {
        return "N".equals(gender);
    }

    public boolean isOther()
    {
        return "O".equals(gender);
    }

    public boolean isUnknown()
    {
        return "U".equals(gender);
    }

    public void setGender(String s)
    {
        gender = s;
    }

    public void setText(String s)
    {
        text = s;
    }
}
