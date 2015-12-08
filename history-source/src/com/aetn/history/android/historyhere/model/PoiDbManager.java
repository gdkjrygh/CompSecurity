// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            POIDetail, PreferenceManager, Configuration

public class PoiDbManager extends SQLiteOpenHelper
{

    static final String C_ADDRESS_1 = "address_1";
    static final String C_ADDRESS_2 = "address_2";
    static final String C_CATEGORY = "category";
    static final String C_CITY = "city";
    static final String C_DESCRIPTION = "description";
    static final String C_ID = "_id";
    static final String C_IMAGE = "image";
    static final String C_INACTIVE = "inactive";
    static final String C_LATITUDE = "latitude";
    static final String C_LONGITUDE = "longitude";
    static final String C_POI_ID = "poi_id";
    static final String C_QUALITY = "quality";
    static final String C_SHORT_DESCRIPTION = "short_description";
    static final String C_STATE = "state";
    static final String C_TITLE = "title";
    static final String C_ZIP = "zip";
    static final String DB_NAME = "historyhereDB";
    static final int DB_VERSION = 2;
    static final String FAVORITES_TABLE = "favorites";
    static final String POI_TABLE = "pois";
    private static PoiDbManager mInstance;
    final String TAG = getClass().getSimpleName();
    private Context mContext;

    public PoiDbManager(Context context)
    {
        super(context, "historyhereDB", null, 2);
        mContext = context;
        Utils.logger(TAG, "DB: PoiDbManager: init");
    }

    private void createPoiTable(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS pois (_id int primary key, poi_id text, title text, image text, category text, longitude double, latitude double, address_1 text, address_2 text, city text, state text, zip text, short_description text, quality long, inactive long, description text)");
        Utils.logger(TAG, "DB PoiDbManager: created POITable");
    }

    public static PoiDbManager getInstance(Context context)
    {
        com/aetn/history/android/historyhere/model/PoiDbManager;
        JVM INSTR monitorenter ;
        if (mInstance == null)
        {
            mInstance = new PoiDbManager(context);
        }
        context = mInstance;
        com/aetn/history/android/historyhere/model/PoiDbManager;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public boolean addPois(ArrayList arraylist, boolean flag)
    {
        Utils.logger(TAG, "addPois(): ");
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        if (flag)
        {
            Utils.logger(TAG, "addPois(): delete previous entries");
            sqlitedatabase.execSQL("delete from pois");
        }
        sqlitedatabase.beginTransaction();
        SQLiteStatement sqlitestatement = sqlitedatabase.compileStatement("insert into pois(poi_id,title,image,latitude,longitude,address_1,address_2,city,state,zip,quality,inactive,short_description) values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); sqlitestatement.execute())
        {
            POIDetail poidetail = (POIDetail)arraylist.next();
            sqlitestatement.bindString(1, poidetail.getId());
            sqlitestatement.bindString(2, poidetail.getTitle());
            sqlitestatement.bindString(3, poidetail.getImage());
            sqlitestatement.bindDouble(4, poidetail.getLocation().lat);
            sqlitestatement.bindDouble(5, poidetail.getLocation().lng);
            sqlitestatement.bindString(6, poidetail.getAddress().getAddress1());
            sqlitestatement.bindString(7, poidetail.getAddress().getAddress2());
            sqlitestatement.bindString(8, poidetail.getAddress().getCity());
            sqlitestatement.bindString(9, poidetail.getAddress().getState());
            sqlitestatement.bindString(10, poidetail.getAddress().getZip());
            sqlitestatement.bindLong(11, poidetail.getQuality());
            sqlitestatement.bindLong(12, poidetail.getInactive());
            sqlitestatement.bindString(13, poidetail.getShortDescription());
        }

        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return true;
    }

    public void convertOldFavorites(SQLiteDatabase sqlitedatabase)
    {
        Utils.logger(TAG, "convertOldFavorites()!");
        boolean flag = false;
        boolean flag1 = false;
        Cursor cursor = sqlitedatabase.rawQuery("select DISTINCT tbl_name from sqlite_master where tbl_name = 'favorites'", null);
        if (cursor != null)
        {
            flag = flag1;
            if (cursor.getCount() > 0)
            {
                cursor.close();
                flag = true;
            }
            cursor.close();
        }
        if (flag)
        {
            Utils.logger(TAG, "convertOldFavorites() table does exist!!");
            Utils.logger(TAG, (new StringBuilder()).append("convertOldFavorites() : query: ").append("select * from favorites;").toString());
            String s = "";
            Cursor cursor1 = sqlitedatabase.rawQuery("select * from favorites;", null);
            int i = cursor1.getColumnIndex("poi_id");
            while (cursor1.moveToNext()) 
            {
                s = (new StringBuilder()).append(s).append(cursor1.getString(i)).append(",").toString();
            }
            String s1 = s;
            if (!s.isEmpty())
            {
                s1 = s.substring(0, s.length() - 1);
                PreferenceManager.addFavorite(mContext, s1);
            }
            Utils.logger(TAG, (new StringBuilder()).append("convertOldFavorites() favs:*").append(s1).append("*").toString());
            cursor1.close();
            sqlitedatabase.execSQL("drop table if exists favorites");
            return;
        } else
        {
            Utils.logger(TAG, "convertOldFavorites() table does NOT exist!!");
            return;
        }
    }

    public ArrayList getFavoritePoiList(String as[])
    {
        SQLiteDatabase sqlitedatabase = getReadableDatabase();
        Utils.logger(TAG, "getFavoritePoiList() 1: ");
        ArrayList arraylist = new ArrayList();
        String s = "";
        int k = as.length;
        for (int i = 0; i < k; i++)
        {
            String s1 = as[i];
            s = (new StringBuilder()).append(s).append("'").append(s1).append("',").toString();
        }

        as = new StringBuilder(s);
        as.replace(s.lastIndexOf(","), s.lastIndexOf(",") + 1, "");
        as = as.toString();
        as = (new StringBuilder()).append("select * from pois where poi_id IN (").append(as).append(");").toString();
        Utils.logger(TAG, (new StringBuilder()).append("getFavoritePoiList() : query: ").append(as).toString());
        as = sqlitedatabase.rawQuery(as, null);
        int j = as.getColumnIndex("poi_id");
        k = as.getColumnIndex("title");
        int l = as.getColumnIndex("image");
        int i1 = as.getColumnIndex("short_description");
        int j1 = as.getColumnIndex("latitude");
        int k1 = as.getColumnIndex("longitude");
        int l1 = as.getColumnIndex("address_1");
        int i2 = as.getColumnIndex("address_2");
        int j2 = as.getColumnIndex("city");
        int k2 = as.getColumnIndex("state");
        int l2 = as.getColumnIndex("zip");
        POIDetail poidetail;
        for (; as.moveToNext(); arraylist.add(poidetail))
        {
            poidetail = new POIDetail();
            poidetail.setId(as.getString(j));
            poidetail.setTitle(as.getString(k));
            poidetail.setShortDescription(as.getString(i1));
            poidetail.setLocation(as.getDouble(j1), as.getDouble(k1));
            poidetail.setImage(as.getString(l));
            poidetail.setAddress(as.getString(l1), as.getString(i2), as.getString(j2), as.getString(k2), as.getString(l2));
        }

        Utils.logger(TAG, (new StringBuilder()).append("getFavoritePoiList() 3: al.size():").append(arraylist.size()).toString());
        as.close();
        sqlitedatabase.close();
        return arraylist;
    }

    public POIDetail getPoiById(String s)
    {
        SQLiteDatabase sqlitedatabase = getReadableDatabase();
        Object obj = null;
        s = (new StringBuilder()).append("SELECT * FROM pois where poi_id = '").append(s).append("';").toString();
        Utils.logger(TAG, (new StringBuilder()).append("getPoiById() : query: ").append(s).toString());
        Cursor cursor = sqlitedatabase.rawQuery(s, null);
        int i = cursor.getColumnIndex("poi_id");
        int j = cursor.getColumnIndex("title");
        int k = cursor.getColumnIndex("image");
        int l = cursor.getColumnIndex("latitude");
        int i1 = cursor.getColumnIndex("longitude");
        int j1 = cursor.getColumnIndex("address_1");
        int k1 = cursor.getColumnIndex("address_2");
        int l1 = cursor.getColumnIndex("city");
        int i2 = cursor.getColumnIndex("state");
        int j2 = cursor.getColumnIndex("zip");
        int k2 = cursor.getColumnIndex("short_description");
        s = obj;
        if (cursor.getCount() != 0)
        {
            cursor.moveToNext();
            s = new POIDetail();
            s.setId(cursor.getString(i));
            s.setTitle(cursor.getString(j));
            s.setImage(cursor.getString(k));
            s.setLocation(cursor.getDouble(l), cursor.getDouble(i1));
            s.setAddress(cursor.getString(j1), cursor.getString(k1), cursor.getString(l1), cursor.getString(i2), cursor.getString(j2));
            s.setShortDescription(cursor.getString(k2));
        }
        cursor.close();
        sqlitedatabase.close();
        Utils.logger(TAG, "getPoiById() 3: ");
        return s;
    }

    public ArrayList getPoiList()
    {
        Utils.logger(TAG, "getPoiList() 1: ");
        ArrayList arraylist = new ArrayList();
        SQLiteDatabase sqlitedatabase = getReadableDatabase();
        Cursor cursor = sqlitedatabase.query("pois", null, null, null, null, null, null);
        int i = cursor.getColumnIndex("poi_id");
        int j = cursor.getColumnIndex("title");
        int k = cursor.getColumnIndex("image");
        int l = cursor.getColumnIndex("latitude");
        int i1 = cursor.getColumnIndex("longitude");
        Utils.logger(TAG, (new StringBuilder()).append("getPoiList() 3: latRow:").append(l).append("|lngRow:").append(i1).toString());
        POIDetail poidetail;
        for (; cursor.moveToNext(); arraylist.add(poidetail))
        {
            poidetail = new POIDetail();
            poidetail.setId(cursor.getString(i));
            poidetail.setTitle(cursor.getString(j));
            poidetail.setLocation(cursor.getDouble(l), cursor.getDouble(i1));
            poidetail.setImage(cursor.getString(k));
        }

        cursor.close();
        sqlitedatabase.close();
        return arraylist;
    }

    public ArrayList getPoiListWithinBounds(double d, double d1, double d2, double d3)
    {
        Utils.logger(TAG, "getPoiListWithinBounds() 1: ");
        ArrayList arraylist = new ArrayList();
        SQLiteDatabase sqlitedatabase = getReadableDatabase();
        Object obj = (new StringBuilder()).append("select * from pois where latitude <=").append(d).append(" AND ").append("latitude").append(" >= ").append(d1).append(" AND ").append("longitude").append(" >= ").append(d2).append(" AND ").append("longitude").append(" <= ").append(d3).append(" AND INACTIVE = 0;").toString();
        Utils.logger(TAG, (new StringBuilder()).append("getPoiListWithinBounds() : query: ").append(((String) (obj))).toString());
        obj = sqlitedatabase.rawQuery(((String) (obj)), null);
        int i = ((Cursor) (obj)).getColumnIndex("poi_id");
        int j = ((Cursor) (obj)).getColumnIndex("title");
        int k = ((Cursor) (obj)).getColumnIndex("image");
        int l = ((Cursor) (obj)).getColumnIndex("latitude");
        int i1 = ((Cursor) (obj)).getColumnIndex("longitude");
        int j1 = ((Cursor) (obj)).getColumnIndex("address_1");
        int k1 = ((Cursor) (obj)).getColumnIndex("address_2");
        int l1 = ((Cursor) (obj)).getColumnIndex("city");
        int i2 = ((Cursor) (obj)).getColumnIndex("state");
        int j2 = ((Cursor) (obj)).getColumnIndex("zip");
        int k2 = ((Cursor) (obj)).getColumnIndex("short_description");
        POIDetail poidetail;
        for (; ((Cursor) (obj)).moveToNext(); arraylist.add(poidetail))
        {
            poidetail = new POIDetail();
            poidetail.setId(((Cursor) (obj)).getString(i));
            poidetail.setTitle(((Cursor) (obj)).getString(j));
            poidetail.setImage(((Cursor) (obj)).getString(k));
            poidetail.setLocation(((Cursor) (obj)).getDouble(l), ((Cursor) (obj)).getDouble(i1));
            poidetail.setAddress(((Cursor) (obj)).getString(j1), ((Cursor) (obj)).getString(k1), ((Cursor) (obj)).getString(l1), ((Cursor) (obj)).getString(i2), ((Cursor) (obj)).getString(j2));
            poidetail.setShortDescription(((Cursor) (obj)).getString(k2));
        }

        ((Cursor) (obj)).close();
        sqlitedatabase.close();
        Utils.logger(TAG, (new StringBuilder()).append("getPoiListWithinBounds() 3: ReturnedList.size()").append(arraylist.size()).toString());
        return arraylist;
    }

    public ArrayList getPoisFromList(String s)
    {
        SQLiteDatabase sqlitedatabase = getReadableDatabase();
        Object obj = (new StringBuilder()).append("select * from pois where poi_id IN (").append(s).append(");").toString();
        Utils.logger(TAG, (new StringBuilder()).append("getRowsForUpdate() : query: ").append(((String) (obj))).toString());
        s = new ArrayList();
        obj = sqlitedatabase.rawQuery(((String) (obj)), null);
        int i = ((Cursor) (obj)).getColumnIndex("poi_id");
        int j = ((Cursor) (obj)).getColumnIndex("title");
        int k = ((Cursor) (obj)).getColumnIndex("image");
        int l = ((Cursor) (obj)).getColumnIndex("short_description");
        int i1 = ((Cursor) (obj)).getColumnIndex("latitude");
        int j1 = ((Cursor) (obj)).getColumnIndex("longitude");
        int k1 = ((Cursor) (obj)).getColumnIndex("address_1");
        int l1 = ((Cursor) (obj)).getColumnIndex("address_2");
        int i2 = ((Cursor) (obj)).getColumnIndex("city");
        int j2 = ((Cursor) (obj)).getColumnIndex("state");
        int k2 = ((Cursor) (obj)).getColumnIndex("zip");
        POIDetail poidetail;
        for (; ((Cursor) (obj)).moveToNext(); s.add(poidetail))
        {
            poidetail = new POIDetail();
            poidetail.setId(((Cursor) (obj)).getString(i));
            poidetail.setTitle(((Cursor) (obj)).getString(j));
            poidetail.setShortDescription(((Cursor) (obj)).getString(l));
            poidetail.setLocation(((Cursor) (obj)).getDouble(i1), ((Cursor) (obj)).getDouble(j1));
            poidetail.setImage(((Cursor) (obj)).getString(k));
            poidetail.setAddress(((Cursor) (obj)).getString(k1), ((Cursor) (obj)).getString(l1), ((Cursor) (obj)).getString(i2), ((Cursor) (obj)).getString(j2), ((Cursor) (obj)).getString(k2));
        }

        Utils.logger(TAG, (new StringBuilder()).append("getRowsForUpdate() 3: al.size():").append(s.size()).toString());
        ((Cursor) (obj)).close();
        sqlitedatabase.close();
        return s;
    }

    public POIDetail getRandomPoi()
    {
        SQLiteDatabase sqlitedatabase = getReadableDatabase();
        int i = HistoryHereApplication.getConfiguration().supriseMeQualityMin;
        Object obj = (new StringBuilder()).append("SELECT * FROM pois WHERE INACTIVE = 0 AND QUALITY = ").append(i).append(" ORDER BY RANDOM() LIMIT 1;").toString();
        Utils.logger(TAG, (new StringBuilder()).append("getRandomPoi() : query: ").append(((String) (obj))).toString());
        obj = sqlitedatabase.rawQuery(((String) (obj)), null);
        i = ((Cursor) (obj)).getColumnIndex("poi_id");
        int j = ((Cursor) (obj)).getColumnIndex("title");
        int k = ((Cursor) (obj)).getColumnIndex("image");
        int l = ((Cursor) (obj)).getColumnIndex("latitude");
        int i1 = ((Cursor) (obj)).getColumnIndex("longitude");
        int j1 = ((Cursor) (obj)).getColumnIndex("address_1");
        int k1 = ((Cursor) (obj)).getColumnIndex("address_2");
        int l1 = ((Cursor) (obj)).getColumnIndex("city");
        int i2 = ((Cursor) (obj)).getColumnIndex("state");
        int j2 = ((Cursor) (obj)).getColumnIndex("zip");
        int k2 = ((Cursor) (obj)).getColumnIndex("short_description");
        ((Cursor) (obj)).moveToNext();
        POIDetail poidetail = new POIDetail();
        poidetail.setId(((Cursor) (obj)).getString(i));
        poidetail.setTitle(((Cursor) (obj)).getString(j));
        poidetail.setImage(((Cursor) (obj)).getString(k));
        poidetail.setLocation(((Cursor) (obj)).getDouble(l), ((Cursor) (obj)).getDouble(i1));
        poidetail.setAddress(((Cursor) (obj)).getString(j1), ((Cursor) (obj)).getString(k1), ((Cursor) (obj)).getString(l1), ((Cursor) (obj)).getString(i2), ((Cursor) (obj)).getString(j2));
        poidetail.setShortDescription(((Cursor) (obj)).getString(k2));
        ((Cursor) (obj)).close();
        sqlitedatabase.close();
        return poidetail;
    }

    public ArrayList getRowsForUpdate(ArrayList arraylist)
    {
        SQLiteDatabase sqlitedatabase = getReadableDatabase();
        Utils.logger(TAG, (new StringBuilder()).append("getRowsForUpdate() 1: the number of requested items is: ").append(arraylist.size()).toString());
        ArrayList arraylist1 = new ArrayList();
        Object obj = "";
        Iterator iterator = arraylist.iterator();
        for (arraylist = ((ArrayList) (obj)); iterator.hasNext(); arraylist = (new StringBuilder()).append(arraylist).append("'").append(((POIDetail) (obj)).getId()).append("',").toString())
        {
            obj = (POIDetail)iterator.next();
        }

        obj = new StringBuilder(arraylist);
        ((StringBuilder) (obj)).replace(arraylist.lastIndexOf(","), arraylist.lastIndexOf(",") + 1, "");
        arraylist = ((StringBuilder) (obj)).toString();
        arraylist = (new StringBuilder()).append("select * from pois where poi_id IN (").append(arraylist).append(");").toString();
        Utils.logger(TAG, (new StringBuilder()).append("getRowsForUpdate() : query: ").append(arraylist).toString());
        arraylist = sqlitedatabase.rawQuery(arraylist, null);
        int i = arraylist.getColumnIndex("poi_id");
        int j = arraylist.getColumnIndex("title");
        int k = arraylist.getColumnIndex("image");
        int l = arraylist.getColumnIndex("description");
        int i1 = arraylist.getColumnIndex("short_description");
        int j1 = arraylist.getColumnIndex("latitude");
        int k1 = arraylist.getColumnIndex("longitude");
        POIDetail poidetail;
        for (; arraylist.moveToNext(); arraylist1.add(poidetail))
        {
            poidetail = new POIDetail();
            poidetail.setId(arraylist.getString(i));
            poidetail.setTitle(arraylist.getString(j));
            poidetail.setDescription(arraylist.getString(l));
            poidetail.setShortDescription(arraylist.getString(i1));
            poidetail.setLocation(arraylist.getDouble(j1), arraylist.getDouble(k1));
            poidetail.setImage(arraylist.getString(k));
        }

        Utils.logger(TAG, (new StringBuilder()).append("getRowsForUpdate() 3: al.size():").append(arraylist1.size()).toString());
        arraylist.close();
        sqlitedatabase.close();
        return arraylist1;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        Utils.logger(TAG, "DB: PoiDbManager: onCreate");
        createPoiTable(sqlitedatabase);
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        Utils.logger(TAG, "DB: PoiDbManager: onUpgrade");
        createPoiTable(sqlitedatabase);
        convertOldFavorites(sqlitedatabase);
    }

    public boolean updatePois(ArrayList arraylist)
    {
        Utils.logger(TAG, "addPois(): ");
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        sqlitedatabase.beginTransaction();
        SQLiteStatement sqlitestatement = sqlitedatabase.compileStatement("update pois set title= ? ,image= ? ,latitude= ? ,longitude= ? ,address_1= ? ,address_2= ? ,city= ? ,state= ? ,zip= ? ,quality= ? ,inactive= ? ,short_description= ? WHERE poi_id = ?");
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); sqlitestatement.execute())
        {
            POIDetail poidetail = (POIDetail)arraylist.next();
            sqlitestatement.bindString(1, poidetail.getTitle());
            sqlitestatement.bindString(2, poidetail.getImage());
            sqlitestatement.bindDouble(3, poidetail.getLocation().lat);
            sqlitestatement.bindDouble(4, poidetail.getLocation().lng);
            sqlitestatement.bindString(5, poidetail.getAddress().getAddress1());
            sqlitestatement.bindString(6, poidetail.getAddress().getAddress2());
            sqlitestatement.bindString(7, poidetail.getAddress().getCity());
            sqlitestatement.bindString(8, poidetail.getAddress().getState());
            sqlitestatement.bindString(9, poidetail.getAddress().getZip());
            sqlitestatement.bindLong(10, poidetail.getQuality());
            sqlitestatement.bindLong(11, poidetail.getInactive());
            sqlitestatement.bindString(12, poidetail.getShortDescription());
            sqlitestatement.bindString(13, poidetail.getId());
        }

        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return true;
    }
}
