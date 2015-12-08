// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import android.util.Log;
import com.aetn.history.android.historyhere.utils.Utils;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

public class POI
    implements ClusterItem
{
    public class Address
    {

        private String address1;
        private String address2;
        private String city;
        private String state;
        final POI this$0;
        private String zip;

        public String getAddress1()
        {
            if (address1 != null)
            {
                return address1;
            } else
            {
                return "";
            }
        }

        public String getAddress2()
        {
            if (address2 != null)
            {
                return address2;
            } else
            {
                return "";
            }
        }

        public String getCity()
        {
            if (city != null)
            {
                return city;
            } else
            {
                return "";
            }
        }

        public String getState()
        {
            if (state != null)
            {
                return state;
            } else
            {
                return "";
            }
        }

        public String getZip()
        {
            if (zip != null)
            {
                return zip;
            } else
            {
                return "";
            }
        }



/*
        static String access$002(Address address3, String s)
        {
            address3.address1 = s;
            return s;
        }

*/



/*
        static String access$102(Address address3, String s)
        {
            address3.address2 = s;
            return s;
        }

*/



/*
        static String access$202(Address address3, String s)
        {
            address3.city = s;
            return s;
        }

*/



/*
        static String access$302(Address address3, String s)
        {
            address3.state = s;
            return s;
        }

*/



/*
        static String access$402(Address address3, String s)
        {
            address3.zip = s;
            return s;
        }

*/

        public Address()
        {
            this$0 = POI.this;
            super();
            address1 = "";
            address2 = "";
            city = "";
            state = "";
            zip = "";
        }
    }

    public class Location
    {

        public double lat;
        public double lng;
        final POI this$0;

        public Location()
        {
            this$0 = POI.this;
            super();
            lat = lat;
            lng = lng;
        }

        public Location(double d, double d1)
        {
            this$0 = POI.this;
            super();
            lat = d;
            lng = d1;
        }
    }


    private static final long serialVersionUID = 1L;
    private final String TAG;
    private Address address;
    private String category;
    private long distance;
    private String id;
    private String image;
    private double lat;
    private double lng;
    private Location location;
    private String poi_id;
    private String short_description;
    private String title;

    public POI()
    {
        TAG = "POI";
        title = "";
        short_description = "";
        image = "";
        category = "";
        address = new Address();
        poi_id = "";
        title = "";
        location = new Location(0.0D, 0.0D);
        distance = 0L;
        short_description = "";
        image = "";
        category = "";
    }

    public POI(String s, String s1, Location location1, int i, String s2, String s3, String s4)
    {
        TAG = "POI";
        title = "";
        short_description = "";
        image = "";
        category = "";
        address = new Address();
        poi_id = s;
        title = s1;
        location = location1;
        distance = i;
        short_description = s2;
        image = s3;
        category = s4;
    }

    public POI(String s, String s1, Location location1, int i, String s2, String s3, String s4, 
            String s5, double d, double d1)
    {
        TAG = "POI";
        title = "";
        short_description = "";
        image = "";
        category = "";
        address = new Address();
        poi_id = s;
        title = s1;
        location = location1;
        distance = i;
        short_description = s2;
        image = s3;
        category = s4;
        id = s5;
        lat = d;
        lng = d1;
    }

    public POI(String s, String s1, String s2, String s3, double d, double d1, String s4)
    {
        TAG = "POI";
        title = "";
        short_description = "";
        image = "";
        category = "";
        address = new Address();
        poi_id = s;
        title = s1;
        distance = 0L;
        short_description = s2;
        image = s4;
        category = s3;
        location = new Location();
        location.lat = d;
        location.lng = d1;
    }

    public boolean equals(Object obj)
    {
        boolean flag = false;
        obj = (POI)obj;
        if (getId().equalsIgnoreCase(((POI) (obj)).getId()))
        {
            flag = true;
        }
        return flag;
    }

    public Address getAddress()
    {
        return address;
    }

    public String getCity()
    {
        return getAddress().getCity();
    }

    public String getCityStateString()
    {
        String s1 = (new StringBuilder()).append(address.city).append(", ").append(address.state).toString();
        String s = s1;
        if (s1.equalsIgnoreCase(", "))
        {
            s = "";
        }
        return s;
    }

    public long getDistance()
    {
        return distance;
    }

    public String getFormattedAddress()
    {
        String s2 = "";
        String s = s2;
        String s1;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        try
        {
            s3 = address.address1;
        }
        catch (Exception exception)
        {
            Log.e("POI", (new StringBuilder()).append("getFormattedAddress the error was:").append(exception.toString()).toString());
            return s;
        }
        s = s2;
        s7 = address.address2;
        s = s2;
        s6 = address.city;
        s = s2;
        s5 = address.state;
        s = s2;
        s4 = address.zip;
        s1 = s2;
        s = s2;
        if (!s3.equals(""))
        {
            s1 = s3;
        }
        s2 = s1;
        s = s1;
        if (s7.equals(""))
        {
            break MISSING_BLOCK_LABEL_116;
        }
        s = s1;
        s2 = (new StringBuilder()).append(s1).append("\n").append(s7).toString();
        s = s2;
        if (!s3.equals(""))
        {
            break MISSING_BLOCK_LABEL_143;
        }
        s3 = s2;
        s = s2;
        if (s7.equals(""))
        {
            break MISSING_BLOCK_LABEL_166;
        }
        s = s2;
        s3 = (new StringBuilder()).append(s2).append("\n").toString();
        s1 = s3;
        s = s3;
        if (s6.equals(""))
        {
            break MISSING_BLOCK_LABEL_242;
        }
        s = s3;
        s2 = (new StringBuilder()).append(s3).append(s6).toString();
        s1 = s2;
        s = s2;
        if (s5.equals(""))
        {
            break MISSING_BLOCK_LABEL_242;
        }
        s = s2;
        s1 = (new StringBuilder()).append(s2).append(",").toString();
        s2 = s1;
        s = s1;
        if (s5.equals(""))
        {
            break MISSING_BLOCK_LABEL_283;
        }
        s = s1;
        s2 = (new StringBuilder()).append(s1).append(" ").append(s5).toString();
        s1 = s2;
        s = s2;
        if (s4.equals(""))
        {
            break MISSING_BLOCK_LABEL_324;
        }
        s = s2;
        s1 = (new StringBuilder()).append(s2).append(" ").append(s4).toString();
        return s1;
    }

    public String getHtmlFormattedAddress()
    {
        return getFormattedAddress().replaceAll("\n", "<br/>");
    }

    public String getId()
    {
        if (id != null)
        {
            return id;
        } else
        {
            return poi_id;
        }
    }

    public String getImage()
    {
        return image;
    }

    public double getLatitude()
    {
        return getLocation().lat;
    }

    public Location getLocation()
    {
        if (location == null)
        {
            location = new Location();
            location.lat = lat;
            location.lng = lng;
        }
        return location;
    }

    public double getLongitude()
    {
        return getLocation().lng;
    }

    public String getMileageString()
    {
        double d = Utils.convertMetersToMiles(getDistance());
        return (new StringBuilder()).append(String.valueOf(d)).append("M").toString();
    }

    public LatLng getPosition()
    {
        Location location1 = getLocation();
        return new LatLng(location1.lat, location1.lng);
    }

    public String getShortDescription()
    {
        return short_description;
    }

    public String getTitle()
    {
        return title;
    }

    public void setAddress(String s, String s1, String s2, String s3, String s4)
    {
        Address address1 = new Address();
        address1.address1 = s;
        address1.address2 = s1;
        address1.city = s2;
        address1.state = s3;
        address1.zip = s4;
        address = address1;
    }

    public void setDistance(long l)
    {
        distance = l;
    }

    public void setId(String s)
    {
        poi_id = s;
    }

    public void setImage(String s)
    {
        image = s;
    }

    public void setLocation(double d, double d1)
    {
        if (location == null)
        {
            location = new Location();
        }
        location.lat = d;
        location.lng = d1;
    }

    public void setShortDescription(String s)
    {
        short_description = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
