// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.util.GeoUri;
import java.util.List;

// Referenced classes of package ezvcard.property:
//            VCardProperty, HasAltId

public class Geo extends VCardProperty
    implements HasAltId
{

    private GeoUri uri;

    public Geo(GeoUri geouri)
    {
        uri = geouri;
    }

    public Geo(Double double1, Double double2)
    {
        this((new ezvcard.util.GeoUri.Builder(double1, double2)).build());
    }

    protected void _validate(List list, VCardVersion vcardversion, VCard vcard)
    {
        if (getLatitude() == null)
        {
            list.add("Latitude is missing.");
        }
        if (getLongitude() == null)
        {
            list.add("Longitude is missing.");
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

    public GeoUri getGeoUri()
    {
        return uri;
    }

    public Double getLatitude()
    {
        if (uri == null)
        {
            return null;
        } else
        {
            return uri.getCoordA();
        }
    }

    public Double getLongitude()
    {
        if (uri == null)
        {
            return null;
        } else
        {
            return uri.getCoordB();
        }
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

    public void setGeoUri(GeoUri geouri)
    {
        uri = geouri;
    }

    public void setLatitude(Double double1)
    {
        if (uri == null)
        {
            uri = (new ezvcard.util.GeoUri.Builder(double1, null)).build();
            return;
        } else
        {
            uri = (new ezvcard.util.GeoUri.Builder(uri)).coordA(double1).build();
            return;
        }
    }

    public void setLongitude(Double double1)
    {
        if (uri == null)
        {
            uri = (new ezvcard.util.GeoUri.Builder(null, double1)).build();
            return;
        } else
        {
            uri = (new ezvcard.util.GeoUri.Builder(uri)).coordB(double1).build();
            return;
        }
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
