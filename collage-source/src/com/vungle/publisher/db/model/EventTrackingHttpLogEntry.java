// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import android.content.ContentValues;
import android.database.Cursor;
import com.vungle.publisher.bg;
import com.vungle.publisher.bi;
import java.util.List;
import javax.inject.Provider;

public class EventTrackingHttpLogEntry extends bi
{
    public static class Factory extends com.vungle.publisher.bi.a
    {

        Provider a;

        public final volatile int a(List list)
        {
            return super.a(list);
        }

        protected final bi a(bi bi1, Cursor cursor)
        {
            bi1 = (EventTrackingHttpLogEntry)bi1;
            bi1.a = bg.f(cursor, "ad_id");
            bi1.b = bg.f(cursor, "delivery_id");
            bi1.c = (EventTracking.a)bg.a(cursor, "event", com/vungle/publisher/db/model/EventTracking$a);
            bi1.t = bg.d(cursor, "id");
            bi1.d = bg.e(cursor, "insert_timestamp_millis").longValue();
            bi1.e = bg.d(cursor, "response_code");
            bi1.f = bg.e(cursor, "response_timestamp_millis");
            bi1.g = bg.f(cursor, "url");
            return bi1;
        }

        public final EventTrackingHttpLogEntry b()
        {
            return (EventTrackingHttpLogEntry)a.get();
        }

        protected final volatile Object[] b(int i)
        {
            return new Integer[i];
        }

        protected final volatile bi[] c(int i)
        {
            return new EventTrackingHttpLogEntry[i];
        }

        protected final bi c_()
        {
            return b();
        }

        public final volatile List d()
        {
            return super.d();
        }

        public final volatile List d(int i)
        {
            return super.d(i);
        }

        protected final String e_()
        {
            return "event_tracking_http_log";
        }

        Factory()
        {
        }
    }


    public String a;
    public String b;
    public EventTracking.a c;
    public long d;
    public Integer e;
    public Long f;
    public String g;
    Factory h;

    EventTrackingHttpLogEntry()
    {
    }

    protected final ContentValues a(boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        if (flag)
        {
            contentvalues.put("id", (Integer)s());
            long l = System.currentTimeMillis();
            d = l;
            contentvalues.put("insert_timestamp_millis", Long.valueOf(l));
        }
        contentvalues.put("ad_id", a);
        contentvalues.put("delivery_id", b);
        contentvalues.put("event", c.toString());
        contentvalues.put("response_code", e);
        contentvalues.put("response_timestamp_millis", f);
        contentvalues.put("url", g);
        return contentvalues;
    }

    protected final volatile com.vungle.publisher.bi.a a_()
    {
        return h;
    }

    protected final String b()
    {
        return "event_tracking_http_log";
    }

    protected final StringBuilder p()
    {
        StringBuilder stringbuilder = super.p();
        bi.a(stringbuilder, "ad_id", a, false);
        bi.a(stringbuilder, "delivery_id", b, false);
        bi.a(stringbuilder, "event", c, false);
        bi.a(stringbuilder, "response_code", e, false);
        bi.a(stringbuilder, "response_timestamp_millis", f, false);
        bi.a(stringbuilder, "url", g, false);
        bi.a(stringbuilder, "insert_timestamp_millis", Long.valueOf(d), false);
        return stringbuilder;
    }
}
