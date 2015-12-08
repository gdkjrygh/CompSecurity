// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.service;

import android.location.Location;
import android.widget.Toast;
import com.digby.localpoint.sdk.core.ILPError;
import com.digby.localpoint.sdk.core.ILPGeopoint;
import com.digby.localpoint.sdk.core.ILPID;
import com.digby.localpoint.sdk.core.ILPLocation;
import com.digby.localpoint.sdk.core.util.LPAbstractLocationBroadcastReceiver;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import java.util.Set;

public class LPLocationBroadcastReceiver extends LPAbstractLocationBroadcastReceiver
{

    public LPLocationBroadcastReceiver()
    {
    }

    private void toastAndLog(String s)
    {
        Toast.makeText(getContext(), s, 1).show();
    }

    public void onAdd(ILPLocation ilplocation)
    {
        (new StringBuilder()).append("Added new location: ").append(ilplocation.getName()).toString();
    }

    public void onCheckInFailure(ILPLocation ilplocation, ILPError ilperror)
    {
        (new StringBuilder()).append(ilperror.getErrorMessage()).append(": ").append(ilplocation.getName()).toString();
    }

    public void onCheckInSuccess(ILPLocation ilplocation)
    {
        (new StringBuilder()).append("Successfully checked in to location: ").append(ilplocation.getName()).toString();
        Location location = new Location("gps");
        location.setLatitude(ilplocation.getCenter().getLatitude());
        location.setLongitude(ilplocation.getCenter().getLongitude());
        KohlsPhoneApplication.getInstance().getKohlsPref().setDigbyNotification(true, location);
    }

    public void onDelete(ILPID ilpid)
    {
        (new StringBuilder()).append("Removed location with ID: ").append(ilpid.getValue()).toString();
    }

    public void onEntry(ILPLocation ilplocation)
    {
        (new StringBuilder()).append("Entered location: ").append(ilplocation.getName()).toString();
        if (ilplocation.getTags() != null)
        {
            for (int i = 0; i < ilplocation.getTags().size(); i++)
            {
                if (ilplocation.getTags().contains("kohls_stores"))
                {
                    Location location = new Location("gps");
                    location.setLatitude(ilplocation.getCenter().getLatitude());
                    location.setLongitude(ilplocation.getCenter().getLongitude());
                    KohlsPhoneApplication.getInstance().getKohlsPref().setDigbyNotification(true, location);
                }
            }

        }
    }

    public void onExit(ILPLocation ilplocation)
    {
        (new StringBuilder()).append("Exited location: ").append(ilplocation.getName()).toString();
        KohlsPhoneApplication.getInstance().getKohlsPref().setDigbyNotification(false, null);
    }

    public void onModify(ILPLocation ilplocation)
    {
        (new StringBuilder()).append("Modified location: ").append(ilplocation.getName()).toString();
    }
}
