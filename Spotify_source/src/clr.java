// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.images.WebImage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class clr
{

    private static final bpy a = new bpy("MetadataUtils", (byte)0);
    private static final String b[] = {
        "Z", "+hh", "+hhmm", "+hh:mm"
    };
    private static final String c = (new StringBuilder("yyyyMMdd'T'HHmmss")).append(b[0]).toString();

    public static Calendar a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            a.a("Input string is empty or null", new Object[0]);
            return null;
        }
        Object obj = b(s);
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            a.a("Invalid date format", new Object[0]);
            return null;
        }
        String s2 = c(s);
        s = "yyyyMMdd";
        String s1 = ((String) (obj));
        if (!TextUtils.isEmpty(s2))
        {
            s1 = (new StringBuilder()).append(((String) (obj))).append("T").append(s2).toString();
            if (s2.length() == 6)
            {
                s = "yyyyMMdd'T'HHmmss";
            } else
            {
                s = c;
            }
        }
        obj = GregorianCalendar.getInstance();
        try
        {
            s = (new SimpleDateFormat(s)).parse(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a.a("Error parsing string: %s", new Object[] {
                s.getMessage()
            });
            return null;
        }
        ((Calendar) (obj)).setTime(s);
        return ((Calendar) (obj));
    }

    public static void a(List list, JSONObject jsonobject)
    {
        JSONObject jsonobject1;
        int i;
        int j;
        try
        {
            list.clear();
            jsonobject = jsonobject.getJSONArray("images");
            j = jsonobject.length();
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject1 = jsonobject.getJSONObject(i);
        try
        {
            list.add(new WebImage(jsonobject1));
        }
        catch (IllegalArgumentException illegalargumentexception) { }
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void a(JSONObject jsonobject, List list)
    {
        JSONArray jsonarray;
        if (list == null || list.isEmpty())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        jsonarray = new JSONArray();
        for (list = list.iterator(); list.hasNext(); jsonarray.put(((WebImage)list.next()).a())) { }
        jsonobject.put("images", jsonarray);
        return;
        jsonobject;
    }

    private static String b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            a.a("Input string is empty or null", new Object[0]);
            return null;
        }
        try
        {
            s = s.substring(0, 8);
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            s = a;
            String s1 = indexoutofboundsexception.getMessage();
            Log.i(((bpy) (s)).a, s.c("Error extracting the date: %s", new Object[] {
                s1
            }));
            return null;
        }
        return s;
    }

    private static String c(String s)
    {
        boolean flag = false;
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        a.a("string is empty or null", new Object[0]);
_L4:
        return null;
_L2:
        int i = s.indexOf('T');
        if (i != 8)
        {
            a.a("T delimeter is not found", new Object[0]);
            return null;
        }
        try
        {
            s = s.substring(i + 1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a.a("Error extracting the time substring: %s", new Object[] {
                s.getMessage()
            });
            return null;
        }
        if (s.length() == 6)
        {
            return s;
        }
        switch (s.charAt(6))
        {
        default:
            return null;

        case 90: // 'Z'
            continue; /* Loop/switch isn't completed */

        case 43: // '+'
        case 45: // '-'
            int j = s.length();
            if (j == b[1].length() + 6 || j == b[2].length() + 6 || j == b[3].length() + 6)
            {
                flag = true;
            }
            if (flag)
            {
                return s.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
            }
            break;
        }
        continue; /* Loop/switch isn't completed */
        if (s.length() != b[0].length() + 6) goto _L4; else goto _L3
_L3:
        return (new StringBuilder()).append(s.substring(0, s.length() - 1)).append("+0000").toString();
        if (true) goto _L4; else goto _L5
_L5:
    }

}
