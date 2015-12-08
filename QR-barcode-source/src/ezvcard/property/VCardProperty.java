// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public abstract class VCardProperty
    implements Comparable
{

    protected String group;
    protected VCardParameters parameters;

    public VCardProperty()
    {
        parameters = new VCardParameters();
    }

    protected Set _supportedVersions()
    {
        return EnumSet.copyOf(Arrays.asList(VCardVersion.values()));
    }

    protected void _validate(List list, VCardVersion vcardversion, VCard vcard)
    {
    }

    public void addParameter(String s, String s1)
    {
        parameters.put(s, s1);
    }

    void addPid(int i, int j)
    {
        parameters.addPid(i, j);
    }

    public int compareTo(VCardProperty vcardproperty)
    {
        Integer integer = getParameters().getPref();
        vcardproperty = vcardproperty.getParameters().getPref();
        if (integer == null && vcardproperty == null)
        {
            return 0;
        }
        if (integer == null)
        {
            return 1;
        }
        if (vcardproperty == null)
        {
            return -1;
        } else
        {
            return vcardproperty.compareTo(integer);
        }
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((VCardProperty)obj);
    }

    public String getGroup()
    {
        return group;
    }

    Integer getIndex()
    {
        return parameters.getIndex();
    }

    String getLanguage()
    {
        return parameters.getLanguage();
    }

    public String getParameter(String s)
    {
        return (String)parameters.first(s);
    }

    public VCardParameters getParameters()
    {
        return parameters;
    }

    public List getParameters(String s)
    {
        return parameters.get(s);
    }

    List getPids()
    {
        return parameters.getPids();
    }

    Integer getPref()
    {
        return parameters.getPref();
    }

    public final Set getSupportedVersions()
    {
        return _supportedVersions();
    }

    public void removeParameter(String s)
    {
        parameters.removeAll(s);
    }

    void removePids()
    {
        parameters.removePids();
    }

    public void setGroup(String s)
    {
        group = s;
    }

    void setIndex(Integer integer)
    {
        parameters.setIndex(integer);
    }

    void setLanguage(String s)
    {
        parameters.setLanguage(s);
    }

    public void setParameter(String s, String s1)
    {
        parameters.replace(s, s1);
    }

    public void setParameters(VCardParameters vcardparameters)
    {
        parameters = vcardparameters;
    }

    void setPref(Integer integer)
    {
        parameters.setPref(integer);
    }

    public final List validate(VCardVersion vcardversion, VCard vcard)
    {
        ArrayList arraylist = new ArrayList(0);
        Set set = getSupportedVersions();
        if (!set.contains(vcardversion))
        {
            arraylist.add((new StringBuilder()).append("Property is not supported by version ").append(vcardversion.getVersion()).append(".  Supported versions are: ").append(set).toString());
        }
        arraylist.addAll(parameters.validate(vcardversion));
        _validate(arraylist, vcardversion, vcard);
        return arraylist;
    }
}
