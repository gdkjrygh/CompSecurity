// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googlegeo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.infrastructure.googlegeo:
//            GoogleGeometryDTO, GoogleAddressComponentDTO

public class GoogleGeocodeResultDTO
{

    public static final String ADMINISTRATIVE_AREA_LEVEL_1_TYPE = "administrative_area_level_1";
    public static final String ESTABLISHMENT_TYPE = "establishment";
    public static final String LOCALITY_TYPE = "locality";
    public static final String ROUTE_TYPE = "route";
    public static final String STREET_NUMBER_TYPE = "street_number";
    public final List addressComponents;
    public final String formattedAddress;
    public final GoogleGeometryDTO geometry;
    public final List types;

    public GoogleGeocodeResultDTO()
    {
        addressComponents = new ArrayList();
        formattedAddress = "";
        geometry = new GoogleGeometryDTO();
        types = new ArrayList();
    }

    public GoogleGeocodeResultDTO(ArrayList arraylist, String s, GoogleGeometryDTO googlegeometrydto, ArrayList arraylist1)
    {
        addressComponents = arraylist;
        formattedAddress = s;
        geometry = googlegeometrydto;
        types = arraylist1;
    }

    public String getShortAddress()
    {
        Iterator iterator = addressComponents.iterator();
        String s5 = null;
        String s1 = null;
        String s = null;
        while (iterator.hasNext()) 
        {
            GoogleAddressComponentDTO googleaddresscomponentdto = (GoogleAddressComponentDTO)iterator.next();
            String s2 = s5;
            String s4 = s1;
            if (googleaddresscomponentdto.types != null)
            {
                if (googleaddresscomponentdto.types.contains("street_number"))
                {
                    s4 = googleaddresscomponentdto.shortName;
                    s2 = s5;
                } else
                {
                    s2 = s5;
                    s4 = s1;
                    if (googleaddresscomponentdto.types.contains("route"))
                    {
                        s2 = googleaddresscomponentdto.shortName;
                        s4 = s1;
                    }
                }
            }
            if (Strings.isNullOrEmpty(s))
            {
                s = googleaddresscomponentdto.shortName;
            }
            s5 = s2;
            s1 = s4;
        }
        String s3 = s;
        if (s5 != null)
        {
            s3 = s;
            if (s1 != null)
            {
                s3 = (new StringBuilder()).append(s1).append(" ").append(s5).toString();
            }
        }
        return s3;
    }

    public boolean hasEstablishment()
    {
        for (Iterator iterator = addressComponents.iterator(); iterator.hasNext();)
        {
            GoogleAddressComponentDTO googleaddresscomponentdto = (GoogleAddressComponentDTO)iterator.next();
            if (googleaddresscomponentdto.types != null && googleaddresscomponentdto.types.contains("establishment"))
            {
                return true;
            }
        }

        return false;
    }

    public boolean hasStreetNumber()
    {
        for (Iterator iterator = addressComponents.iterator(); iterator.hasNext();)
        {
            GoogleAddressComponentDTO googleaddresscomponentdto = (GoogleAddressComponentDTO)iterator.next();
            if (googleaddresscomponentdto.types != null && googleaddresscomponentdto.types.contains("street_number"))
            {
                return true;
            }
        }

        return false;
    }
}
