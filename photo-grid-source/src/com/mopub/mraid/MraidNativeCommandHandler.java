// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.view.View;
import android.view.Window;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;
import com.mopub.common.util.Intents;
import com.mopub.common.util.Utils;
import com.mopub.common.util.VersionCode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.mopub.mraid:
//            h, ac, aa, af

public class MraidNativeCommandHandler
{

    public static final String ANDROID_CALENDAR_CONTENT_TYPE = "vnd.android.cursor.item/event";
    private static final String a[] = {
        "yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"
    };

    public MraidNativeCommandHandler()
    {
    }

    private static Date a(String s)
    {
        Object obj;
        String as[];
        int i;
        int j;
        as = a;
        j = as.length;
        obj = null;
        i = 0;
_L2:
        Object obj1;
        obj1 = obj;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        obj1 = as[i];
        obj1 = (new SimpleDateFormat(((String) (obj1)), Locale.US)).parse(s);
        obj = obj1;
        obj1 = obj;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        obj1 = obj;
        return ((Date) (obj1));
        obj1;
        obj1 = obj;
        i++;
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static void a(Context context, Map map)
    {
        if (!c(context)) goto _L2; else goto _L1
_L1:
        HashMap hashmap;
        hashmap = new HashMap();
        if (!map.containsKey("description") || !map.containsKey("start"))
        {
            throw new IllegalArgumentException("Missing start and description fields");
        }
        hashmap.put("title", map.get("description"));
        if (!map.containsKey("start") || map.get("start") == null) goto _L4; else goto _L3
_L3:
        Object obj = a((String)map.get("start"));
        if (obj == null) goto _L6; else goto _L5
_L5:
        hashmap.put("beginTime", Long.valueOf(((Date) (obj)).getTime()));
        if (!map.containsKey("end") || map.get("end") == null) goto _L8; else goto _L7
_L7:
        obj = a((String)map.get("end"));
        if (obj == null) goto _L10; else goto _L9
_L9:
        hashmap.put("endTime", Long.valueOf(((Date) (obj)).getTime()));
_L8:
        if (map.containsKey("location"))
        {
            hashmap.put("eventLocation", map.get("location"));
        }
        if (map.containsKey("summary"))
        {
            hashmap.put("description", map.get("summary"));
        }
        if (!map.containsKey("transparency")) goto _L12; else goto _L11
_L11:
        String s;
        Object obj1;
        int i;
        if (((String)map.get("transparency")).equals("transparent"))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        hashmap.put("availability", Integer.valueOf(i));
_L12:
        obj = new StringBuilder();
        if (!map.containsKey("frequency")) goto _L14; else goto _L13
_L13:
        s = (String)map.get("frequency");
        if (!map.containsKey("interval"))
        {
            break MISSING_BLOCK_LABEL_896;
        }
        i = Integer.parseInt((String)map.get("interval"));
_L33:
        if (!"daily".equals(s)) goto _L16; else goto _L15
_L15:
        ((StringBuilder) (obj)).append("FREQ=DAILY;");
        if (i == -1) goto _L14; else goto _L17
_L17:
        ((StringBuilder) (obj)).append((new StringBuilder("INTERVAL=")).append(i).append(";").toString());
_L14:
        hashmap.put("rrule", ((StringBuilder) (obj)).toString());
        map = (new Intent("android.intent.action.INSERT")).setType("vnd.android.cursor.item/event");
        obj = hashmap.keySet().iterator();
_L22:
        if (!((Iterator) (obj)).hasNext()) goto _L19; else goto _L18
_L18:
        s = (String)((Iterator) (obj)).next();
        obj1 = hashmap.get(s);
        if (!(obj1 instanceof Long)) goto _L21; else goto _L20
_L20:
        map.putExtra(s, ((Long)obj1).longValue());
          goto _L22
_L6:
        try
        {
            throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            MoPubLog.d("no calendar app installed");
            throw new h("Action is unsupported on this device - no calendar app installed");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            MoPubLog.d((new StringBuilder("create calendar: invalid parameters ")).append(context.getMessage()).toString());
            throw new h(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            MoPubLog.d("could not create calendar event");
        }
        throw new h(context);
_L4:
        throw new IllegalArgumentException("Invalid calendar event: start is null.");
_L10:
        throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
_L16:
        if (!"weekly".equals(s)) goto _L24; else goto _L23
_L23:
        ((StringBuilder) (obj)).append("FREQ=WEEKLY;");
        if (i == -1) goto _L26; else goto _L25
_L25:
        ((StringBuilder) (obj)).append((new StringBuilder("INTERVAL=")).append(i).append(";").toString());
_L26:
        if (!map.containsKey("daysInWeek")) goto _L14; else goto _L27
_L27:
        map = b((String)map.get("daysInWeek"));
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_669;
        }
        throw new IllegalArgumentException("invalid ");
        ((StringBuilder) (obj)).append((new StringBuilder("BYDAY=")).append(map).append(";").toString());
          goto _L14
_L24:
        if (!"monthly".equals(s))
        {
            break MISSING_BLOCK_LABEL_815;
        }
        ((StringBuilder) (obj)).append("FREQ=MONTHLY;");
        if (i == -1) goto _L29; else goto _L28
_L28:
        ((StringBuilder) (obj)).append((new StringBuilder("INTERVAL=")).append(i).append(";").toString());
_L29:
        if (!map.containsKey("daysInMonth")) goto _L14; else goto _L30
_L30:
        map = c((String)map.get("daysInMonth"));
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_786;
        }
        throw new IllegalArgumentException();
        ((StringBuilder) (obj)).append((new StringBuilder("BYMONTHDAY=")).append(map).append(";").toString());
          goto _L14
        throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
_L21:
        if (!(obj1 instanceof Integer)) goto _L32; else goto _L31
_L31:
        map.putExtra(s, ((Integer)obj1).intValue());
          goto _L22
_L32:
        map.putExtra(s, (String)obj1);
          goto _L22
_L19:
        map.setFlags(0x10000000);
        context.startActivity(map);
        return;
_L2:
        MoPubLog.d("unsupported action createCalendarEvent for devices pre-ICS");
        throw new h("Action is unsupported on this device (need Android version Ice Cream Sandwich or above)");
        i = -1;
          goto _L33
    }

    static boolean a(Activity activity, View view)
    {
label0:
        {
            if (VersionCode.currentApiLevel().isBelow(VersionCode.HONEYCOMB_MR1))
            {
                return false;
            }
            for (; view.isHardwareAccelerated() && !Utils.bitMaskContainsFlag(view.getLayerType(), 1); view = (View)view.getParent())
            {
                if (!(view.getParent() instanceof View))
                {
                    break label0;
                }
            }

            return false;
        }
        activity = activity.getWindow();
        return activity != null && Utils.bitMaskContainsFlag(activity.getAttributes().flags, 0x1000000);
    }

    static boolean a(Context context)
    {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return Intents.deviceCanHandleIntent(context, intent);
    }

    private static String b(String s)
    {
        StringBuilder stringbuilder;
        boolean aflag[];
        String as[];
        int i;
        int l;
        stringbuilder = new StringBuilder();
        aflag = new boolean[7];
        as = s.split(",");
        l = as.length;
        i = 0;
_L15:
        if (i >= l) goto _L2; else goto _L1
_L1:
        int j;
        int k = Integer.parseInt(as[i]);
        j = k;
        if (k == 7)
        {
            j = 0;
        }
        if (aflag[j]) goto _L4; else goto _L3
_L3:
        StringBuilder stringbuilder1 = new StringBuilder();
        j;
        JVM INSTR tableswitch 0 6: default 120
    //                   0 146
    //                   1 184
    //                   2 191
    //                   3 198
    //                   4 205
    //                   5 212
    //                   6 219;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L5:
        throw new IllegalArgumentException((new StringBuilder("invalid day of week ")).append(j).toString());
_L6:
        s = "SU";
_L13:
        stringbuilder.append(stringbuilder1.append(s).append(",").toString());
        aflag[j] = true;
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L7:
        s = "MO";
        continue; /* Loop/switch isn't completed */
_L8:
        s = "TU";
        continue; /* Loop/switch isn't completed */
_L9:
        s = "WE";
        continue; /* Loop/switch isn't completed */
_L10:
        s = "TH";
        continue; /* Loop/switch isn't completed */
_L11:
        s = "FR";
        continue; /* Loop/switch isn't completed */
_L12:
        s = "SA";
        if (true) goto _L13; else goto _L2
_L2:
        if (as.length == 0)
        {
            throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
        }
        stringbuilder.deleteCharAt(stringbuilder.length() - 1);
        return stringbuilder.toString();
        if (true) goto _L15; else goto _L14
_L14:
    }

    static boolean b(Context context)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return Intents.deviceCanHandleIntent(context, intent);
    }

    private static String c(String s)
    {
        StringBuilder stringbuilder;
label0:
        {
            stringbuilder = new StringBuilder();
            boolean aflag[] = new boolean[63];
            s = s.split(",");
            int j = s.length;
            int i = 0;
            int k;
            do
            {
                if (i >= j)
                {
                    break label0;
                }
                k = Integer.parseInt(s[i]);
                if (!aflag[k + 31])
                {
                    StringBuilder stringbuilder1 = new StringBuilder();
                    if (k == 0 || k < -31 || k > 31)
                    {
                        break;
                    }
                    stringbuilder.append(stringbuilder1.append(String.valueOf(k)).append(",").toString());
                    aflag[k + 31] = true;
                }
                i++;
            } while (true);
            throw new IllegalArgumentException((new StringBuilder("invalid day of month ")).append(k).toString());
        }
        if (s.length == 0)
        {
            throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
        } else
        {
            stringbuilder.deleteCharAt(stringbuilder.length() - 1);
            return stringbuilder.toString();
        }
    }

    static boolean c(Context context)
    {
        Intent intent = (new Intent("android.intent.action.INSERT")).setType("vnd.android.cursor.item/event");
        return VersionCode.currentApiLevel().isAtLeast(VersionCode.ICE_CREAM_SANDWICH) && Intents.deviceCanHandleIntent(context, intent);
    }

    public static boolean isStorePictureSupported(Context context)
    {
        return "mounted".equals(Environment.getExternalStorageState()) && context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    final void a(Context context, String s, af af)
    {
        AsyncTasks.safeExecuteOnExecutor(new ac(context, new aa(this, context, af)), new String[] {
            s
        });
    }

}
