// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpenHelper extends SQLiteOpenHelper
{

    public DBOpenHelper(Context context)
    {
        super(context, "musicplayer.db", null, 1);
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("create table if not exists musictbl(id integer not null,title text not null,data text not null,size long,duration int not null,album text,album_id integer,artist text,folder_path text not null)");
        sqlitedatabase.execSQL("create table if not exists foldertbl(id integer primary key autoincrement,num integer not null,name text not null,path text not null)");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }
}
