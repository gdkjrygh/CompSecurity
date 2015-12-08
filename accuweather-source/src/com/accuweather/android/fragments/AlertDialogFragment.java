// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import android.os.Bundle;
import com.accuweather.android.dialogs.GenericAlertDialogFragment;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.alert.AlertModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlertDialogFragment extends GenericAlertDialogFragment
    implements android.content.DialogInterface.OnClickListener
{

    private WeatherDataModel mWeatherDataModel;

    public AlertDialogFragment()
    {
    }

    private String buildMessage(WeatherDataModel weatherdatamodel)
    {
        StringBuilder stringbuilder = new StringBuilder();
        ArrayList arraylist = new ArrayList();
        if (weatherdatamodel.getAlerts() == null)
        {
            return null;
        }
        for (int i = 0; i < weatherdatamodel.getAlerts().size(); i++)
        {
            arraylist.add(((AlertModel)weatherdatamodel.getAlerts().get(i)).getAlertDescription());
        }

        int j = 0;
        int k = arraylist.size();
        weatherdatamodel = arraylist.iterator();
        while (weatherdatamodel.hasNext()) 
        {
            String s = (String)weatherdatamodel.next();
            if (j == 0)
            {
                stringbuilder.append(s);
            } else
            if (j == k - 1)
            {
                stringbuilder.append((new StringBuilder()).append(" and ").append(s).toString());
            } else
            {
                stringbuilder.append((new StringBuilder()).append(", ").append(s).toString());
            }
            j++;
        }
        return stringbuilder.toString();
    }

    private void init()
    {
        mWeatherDataModel = (WeatherDataModel)getArguments().getSerializable("content");
        setTitleResourceId(com.accuweather.android.R.string.WeatherAlert);
        setPositiveButtonResourceId(com.accuweather.android.R.string.MoreInfo_Abbr14);
        setMessage(buildMessage(mWeatherDataModel));
    }

    public static AlertDialogFragment newInstance(WeatherDataModel weatherdatamodel)
    {
        AlertDialogFragment alertdialogfragment = new AlertDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("content", weatherdatamodel);
        alertdialogfragment.setArguments(bundle);
        return alertdialogfragment;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        init();
    }
}
