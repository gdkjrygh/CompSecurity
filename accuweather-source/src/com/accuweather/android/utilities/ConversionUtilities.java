// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.accuweather.android.enums.ForecastModelType;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

// Referenced classes of package com.accuweather.android.utilities:
//            PreferenceUtils

public class ConversionUtilities
{

    public static final int CELCIUS = 1;
    public static final int FAHRENHEIT = 0;
    public static final int IMPERIAL = 0;
    public static final int IN = 0;
    public static final int KM = 1;
    public static final int KNOT = 2;
    public static final int KPA = 1;
    public static final int KPH = 1;
    public static final int MB = 2;
    public static final int METRIC = 1;
    public static final int MI = 0;
    public static final int MPH = 0;
    public static final int MPS = 3;
    private static Locale mLocale = Locale.getDefault();

    public ConversionUtilities()
    {
    }

    private static String cardinalToDegree(String s, Context context)
    {
        if (s.equals(context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.N)))
        {
            return "0";
        }
        if (s.equals(context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.NNE)))
        {
            return "22.5";
        }
        if (s.equals(context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.NE)))
        {
            return "45";
        }
        if (s.equals(context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.ENE)))
        {
            return "67.5";
        }
        if (s.equals(context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.E)))
        {
            return "90";
        }
        if (s.equals(context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.ESE)))
        {
            return "112.5";
        }
        if (s.equals(context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.SE)))
        {
            return "135";
        }
        if (s.equals(context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.SSE)))
        {
            return "157.5";
        }
        if (s.equals(context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.S)))
        {
            return "180";
        }
        if (s.equals(context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.SSW)))
        {
            return "202.5";
        }
        if (s.equals(context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.SW)))
        {
            return "225";
        }
        if (s.equals(context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.WSW)))
        {
            return "247.5";
        }
        if (s.equals(context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.W)))
        {
            return "270";
        }
        if (s.equals(context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.WNW)))
        {
            return "292.5";
        }
        if (s.equals(context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.NW)))
        {
            return "315";
        }
        if (s.equals(context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.NNW)))
        {
            return "337.5";
        } else
        {
            return "";
        }
    }

    public static boolean checkForZero(String s)
    {
        return s.equals("0") || s.equals("0.0") || s.equals("0.00") || s.equals(".0") || s.equals(".00");
    }

    public static double convertCelciusToFahrenheit(double d)
    {
        return (9D * d) / 5D + 32D;
    }

    public static double convertFahrenheitToCelcius(double d)
    {
        return ((d - 32D) * 5D) / 9D;
    }

    public static String convertFromInToCm(String s)
    {
        return getFormattedMultipiedValue(s, 2.54D);
    }

    public static String convertFromInToKpa(String s)
    {
        return getFormattedMultipiedValue(s, 3.3863886666699998D);
    }

    public static String convertFromInToMb(String s)
    {
        return getFormattedMultipiedValue(s, 33.863752599999998D);
    }

    public static String convertFromInToMm(String s)
    {
        return getFormattedMultipiedValue(s, 25.399999999999999D);
    }

    public static String convertFromKmToMi(String s)
    {
        return getFormattedMultipiedValue(s, 0.621D);
    }

    public static String convertFromKnotsToMph(String s)
    {
        return getFormattedMultipiedValue(s, 1.1507799999999999D);
    }

    public static String convertFromKphToKnots(String s)
    {
        return getFormattedMultipiedValue(s, 0.53995700000000002D);
    }

    public static String convertFromKphToMph(String s)
    {
        return getFormattedMultipiedValue(s, 0.621D);
    }

    public static String convertFromKphToMps(String s)
    {
        return getFormattedMultipiedValue(s, 0.27777800000000002D);
    }

    public static String convertFromMbToIn(String s)
    {
        return getFormattedMultipiedValue(s, 0.029999999999999999D);
    }

    public static String convertFromMbToKpa(String s)
    {
        return getFormattedMultipiedValue(s, 0.10000000000000001D);
    }

    public static String convertFromMiToKm(String s)
    {
        return getFormattedMultipiedValue(s, 1.609D);
    }

    public static String convertFromMphToKnots(String s)
    {
        return getFormattedMultipiedValue(s, 0.86897599999999997D);
    }

    public static String convertFromMphToKph(String s)
    {
        return getFormattedMultipiedValue(s, 1.609D);
    }

    public static String convertFromMphToMps(String s)
    {
        return getFormattedMultipiedValue(s, 0.44703999999999999D);
    }

    public static String convertFromMpsToMph(String s)
    {
        return getFormattedMultipiedValue(s, 2.2368999999999999D);
    }

    public static String convertPressure(String s, int i, Context context, int j)
    {
        String s1;
        if (TextUtils.isEmpty(s))
        {
            return context.getString(com.accuweather.android.R.string.NA);
        }
        s1 = s.substring(0);
        if (i != 1) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch 0 1: default 52
    //                   0 165
    //                   1 187;
           goto _L3 _L4 _L5
_L3:
        s = s1;
        if (checkForZero(s1))
        {
            s = "0";
        }
        context = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.MB);
_L6:
        if (!mLocale.equals(Locale.ENGLISH) && !mLocale.equals(Locale.US))
        {
            if (s.split(",").length > 1)
            {
                s = s.replace(",", ".");
                long l;
                try
                {
                    l = Math.round(Double.parseDouble(s));
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return "";
                }
                i = (int)l;
                return (new StringBuilder()).append(i).append(" ").append(context.toLowerCase()).toString();
            } else
            {
                return (new StringBuilder()).append(s).append(" ").append(context.toLowerCase()).toString();
            }
        } else
        {
            return (new StringBuilder()).append(s).append(" ").append(context.toLowerCase()).toString();
        }
_L4:
        s = convertFromMbToIn(s);
        context = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.IN);
          goto _L6
_L5:
        s = convertFromMbToKpa(s);
        context = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.KPA);
          goto _L6
_L2:
        switch (j)
        {
        default:
            s = s1;
            if (checkForZero(s1))
            {
                s = "0";
            }
            context = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.IN);
            break;

        case 1: // '\001'
            s = convertFromInToKpa(s);
            context = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.KPA);
            break;

        case 2: // '\002'
            s = convertFromInToMb(s);
            context = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.MB);
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public static String convertRain(String s, int i, Context context, int j)
    {
        if (i == 1)
        {
            if (j == 0)
            {
                String s1;
                if (checkForZero(s))
                {
                    s = getFormattedValue(0.0D);
                } else
                {
                    s = getFormattedValue(Double.parseDouble(Double.toString(0.039D * Double.parseDouble(s))));
                }
                s1 = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.IN);
                context = s;
                s = s1;
            } else
            {
                String s2;
                if (checkForZero(s))
                {
                    s2 = getFormattedValue(0.0D);
                } else
                {
                    s2 = getFormattedValue(Double.parseDouble(s));
                }
                s = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.MM);
                context = s2;
            }
        } else
        if (j == 1)
        {
            String s3;
            if (checkForZero(s))
            {
                s3 = getFormattedValue(0.0D);
            } else
            {
                s3 = getFormattedValue(Double.parseDouble(Double.toString(25.399999999999999D * Double.parseDouble(s))));
            }
            s = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.MM);
            context = s3;
        } else
        {
            String s4;
            if (checkForZero(s))
            {
                s4 = getFormattedValue(0.0D);
            } else
            {
                s4 = getFormattedValue(Double.parseDouble(s));
            }
            s = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.IN);
            context = s4;
        }
        return (new StringBuilder()).append(context).append(" ").append(s.toLowerCase()).toString();
    }

    public static String convertSnow(String s, int i, Context context, int j, ForecastModelType forecastmodeltype)
    {
        if (i == 1)
        {
            if (j == 0)
            {
                if (checkForZero(s))
                {
                    forecastmodeltype = getFormattedValue(0.0D);
                } else
                {
                    if (forecastmodeltype.equals(ForecastModelType.HOURLY_MODEL))
                    {
                        s = Double.toString(0.039699999999999999D * Double.parseDouble(s));
                    } else
                    {
                        s = Double.toString(0.39700000000000002D * Double.parseDouble(s));
                    }
                    forecastmodeltype = getFormattedValue(Double.parseDouble(s));
                }
                s = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.IN);
            } else
            {
                if (checkForZero(s))
                {
                    forecastmodeltype = getFormattedValue(0.0D);
                } else
                if (forecastmodeltype.equals(ForecastModelType.HOURLY_MODEL))
                {
                    forecastmodeltype = getFormattedValue(Double.parseDouble(s) / 10D);
                } else
                {
                    forecastmodeltype = getFormattedValue(Double.parseDouble(s));
                }
                s = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.cm);
            }
        } else
        if (j == 1)
        {
            if (checkForZero(s))
            {
                forecastmodeltype = getFormattedValue(0.0D);
            } else
            {
                forecastmodeltype = getFormattedValue(Double.parseDouble(Double.toString(2.54D * Double.parseDouble(s))));
            }
            s = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.cm);
        } else
        {
            if (checkForZero(s))
            {
                forecastmodeltype = getFormattedValue(0.0D);
            } else
            {
                forecastmodeltype = getFormattedValue(Double.parseDouble(s));
            }
            s = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.IN);
        }
        return (new StringBuilder()).append(forecastmodeltype).append(" ").append(s.toLowerCase()).toString();
    }

    public static String convertSpeed(String s, int i, Context context, int j)
    {
        String s1;
        if (TextUtils.isEmpty(s))
        {
            return context.getString(com.accuweather.android.R.string.NA);
        }
        s1 = s.substring(0);
        if (i != 1) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 149
    //                   1 60
    //                   2 171
    //                   3 193;
           goto _L3 _L4 _L3 _L5 _L6
_L3:
        s = s1;
        if (checkForZero(s1))
        {
            s = "0";
        }
        context = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.km_h_Abbr4);
_L7:
        if (s.split(",").length > 1)
        {
            s = s.replace(",", ".");
            long l;
            try
            {
                l = Math.round(Double.parseDouble(s));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return "";
            }
            i = (int)l;
            return (new StringBuilder()).append(i).append(" ").append(context.toLowerCase()).toString();
        }
        break MISSING_BLOCK_LABEL_348;
_L4:
        s = convertFromKphToMph(s);
        context = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.MPH);
          goto _L7
_L5:
        s = convertFromKphToKnots(s);
        context = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.kn);
          goto _L7
_L6:
        s = convertFromKphToMps(s);
        context = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.MPerS);
          goto _L7
_L2:
        switch (j)
        {
        default:
            s = s1;
            if (checkForZero(s1))
            {
                s = "0";
            }
            context = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.MPH);
            break;

        case 1: // '\001'
            s = convertFromMphToKph(s);
            context = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.km_h_Abbr4);
            break;

        case 2: // '\002'
            s = convertFromMphToKnots(s);
            context = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.kn);
            break;

        case 3: // '\003'
            convertFromMphToMps(s);
            context = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.MPerS);
            s = s1;
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
        long l1;
        try
        {
            l1 = Math.round(Double.parseDouble(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        i = (int)l1;
        return (new StringBuilder()).append(i).append(" ").append(context.toLowerCase()).toString();
    }

    public static double convertTemperature(double d, int i, int j)
    {
        switch (i)
        {
        default:
            switch (j)
            {
            default:
                return d;

            case 1: // '\001'
                return convertFahrenheitToCelcius(d);
            }

        case 1: // '\001'
            switch (j)
            {
            default:
                return d;

            case 0: // '\0'
                return convertCelciusToFahrenheit(d);
            }
        }
    }

    public static String convertVisibility(String s, int i, Context context, int j)
    {
        String s1 = s.substring(0);
        if (i != 1) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch 0 0: default 32
    //                   0 106;
           goto _L3 _L4
_L3:
        if (!checkForZero(s1));
        context = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.KM);
_L6:
        if (s.split(",").length > 1)
        {
            i = (int)Math.round(Double.parseDouble(s.replace(",", ".")));
            return (new StringBuilder()).append(i).append(" ").append(context).toString();
        }
        break; /* Loop/switch isn't completed */
_L4:
        convertFromKmToMi(s);
        context = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.mi);
        if (true) goto _L6; else goto _L5
_L2:
        switch (j)
        {
        default:
            if (!checkForZero(s1));
            context = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.mi);
            break;

        case 1: // '\001'
            convertFromKmToMi(s);
            context = context.getApplicationContext().getResources().getString(com.accuweather.android.R.string.KM);
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
_L5:
        long l;
        try
        {
            l = Math.round(Double.parseDouble(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        i = (int)l;
        return (new StringBuilder()).append(i).append(" ").append(context).toString();
    }

    public static String convertWindDirection(String s, Context context, int i)
    {
        String s1;
        boolean flag;
        s1 = null;
        flag = isNumeric(s);
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        s1 = degreeToCardinal(s, context);
_L6:
        return s1;
_L4:
        return getStringResourceByName(s, context);
_L2:
        if (i == 1)
        {
            if (flag)
            {
                return (new StringBuilder()).append(s).append("\260").toString();
            } else
            {
                return (new StringBuilder()).append(cardinalToDegree(s, context)).append("\260").toString();
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static String degreeToCardinal(String s, Context context)
    {
        float f = Float.parseFloat(s);
        if (f >= 0.0F && f < 22.5F)
        {
            return context.getString(com.accuweather.android.R.string.N);
        }
        if (f >= 22.5F && f < 45F)
        {
            return context.getString(com.accuweather.android.R.string.NNE);
        }
        if ((double)f >= 45D && f < 67.5F)
        {
            return context.getString(com.accuweather.android.R.string.NE);
        }
        if (f >= 67.5F && f < 90F)
        {
            return context.getString(com.accuweather.android.R.string.ENE);
        }
        if (f >= 90F && f < 112.5F)
        {
            return context.getString(com.accuweather.android.R.string.E);
        }
        if (f >= 112.5F && f < 135F)
        {
            return context.getString(com.accuweather.android.R.string.ESE);
        }
        if (f >= 135F && f < 157.5F)
        {
            return context.getString(com.accuweather.android.R.string.SE);
        }
        if (f >= 157.5F && f < 180F)
        {
            return context.getString(com.accuweather.android.R.string.SSE);
        }
        if (f >= 180F && f < 202.5F)
        {
            return context.getString(com.accuweather.android.R.string.S);
        }
        if (f >= 202.5F && f < 225F)
        {
            return context.getString(com.accuweather.android.R.string.SSW);
        }
        if (f >= 225F && f < 247.5F)
        {
            return context.getString(com.accuweather.android.R.string.SW);
        }
        if (f >= 247.5F && f < 270F)
        {
            return context.getString(com.accuweather.android.R.string.WSW);
        }
        if (f >= 270F && f < 292.5F)
        {
            return context.getString(com.accuweather.android.R.string.W);
        }
        if (f >= 292.5F && f < 315F)
        {
            return context.getString(com.accuweather.android.R.string.WNW);
        }
        if (f >= 315F && f < 337.5F)
        {
            return context.getString(com.accuweather.android.R.string.NW);
        }
        if (f >= 337.5F && f < 360F)
        {
            return context.getString(com.accuweather.android.R.string.NNW);
        } else
        {
            return "";
        }
    }

    private static String getFormattedMultipiedValue(String s, double d)
    {
label0:
        {
            String s1 = s;
            if (s != null)
            {
                s1 = s;
                if (!TextUtils.isEmpty(s))
                {
                    if (checkForZero(s))
                    {
                        break label0;
                    }
                    s = Double.toString(Double.parseDouble(s) * d);
                    s1 = s;
                    if (s.length() > 4)
                    {
                        s1 = getFormattedValue(Double.parseDouble(s));
                    }
                }
            }
            return s1;
        }
        return "0";
    }

    public static String getFormattedValue(double d)
    {
        Object obj;
label0:
        {
            obj = (DecimalFormat)NumberFormat.getNumberInstance(mLocale);
            ((DecimalFormat) (obj)).applyPattern("###,###.##");
            String s = ((DecimalFormat) (obj)).format(d);
            obj = s;
            if (!s.equals("0"))
            {
                break label0;
            }
            if (!mLocale.equals(Locale.US))
            {
                obj = s;
                if (!mLocale.equals(Locale.ENGLISH))
                {
                    break label0;
                }
            }
            obj = "0.0";
        }
        return ((String) (obj));
    }

    private static String getStringResourceByName(String s, Context context)
    {
        int i = context.getResources().getIdentifier(s, "string", context.getPackageName());
        try
        {
            context = context.getString(i);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return s;
        }
        return context;
    }

    public static boolean isNumeric(String s)
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

    public static boolean isTwelveHourFormat(Context context)
    {
        return PreferenceUtils.get(context, "pref_time", context.getString(com.accuweather.android.R.string.default_metric)).equals("0");
    }

    public static double toTwoDecimals(double d)
    {
        return (new BigDecimal(d)).setScale(2, 3).doubleValue();
    }

    public static String toTwoDecimalsForDisplay(double d)
    {
        DecimalFormatSymbols decimalformatsymbols = new DecimalFormatSymbols(Locale.getDefault());
        decimalformatsymbols.setDecimalSeparator('.');
        return (new DecimalFormat("#.##", decimalformatsymbols)).format(d);
    }

}
