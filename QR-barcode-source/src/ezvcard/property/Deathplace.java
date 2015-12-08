// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package ezvcard.property:
//            VCardProperty, HasAltId

public class Deathplace extends VCardProperty
    implements HasAltId
{

    private String text;
    private String uri;

    public Deathplace()
    {
    }

    public Set _supportedVersions()
    {
        return EnumSet.of(VCardVersion.V4_0);
    }

    protected void _validate(List list, VCardVersion vcardversion, VCard vcard)
    {
        if (text == null && uri == null)
        {
            list.add("Property has neither a URI nor a text value associated with it.");
        }
    }

    public String getAltId()
    {
        return parameters.getAltId();
    }

    public String getLanguage()
    {
        return super.getLanguage();
    }

    public String getText()
    {
        return text;
    }

    public String getUri()
    {
        return uri;
    }

    public void setAltId(String s)
    {
        parameters.setAltId(s);
    }

    public void setLanguage(String s)
    {
        super.setLanguage(s);
    }

    public void setText(String s)
    {
        text = s;
        uri = null;
    }

    public void setUri(String s)
    {
        uri = s;
        text = null;
    }
}
