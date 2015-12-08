// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.geo;

import java.util.Iterator;
import java.util.List;
import me.lyft.android.infrastructure.googlegeo.GoogleAddressComponentDTO;

// Referenced classes of package me.lyft.android.domain.geo:
//            Address

public class AddressMapper
{

    public AddressMapper()
    {
    }

    public static Address fromGoogleAddressComponentsDTO(List list)
    {
        String s = "";
        String s1 = "";
        Iterator iterator = list.iterator();
        list = s1;
        do
        {
            List list1;
            if (iterator.hasNext())
            {
                GoogleAddressComponentDTO googleaddresscomponentdto = (GoogleAddressComponentDTO)iterator.next();
                list1 = list;
                if (googleaddresscomponentdto.types != null)
                {
                    if (googleaddresscomponentdto.types.contains("administrative_area_level_1"))
                    {
                        list = googleaddresscomponentdto.shortName;
                    }
                    list1 = list;
                    if (googleaddresscomponentdto.types.contains("locality"))
                    {
                        s = googleaddresscomponentdto.shortName;
                        continue;
                    }
                }
            } else
            {
                return new Address(s, list);
            }
            list = list1;
        } while (true);
    }
}
