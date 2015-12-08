// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.globalization;

import android.text.format.DateFormat;
import android.text.format.Time;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova.globalization:
//            GlobalizationError

public class Globalization extends CordovaPlugin
{

    public static final String CURRENCY = "currency";
    public static final String CURRENCYCODE = "currencyCode";
    public static final String DATE = "date";
    public static final String DATESTRING = "dateString";
    public static final String DATETOSTRING = "dateToString";
    public static final String DAYS = "days";
    public static final String FORMATLENGTH = "formatLength";
    public static final String FULL = "full";
    public static final String GETCURRENCYPATTERN = "getCurrencyPattern";
    public static final String GETDATENAMES = "getDateNames";
    public static final String GETDATEPATTERN = "getDatePattern";
    public static final String GETFIRSTDAYOFWEEK = "getFirstDayOfWeek";
    public static final String GETLOCALENAME = "getLocaleName";
    public static final String GETNUMBERPATTERN = "getNumberPattern";
    public static final String GETPREFERREDLANGUAGE = "getPreferredLanguage";
    public static final String ISDAYLIGHTSAVINGSTIME = "isDayLightSavingsTime";
    public static final String ITEM = "item";
    public static final String LONG = "long";
    public static final String MEDIUM = "medium";
    public static final String MONTHS = "months";
    public static final String NARROW = "narrow";
    public static final String NUMBER = "number";
    public static final String NUMBERSTRING = "numberString";
    public static final String NUMBERTOSTRING = "numberToString";
    public static final String OPTIONS = "options";
    public static final String PERCENT = "percent";
    public static final String SELECTOR = "selector";
    public static final String STRINGTODATE = "stringToDate";
    public static final String STRINGTONUMBER = "stringToNumber";
    public static final String TIME = "time";
    public static final String TYPE = "type";
    public static final String WIDE = "wide";

    public Globalization()
    {
    }

    private JSONObject getCurrencyPattern(JSONArray jsonarray)
        throws GlobalizationError
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            Object obj = jsonarray.getJSONObject(0).getString("currencyCode");
            jsonarray = (DecimalFormat)DecimalFormat.getCurrencyInstance(Locale.getDefault());
            obj = Currency.getInstance(((String) (obj)));
            jsonarray.setCurrency(((Currency) (obj)));
            jsonobject.put("pattern", jsonarray.toPattern());
            jsonobject.put("code", ((Currency) (obj)).getCurrencyCode());
            jsonobject.put("fraction", jsonarray.getMinimumFractionDigits());
            jsonobject.put("rounding", Integer.valueOf(0));
            jsonobject.put("decimal", String.valueOf(jsonarray.getDecimalFormatSymbols().getDecimalSeparator()));
            jsonobject.put("grouping", String.valueOf(jsonarray.getDecimalFormatSymbols().getGroupingSeparator()));
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            throw new GlobalizationError("FORMATTING_ERROR");
        }
        return jsonobject;
    }

    private JSONObject getDateNames(final JSONArray namesMap)
        throws GlobalizationError
    {
        JSONObject jsonobject;
        JSONArray jsonarray;
        ArrayList arraylist;
        int j;
        int k;
        boolean flag;
        boolean flag1;
        jsonobject = new JSONObject();
        jsonarray = new JSONArray();
        arraylist = new ArrayList();
        k = 0;
        flag1 = false;
        flag = false;
        j = ((flag) ? 1 : 0);
        if (namesMap.getJSONObject(0).length() <= 0)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        int i = ((flag1) ? 1 : 0);
        if (((JSONObject)namesMap.getJSONObject(0).get("options")).isNull("type"))
        {
            break MISSING_BLOCK_LABEL_112;
        }
        i = ((flag1) ? 1 : 0);
        if (((String)((JSONObject)namesMap.getJSONObject(0).get("options")).get("type")).equalsIgnoreCase("narrow"))
        {
            i = 0 + 1;
        }
        j = ((flag) ? 1 : 0);
        k = i;
        if (((JSONObject)namesMap.getJSONObject(0).get("options")).isNull("item"))
        {
            break MISSING_BLOCK_LABEL_188;
        }
        j = ((flag) ? 1 : 0);
        k = i;
        if (((String)((JSONObject)namesMap.getJSONObject(0).get("options")).get("item")).equalsIgnoreCase("days"))
        {
            j = 0 + 10;
            k = i;
        }
        i = j + k;
        if (i != 1) goto _L2; else goto _L1
_L1:
        namesMap = Calendar.getInstance().getDisplayNames(2, 1, Locale.getDefault());
_L3:
        for (Iterator iterator = namesMap.keySet().iterator(); iterator.hasNext(); arraylist.add((String)iterator.next())) { }
        break MISSING_BLOCK_LABEL_330;
_L2:
label0:
        {
            if (i != 10)
            {
                break label0;
            }
            try
            {
                namesMap = Calendar.getInstance().getDisplayNames(7, 2, Locale.getDefault());
            }
            // Misplaced declaration of an exception variable
            catch (final JSONArray namesMap)
            {
                throw new GlobalizationError("UNKNOWN_ERROR");
            }
        }
          goto _L3
        if (i != 11)
        {
            break MISSING_BLOCK_LABEL_315;
        }
        namesMap = Calendar.getInstance().getDisplayNames(7, 1, Locale.getDefault());
          goto _L3
        namesMap = Calendar.getInstance().getDisplayNames(2, 2, Locale.getDefault());
          goto _L3
        Collections.sort(arraylist, new Comparator() {

            final Globalization this$0;
            final Map val$namesMap;

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((String)obj, (String)obj1);
            }

            public int compare(String s, String s1)
            {
                return ((Integer)namesMap.get(s)).compareTo((Integer)namesMap.get(s1));
            }

            
            {
                this$0 = Globalization.this;
                namesMap = map;
                super();
            }
        });
        i = 0;
_L5:
        if (i >= arraylist.size())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonarray.put(arraylist.get(i));
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        namesMap = jsonobject.put("value", jsonarray);
        return namesMap;
    }

    private JSONObject getDatePattern(JSONArray jsonarray)
        throws GlobalizationError
    {
        JSONObject jsonobject = new JSONObject();
        Object obj;
        Object obj1;
        SimpleDateFormat simpledateformat;
        obj1 = (SimpleDateFormat)DateFormat.getDateFormat(cordova.getActivity());
        simpledateformat = (SimpleDateFormat)DateFormat.getTimeFormat(cordova.getActivity());
        obj = (new StringBuilder()).append(((SimpleDateFormat) (obj1)).toLocalizedPattern()).append(" ").append(simpledateformat.toLocalizedPattern()).toString();
        if (!jsonarray.getJSONObject(0).has("options")) goto _L2; else goto _L1
_L1:
        Object obj2 = jsonarray.getJSONObject(0).getJSONObject("options");
        jsonarray = ((JSONArray) (obj1));
        if (((JSONObject) (obj2)).isNull("formatLength")) goto _L4; else goto _L3
_L3:
        obj = ((JSONObject) (obj2)).getString("formatLength");
        if (!((String) (obj)).equalsIgnoreCase("medium")) goto _L6; else goto _L5
_L5:
        jsonarray = (SimpleDateFormat)DateFormat.getMediumDateFormat(cordova.getActivity());
_L4:
        obj1 = (new StringBuilder()).append(jsonarray.toLocalizedPattern()).append(" ").append(simpledateformat.toLocalizedPattern()).toString();
        obj = obj1;
        if (((JSONObject) (obj2)).isNull("selector")) goto _L2; else goto _L7
_L7:
        obj2 = ((JSONObject) (obj2)).getString("selector");
        if (!((String) (obj2)).equalsIgnoreCase("date")) goto _L9; else goto _L8
_L8:
        obj = jsonarray.toLocalizedPattern();
_L2:
        jsonarray = TimeZone.getTimeZone(Time.getCurrentTimezone());
        jsonobject.put("pattern", obj);
        jsonobject.put("timezone", jsonarray.getDisplayName(jsonarray.inDaylightTime(Calendar.getInstance().getTime()), 0));
        jsonobject.put("utc_offset", jsonarray.getRawOffset() / 1000);
        jsonobject.put("dst_offset", jsonarray.getDSTSavings() / 1000);
        return jsonobject;
_L6:
        if (((String) (obj)).equalsIgnoreCase("long")) goto _L11; else goto _L10
_L10:
        jsonarray = ((JSONArray) (obj1));
        if (!((String) (obj)).equalsIgnoreCase("full")) goto _L4; else goto _L11
_L11:
        jsonarray = (SimpleDateFormat)DateFormat.getLongDateFormat(cordova.getActivity());
          goto _L4
_L9:
        obj = obj1;
        if (!((String) (obj2)).equalsIgnoreCase("time")) goto _L2; else goto _L12
_L12:
        obj = simpledateformat.toLocalizedPattern();
          goto _L2
        jsonarray;
        throw new GlobalizationError("PATTERN_ERROR");
          goto _L4
    }

    private JSONObject getDateToString(JSONArray jsonarray)
        throws GlobalizationError
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            Date date = new Date(((Long)jsonarray.getJSONObject(0).get("date")).longValue());
            jsonarray = jsonobject.put("value", (new SimpleDateFormat(getDatePattern(jsonarray).getString("pattern"))).format(date));
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            throw new GlobalizationError("FORMATTING_ERROR");
        }
        return jsonarray;
    }

    private JSONObject getFirstDayOfWeek(JSONArray jsonarray)
        throws GlobalizationError
    {
        jsonarray = new JSONObject();
        try
        {
            jsonarray = jsonarray.put("value", Calendar.getInstance(Locale.getDefault()).getFirstDayOfWeek());
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            throw new GlobalizationError("UNKNOWN_ERROR");
        }
        return jsonarray;
    }

    private JSONObject getIsDayLightSavingsTime(JSONArray jsonarray)
        throws GlobalizationError
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonarray = new Date(((Long)jsonarray.getJSONObject(0).get("date")).longValue());
            jsonarray = jsonobject.put("dst", TimeZone.getTimeZone(Time.getCurrentTimezone()).inDaylightTime(jsonarray));
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            throw new GlobalizationError("UNKNOWN_ERROR");
        }
        return jsonarray;
    }

    private JSONObject getLocaleName()
        throws GlobalizationError
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("value", toBcp47Language(Locale.getDefault()));
        }
        catch (Exception exception)
        {
            throw new GlobalizationError("UNKNOWN_ERROR");
        }
        return jsonobject;
    }

    private DecimalFormat getNumberFormatInstance(JSONArray jsonarray)
        throws JSONException
    {
        DecimalFormat decimalformat = (DecimalFormat)DecimalFormat.getInstance(Locale.getDefault());
        if (jsonarray.getJSONObject(0).length() <= 1 || ((JSONObject)jsonarray.getJSONObject(0).get("options")).isNull("type"))
        {
            break MISSING_BLOCK_LABEL_106;
        }
        jsonarray = (String)((JSONObject)jsonarray.getJSONObject(0).get("options")).get("type");
        if (jsonarray.equalsIgnoreCase("currency"))
        {
            return (DecimalFormat)DecimalFormat.getCurrencyInstance(Locale.getDefault());
        }
        if (!jsonarray.equalsIgnoreCase("percent"))
        {
            break MISSING_BLOCK_LABEL_106;
        }
        jsonarray = (DecimalFormat)DecimalFormat.getPercentInstance(Locale.getDefault());
        return jsonarray;
        jsonarray;
        return decimalformat;
    }

    private JSONObject getNumberPattern(JSONArray jsonarray)
        throws GlobalizationError
    {
        JSONObject jsonobject = new JSONObject();
        char c;
        DecimalFormat decimalformat;
        String s;
        DecimalFormat decimalformat1;
        String s1;
        try
        {
            decimalformat1 = (DecimalFormat)DecimalFormat.getInstance(Locale.getDefault());
            s1 = String.valueOf(decimalformat1.getDecimalFormatSymbols().getDecimalSeparator());
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            throw new GlobalizationError("PATTERN_ERROR");
        }
        decimalformat = decimalformat1;
        s = s1;
        if (jsonarray.getJSONObject(0).length() <= 0) goto _L2; else goto _L1
_L1:
        decimalformat = decimalformat1;
        s = s1;
        if (((JSONObject)jsonarray.getJSONObject(0).get("options")).isNull("type")) goto _L2; else goto _L3
_L3:
        jsonarray = (String)((JSONObject)jsonarray.getJSONObject(0).get("options")).get("type");
        if (!jsonarray.equalsIgnoreCase("currency")) goto _L5; else goto _L4
_L4:
        decimalformat = (DecimalFormat)DecimalFormat.getCurrencyInstance(Locale.getDefault());
        s = decimalformat.getDecimalFormatSymbols().getCurrencySymbol();
_L2:
        jsonobject.put("pattern", decimalformat.toPattern());
        jsonobject.put("symbol", s);
        jsonobject.put("fraction", decimalformat.getMinimumFractionDigits());
        jsonobject.put("rounding", Integer.valueOf(0));
        jsonobject.put("positive", decimalformat.getPositivePrefix());
        jsonobject.put("negative", decimalformat.getNegativePrefix());
        jsonobject.put("decimal", String.valueOf(decimalformat.getDecimalFormatSymbols().getDecimalSeparator()));
        jsonobject.put("grouping", String.valueOf(decimalformat.getDecimalFormatSymbols().getGroupingSeparator()));
        return jsonobject;
_L5:
        decimalformat = decimalformat1;
        s = s1;
        if (!jsonarray.equalsIgnoreCase("percent")) goto _L2; else goto _L6
_L6:
        decimalformat = (DecimalFormat)DecimalFormat.getPercentInstance(Locale.getDefault());
        c = decimalformat.getDecimalFormatSymbols().getPercent();
        s = String.valueOf(c);
          goto _L2
    }

    private JSONObject getNumberToString(JSONArray jsonarray)
        throws GlobalizationError
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonarray = jsonobject.put("value", getNumberFormatInstance(jsonarray).format(jsonarray.getJSONObject(0).get("number")));
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            throw new GlobalizationError("FORMATTING_ERROR");
        }
        return jsonarray;
    }

    private JSONObject getPreferredLanguage()
        throws GlobalizationError
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("value", toBcp47Language(Locale.getDefault()));
        }
        catch (Exception exception)
        {
            throw new GlobalizationError("UNKNOWN_ERROR");
        }
        return jsonobject;
    }

    private JSONObject getStringToNumber(JSONArray jsonarray)
        throws GlobalizationError
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonarray = jsonobject.put("value", getNumberFormatInstance(jsonarray).parse((String)jsonarray.getJSONObject(0).get("numberString")));
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            throw new GlobalizationError("PARSING_ERROR");
        }
        return jsonarray;
    }

    private JSONObject getStringtoDate(JSONArray jsonarray)
        throws GlobalizationError
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonarray = (new SimpleDateFormat(getDatePattern(jsonarray).getString("pattern"))).parse(jsonarray.getJSONObject(0).get("dateString").toString());
            Time time = new Time();
            time.set(jsonarray.getTime());
            jsonobject.put("year", time.year);
            jsonobject.put("month", time.month);
            jsonobject.put("day", time.monthDay);
            jsonobject.put("hour", time.hour);
            jsonobject.put("minute", time.minute);
            jsonobject.put("second", time.second);
            jsonobject.put("millisecond", Long.valueOf(0L));
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            throw new GlobalizationError("PARSING_ERROR");
        }
        return jsonobject;
    }

    private String toBcp47Language(Locale locale)
    {
        Object obj;
        Object obj1;
        String s;
        String s1 = locale.getLanguage();
        String s2 = locale.getCountry();
        locale = locale.getVariant();
        s = s1;
        obj1 = s2;
        obj = locale;
        if (s1.equals("no"))
        {
            s = s1;
            obj1 = s2;
            obj = locale;
            if (s2.equals("NO"))
            {
                s = s1;
                obj1 = s2;
                obj = locale;
                if (locale.equals("NY"))
                {
                    s = "nn";
                    obj1 = "NO";
                    obj = "";
                }
            }
        }
        if (!s.isEmpty() && s.matches("\\p{Alpha}{2,8}")) goto _L2; else goto _L1
_L1:
        locale = "und";
_L4:
        s = ((String) (obj1));
        if (!((String) (obj1)).matches("\\p{Alpha}{2}|\\p{Digit}{3}"))
        {
            s = "";
        }
        obj1 = obj;
        if (!((String) (obj)).matches("\\p{Alnum}{5,8}|\\p{Digit}\\p{Alnum}{3}"))
        {
            obj1 = "";
        }
        locale = new StringBuilder(locale);
        if (!s.isEmpty())
        {
            locale.append('-').append(s);
        }
        if (!((String) (obj1)).isEmpty())
        {
            locale.append('-').append(((String) (obj1)));
        }
        return locale.toString();
_L2:
        if (s.equals("iw"))
        {
            locale = "he";
        } else
        if (s.equals("in"))
        {
            locale = "id";
        } else
        {
            locale = s;
            if (s.equals("ji"))
            {
                locale = "yi";
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
    {
        new JSONObject();
        if (!s.equals("getLocaleName")) goto _L2; else goto _L1
_L1:
        s = getLocaleName();
_L4:
        callbackcontext.success(s);
        break MISSING_BLOCK_LABEL_285;
_L2:
        if (s.equals("getPreferredLanguage"))
        {
            s = getPreferredLanguage();
            continue; /* Loop/switch isn't completed */
        }
        if (s.equalsIgnoreCase("dateToString"))
        {
            s = getDateToString(jsonarray);
            continue; /* Loop/switch isn't completed */
        }
        if (s.equalsIgnoreCase("stringToDate"))
        {
            s = getStringtoDate(jsonarray);
            continue; /* Loop/switch isn't completed */
        }
        if (s.equalsIgnoreCase("getDatePattern"))
        {
            s = getDatePattern(jsonarray);
            continue; /* Loop/switch isn't completed */
        }
        if (!s.equalsIgnoreCase("getDateNames"))
        {
            break MISSING_BLOCK_LABEL_160;
        }
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            throw new GlobalizationError("UNKNOWN_ERROR");
        }
        try
        {
            s = getDateNames(jsonarray);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, s.toJson()));
            break MISSING_BLOCK_LABEL_285;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.JSON_EXCEPTION));
        }
        break MISSING_BLOCK_LABEL_285;
        if (s.equalsIgnoreCase("isDayLightSavingsTime"))
        {
            s = getIsDayLightSavingsTime(jsonarray);
            continue; /* Loop/switch isn't completed */
        }
        if (s.equalsIgnoreCase("getFirstDayOfWeek"))
        {
            s = getFirstDayOfWeek(jsonarray);
            continue; /* Loop/switch isn't completed */
        }
        if (s.equalsIgnoreCase("numberToString"))
        {
            s = getNumberToString(jsonarray);
            continue; /* Loop/switch isn't completed */
        }
        if (s.equalsIgnoreCase("stringToNumber"))
        {
            s = getStringToNumber(jsonarray);
            continue; /* Loop/switch isn't completed */
        }
        if (s.equalsIgnoreCase("getNumberPattern"))
        {
            s = getNumberPattern(jsonarray);
            continue; /* Loop/switch isn't completed */
        }
        if (!s.equalsIgnoreCase("getCurrencyPattern"))
        {
            break; /* Loop/switch isn't completed */
        }
        s = getCurrencyPattern(jsonarray);
        if (true) goto _L4; else goto _L3
_L3:
        return false;
        return true;
    }
}
