// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.location.Address;
import android.location.Geocoder;
import android.location.LocationManager;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.scannerfire.utils.Utils;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.QRBS.activity:
//            CreateGps

class this._cls0
    implements android.view.Listener
{

    final CreateGps this$0;

    public void onClick(View view)
    {
        if (locationManager != null && locationListener != null)
        {
            locationManager.removeUpdates(locationListener);
        }
        lat.setText("");
        lon.setText("");
        if (address.getText().length() == 0)
        {
            Utils.showToastNotification(activity, getString(0x7f0800fe));
            return;
        }
        if (!(new Utils()).checkConnectivity(activity))
        {
            Utils.showToastNotification(activity, getString(0x7f0800ff));
            return;
        }
        view = (Address)CreateGps.access$0(CreateGps.this).getFromLocationName(address.getText().toString(), 1).get(0);
        if (view.hasLongitude() && view.hasLatitude())
        {
            double d = view.getLongitude();
            double d1 = view.getLatitude();
            lon.setText(Double.toString(d));
            lat.setText(Double.toString(d1));
            return;
        }
        try
        {
            Utils.showToastNotification(activity, getString(0x7f080100));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Utils.showToastNotification(activity, getString(0x7f080101));
            view.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Utils.showToastNotification(activity, getString(0x7f080100));
        }
        view.printStackTrace();
        return;
    }

    ption()
    {
        this$0 = CreateGps.this;
        super();
    }
}
