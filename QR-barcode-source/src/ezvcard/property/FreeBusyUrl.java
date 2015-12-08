// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package ezvcard.property:
//            UriProperty, HasAltId

public class FreeBusyUrl extends UriProperty
    implements HasAltId
{

    public FreeBusyUrl(String s)
    {
        super(s);
    }

    public Set _supportedVersions()
    {
        return EnumSet.of(VCardVersion.V4_0);
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

    public String getType()
    {
        return parameters.getType();
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

    public void setType(String s)
    {
        parameters.setType(s);
    }
}
