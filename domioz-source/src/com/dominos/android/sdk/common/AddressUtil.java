// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.google.android.gms.maps.model.LatLng;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.dominos.android.sdk.common:
//            StringHelper

public class AddressUtil
{

    private static final String NEW_LINE = "\n";
    private static final String SPACE = " ";
    private static final String ZERO = "0";
    private static final String addressEndings[] = {
        "Rd", "Dr", "Ave", "St", "Blvd", "Road", "Avenue", "Street", "Drive"
    };

    public AddressUtil()
    {
    }

    public static String getCarryoutAddressDescription(LabsAddress labsaddress)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(labsaddress.getStreetLine());
        stringbuilder.append("\n");
        stringbuilder.append(labsaddress.getCityRegionLine());
        return stringbuilder.toString().trim();
    }

    public static String getDeliveryAddressDescription(LabsAddress labsaddress)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (StringHelper.isNotEmpty(labsaddress.getOrganizationName()))
        {
            stringbuilder.append(labsaddress.getOrganizationName());
            stringbuilder.append("\n");
        }
        StringBuilder stringbuilder1 = new StringBuilder(labsaddress.getStreet());
        if (StringHelper.isNotEmpty(labsaddress.getUnitType()))
        {
            stringbuilder1.append(" ");
            stringbuilder1.append(labsaddress.getUnitType());
        }
        if (StringHelper.isNotEmpty(labsaddress.getUnitNumber().trim()))
        {
            stringbuilder1.append(" ");
            stringbuilder1.append("#");
            stringbuilder1.append(labsaddress.getUnitNumber().trim());
        }
        if (StringHelper.equalsIgnoreCase(labsaddress.getAddressType(), "Campus"))
        {
            stringbuilder.append(removeZeroFromStreetAddress(stringbuilder1.toString()));
        } else
        {
            stringbuilder.append(stringbuilder1);
        }
        stringbuilder.append("\n");
        stringbuilder.append(labsaddress.getCityRegionLine());
        return stringbuilder.toString().trim();
    }

    public static LatLng getLatLngFromAddress(Context context, String s)
    {
label0:
        {
            context = new Geocoder(context);
            try
            {
                context = context.getFromLocationName(s, 5);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = null;
            }
            if (context == null || context.size() <= 0)
            {
                break label0;
            }
            context = context.iterator();
            do
            {
                if (!context.hasNext())
                {
                    break label0;
                }
                s = (Address)context.next();
            } while (s == null);
            s.getLatitude();
            s.getLongitude();
            return new LatLng(s.getLatitude(), s.getLongitude());
        }
        return null;
    }

    public static LatLng getLatLngFromFormattedAddress(Context context, String s)
    {
        return getLatLngFromFormattedAddress(context, s, true);
    }

    public static LatLng getLatLngFromFormattedAddress(Context context, String s, boolean flag)
    {
        Object obj1 = getLatLngFromAddress(context, s);
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = obj1;
            if (StringHelper.isNotBlank(s))
            {
                obj = obj1;
                if (StringHelper.contains(s, "\n"))
                {
                    String s1 = s.substring(s.indexOf("\n"));
                    String as[] = addressEndings;
                    int k = as.length;
                    int i = 0;
                    obj = obj1;
                    do
                    {
                        if (i >= k)
                        {
                            break;
                        }
                        obj = as[i];
                        obj1 = getLatLngFromAddress(context, (new StringBuilder()).append(StringHelper.substringBefore(s, ((String) (obj)))).append(((String) (obj))).append(s1).toString());
                        obj = obj1;
                        if (obj1 != null)
                        {
                            break;
                        }
                        i++;
                        obj = obj1;
                    } while (true);
                }
            }
        }
        obj1 = obj;
        if (flag)
        {
            obj1 = obj;
            if (obj == null)
            {
                obj1 = obj;
                if (StringHelper.isNotBlank(s))
                {
                    obj1 = obj;
                    if (StringHelper.contains(s, "\n"))
                    {
                        s = s.split("\\n");
                        StringBuilder stringbuilder = new StringBuilder();
                        for (int j = 0; j < s.length - 1; j++)
                        {
                            stringbuilder.append(s[j]);
                            if (j < s.length - 2)
                            {
                                stringbuilder.append("\n");
                            }
                        }

                        obj1 = getLatLngFromFormattedAddress(context, String.valueOf(stringbuilder), false);
                    }
                }
            }
        }
        return ((LatLng) (obj1));
    }

    public static LabsAddress getProfileCampusAddress(LabsAddress labsaddress, LabsAddress labsaddress1)
    {
        LabsAddress labsaddress2 = new LabsAddress(labsaddress);
        labsaddress2.setLine2(labsaddress.getUnitNumber());
        labsaddress2.setLine3(labsaddress.getLine2());
        labsaddress2.setName(labsaddress1.getName());
        labsaddress2.setDeliveryInstructions(labsaddress1.getDeliveryInstructions());
        return labsaddress2;
    }

    public static LabsAddress getUpdatedDeliveryAddress(LabsAddress labsaddress, LabsAddress labsaddress1)
    {
        String s;
        byte byte0;
        s = labsaddress.getAddressType();
        byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch 2011093247 2011093247: default 28
    //                   2011093247 117;
           goto _L1 _L2
_L1:
        byte0;
        JVM INSTR tableswitch 0 0: default 48
    //                   0 131;
           goto _L3 _L4
_L3:
        labsaddress1.setUnitNumber(labsaddress.getUnitNumber());
        labsaddress1.setLine2(labsaddress.getUnitNumber());
        s = labsaddress.getAddressType();
        if (!StringHelper.isNotEmpty(s))
        {
            s = "residence";
        }
        labsaddress1.setAddressType(s);
_L5:
        if (StringHelper.isEmpty(labsaddress1.getOrganizationName()))
        {
            labsaddress1.setOrganizationName(labsaddress.getOrganizationName());
        }
        labsaddress1.setName(labsaddress.getName());
        labsaddress1.setDeliveryInstructions(labsaddress.getDeliveryInstructions());
        return labsaddress1;
_L2:
        if (s.equals("Campus"))
        {
            byte0 = 0;
        }
          goto _L1
_L4:
        labsaddress1.setUnitNumber(labsaddress.getUnitNumber());
        labsaddress1.setAddressType("Campus");
        labsaddress1.setCampusId(labsaddress.getCampusId());
        labsaddress1.setOrganizationName(labsaddress1.getLine3());
          goto _L5
    }

    public static String removeZeroFromStreetAddress(String s)
    {
        String s1 = s;
        if (s != null)
        {
            String as[] = s.split(" ");
            s1 = s;
            if (as.length > 0)
            {
                s1 = s;
                if (as[0].equalsIgnoreCase("0"))
                {
                    s = new StringBuilder();
                    for (int i = 1; i < as.length; i++)
                    {
                        s.append(as[i]);
                        s.append(" ");
                    }

                    s1 = s.toString().trim();
                }
            }
        }
        return s1;
    }

}
