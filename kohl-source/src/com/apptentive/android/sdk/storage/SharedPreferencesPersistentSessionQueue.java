// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.apptentive.android.sdk.SessionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.apptentive.android.sdk.storage:
//            PersistentSessionQueue

public class SharedPreferencesPersistentSessionQueue
    implements PersistentSessionQueue
{

    private static final String EVENT_SEP = ";";
    private static final String FIELD_SEP = ":";
    private Context appContext;

    public SharedPreferencesPersistentSessionQueue(Context context)
    {
        appContext = context.getApplicationContext();
    }

    private String generateStorableEventString(SessionEvent sessionevent)
    {
        return String.format("%s%s%s%s%s", new Object[] {
            Long.valueOf(sessionevent.getTime()), ":", sessionevent.getAction().name(), ":", sessionevent.getActivityName()
        });
    }

    private SharedPreferences getPrefs()
    {
        return appContext.getSharedPreferences("APPTENTIVE", 0);
    }

    private SessionEvent parseStorableEventString(String s)
    {
        String as[] = s.split(":");
        if (as.length != 3)
        {
            throw new RuntimeException((new StringBuilder()).append("Corrupt SessionEvent in Queue: ").append(s).toString());
        } else
        {
            return new SessionEvent(Long.parseLong(as[0]), com.apptentive.android.sdk.SessionEvent.Action.valueOf(as[1]), as[2]);
        }
    }

    public transient void addEvents(SessionEvent asessionevent[])
    {
        SharedPreferences sharedpreferences = getPrefs();
        StringBuilder stringbuilder = new StringBuilder(sharedpreferences.getString("appActivityStateQueue", ""));
        int j = asessionevent.length;
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append(generateStorableEventString(asessionevent[i])).append(";");
        }

        sharedpreferences.edit().putString("appActivityStateQueue", stringbuilder.toString()).commit();
    }

    public void deleteAllEvents()
    {
        getPrefs().edit().remove("appActivityStateQueue").commit();
    }

    public transient void deleteEvents(SessionEvent asessionevent[])
    {
        Object obj = getAllEvents();
        int j = asessionevent.length;
label0:
        for (int i = 0; i < j; i++)
        {
            SessionEvent sessionevent = asessionevent[i];
            Iterator iterator = ((List) (obj)).iterator();
            SessionEvent sessionevent1;
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                sessionevent1 = (SessionEvent)iterator.next();
            } while (!sessionevent.equals(sessionevent1));
            ((List) (obj)).remove(sessionevent1);
        }

        asessionevent = new StringBuilder();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); asessionevent.append(generateStorableEventString((SessionEvent)((Iterator) (obj)).next())).append(";")) { }
        getPrefs().edit().putString("appActivityStateQueue", asessionevent.toString()).commit();
    }

    public List getAllEvents()
    {
        String as[] = getPrefs().getString("appActivityStateQueue", "").split(";");
        ArrayList arraylist = new ArrayList(as.length);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            if (!s.equals(""))
            {
                arraylist.add(parseStorableEventString(s));
            }
        }

        return arraylist;
    }
}
