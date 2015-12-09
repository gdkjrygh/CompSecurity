// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.data;

import android.content.Context;
import android.location.Location;
import com.fitbit.config.BuildType;
import com.fitbit.data.bl.q;
import com.fitbit.data.domain.Type;
import com.fitbit.data.domain.b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.runtrack.data:
//            ExerciseSession, b, ExerciseSegment, ExerciseEvent

public class a
    implements b
{

    private static final String a = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    private final SimpleDateFormat b;
    private final ExerciseSession c;

    public a(ExerciseSession exercisesession)
    {
        b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
        c = exercisesession;
    }

    private String a(Date date)
    {
        return b.format(date);
    }

    public String a()
    {
        return String.valueOf(c.getUuid());
    }

    public JSONObject a(Context context)
        throws JSONException
    {
        context = new com.fitbit.runtrack.data.b();
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("name", "Run");
        jsonobject.put("notes", "no notes is good notes");
        JSONArray jsonarray = new JSONArray();
        List list = q.a().d(c);
        JSONObject jsonobject1;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); jsonarray.put(jsonarray.length(), jsonobject1))
        {
            ExerciseSegment exercisesegment = (ExerciseSegment)iterator.next();
            jsonobject1 = new JSONObject();
            jsonobject1.put("time", a(exercisesegment.c()));
            jsonobject1.put("type", "start");
            jsonarray.put(jsonarray.length(), jsonobject1);
            jsonobject1 = new JSONObject();
            jsonobject1.put("time", a(exercisesegment.d()));
            jsonobject1.put("type", "stop");
        }

        jsonobject.put("events", jsonarray);
        jsonarray = new JSONArray();
        Iterator iterator1 = context.f(c).iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            context = (ExerciseEvent)iterator1.next();
            Location location = ((ExerciseEvent) (context)).location;
            if (Double.isNaN(location.getLatitude()) || Double.isNaN(location.getLongitude()))
            {
                continue;
            }
            if (!list.isEmpty())
            {
                ExerciseSegment exercisesegment1 = (ExerciseSegment)list.get(0);
                ExerciseSegment exercisesegment2 = (ExerciseSegment)list.get(list.size() - 1);
                if (location.getTime() < exercisesegment1.c().getTime() || location.getTime() > exercisesegment2.d().getTime())
                {
                    continue;
                }
            }
            JSONObject jsonobject2 = new JSONObject();
            jsonobject2.put("date", a(new Date(location.getTime())));
            jsonobject2.put("latitude", location.getLatitude());
            jsonobject2.put("longitude", location.getLongitude());
            if (!((ExerciseEvent) (context)).type.recorded)
            {
                jsonobject2.put("interpolated", true);
            }
            context = null;
            if (location.hasAltitude())
            {
                context = Double.valueOf(location.getAltitude());
            }
            jsonobject2.put("elevation", context);
            context = null;
            if (location.hasAccuracy())
            {
                context = Float.valueOf(location.getAccuracy());
            }
            jsonobject2.put("horizontalAccuracy", context);
            context = null;
            if (location.hasSpeed())
            {
                context = Float.valueOf(location.getSpeed());
            }
            jsonobject2.put("speed", context);
            context = null;
            if (location.hasBearing())
            {
                context = Float.valueOf(location.getBearing());
            }
            jsonobject2.put("bearing", context);
            jsonarray.put(jsonarray.length(), jsonobject2);
        } while (true);
        jsonobject.put("trackpoints", jsonarray);
        jsonobject.put("wireId", c.g());
        if (com.fitbit.config.b.a.a())
        {
            com.fitbit.e.a.a("TRACKS", jsonobject.toString(2), new Object[0]);
        }
        return jsonobject;
    }

    public void a(Context context, long l)
    {
        (new com.fitbit.runtrack.data.b()).a(c, l);
    }

    public Type b()
    {
        return Type.MOBILE_RUN;
    }

    public ExerciseSession c()
    {
        return c;
    }
}
