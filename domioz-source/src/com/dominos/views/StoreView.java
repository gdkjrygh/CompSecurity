// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.core.Util;
import com.dominos.android.sdk.common.dom.locator.LocatorStore;

public class StoreView extends RelativeLayout
{

    static final String TAG = "OLO.StoreView";

    public StoreView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f0300b1, this);
    }

    private String getString(int i)
    {
        return getContext().getString(i);
    }

    private void setAddressDescription(String s)
    {
        s = s.replaceAll("\n", ", ");
        ((TextView)findViewById(0x7f0f03b4)).setText(s);
    }

    private void setInfo(Bundle bundle)
    {
        findViewById(0x7f0f03b6).setTag(bundle);
    }

    private void setLocationInfo(String s)
    {
        ((TextView)findViewById(0x7f0f03b5)).setText(s);
    }

    public void setStore(LocatorStore locatorstore)
    {
        String s;
        Object obj;
        String s1;
        int i;
        if (locatorstore.isOpen())
        {
            i = 0x7f0802e7;
        } else
        {
            i = 0x7f0802de;
        }
        s = getString(i);
        if (locatorstore.isOnline())
        {
            i = 0x7f0802e6;
        } else
        {
            i = 0x7f0802e5;
        }
        obj = getString(i);
        if (locatorstore.isDeliveryStore())
        {
            i = 0x7f0802e3;
        } else
        {
            i = 0x7f0802e4;
        }
        s1 = Util.glue(s, ", ", Util.glue(((String) (obj)), ", ", getString(i)));
        if (locatorstore.getDistance() == null)
        {
            s = "";
        } else
        {
            s = String.format("%s %s%s\n\n", new Object[] {
                getString(0x7f0802e0), locatorstore.getDistance().toString(), getString(0x7f0802e1)
            });
        }
        if (locatorstore.getCarryoutHoursDescription().equals(locatorstore.getDeliveryHoursDescription()))
        {
            obj = String.format("%s\n%s", new Object[] {
                getString(0x7f0802e2), locatorstore.getCarryoutHoursDescription()
            });
        } else
        {
            obj = String.format("%s\n%s\n\n%s\n%s", new Object[] {
                getString(0x7f0802dd), locatorstore.getCarryoutHoursDescription(), getString(0x7f0802df), locatorstore.getDeliveryHoursDescription()
            });
        }
        s = String.format("%s %s\n\n%s %s\n\n%s%s", new Object[] {
            getString(0x7f0802e8), locatorstore.getPhone(), getString(0x7f0802e9), s1, s, obj
        });
        setAddressDescription(locatorstore.getAddressDescription());
        setLocationInfo(locatorstore.getLocationInfo());
        obj = new Bundle();
        ((Bundle) (obj)).putString("info", s);
        ((Bundle) (obj)).putString("address", locatorstore.getAddressDescription());
        ((Bundle) (obj)).putString("carryoutHours", locatorstore.getCarryoutHoursDescription());
        ((Bundle) (obj)).putString("deliveryHours", locatorstore.getDeliveryHoursDescription());
        ((Bundle) (obj)).putString("storeNumber", locatorstore.getStoreId());
        ((Bundle) (obj)).putString("phone", locatorstore.getPhone());
        ((Bundle) (obj)).putBoolean("carryoutAvail", locatorstore.isCarryoutAvailable());
        ((Bundle) (obj)).putBoolean("storeOpen", locatorstore.isOpen());
        ((Bundle) (obj)).putBoolean("storeOnline", locatorstore.isOnline());
        setInfo(((Bundle) (obj)));
        setBackgroundColor(0);
    }
}
