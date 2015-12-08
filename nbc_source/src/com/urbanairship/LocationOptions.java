// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.content.Context;
import java.lang.reflect.Field;

// Referenced classes of package com.urbanairship:
//            Options, Logger, PropertyName

public class LocationOptions extends Options
{

    private static final int MAX_BG_REPORTING_INTERVAL_SECONDS = 0x15180;
    private static final int MAX_UPDATE_INTERVAL_METERS = 0x186a0;
    private static final int MAX_UPDATE_INTERVAL_SECONDS = 0x15180;
    private static final int MIN_BG_REPORTING_INTERVAL_SECONDS = 60;
    private static final int MIN_UPDATE_INTERVAL_METERS = 10;
    private static final int MIN_UPDATE_INTERVAL_SECONDS = 60;
    public int accuracy;
    public boolean allowGPSForLocationTracking;
    public boolean altitudeRequired;
    public long backgroundReportingIntervalSeconds;
    public boolean bearingRequired;
    public boolean costAllowed;
    public int horizontalAccuracy;
    public boolean locationServiceEnabled;
    public int powerRequirement;
    public boolean speedRequired;
    public int updateIntervalMeters;
    public long updateIntervalSeconds;

    public LocationOptions()
    {
        locationServiceEnabled = false;
        allowGPSForLocationTracking = true;
        updateIntervalMeters = 500;
        updateIntervalSeconds = 900L;
        backgroundReportingIntervalSeconds = 900L;
        accuracy = 2;
        horizontalAccuracy = 0;
        powerRequirement = 1;
        altitudeRequired = false;
        bearingRequired = false;
        speedRequired = false;
        costAllowed = false;
    }

    private void ensureUpdateIntervalValuesAreValid()
    {
        if (updateIntervalSeconds >= 60L) goto _L2; else goto _L1
_L1:
        Logger.warn((new StringBuilder()).append("The updateIntervalSeconds ").append(updateIntervalSeconds).append(" may decrease battery life.").toString());
_L8:
        if (updateIntervalMeters < 10)
        {
            Logger.warn((new StringBuilder()).append("The updateIntervalMeters ").append(updateIntervalMeters).append(" may decrease battery life if the updateIntervalSeconds value is also low.").toString());
        } else
        if (updateIntervalMeters > 0x186a0)
        {
            Logger.warn((new StringBuilder()).append("The updateIntervalMeters ").append(updateIntervalMeters).append(" may provide less accurate location updates.").toString());
        }
        if (backgroundReportingIntervalSeconds >= 60L) goto _L4; else goto _L3
_L3:
        Logger.warn((new StringBuilder()).append("The backgroundReportingIntervalSeconds ").append(backgroundReportingIntervalSeconds).append(" may decrease battery life.").toString());
_L6:
        return;
_L2:
        if (updateIntervalSeconds > 0x15180L)
        {
            Logger.warn((new StringBuilder()).append("The updateIntervalSeconds ").append(updateIntervalSeconds).append(" may provide less accurate location updates.").toString());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (backgroundReportingIntervalSeconds <= 0x15180L) goto _L6; else goto _L5
_L5:
        Logger.warn((new StringBuilder()).append("The backgroundReportingIntervalSeconds ").append(backgroundReportingIntervalSeconds).append(" may provide less detailed analytic reports.").toString());
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private boolean isAccuracyValid(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            return true;
        }
    }

    private boolean isPowerReqValid()
    {
        switch (powerRequirement)
        {
        default:
            return false;

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return true;
        }
    }

    public static LocationOptions loadDefaultOptions(Context context)
    {
        LocationOptions locationoptions = new LocationOptions();
        locationoptions.loadFromProperties(context);
        return locationoptions;
    }

    public String getDefaultPropertiesFilename()
    {
        return "location.properties";
    }

    public boolean isValid()
    {
        LocationOptions locationoptions;
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag = true;
        locationoptions = new LocationOptions();
        flag1 = flag2;
        Field afield[] = getClass().getFields();
        flag1 = flag2;
        int j = afield.length;
        int i = 0;
_L5:
        flag1 = flag;
        if (i >= j) goto _L2; else goto _L1
_L1:
        Field field;
        field = afield[i];
        flag1 = flag;
        flag2 = field.isAnnotationPresent(com/urbanairship/PropertyName);
        if (!flag2) goto _L4; else goto _L3
_L3:
        flag1 = flag;
_L2:
        if (!isAccuracyValid(accuracy))
        {
            Logger.error((new StringBuilder()).append(accuracy).append(" is not a valid location accuracy requirement. Falling back to ").append(locationoptions.accuracy).append(" ACCURACY_COARSE.").toString());
            accuracy = locationoptions.accuracy;
        }
        if (!isAccuracyValid(horizontalAccuracy))
        {
            Logger.error((new StringBuilder()).append(horizontalAccuracy).append(" is not a valid location accuracy requirement. Falling back to ").append(locationoptions.horizontalAccuracy).append(" NO_REQUIREMENT.").toString());
            horizontalAccuracy = locationoptions.horizontalAccuracy;
        }
        if (!isPowerReqValid())
        {
            Logger.error((new StringBuilder()).append(powerRequirement).append(" is not a valid power requirement. Falling back to ").append(locationoptions.powerRequirement).append(" POWER_LOW").toString());
            powerRequirement = locationoptions.powerRequirement;
        }
        ensureUpdateIntervalValuesAreValid();
        return flag1;
_L4:
        flag1 = flag;
        Logger.error((new StringBuilder()).append("The public field '").append(field.getName()).append("' is missing an annotation").toString());
        flag1 = flag;
        Logger.error("LocationOptions appears to be obfuscated. If using Proguard, add the following to your proguard.cfg:");
        flag1 = flag;
        Logger.error("\t-keepattributes *Annotation*");
        flag = false;
        i++;
          goto _L5
        SecurityException securityexception;
        securityexception;
          goto _L2
    }
}
