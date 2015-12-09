// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.vungle.log.Logger;
import com.vungle.publisher.bg;
import com.vungle.publisher.bi;
import com.vungle.publisher.db.DatabaseHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.db.model:
//            EventTracking

static class nse.ThirdPartyAdTracking extends com.vungle.publisher..Factory
{

    Provider a;

    private EventTracking a()
    {
        return (EventTracking)a.get();
    }

    private void a(String s, Map map, a a1, String as[])
    {
label0:
        {
label1:
            {
                if (as == null || as.length <= 0)
                {
                    break label0;
                }
                if (as != null && as.length > 0)
                {
                    ArrayList arraylist = new ArrayList();
                    int j = as.length;
                    int i = 0;
                    while (i < j) 
                    {
                        String s1 = as[i];
                        EventTracking eventtracking;
                        if (a1 != null && s1 != null)
                        {
                            eventtracking = (EventTracking)a.get();
                            eventtracking.a = s;
                            eventtracking.b = a1;
                            eventtracking.c = s1;
                        } else
                        {
                            eventtracking = null;
                        }
                        if (eventtracking != null)
                        {
                            arraylist.add(eventtracking);
                        }
                        i++;
                    }
                    s = arraylist;
                } else
                {
                    s = null;
                }
                if (s != null)
                {
                    as = s;
                    if (!s.isEmpty())
                    {
                        break label1;
                    }
                }
                as = null;
            }
            if (as != null && !as.isEmpty())
            {
                map.put(a1, as);
            }
        }
    }

    static void a(Map map)
    {
        if (map != null)
        {
            map = map.values().iterator();
            do
            {
                if (!map.hasNext())
                {
                    break;
                }
                Object obj = (List)map.next();
                if (obj != null)
                {
                    obj = ((List) (obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        ((EventTracking)((Iterator) (obj)).next()).r();
                    }
                }
            } while (true);
        }
    }

    protected final bi a(bi bi, Cursor cursor)
    {
        bi = (EventTracking)bi;
        bi.t = bg.d(cursor, "id");
        bi.a = bg.f(cursor, "ad_id");
        bi.b = (a)bg.a(cursor, "event", com/vungle/publisher/db/model/EventTracking$a);
        bi.c = bg.f(cursor, "url");
        return bi;
    }

    final Map a(String s, com.vungle.publisher.protocol.message.dPartyAdTracking dpartyadtracking)
    {
        if (dpartyadtracking == null) goto _L2; else goto _L1
_L1:
        HashMap hashmap;
        com.vungle.publisher.protocol.message.dPartyAdTracking.PlayCheckpoint aplaycheckpoint[];
        hashmap = new HashMap();
        a(s, ((Map) (hashmap)), _10_, dpartyadtracking.g());
        a(s, ((Map) (hashmap)), a, dpartyadtracking.h());
        aplaycheckpoint = dpartyadtracking.j();
        if (aplaycheckpoint == null || aplaycheckpoint.length <= 0) goto _L4; else goto _L3
_L3:
        int i;
        int j;
        j = aplaycheckpoint.length;
        i = 0;
_L6:
        while (i < j) 
        {
            com.vungle.publisher.protocol.message.dPartyAdTracking.PlayCheckpoint playcheckpoint = aplaycheckpoint[i];
            Object obj = playcheckpoint.a;
            if (obj != null)
            {
                float f = ((Float) (obj)).floatValue();
                if (f == 0.0F)
                {
                    obj = ng.PlayCheckpoint.a;
                } else
                if ((double)f == 0.25D)
                {
                    obj = ng.PlayCheckpoint.a;
                } else
                if ((double)f == 0.5D)
                {
                    obj = ng.PlayCheckpoint.a;
                } else
                if ((double)f == 0.75D)
                {
                    obj = ng.PlayCheckpoint.a;
                } else
                if (f == 1.0F)
                {
                    obj = ng.PlayCheckpoint.a;
                } else
                {
                    Logger.w("VungleDatabase", (new StringBuilder("invalid play percent: ")).append(f).toString());
                    obj = null;
                }
                if (obj != null)
                {
                    a(s, ((Map) (hashmap)), ((a) (obj)), playcheckpoint.b);
                }
            }
            i++;
        }
_L4:
        a(s, ((Map) (hashmap)), a, dpartyadtracking.d());
        a(s, ((Map) (hashmap)), a, dpartyadtracking.k());
        a(s, ((Map) (hashmap)), a, dpartyadtracking.e());
        a(s, ((Map) (hashmap)), a, dpartyadtracking.f());
        a(s, ((Map) (hashmap)), a, dpartyadtracking.i());
        a(s, ((Map) (hashmap)), a, dpartyadtracking.l());
        a(s, ((Map) (hashmap)), a, dpartyadtracking.m());
        return hashmap;
_L2:
        return null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    final void a(String s)
    {
        int i = c.getWritableDatabase().delete("event_tracking", "ad_id = ?", new String[] {
            s
        });
        Logger.v("VungleDatabase", (new StringBuilder("deleted ")).append(i).append(" expired event_tracking records for adId: ").append(s).toString());
    }

    final Map b(String s)
    {
        Object obj = null;
        if (s != null) goto _L2; else goto _L1
_L1:
        Logger.w("VungleDatabase", (new StringBuilder("failed to fetch event_tracking records by ad_id: ")).append(s).toString());
        obj = null;
_L8:
        return ((Map) (obj));
_L2:
        Cursor cursor;
        Logger.d("VungleDatabase", (new StringBuilder("fetching event_tracking records by ad_id: ")).append(s).toString());
        cursor = c.getReadableDatabase().query("event_tracking", null, "ad_id = ?", new String[] {
            s
        }, null, null, null);
        int i;
        i = cursor.getCount();
        Logger.v("VungleDatabase", (new StringBuilder()).append(i).append(" event_tracking for ad_id: ").append(s).toString());
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        obj = new HashMap();
_L6:
        if (!cursor.moveToNext()) goto _L4; else goto _L3
_L3:
        EventTracking eventtracking;
        eventtracking = a();
        b(((bi) (eventtracking)), cursor);
        if (eventtracking == null) goto _L6; else goto _L5
_L5:
        List list;
        tabase tabase;
        tabase = eventtracking.b;
        list = (List)((Map) (obj)).get(tabase);
        s = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        s = new ArrayList();
        ((Map) (obj)).put(tabase, s);
        s.add(eventtracking);
          goto _L6
        s;
        obj = cursor;
_L9:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw s;
_L4:
        s = ((String) (obj));
_L10:
        obj = s;
        if (cursor == null) goto _L8; else goto _L7
_L7:
        cursor.close();
        return s;
        s;
          goto _L9
        s = null;
          goto _L10
    }

    protected final volatile Object[] b(int i)
    {
        return new Integer[i];
    }

    protected final volatile bi[] c(int i)
    {
        return new EventTracking[i];
    }

    protected final bi c_()
    {
        return a();
    }

    protected final String e_()
    {
        return "event_tracking";
    }

    nse.ThirdPartyAdTracking()
    {
    }
}
