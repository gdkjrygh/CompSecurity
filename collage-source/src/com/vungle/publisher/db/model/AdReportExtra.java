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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

public class AdReportExtra extends bi
{
    public static class Factory extends com.vungle.publisher.bi.a
    {

        Provider a;

        protected static AdReportExtra[] a(int i)
        {
            return new AdReportExtra[i];
        }

        final int a(Integer integer)
        {
            int i = c.getWritableDatabase().delete("ad_report_extra", "ad_report_id = ?", new String[] {
                String.valueOf(integer)
            });
            Logger.v("VungleDatabase", (new StringBuilder("deleted ")).append(i).append(" ad_report_extra records for adReportId: ").append(integer).toString());
            return i;
        }

        public final volatile int a(List list)
        {
            return super.a(list);
        }

        protected final bi a(bi bi1, Cursor cursor)
        {
            bi1 = (AdReportExtra)bi1;
            bi1.t = bg.d(cursor, "id");
            bi1.a = bg.d(cursor, "ad_report_id");
            bi1.b = bg.f(cursor, "name");
            bi1.c = bg.f(cursor, "value");
            return bi1;
        }

        final AdReportExtra a()
        {
            return (AdReportExtra)a.get();
        }

        final Map b(Integer integer)
        {
            Object obj = null;
            if (integer != null) goto _L2; else goto _L1
_L1:
            Logger.w("VungleDatabase", (new StringBuilder("failed to fetch ad_report_extra records by ad_report_id ")).append(integer).toString());
            obj = null;
_L8:
            return ((Map) (obj));
_L2:
            Cursor cursor;
            Logger.d("VungleDatabase", (new StringBuilder("fetching ad_report_extra records by ad_report_id ")).append(integer).toString());
            cursor = c.getReadableDatabase().query("ad_report_extra", null, "ad_report_id = ?", new String[] {
                String.valueOf(integer)
            }, null, null, null);
            int i;
            i = cursor.getCount();
            Logger.v("VungleDatabase", (new StringBuilder()).append(i).append(" ad_report_extra for ad_report_id ").append(integer).toString());
            if (i <= 0) goto _L4; else goto _L3
_L3:
            obj = new HashMap();
_L6:
            integer = ((Integer) (obj));
            if (!cursor.moveToNext())
            {
                break; /* Loop/switch isn't completed */
            }
            integer = a();
            b(((bi) (integer)), cursor);
            ((Map) (obj)).put(((AdReportExtra) (integer)).b, integer);
            if (true) goto _L6; else goto _L5
            integer;
            obj = cursor;
_L9:
            if (obj != null)
            {
                ((Cursor) (obj)).close();
            }
            throw integer;
_L4:
            integer = null;
_L5:
            obj = integer;
            if (cursor == null) goto _L8; else goto _L7
_L7:
            cursor.close();
            return integer;
            integer;
              goto _L9
        }

        protected final volatile Object[] b(int i)
        {
            return new Integer[i];
        }

        protected final volatile bi[] c(int i)
        {
            return new AdReportExtra[i];
        }

        protected final bi c_()
        {
            return a();
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
            return "ad_report_extra";
        }

        public Factory()
        {
        }
    }


    Integer a;
    public String b;
    public String c;
    Factory d;

    public AdReportExtra()
    {
    }

    protected final ContentValues a(boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        if (flag)
        {
            contentvalues.put("ad_report_id", a);
        }
        contentvalues.put("name", b);
        contentvalues.put("value", c);
        return contentvalues;
    }

    protected final volatile com.vungle.publisher.bi.a a_()
    {
        return d;
    }

    protected final String b()
    {
        return "ad_report_extra";
    }

    protected final StringBuilder p()
    {
        StringBuilder stringbuilder = super.p();
        bi.a(stringbuilder, "ad_report_id", a, false);
        bi.a(stringbuilder, "name", b, false);
        bi.a(stringbuilder, "value", c, false);
        return stringbuilder;
    }
}
