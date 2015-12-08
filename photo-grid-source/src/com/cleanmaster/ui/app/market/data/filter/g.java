// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.data.filter;

import android.content.Context;
import com.cleanmaster.util.q;
import com.picksinit.PicksMob;
import com.picksinit.b;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cleanmaster.ui.app.market.data.filter:
//            b, a

public class g extends com.cleanmaster.ui.app.market.data.filter.b
{

    private static SimpleDateFormat g = null;
    long e;
    long f;

    public g()
    {
        e = -1L;
        f = -1L;
    }

    public static String a(long l)
    {
        if (l <= 0L)
        {
            return "N/A";
        }
        if ((new Date(l)).getYear() != 70)
        {
            Calendar.getInstance().setTime(new Date(l));
            if (g == null)
            {
                g = new SimpleDateFormat("yyyy-MM-dd:hh:mm");
            }
            return g.format(Long.valueOf(l));
        } else
        {
            return PicksMob.getInstance().getContext().getString(q.a("market_unknown_app_install_date"));
        }
    }

    public static long b(long l)
    {
        Date date;
        Object obj;
        String s;
        obj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ((SimpleDateFormat) (obj)).setTimeZone(TimeZone.getTimeZone("GMT"));
        date = new Date(l);
        s = ((SimpleDateFormat) (obj)).format(date);
        obj = ((SimpleDateFormat) (obj)).parse(s);
        date = ((Date) (obj));
_L2:
        return date.getTime();
        ParseException parseexception;
        parseexception;
        parseexception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static g b(JSONObject jsonobject)
    {
        g g1 = new g();
        try
        {
            jsonobject = jsonobject.getJSONObject("time_condition");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            return g1;
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        g1.e = jsonobject.optLong("start_time", -1L);
        if (g1.e > 0L)
        {
            g1.e = g1.e * 1000L;
            g1.e = b(g1.e);
        }
        g1.f = jsonobject.optLong("end_time", -1L);
        if (g1.f > 0L)
        {
            g1.f = g1.f * 1000L;
            g1.f = b(g1.f);
        }
        return g1;
    }

    protected boolean b(a a1)
    {
        long l = a1.g();
        return l >= e && l <= f;
    }

}
