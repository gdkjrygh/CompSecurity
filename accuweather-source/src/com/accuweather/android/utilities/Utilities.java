// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.Html;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.accuweather.android.models.location.LocationSearch;
import com.accuweather.android.models.location.LocationSearchResult;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.accuweather.android.utilities:
//            FileCache, ConversionUtilities, Constants, DmaExclusions, 
//            PartnerCoding

public class Utilities
{

    private static Locale mLocale = Locale.getDefault();

    public Utilities()
    {
    }

    public static ArrayList buildHtmlifiedLocationFullNames(Context context, LocationSearch locationsearch, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        if (locationsearch != null && locationsearch.size() != 0 || !flag) goto _L2; else goto _L1
_L1:
        arraylist.add(context.getResources().getString(com.accuweather.android.R.string.NoLocationFound));
_L4:
        return arraylist;
_L2:
        if (locationsearch != null)
        {
            int i = 0;
            while (i < locationsearch.size()) 
            {
                arraylist.add(Html.fromHtml(((LocationSearchResult)locationsearch.get(i)).getFullNameWithMarkup()));
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean checkGL20Support(Context context)
    {
        return ((ActivityManager)context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 0x20000;
    }

    public static boolean containsOnlyNumbers(String s)
    {
        if (s != null && s.length() != 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= s.length())
                {
                    break label1;
                }
                if (!Character.isDigit(s.charAt(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static int getDrawableId(String s)
    {
        int i;
        try
        {
            s = com/accuweather/android/R$drawable.getField(s);
            i = s.getInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return 0;
        }
        return i;
    }

    public static String getFormattedValue(double d)
    {
        Object obj = (DecimalFormat)NumberFormat.getNumberInstance(mLocale);
        ((DecimalFormat) (obj)).applyPattern("###,###.##");
        String s = ((DecimalFormat) (obj)).format(d);
        obj = s;
        if (s.equals("0"))
        {
            obj = s;
            if (mLocale.equals(Locale.US))
            {
                obj = "0.0";
            }
        }
        return ((String) (obj));
    }

    public static Drawable getImageDrawable(String s, Context context)
    {
        Resources resources = context.getResources();
        int i = resources.getIdentifier(s, "drawable", context.getPackageName());
        if (i != 0)
        {
            return resources.getDrawable(i);
        } else
        {
            return null;
        }
    }

    public static String getOutputFilePath(Context context, String s)
        throws IOException
    {
        return (new FileCache(context)).getFile(s).getAbsolutePath();
    }

    public static int getRawId(String s)
    {
        return getRawId(s, com/accuweather/android/R$raw);
    }

    public static int getRawId(String s, Class class1)
    {
        int i;
        try
        {
            s = class1.getField(s);
            i = s.getInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return 0;
        }
        return i;
    }

    public static int getResourceId(String s)
    {
        int i;
        try
        {
            s = com/accuweather/android/R$id.getField(s);
            i = s.getInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return 0;
        }
        return i;
    }

    public static String getUvCategory(String s, Context context)
    {
        if (!ConversionUtilities.isNumeric(s))
        {
            return s;
        }
        switch (Integer.parseInt(s))
        {
        default:
            return " ";

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            return context.getResources().getString(com.accuweather.android.R.string.Low);

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return context.getResources().getString(com.accuweather.android.R.string.Moderate);

        case 6: // '\006'
        case 7: // '\007'
            return context.getResources().getString(com.accuweather.android.R.string.High);

        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
            return context.getResources().getString(com.accuweather.android.R.string.VeryHigh);

        case 11: // '\013'
            return context.getResources().getString(com.accuweather.android.R.string.Extreme);
        }
    }

    private static boolean isAirplaneModeOn(Context context)
    {
        boolean flag = false;
        if (android.provider.Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0)
        {
            flag = true;
        }
        return flag;
    }

    public static boolean isAndroidLite()
    {
        return false;
    }

    public static boolean isConnected(Context context)
    {
        return isOnline(context) && !isAirplaneModeOn(context);
    }

    public static boolean isFroyoOrEarlier()
    {
        return android.os.Build.VERSION.SDK_INT <= 8;
    }

    public static boolean isGingerbreadOrEarlier()
    {
        return android.os.Build.VERSION.SDK_INT <= 10;
    }

    public static boolean isHoneycombOrGreater()
    {
        return android.os.Build.VERSION.SDK_INT > 10;
    }

    public static boolean isIceCreamSandwich()
    {
        return android.os.Build.VERSION.SDK_INT == 14 || android.os.Build.VERSION.SDK_INT == 15;
    }

    public static boolean isIcsOrGreater()
    {
        return android.os.Build.VERSION.SDK_INT >= 14;
    }

    public static boolean isJellybeanOrGreater()
    {
        return android.os.Build.VERSION.SDK_INT > 15;
    }

    public static boolean isKindleDevice(Context context)
    {
        context = Build.MODEL;
        for (int i = 0; i < Constants.KINDLE_DEVICES.size(); i++)
        {
            if (((String)Constants.KINDLE_DEVICES.get(i)).equals(context))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean isLandscape(Context context)
    {
        int i = context.getApplicationContext().getResources().getConfiguration().orientation;
        return i == 2 || i == 0;
    }

    public static boolean isLdpi(Context context)
    {
        return context.getResources().getDisplayMetrics().densityDpi == 120;
    }

    private static boolean isOnline(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context == null)
        {
            return false;
        } else
        {
            return context.isConnected();
        }
    }

    public static boolean isScreenSizeLargeOrGreater(Context context)
    {
        int i = context.getApplicationContext().getResources().getConfiguration().screenLayout;
        return ((i & 3) == 3 || (i & 4) == 4) && !shouldTabletBeTreatedAsPhone();
    }

    public static boolean isScreenSizeSmall(Context context)
    {
        return (context.getApplicationContext().getResources().getConfiguration().screenLayout & 0xf) == 1;
    }

    public static boolean isStartingFromWidget(Intent intent)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (intent != null)
        {
            flag = flag1;
            if (!TextUtils.isEmpty(intent.getStringExtra("location_code")))
            {
                flag = true;
            }
        }
        return flag;
    }

    public static void notifyResetGAWidgetAlarmService(Context context)
    {
        Intent intent = new Intent();
        intent.setAction("com.accuweather.android.widget.ga.reset");
        context.sendBroadcast(intent);
    }

    public static void setTextColor(Object obj, int i)
    {
        if (!(obj instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        obj = (ViewGroup)obj;
        int k = ((ViewGroup) (obj)).getChildCount();
        for (int j = 0; j < k; j++)
        {
            setTextColor(((ViewGroup) (obj)).getChildAt(j), i);
        }

          goto _L3
_L2:
        if (!(obj instanceof View)) goto _L3; else goto _L4
_L4:
        Method method = null;
        Method method1 = obj.getClass().getMethod("setTextColor", new Class[] {
            Integer.TYPE
        });
        method = method1;
_L7:
        if (method == null) goto _L3; else goto _L5
_L5:
        method.invoke(obj, new Object[] {
            Integer.valueOf(i)
        });
_L3:
        return;
        obj;
        return;
        obj;
        return;
        obj;
        return;
        Object obj1;
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static void setTypeFace(Object obj, Typeface typeface)
    {
        if (!(obj instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        obj = (ViewGroup)obj;
        int j = ((ViewGroup) (obj)).getChildCount();
        for (int i = 0; i < j; i++)
        {
            setTypeFace(((ViewGroup) (obj)).getChildAt(i), typeface);
        }

          goto _L3
_L2:
        if (!(obj instanceof View)) goto _L3; else goto _L4
_L4:
        Method method = null;
        Method method1 = obj.getClass().getMethod("setTypeface", new Class[] {
            android/graphics/Typeface
        });
        method = method1;
_L7:
        if (method == null) goto _L3; else goto _L5
_L5:
        method.invoke(obj, new Object[] {
            typeface
        });
_L3:
        return;
        obj;
        return;
        obj;
        return;
        obj;
        return;
        Object obj1;
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static boolean shouldDmaBeExcluded(String s, String s1)
    {
        if (DmaExclusions.getExclusionList(s) == null)
        {
            return false;
        } else
        {
            return DmaExclusions.getExclusionList(s).contains(s1);
        }
    }

    public static boolean shouldNotShowBlueLinks(Context context)
    {
        context = Build.MODEL;
        Log.i("xyz", String.valueOf(Constants.KINDLE_DEVICES.size()));
        for (int i = 0; i < Constants.KINDLE_DEVICES.size(); i++)
        {
            if (((String)Constants.KINDLE_DEVICES.get(i)).equals(context))
            {
                return false;
            }
        }

        return true;
    }

    public static boolean shouldShowGpsButton(Context context)
    {
        String s = PartnerCoding.getPartnerCodeFromSharedPreferences(context);
        if (!Constants.NO_GPS_ALLOWED_PARTNERS.contains(s))
        {
            if ((context = context.getPackageManager()).hasSystemFeature("android.hardware.location.gps") || context.hasSystemFeature("android.hardware.location.network"))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean shouldShowPush(Context context)
    {
        String s = Build.MODEL;
        context = PartnerCoding.getPartnerCodeFromSharedPreferences(context);
        for (int i = 0; i < Constants.NON_PUSH_MODELS.size(); i++)
        {
            if (((String)Constants.NON_PUSH_MODELS.get(i)).equals(s))
            {
                return false;
            }
        }

        for (int j = 0; j < Constants.NON_PUSH_PARTNERS.size(); j++)
        {
            if (((String)Constants.NON_PUSH_PARTNERS.get(j)).equals(context))
            {
                return false;
            }
        }

        return true;
    }

    public static boolean shouldTabletBeTreatedAsPhone()
    {
        return Build.MODEL.equals(Constants.DeviceModel.BN.NOOK_COLOR.model());
    }

}
