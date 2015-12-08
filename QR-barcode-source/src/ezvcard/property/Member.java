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
//            UriProperty, HasAltId, Kind

public class Member extends UriProperty
    implements HasAltId
{

    public Member(String s)
    {
        super(s);
    }

    public Set _supportedVersions()
    {
        return EnumSet.of(VCardVersion.V4_0);
    }

    protected void _validate(List list, VCardVersion vcardversion, VCard vcard)
    {
        super._validate(list, vcardversion, vcard);
        if (vcard.getKind() == null || !vcard.getKind().isGroup())
        {
            list.add((new StringBuilder()).append("The ").append(ezvcard/property/Kind.getSimpleName()).append(" property must be set to \"group\" if the vCard contains ").append(ezvcard/property/Member.getSimpleName()).append(" properties.").toString());
        }
    }

    public void addPid(int i, int j)
    {
        super.addPid(i, j);
    }

    public String getAltId()
    {
        return parameters.getAltId();
    }

    public String getMediaType()
    {
        return parameters.getMediaType();
    }

    public List getPids()
    {
        return super.getPids();
    }

    public Integer getPref()
    {
        return super.getPref();
    }

    public String getUri()
    {
        return (String)getValue();
    }

    public void removePids()
    {
        super.removePids();
    }

    public void setAltId(String s)
    {
        parameters.setAltId(s);
    }

    public void setMediaType(String s)
    {
        parameters.setMediaType(s);
    }

    public void setPref(Integer integer)
    {
        super.setPref(integer);
    }

    public void setUri(String s)
    {
        setValue(s);
    }

    public void setUriEmail(String s)
    {
        setUri((new StringBuilder()).append("mailto:").append(s).toString());
    }

    public void setUriIM(String s, String s1)
    {
        setUri((new StringBuilder()).append(s).append(":").append(s1).toString());
    }

    public void setUriTelephone(String s)
    {
        setUri((new StringBuilder()).append("tel:").append(s).toString());
    }
}
