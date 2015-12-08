// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.AddressType;
import ezvcard.parameter.VCardParameters;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package ezvcard.property:
//            VCardProperty, HasAltId

public class Address extends VCardProperty
    implements HasAltId
{

    private String country;
    private String extendedAddress;
    private String locality;
    private String poBox;
    private String postalCode;
    private String region;
    private String streetAddress;

    public Address()
    {
    }

    protected void _validate(List list, VCardVersion vcardversion, VCard vcard)
    {
        vcard = getTypes().iterator();
        do
        {
            if (!vcard.hasNext())
            {
                break;
            }
            AddressType addresstype = (AddressType)vcard.next();
            if (addresstype != AddressType.PREF && !addresstype.isSupported(vcardversion))
            {
                list.add((new StringBuilder()).append("Type value \"").append(addresstype.getValue()).append("\" is not supported in version ").append(vcardversion.getVersion()).append(".").toString());
            }
        } while (true);
    }

    public void addPid(int i, int j)
    {
        super.addPid(i, j);
    }

    public void addType(AddressType addresstype)
    {
        parameters.addType(addresstype.getValue());
    }

    public String getAltId()
    {
        return parameters.getAltId();
    }

    public String getCountry()
    {
        return country;
    }

    public String getExtendedAddress()
    {
        return extendedAddress;
    }

    public double[] getGeo()
    {
        return parameters.getGeo();
    }

    public String getLabel()
    {
        return parameters.getLabel();
    }

    public String getLanguage()
    {
        return super.getLanguage();
    }

    public String getLocality()
    {
        return locality;
    }

    public List getPids()
    {
        return super.getPids();
    }

    public String getPoBox()
    {
        return poBox;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public Integer getPref()
    {
        return super.getPref();
    }

    public String getRegion()
    {
        return region;
    }

    public String getStreetAddress()
    {
        return streetAddress;
    }

    public String getTimezone()
    {
        return parameters.getTimezone();
    }

    public Set getTypes()
    {
        Object obj = parameters.getTypes();
        HashSet hashset = new HashSet(((Set) (obj)).size());
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); hashset.add(AddressType.get((String)((Iterator) (obj)).next()))) { }
        return hashset;
    }

    public void removePids()
    {
        super.removePids();
    }

    public void removeType(AddressType addresstype)
    {
        parameters.removeType(addresstype.getValue());
    }

    public void setAltId(String s)
    {
        parameters.setAltId(s);
    }

    public void setCountry(String s)
    {
        country = s;
    }

    public void setExtendedAddress(String s)
    {
        extendedAddress = s;
    }

    public void setGeo(double d, double d1)
    {
        parameters.setGeo(d, d1);
    }

    public void setLabel(String s)
    {
        parameters.setLabel(s);
    }

    public void setLanguage(String s)
    {
        super.setLanguage(s);
    }

    public void setLocality(String s)
    {
        locality = s;
    }

    public void setPoBox(String s)
    {
        poBox = s;
    }

    public void setPostalCode(String s)
    {
        postalCode = s;
    }

    public void setPref(Integer integer)
    {
        super.setPref(integer);
    }

    public void setRegion(String s)
    {
        region = s;
    }

    public void setStreetAddress(String s)
    {
        streetAddress = s;
    }

    public void setTimezone(String s)
    {
        parameters.setTimezone(s);
    }
}
