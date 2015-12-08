// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.tinder.enums.SqlDataType;
import com.tinder.model.TinderLocation;
import com.tinder.utils.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.tinder.b:
//            b, c, l, f

public final class i extends b
{

    private c a[];

    public i()
    {
        a = (new c[] {
            new c("id", SqlDataType.TEXT, true), new c("latitude", SqlDataType.REAL, false), new c("longitude", SqlDataType.REAL, false), new c("state_province_long", SqlDataType.TEXT, false), new c("state_province_short", SqlDataType.TEXT, false), new c("country_short_name", SqlDataType.TEXT, false), new c("country_long_name", SqlDataType.TEXT, false), new c("country", SqlDataType.TEXT, false), new c("address", SqlDataType.TEXT, false), new c("route", SqlDataType.TEXT, false), 
            new c("street_number", SqlDataType.TEXT, false), new c("city", SqlDataType.TEXT, false), new c("last_seen_date", SqlDataType.INTEGER, false)
        });
    }

    public static List e()
    {
        Cursor cursor = l.a().a("tinder_locations", "last_seen_date DESC");
        Object obj = new ArrayList(cursor.getCount());
        TinderLocation tinderlocation;
        for (; cursor.moveToNext(); ((List) (obj)).add(tinderlocation))
        {
            tinderlocation = new TinderLocation();
            tinderlocation.setLatitude(cursor.getDouble(cursor.getColumnIndex("latitude")));
            tinderlocation.setLongitude(cursor.getDouble(cursor.getColumnIndex("longitude")));
            tinderlocation.setStateProvinceLong(cursor.getString(cursor.getColumnIndex("state_province_long")));
            tinderlocation.setStateProvinceShort(cursor.getString(cursor.getColumnIndex("state_province_short")));
            tinderlocation.setCountryLong(cursor.getString(cursor.getColumnIndex("country_long_name")));
            tinderlocation.setCountryShort(cursor.getString(cursor.getColumnIndex("country_short_name")));
            tinderlocation.setCounty(cursor.getString(cursor.getColumnIndex("country")));
            tinderlocation.setAddress(cursor.getString(cursor.getColumnIndex("address")));
            tinderlocation.setRoute(cursor.getString(cursor.getColumnIndex("route")));
            tinderlocation.setStreetNumber(cursor.getString(cursor.getColumnIndex("street_number")));
            tinderlocation.setCity(cursor.getString(cursor.getColumnIndex("city")));
            tinderlocation.setLastSeenDate(cursor.getLong(cursor.getColumnIndex("last_seen_date")));
        }

          goto _L1
        Exception exception;
        exception;
_L3:
        v.b(exception.getMessage());
        f.a(cursor);
        return ((List) (obj));
_L1:
        f.a(cursor);
        return ((List) (obj));
        obj;
        f.a(cursor);
        throw obj;
        exception;
        obj = null;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public final void a(TinderLocation tinderlocation, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("last_seen_date", Long.valueOf(l1));
        l.a().a("tinder_locations", contentvalues, (new StringBuilder("id='")).append(tinderlocation.getId()).append('\'').toString());
        this;
        JVM INSTR monitorexit ;
        return;
        tinderlocation;
        throw tinderlocation;
    }

    public final boolean a(TinderLocation tinderlocation)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = e().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        boolean flag = TextUtils.equals(((TinderLocation)iterator.next()).getId(), tinderlocation.getId());
        if (!flag) goto _L4; else goto _L3
_L3:
        flag = false;
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        (new StringBuilder("TinderLocation insert into db: ")).append(tinderlocation.toString());
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("id", tinderlocation.getId());
        contentvalues.put("latitude", Double.valueOf(tinderlocation.getLatitude()));
        contentvalues.put("longitude", Double.valueOf(tinderlocation.getLongitude()));
        contentvalues.put("state_province_long", tinderlocation.getStateProvinceLong());
        contentvalues.put("state_province_short", tinderlocation.getStateProvinceShort());
        contentvalues.put("country_short_name", tinderlocation.getCountryShort());
        contentvalues.put("country_long_name", tinderlocation.getCountryLong());
        contentvalues.put("country", tinderlocation.getCounty());
        contentvalues.put("address", tinderlocation.getAddress());
        contentvalues.put("route", tinderlocation.getRoute());
        contentvalues.put("street_number", tinderlocation.getStreetNumber());
        contentvalues.put("city", tinderlocation.getCity());
        contentvalues.put("last_seen_date", Long.valueOf(tinderlocation.getLastSeenDate()));
        l.a().a("tinder_locations", contentvalues);
        flag = true;
        continue; /* Loop/switch isn't completed */
        tinderlocation;
        v.b(tinderlocation.getMessage());
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
        tinderlocation;
        throw tinderlocation;
    }

    protected final c[] a()
    {
        return a;
    }

    protected final String b()
    {
        return "tinder_locations";
    }
}
