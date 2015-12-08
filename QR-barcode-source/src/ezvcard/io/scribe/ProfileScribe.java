// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.property.Profile;
import ezvcard.property.VCardProperty;

// Referenced classes of package ezvcard.io.scribe:
//            StringPropertyScribe

public class ProfileScribe extends StringPropertyScribe
{

    public ProfileScribe()
    {
        super(ezvcard/property/Profile, "PROFILE");
    }

    protected Profile _parseValue(String s)
    {
        Profile profile = new Profile();
        profile.setValue(s);
        return profile;
    }

    protected volatile VCardProperty _parseValue(String s)
    {
        return _parseValue(s);
    }
}
