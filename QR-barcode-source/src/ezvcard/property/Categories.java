// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.parameter.VCardParameters;
import java.util.List;

// Referenced classes of package ezvcard.property:
//            TextListProperty, HasAltId

public class Categories extends TextListProperty
    implements HasAltId
{

    public Categories()
    {
    }

    public void addPid(int i, int j)
    {
        super.addPid(i, j);
    }

    public String getAltId()
    {
        return parameters.getAltId();
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

    public void setPref(Integer integer)
    {
        super.setPref(integer);
    }

    public void setType(String s)
    {
        parameters.setType(s);
    }
}
