// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.maps;

import com.accuweather.android.utilities.DateUtils;
import com.google.android.gms.maps.model.TileOverlay;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MapOverlayFrame
{

    private String frameId;
    private String gmtOffset;
    private String overlayType;
    private TileOverlay tileOverlay;

    public MapOverlayFrame(String s, String s1, TileOverlay tileoverlay, String s2)
    {
        overlayType = s;
        frameId = s1;
        tileOverlay = tileoverlay;
        gmtOffset = s2;
    }

    private String convertToLocalTimestamp(int i, String s, int j)
        throws ParseException
    {
        java.util.Date date = (new SimpleDateFormat("HH:mm")).parse((new StringBuilder()).append(i).append(":").append(s).toString());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(11, j);
        i = calendar.get(11);
        return (new StringBuilder()).append(i).append(":").append(s).toString();
    }

    private int getGmtOffsetHours()
    {
        return Math.round(Float.parseFloat(DateUtils.getHourPortionOfGmtOffset(gmtOffset)));
    }

    public String buildLocalTimestamp()
    {
        int i = Integer.parseInt(frameId.substring(0, 2));
        String s = frameId.substring(2);
        String s1;
        try
        {
            s1 = convertToLocalTimestamp(i, s, getGmtOffsetHours());
        }
        catch (ParseException parseexception)
        {
            return (new StringBuilder()).append(i).append(":").append(s).toString();
        }
        return s1;
    }

    public String getOverlayType()
    {
        return overlayType;
    }

    public TileOverlay getTileOverlay()
    {
        return tileOverlay;
    }
}
