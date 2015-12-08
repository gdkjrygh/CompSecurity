// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.app.ProgressDialog;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.EditText;

// Referenced classes of package com.QRBS.activity:
//            CreateGps

public class lon
    implements LocationListener
{

    EditText lat;
    EditText lon;
    final CreateGps this$0;

    public void onLocationChanged(Location location)
    {
        lat.setText(Double.toString(location.getLatitude()));
        lon.setText(Double.toString(location.getLongitude()));
        prog.dismiss();
    }

    public void onProviderDisabled(String s)
    {
    }

    public void onProviderEnabled(String s)
    {
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
    }

    (EditText edittext, EditText edittext1)
    {
        this$0 = CreateGps.this;
        super();
        lat = edittext;
        lon = edittext1;
    }
}
