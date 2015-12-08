// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.RelatedType;
import ezvcard.parameter.VCardParameters;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package ezvcard.property:
//            VCardProperty, HasAltId

public class Related extends VCardProperty
    implements HasAltId
{

    private String text;
    private String uri;

    public Related()
    {
    }

    public Set _supportedVersions()
    {
        return EnumSet.of(VCardVersion.V4_0);
    }

    protected void _validate(List list, VCardVersion vcardversion, VCard vcard)
    {
        if (uri == null && text == null)
        {
            list.add("Property has neither a URI nor a text value associated with it.");
        }
    }

    public void addPid(int i, int j)
    {
        super.addPid(i, j);
    }

    public void addType(RelatedType relatedtype)
    {
        parameters.addType(relatedtype.getValue());
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

    public String getText()
    {
        return text;
    }

    public Set getTypes()
    {
        Object obj = parameters.getTypes();
        HashSet hashset = new HashSet(((Set) (obj)).size());
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); hashset.add(RelatedType.get((String)((Iterator) (obj)).next()))) { }
        return hashset;
    }

    public String getUri()
    {
        return uri;
    }

    public void removePids()
    {
        super.removePids();
    }

    public void removeType(RelatedType relatedtype)
    {
        parameters.removeType(relatedtype.getValue());
    }

    public void setAltId(String s)
    {
        parameters.setAltId(s);
    }

    public void setPref(Integer integer)
    {
        super.setPref(integer);
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
