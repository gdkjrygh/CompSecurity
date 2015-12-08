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
//            TextProperty

public class Profile extends TextProperty
{

    public Profile()
    {
        super("VCARD");
    }

    public Set _supportedVersions()
    {
        return EnumSet.of(VCardVersion.V3_0);
    }

    protected void _validate(List list, VCardVersion vcardversion, VCard vcard)
    {
        if (!"VCARD".equalsIgnoreCase((String)value))
        {
            list.add((new StringBuilder()).append("The only valid value for this property is \"VCARD\", but it is \"").append((String)value).append("\".").toString());
        }
    }
}
