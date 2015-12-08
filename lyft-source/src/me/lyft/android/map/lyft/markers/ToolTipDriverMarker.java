// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft.markers;

import com.google.android.gms.maps.model.BitmapDescriptor;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.map.core.markers.IMarker;

// Referenced classes of package me.lyft.android.map.lyft.markers:
//            DriverMarker

public class ToolTipDriverMarker extends DriverMarker
{

    private String resourceId;
    private String text;

    public ToolTipDriverMarker(String s, IMarker imarker)
    {
        super(s, imarker);
    }

    public boolean consumeClick()
    {
        showInfoWindow();
        return true;
    }

    public void setText(String s)
    {
        if (Strings.isNullOrEmpty(s))
        {
            hideInfoWindow();
        }
        if (Objects.equals(text, s))
        {
            return;
        } else
        {
            text = s;
            super.setText(s);
            showInfoWindow();
            return;
        }
    }

    public void updateIcon(String s, BitmapDescriptor bitmapdescriptor)
    {
        if (Objects.equals(s, resourceId))
        {
            return;
        } else
        {
            resourceId = s;
            setIcon(bitmapdescriptor);
            return;
        }
    }
}
