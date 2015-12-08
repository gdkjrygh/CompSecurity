// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.b;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.arist.c.h;

public final class a extends SQLiteOpenHelper
{

    private Context a;

    public a(Context context)
    {
        super(context, "musicplayer.db", null, 1003);
        a = context;
    }

    private void a(SQLiteDatabase sqlitedatabase)
    {
        int ai[][];
        Object aobj[];
        ai = new int[24][];
        ai[0] = new int[5];
        aobj = new int[5];
        aobj[0] = 300;
        aobj[4] = 300;
        ai[1] = ((int []) (aobj));
        ai[2] = (new int[] {
            500, 300, -200, 400, 400
        });
        aobj = new int[5];
        aobj[0] = 600;
        aobj[2] = 200;
        aobj[3] = 400;
        aobj[4] = 100;
        ai[3] = ((int []) (aobj));
        ai[4] = new int[5];
        aobj = new int[5];
        aobj[0] = 300;
        aobj[3] = 200;
        aobj[4] = -100;
        ai[5] = ((int []) (aobj));
        aobj = new int[5];
        aobj[0] = 400;
        aobj[1] = 100;
        aobj[2] = 900;
        aobj[3] = 300;
        ai[6] = ((int []) (aobj));
        aobj = new int[5];
        aobj[0] = 500;
        aobj[1] = 300;
        aobj[3] = 100;
        aobj[4] = 300;
        ai[7] = ((int []) (aobj));
        ai[8] = (new int[] {
            400, 200, -200, 200, 500
        });
        ai[9] = (new int[] {
            -100, 200, 500, 100, -200
        });
        ai[10] = (new int[] {
            500, 300, -100, 300, 500
        });
        ai[11] = (new int[] {
            500, 300, 200, 400, 400
        });
        aobj = new int[5];
        aobj[0] = 600;
        aobj[1] = 400;
        aobj[2] = 100;
        ai[12] = ((int []) (aobj));
        aobj = new int[5];
        aobj[2] = 100;
        aobj[3] = 400;
        aobj[4] = 600;
        ai[13] = ((int []) (aobj));
        ai[14] = (new int[] {
            600, 300, 100, 300, 600
        });
        ai[15] = (new int[] {
            -300, -200, 300, 280, -100
        });
        aobj = new int[5];
        aobj[0] = 600;
        aobj[1] = 500;
        aobj[3] = 300;
        aobj[4] = 50;
        ai[16] = ((int []) (aobj));
        aobj = new int[5];
        aobj[0] = 500;
        aobj[1] = 50;
        aobj[2] = 350;
        aobj[4] = -480;
        ai[17] = ((int []) (aobj));
        aobj = new int[5];
        aobj[0] = 500;
        aobj[1] = 30;
        aobj[3] = 30;
        aobj[4] = 500;
        ai[18] = ((int []) (aobj));
        aobj = new int[5];
        aobj[0] = 350;
        aobj[2] = -100;
        aobj[3] = -50;
        aobj[4] = 300;
        ai[19] = ((int []) (aobj));
        aobj = new int[5];
        aobj[0] = 550;
        aobj[2] = -120;
        aobj[3] = -400;
        aobj[4] = 300;
        ai[20] = ((int []) (aobj));
        aobj = new int[5];
        aobj[0] = -300;
        aobj[2] = 300;
        aobj[3] = -100;
        aobj[4] = 100;
        ai[21] = ((int []) (aobj));
        ai[22] = (new int[] {
            300, 200, 250, 420, 410
        });
        ai[23] = (new int[] {
            520, 300, -300, 250, 400
        });
        aobj = a.getResources().getStringArray(0x7f0c0003);
        sqlitedatabase.execSQL("create table if not exists effect (_id integer primary key autoincrement,name varchar(10) not null,b1 integer not null, b2 integer not null, b3 integer not null, b4 integer not null, b5 integer not null)");
        if (aobj == null) goto _L2; else goto _L1
_L1:
        ContentValues contentvalues;
        int i;
        contentvalues = new ContentValues();
        i = 0;
_L5:
        if (i < aobj.length) goto _L3; else goto _L2
_L2:
        return;
_L3:
        contentvalues.clear();
        contentvalues.put("name", aobj[i]);
        contentvalues.put("b1", Integer.valueOf(ai[i][0]));
        contentvalues.put("b2", Integer.valueOf(ai[i][1]));
        contentvalues.put("b3", Integer.valueOf(ai[i][2]));
        contentvalues.put("b4", Integer.valueOf(ai[i][3]));
        contentvalues.put("b5", Integer.valueOf(ai[i][4]));
        sqlitedatabase.insert("effect", null, contentvalues);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("create table if not exists musictbl(_id integer primary key ,title text not null,data text not null,size long,duration int not null,album text,album_pic text,album_id integer,folder_path text,date integer,artist text,artist_pic text, play_time integer default 0)");
        sqlitedatabase.execSQL("create table if not exists playlist (_id integer primary key autoincrement,name text not null, sort integer default 0, setup_time integer not null)");
        sqlitedatabase.execSQL("create table if not exists music_playlist (_id integer primary key autoincrement,m_id integer not null,p_id integer not null,foreign key(m_id) references musictbl(_id) on delete cascade on update cascade,foreign key(p_id) references playlist(_id) on delete cascade on update cascade)");
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("name", a.getString(0x7f0900d6));
        contentvalues.put("setup_time", h.a(Long.valueOf(System.currentTimeMillis())));
        sqlitedatabase.insert("playlist", null, contentvalues);
        a(sqlitedatabase);
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        if (i < 1000)
        {
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS music_playlist");
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS musictbl");
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS playlist");
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS effect");
            onCreate(sqlitedatabase);
        }
        switch (i)
        {
        case 1001: 
        default:
            return;

        case 1000: 
            sqlitedatabase.execSQL("ALTER TABLE musictbl ADD play_time integer default 0");
            // fall through

        case 1002: 
            sqlitedatabase.execSQL("ALTER TABLE playlist ADD sort integer default 0");
            break;
        }
    }
}
