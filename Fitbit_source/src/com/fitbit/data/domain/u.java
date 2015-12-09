// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.a;
import com.fitbit.d.b;
import com.fitbit.util.bn;
import com.fitbit.util.o;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            MinutesAsleepIntraday, SleepLogEntry

public class u
    implements b
{

    public List a;
    private Date b;

    public u(Date date)
    {
        b = date;
    }

    private List a(JSONObject jsonobject)
        throws JSONException
    {
        Object obj = jsonobject.optJSONArray("minuteData");
        ArrayList arraylist = new ArrayList();
        Date date = com.fitbit.d.a.c(jsonobject, "startTime");
        jsonobject = new GregorianCalendar(bn.b());
        jsonobject.setTime(date);
        if (obj != null)
        {
            int i = 0;
            int k;
            for (int j = 0; i < ((JSONArray) (obj)).length(); j = k)
            {
                JSONObject jsonobject1 = ((JSONArray) (obj)).getJSONObject(i);
                o.a(jsonobject, com.fitbit.d.a.g(jsonobject1, "dateTime"));
                if (jsonobject.getTimeInMillis() < date.getTime())
                {
                    jsonobject.add(5, 1);
                }
                k = jsonobject1.getInt("value");
                if (k != j)
                {
                    MinutesAsleepIntraday minutesasleepintraday = new MinutesAsleepIntraday();
                    minutesasleepintraday.a(jsonobject.getTime());
                    minutesasleepintraday.a(k);
                    arraylist.add(minutesasleepintraday);
                }
                i++;
            }

            obj = new MinutesAsleepIntraday();
            jsonobject.add(12, 1);
            ((MinutesAsleepIntraday) (obj)).a(jsonobject.getTime());
            ((MinutesAsleepIntraday) (obj)).a(0);
            arraylist.add(obj);
        }
        return arraylist;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.getJSONArray("sleep");
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < jsonobject.length(); i++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(i);
            SleepLogEntry sleeplogentry = new SleepLogEntry();
            sleeplogentry.initFromPublicApiJsonObject(jsonobject1);
            arraylist.add(sleeplogentry);
            sleeplogentry.a(a(jsonobject1));
        }

        a = arraylist;
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }
}
