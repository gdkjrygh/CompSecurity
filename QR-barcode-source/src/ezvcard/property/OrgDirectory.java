// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import java.util.EnumSet;
import java.util.Set;

// Referenced classes of package ezvcard.property:
//            UriProperty, HasAltId

public class OrgDirectory extends UriProperty
    implements HasAltId
{

    public OrgDirectory(String s)
    {
        super(s);
    }

    public Set _supportedVersions()
    {
        return EnumSet.of(VCardVersion.V4_0);
    }

    public String getAltId()
    {
        return parameters.getAltId();
    }

    public Integer getIndex()
    {
        return super.getIndex();
    }

    public String getLanguage()
    {
        return super.getLanguage();
    }

    public Integer getPref()
    {
        return super.getPref();
    }

    public String getType()
    {
        return parameters.getType();
    }

    public void setAltId(String s)
    {
        parameters.setAltId(s);
    }

    public void setIndex(Integer integer)
    {
        super.setIndex(integer);
    }

    public void setLanguage(String s)
    {
        super.setLanguage(s);
    }

    public void setPref(Integer integer)
    {
        super.setPref(integer);
    }

    public void setType(String s)
    {
        parameters.setType(s);
    }
}
