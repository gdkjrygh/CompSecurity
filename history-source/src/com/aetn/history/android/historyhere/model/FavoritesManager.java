// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.aetn.history.android.historyhere.utils.Utils;
import java.util.ArrayList;

public class FavoritesManager extends SQLiteOpenHelper
{

    static final String C_CATEGORY = "category";
    static final String C_DESCRIPTION = "description";
    static final String C_ID = "_id";
    static final String C_IMAGE = "image";
    static final String C_LATITUDE = "latitude";
    static final String C_LONGITUDE = "longitude";
    static final String C_POI_ID = "poi_id";
    static final String C_TITLE = "title";
    static final String DB_NAME = "historyhereDB";
    static final int DB_VERSION = 1;
    static final String TABLE = "favorites";
    final String TAG = getClass().getSimpleName();
    private Context mContext;

    public FavoritesManager(Context context)
    {
        super(context, "historyhereDB", null, 1);
        mContext = context;
        Utils.logger(TAG, "DB: FavoritesManager: init");
    }

    private boolean createFavoritesFile()
    {
        Utils.logger(TAG, "writeFavoritesFile() 1: ");
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("000000,");
        SQLiteDatabase sqlitedatabase = getReadableDatabase();
        Cursor cursor = sqlitedatabase.query("favorites", null, null, null, null, null, null);
        int i = cursor.getColumnIndex("poi_id");
        for (; cursor.moveToNext(); stringbuilder.append((new StringBuilder()).append(cursor.getString(i)).append(",").toString()))
        {
            Utils.logger(TAG, (new StringBuilder()).append("The idRow is: ").append(cursor.getString(i)).toString());
        }

        cursor.close();
        sqlitedatabase.close();
        Utils.logger(TAG, (new StringBuilder()).append("writeFavoritesFile() final string: ").append(stringbuilder.toString()).toString());
        setFavoritesPreference(stringbuilder.toString());
        return false;
    }

    public static String getFavoritesString(Context context)
    {
        context = context.getSharedPreferences("hhPrefs", 0);
        Utils.logger("FavoritesManager1", (new StringBuilder()).append("getFavoritesString(): ").append(context.getString("favorites", "")).toString());
        return context.getString("favorites", "");
    }

    private void setFavoritesPreference(String s)
    {
        SharedPreferences sharedpreferences = mContext.getSharedPreferences("hhPrefs", 0);
        android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString("favorites", s);
        editor.commit();
        Utils.logger(TAG, (new StringBuilder()).append("final favorites: ").append(sharedpreferences.getString("favorites", "")).toString());
    }

    public boolean addFavorite(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        Utils.logger(TAG, "addFavorite(): ");
        if (isFavorite(s))
        {
            return false;
        } else
        {
            Utils.logger(TAG, (new StringBuilder()).append("addFavorite(): ").append(s).append("|").append(s1).toString());
            SQLiteDatabase sqlitedatabase = getWritableDatabase();
            ContentValues contentvalues = new ContentValues();
            contentvalues.clear();
            contentvalues.put("poi_id", s);
            contentvalues.put("title", s1);
            contentvalues.put("image", s6);
            contentvalues.put("description", s2);
            contentvalues.put("category", s3);
            contentvalues.put("latitude", s4);
            contentvalues.put("longitude", s5);
            sqlitedatabase.insertOrThrow("favorites", null, contentvalues);
            sqlitedatabase.close();
            createFavoritesFile();
            dispatchFavoritesChanged();
            return true;
        }
    }

    public void dispatchFavoritesChanged()
    {
        Utils.logger(TAG, "dispatchFavoritesChanged()");
        Intent intent = new Intent("favorites changed");
        mContext.sendBroadcast(intent);
    }

    public ArrayList getFavoritesList()
    {
        Utils.logger(TAG, "getFavoritesList() 1: ");
        ArrayList arraylist = new ArrayList();
        SQLiteDatabase sqlitedatabase = getReadableDatabase();
        Cursor cursor = sqlitedatabase.query("favorites", null, null, null, null, null, "title");
        int i = cursor.getColumnIndex("poi_id");
        int j = cursor.getColumnIndex("title");
        int k = cursor.getColumnIndex("image");
        int l = cursor.getColumnIndex("description");
        int i1 = cursor.getColumnIndex("category");
        Utils.logger(TAG, "getFavoritesList() 2: ");
        int j1 = cursor.getColumnIndex("latitude");
        int k1 = cursor.getColumnIndex("longitude");
        Utils.logger(TAG, (new StringBuilder()).append("getFavoritesList() 3: latRow:").append(j1).append("|lngRow:").append(k1).toString());
        for (; cursor.moveToNext(); Utils.logger(TAG, (new StringBuilder()).append("rows.getString(lngRow):").append(cursor.getString(k1)).toString()))
        {
            Utils.logger(TAG, (new StringBuilder()).append("rows.rows.getString(idRow):").append(cursor.getString(i)).toString());
            Utils.logger(TAG, (new StringBuilder()).append("rows.getString(titleRow):").append(cursor.getString(j)).toString());
            Utils.logger(TAG, (new StringBuilder()).append("rows.getString(imageRow):").append(cursor.getString(k)).toString());
            Utils.logger(TAG, (new StringBuilder()).append("rows.getString(descRow):").append(cursor.getString(l)).toString());
            Utils.logger(TAG, (new StringBuilder()).append("rows.getString(catRow):").append(cursor.getString(i1)).toString());
            Utils.logger(TAG, (new StringBuilder()).append("rows.getString(latRow):").append(cursor.getString(j1)).toString());
        }

        Utils.logger(TAG, "getFavoritesList() 4: ");
        cursor.close();
        sqlitedatabase.close();
        return arraylist;
    }

    public boolean isFavorite(String s)
    {
        Utils.logger(TAG, (new StringBuilder()).append("isFavorite() 1: ").append(s).toString());
        boolean flag = false;
        SQLiteDatabase sqlitedatabase = getReadableDatabase();
        s = sqlitedatabase.query("favorites", null, (new StringBuilder()).append("poi_id=").append(s).toString(), null, null, null, null);
        if (s.moveToNext())
        {
            flag = true;
        }
        s.close();
        sqlitedatabase.close();
        Utils.logger(TAG, (new StringBuilder()).append("isFavorite() 1: ").append(flag).toString());
        return flag;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        Utils.logger(TAG, "DB: FavoritesManager: onCreate");
        sqlitedatabase.execSQL("create table favorites (_id int primary key, poi_id text, title text, image text, category text, longitude text, latitude text, description text)");
        Utils.logger(TAG, "FavoritesManager: DB created");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        sqlitedatabase.execSQL("drop table if exists favorites");
        Utils.logger(TAG, "onUpdated");
        onCreate(sqlitedatabase);
        sqlitedatabase.close();
    }

    public boolean removeFavorite(String s)
    {
        Utils.logger(TAG, (new StringBuilder()).append("removeFavorite(): ").append(s).toString());
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        sqlitedatabase.execSQL((new StringBuilder()).append("delete from favorites where poi_id = '").append(s).append("'").toString());
        sqlitedatabase.close();
        createFavoritesFile();
        dispatchFavoritesChanged();
        return true;
    }
}
