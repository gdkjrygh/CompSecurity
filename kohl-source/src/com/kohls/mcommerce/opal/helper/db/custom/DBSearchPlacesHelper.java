// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.helper.db.custom;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.location.Address;
import com.kohls.mcommerce.opal.helper.db.DBOperationsHelper;
import java.util.ArrayList;
import java.util.Locale;

public class DBSearchPlacesHelper extends DBOperationsHelper
{

    public static final String CITY_FEATURED_NAME = "city_featured_name";
    public static final String CITY_LATITUDE = "city_latitude";
    public static final String CITY_LONGITUDE = "city_longitude";
    public static final String CITY_NAME = "city_name";
    public static String TABLE = "searchplaces";
    public static final String _ID = "Id";

    public DBSearchPlacesHelper()
    {
    }

    public long delete(Address address)
    {
        String s;
        SQLiteDatabase sqlitedatabase;
label0:
        {
            sqlitedatabase = getWritableDb();
            String s1 = address.getLocality();
            if (s1 != null)
            {
                s = s1;
                if (s1.length() != 0)
                {
                    break label0;
                }
            }
            s = address.getAdminArea();
        }
        long l = sqlitedatabase.delete(TABLE, "city_name= ?", new String[] {
            s
        });
        dispose(sqlitedatabase);
        return l;
    }

    public ArrayList getAll()
    {
        ArrayList arraylist = new ArrayList();
        SQLiteDatabase sqlitedatabase = getReadableDb();
        Cursor cursor;
        try
        {
            cursor = sqlitedatabase.query(true, TABLE, null, null, null, null, null, "Id DESC", null);
            if (cursor.moveToFirst())
            {
                for (; !cursor.isAfterLast(); cursor.moveToNext())
                {
                    Address address = new Address(Locale.US);
                    address.setLocality(cursor.getString(cursor.getColumnIndex("city_name")));
                    address.setLongitude(cursor.getDouble(cursor.getColumnIndex("city_longitude")));
                    address.setLatitude(cursor.getDouble(cursor.getColumnIndex("city_latitude")));
                    address.setFeatureName(cursor.getString(cursor.getColumnIndex("city_featured_name")));
                    arraylist.add(address);
                }

            }
        }
        catch (SQLiteException sqliteexception)
        {
            return arraylist;
        }
        dispose(sqlitedatabase, cursor);
        return arraylist;
    }

    public long insert(Address address)
    {
        String s;
        SQLiteDatabase sqlitedatabase;
        ContentValues contentvalues;
label0:
        {
            sqlitedatabase = getWritableDb();
            contentvalues = new ContentValues();
            String s1 = address.getLocality();
            if (s1 != null)
            {
                s = s1;
                if (s1.length() != 0)
                {
                    break label0;
                }
            }
            s = address.getAdminArea();
        }
        contentvalues.put("city_name", s);
        contentvalues.put("city_latitude", Double.valueOf(address.getLatitude()));
        contentvalues.put("city_longitude", Double.valueOf(address.getLongitude()));
        contentvalues.put("city_featured_name", address.getFeatureName());
        long l = sqlitedatabase.insert(TABLE, null, contentvalues);
        dispose(sqlitedatabase);
        return l;
    }

}
