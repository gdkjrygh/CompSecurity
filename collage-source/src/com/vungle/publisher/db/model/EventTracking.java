// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import android.content.ContentValues;
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

public class EventTracking extends bi
{
    static class Factory extends com.vungle.publisher.bi.a
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

        protected final bi a(bi bi1, Cursor cursor)
        {
            bi1 = (EventTracking)bi1;
            bi1.t = bg.d(cursor, "id");
            bi1.a = bg.f(cursor, "ad_id");
            bi1.b = (a)bg.a(cursor, "event", com/vungle/publisher/db/model/EventTracking$a);
            bi1.c = bg.f(cursor, "url");
            return bi1;
        }

        final Map a(String s, com.vungle.publisher.protocol.message.RequestAdResponse.ThirdPartyAdTracking thirdpartyadtracking)
        {
            if (thirdpartyadtracking == null) goto _L2; else goto _L1
_L1:
            HashMap hashmap;
            com.vungle.publisher.protocol.message.RequestAdResponse.ThirdPartyAdTracking.PlayCheckpoint aplaycheckpoint[];
            hashmap = new HashMap();
            a(s, ((Map) (hashmap)), a.a, thirdpartyadtracking.g());
            a(s, ((Map) (hashmap)), a.b, thirdpartyadtracking.h());
            aplaycheckpoint = thirdpartyadtracking.j();
            if (aplaycheckpoint == null || aplaycheckpoint.length <= 0) goto _L4; else goto _L3
_L3:
            int i;
            int j;
            j = aplaycheckpoint.length;
            i = 0;
_L6:
            while (i < j) 
            {
                com.vungle.publisher.protocol.message.RequestAdResponse.ThirdPartyAdTracking.PlayCheckpoint playcheckpoint = aplaycheckpoint[i];
                Object obj = playcheckpoint.a;
                if (obj != null)
                {
                    float f = ((Float) (obj)).floatValue();
                    if (f == 0.0F)
                    {
                        obj = a.c;
                    } else
                    if ((double)f == 0.25D)
                    {
                        obj = a.d;
                    } else
                    if ((double)f == 0.5D)
                    {
                        obj = a.e;
                    } else
                    if ((double)f == 0.75D)
                    {
                        obj = a.f;
                    } else
                    if (f == 1.0F)
                    {
                        obj = a.h;
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
            a(s, ((Map) (hashmap)), a.i, thirdpartyadtracking.d());
            a(s, ((Map) (hashmap)), a.j, thirdpartyadtracking.k());
            a(s, ((Map) (hashmap)), a.l, thirdpartyadtracking.e());
            a(s, ((Map) (hashmap)), a.m, thirdpartyadtracking.f());
            a(s, ((Map) (hashmap)), a.n, thirdpartyadtracking.i());
            a(s, ((Map) (hashmap)), a.o, thirdpartyadtracking.l());
            a(s, ((Map) (hashmap)), a.k, thirdpartyadtracking.m());
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
            a a1;
            a1 = eventtracking.b;
            list = (List)((Map) (obj)).get(a1);
            s = list;
            if (list != null)
            {
                break MISSING_BLOCK_LABEL_206;
            }
            s = new ArrayList();
            ((Map) (obj)).put(a1, s);
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

        Factory()
        {
        }
    }

    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final a o;
        private static final a q[];
        public final float p;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/vungle/publisher/db/model/EventTracking$a, s);
        }

        public static a[] values()
        {
            return (a[])q.clone();
        }

        static 
        {
            a = new a("error", 0);
            b = new a("mute", 1);
            c = new a("play_percentage_0", 2, 0.0F);
            d = new a("play_percentage_25", 3, 0.25F);
            e = new a("play_percentage_50", 4, 0.5F);
            f = new a("play_percentage_75", 5, 0.75F);
            g = new a("play_percentage_80", 6, 0.8F);
            h = new a("play_percentage_100", 7, 0.99F);
            i = new a("postroll_click", 8);
            j = new a("postroll_view", 9);
            k = new a("unmute", 10);
            l = new a("video_click", 11);
            m = new a("video_close", 12);
            n = new a("video_pause", 13);
            o = new a("video_resume", 14);
            q = (new a[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o
            });
        }

        private a(String s, int i1)
        {
            this(s, i1, -1F);
        }

        private a(String s, int i1, float f1)
        {
            super(s, i1);
            p = f1;
        }
    }


    String a;
    a b;
    String c;
    Factory d;

    EventTracking()
    {
    }

    protected final ContentValues a(boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("id", (Integer)t);
        contentvalues.put("ad_id", a);
        contentvalues.put("event", b.toString());
        contentvalues.put("url", c);
        return contentvalues;
    }

    protected final volatile com.vungle.publisher.bi.a a_()
    {
        return d;
    }

    protected final String b()
    {
        return "event_tracking";
    }

    public final StringBuilder p()
    {
        StringBuilder stringbuilder = super.p();
        bi.a(stringbuilder, "ad_id", a, false);
        bi.a(stringbuilder, "event", b, false);
        bi.a(stringbuilder, "url", c, false);
        return stringbuilder;
    }
}
