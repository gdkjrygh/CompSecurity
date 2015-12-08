// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.TelephoneType;
import ezvcard.parameter.VCardParameters;
import ezvcard.util.TelUri;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package ezvcard.property:
//            VCardProperty, HasAltId

public class Telephone extends VCardProperty
    implements HasAltId
{

    private String text;
    private TelUri uri;

    public Telephone(TelUri teluri)
    {
        setUri(teluri);
    }

    public Telephone(String s)
    {
        setText(s);
    }

    protected void _validate(List list, VCardVersion vcardversion, VCard vcard)
    {
        if (uri == null && text == null)
        {
            list.add("Property has neither a URI nor a text value associated with it.");
        }
        if (uri != null && (vcardversion == VCardVersion.V2_1 || vcardversion == VCardVersion.V3_0))
        {
            list.add((new StringBuilder()).append("\"tel\" URIs are not supported by vCard version ").append(vcardversion.getVersion()).append(".  The URI will be converted to a string.  Some data may be lost.").toString());
        }
        vcard = getTypes().iterator();
        do
        {
            if (!vcard.hasNext())
            {
                break;
            }
            TelephoneType telephonetype = (TelephoneType)vcard.next();
            if (telephonetype != TelephoneType.PREF && !telephonetype.isSupported(vcardversion))
            {
                list.add((new StringBuilder()).append("Type value \"").append(telephonetype.getValue()).append("\" is not supported in version ").append(vcardversion.getVersion()).append(".").toString());
            }
        } while (true);
    }

    public void addPid(int i, int j)
    {
        super.addPid(i, j);
    }

    public void addType(TelephoneType telephonetype)
    {
        parameters.addType(telephonetype.getValue());
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
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); hashset.add(TelephoneType.get((String)((Iterator) (obj)).next()))) { }
        return hashset;
    }

    public TelUri getUri()
    {
        return uri;
    }

    public void removePids()
    {
        super.removePids();
    }

    public void removeType(TelephoneType telephonetype)
    {
        parameters.removeType(telephonetype.getValue());
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

    public void setUri(TelUri teluri)
    {
        text = null;
        uri = teluri;
    }
}
