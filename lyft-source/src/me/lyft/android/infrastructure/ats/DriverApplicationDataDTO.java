// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.ats;

import java.util.ArrayList;
import me.lyft.android.common.Objects;

public class DriverApplicationDataDTO
{

    Region regions[];

    public DriverApplicationDataDTO()
    {
    }

    public String findRegionLabelByCode(String s)
    {
        Region aregion[] = getRegions();
        int j = aregion.length;
        for (int i = 0; i < j; i++)
        {
            Region region = aregion[i];
            if (region.getCode().equals(s))
            {
                return region.getLabel();
            }
        }

        return "";
    }

    public ArrayList getRegionCodes()
    {
        ArrayList arraylist = new ArrayList();
        Region aregion[] = getRegions();
        int j = aregion.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(aregion[i].getCode());
        }

        return arraylist;
    }

    public ArrayList getRegionLabels()
    {
        ArrayList arraylist = new ArrayList();
        Region aregion[] = getRegions();
        int j = aregion.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(aregion[i].getLabel());
        }

        return arraylist;
    }

    public Region[] getRegions()
    {
        return (Region[])Objects.firstNonNull(regions, new Region[0]);
    }

    private class Region
    {

        String code;
        String label;

        public String getCode()
        {
            return (String)Objects.firstNonNull(code, "");
        }

        public String getLabel()
        {
            return (String)Objects.firstNonNull(label, "");
        }

        public Region()
        {
        }
    }

}
