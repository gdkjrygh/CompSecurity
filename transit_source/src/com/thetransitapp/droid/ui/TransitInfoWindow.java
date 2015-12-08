// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.ui;

import android.app.Activity;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.maps.model.Marker;
import java.util.Date;

public class TransitInfoWindow
    implements com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
{

    private final Activity activity;

    public TransitInfoWindow(Activity activity1)
    {
        activity = activity1;
    }

    private String getContent(Marker marker, Date date)
    {
        String s;
        int i;
        i = (int)((date.getTime() - System.currentTimeMillis()) / 60000L);
        s = DateFormat.getTimeFormat(activity).format(date);
        date = null;
        if (!marker.getSnippet().startsWith("1|")) goto _L2; else goto _L1
_L1:
        if (i <= 0) goto _L4; else goto _L3
_L3:
        if (i > 90) goto _L6; else goto _L5
_L5:
        date = activity.getString(0x7f0a003a, new Object[] {
            Integer.valueOf(i)
        });
_L8:
        return date;
_L6:
        return activity.getString(0x7f0a003b, new Object[] {
            s
        });
_L4:
        return activity.getString(0x7f0a003c, new Object[] {
            s
        });
_L2:
        if (marker.getSnippet().startsWith("0|"))
        {
            if (i >= 0)
            {
                return activity.getString(0x7f0a003d, new Object[] {
                    s
                });
            } else
            {
                return activity.getString(0x7f0a003e, new Object[] {
                    s
                });
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public View getInfoContents(Marker marker)
    {
        View view;
        View view1;
        view1 = null;
        view = view1;
        if (marker.getTitle() == null) goto _L2; else goto _L1
_L1:
        if (!marker.getTitle().isEmpty()) goto _L4; else goto _L3
_L3:
        view = view1;
_L2:
        return view;
_L4:
        TextView textview;
        view1 = activity.getLayoutInflater().inflate(0x7f03001a, null);
        ((TextView)view1.findViewById(0x7f050045)).setText(marker.getTitle());
        textview = (TextView)view1.findViewById(0x7f050046);
        textview.setVisibility(8);
        view = view1;
        if (marker.getSnippet() == null) goto _L2; else goto _L5
_L5:
        view = view1;
        if (marker.getSnippet().isEmpty()) goto _L2; else goto _L6
_L6:
        int i;
        i = marker.getSnippet().indexOf("|");
        view = view1;
        if (i == -1) goto _L2; else goto _L7
_L7:
        try
        {
            marker = getContent(marker, new Date(Long.parseLong(marker.getSnippet().substring(i + 1))));
        }
        // Misplaced declaration of an exception variable
        catch (Marker marker)
        {
            return view1;
        }
        view = view1;
        if (marker == null) goto _L2; else goto _L8
_L8:
        textview.setVisibility(0);
        textview.setText(marker);
        return view1;
    }

    public View getInfoWindow(Marker marker)
    {
        return null;
    }
}
