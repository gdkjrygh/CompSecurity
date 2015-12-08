// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result;

import android.app.Activity;
import com.google.zxing.client.result.GeoParsedResult;
import com.google.zxing.client.result.ParsedResult;

// Referenced classes of package com.google.zxing.client.android.result:
//            ResultHandler

public final class GeoResultHandler extends ResultHandler
{

    private static final int buttons[];

    public GeoResultHandler(Activity activity, ParsedResult parsedresult)
    {
        super(activity, parsedresult);
    }

    public int getButtonCount()
    {
        return buttons.length;
    }

    public int getButtonText(int i)
    {
        return buttons[i];
    }

    public int getDisplayTitle()
    {
        return com.google.zxing.client.android.R.string.result_geo;
    }

    public void handleButtonPress(int i)
    {
        GeoParsedResult geoparsedresult = (GeoParsedResult)getResult();
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            openMap(geoparsedresult.getGeoURI());
            return;

        case 1: // '\001'
            getDirections(geoparsedresult.getLatitude(), geoparsedresult.getLongitude());
            break;
        }
    }

    static 
    {
        buttons = (new int[] {
            com.google.zxing.client.android.R.string.button_show_map, com.google.zxing.client.android.R.string.button_get_directions
        });
    }
}
