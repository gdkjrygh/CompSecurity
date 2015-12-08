// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.location.api.LocationSettings;
import com.google.android.apps.wallet.mywallet.SharedPreferenceDismissController;
import com.google.android.apps.wallet.tile.Tile;

public class LocationServicesTeachingTile extends Tile
{
    public static final class Configuration extends Enum
    {

        private static final Configuration $VALUES[];
        public static final Configuration OFF;
        public static final Configuration ON;
        final int bodyText;
        final int headlineText;
        final int iconId;

        public static Configuration valueOf(String s)
        {
            return (Configuration)Enum.valueOf(com/google/android/apps/wallet/geofencing/LocationServicesTeachingTile$Configuration, s);
        }

        public static Configuration[] values()
        {
            return (Configuration[])$VALUES.clone();
        }

        static 
        {
            OFF = new Configuration("OFF", 0, com.google.android.apps.walletnfcrel.R.string.location_services_teaching_tile_location_off_headline, com.google.android.apps.walletnfcrel.R.string.location_services_teaching_tile_location_off_body, com.google.android.apps.walletnfcrel.R.drawable.ic_mywallet_loc_off_color_40dp);
            ON = new Configuration("ON", 1, com.google.android.apps.walletnfcrel.R.string.location_services_teaching_tile_location_on_headline, com.google.android.apps.walletnfcrel.R.string.location_services_teaching_tile_location_on_body, com.google.android.apps.walletnfcrel.R.drawable.ic_mywallet_loc_color_40dp);
            $VALUES = (new Configuration[] {
                OFF, ON
            });
        }

        private Configuration(String s, int i, int j, int k, int l)
        {
            super(s, i);
            headlineText = j;
            bodyText = k;
            iconId = l;
        }
    }


    private final Activity activity;
    private TextView body;
    private final SharedPreferenceDismissController dismissController;
    private final FeatureManager featureManager;
    private TextView headline;
    private ImageView icon;
    private final LocationSettings locationSettings;

    LocationServicesTeachingTile(Activity activity1, LocationSettings locationsettings, FeatureManager featuremanager, SharedPreferences sharedpreferences)
    {
        super(activity1);
        activity = activity1;
        locationSettings = locationsettings;
        featureManager = featuremanager;
        dismissController = new SharedPreferenceDismissController(sharedpreferences, SharedPreference.LOCATION_SERVICES_TEACHING_TILE_DISMISSED);
        addTileDismissedListener(dismissController);
    }

    public final String getAnchor()
    {
        return "locationteaching";
    }

    protected final void onActivate()
    {
        super.onActivate();
        Configuration configuration;
        if (locationSettings.isSystemPreferencesLocationEnabled())
        {
            configuration = Configuration.ON;
        } else
        {
            configuration = Configuration.OFF;
        }
        headline.setText(context.getString(configuration.headlineText));
        body.setText(context.getString(configuration.bodyText));
        icon.setImageResource(configuration.iconId);
    }

    protected final View onCreateView(ViewGroup viewgroup)
    {
        viewgroup = activity.getLayoutInflater().inflate(com.google.android.apps.walletnfcrel.R.layout.tile_card, viewgroup, false);
        icon = (ImageView)viewgroup.findViewById(com.google.android.apps.walletnfcrel.R.id.Icon);
        headline = (TextView)viewgroup.findViewById(com.google.android.apps.walletnfcrel.R.id.Headline);
        body = (TextView)viewgroup.findViewById(com.google.android.apps.walletnfcrel.R.id.Body);
        viewgroup.setOnClickListener(new android.view.View.OnClickListener() );
        return viewgroup;
    }

    public final boolean shouldShow()
    {
        return !dismissController.isDismissed() && featureManager.isFeatureEnabled(Feature.LOCATION_REPORTING);
    }


}
