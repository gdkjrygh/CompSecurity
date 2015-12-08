// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.arist.entity.MusicFolder;
import java.util.ArrayList;

// Referenced classes of package com.arist.dao:
//            DBOpenHelper

public class MusicFolderDao
{

    private DBOpenHelper helper;

    public MusicFolderDao(Context context)
    {
        helper = new DBOpenHelper(context);
    }

    public void deleteAllFolder()
    {
        SQLiteDatabase sqlitedatabase = helper.getWritableDatabase();
        sqlitedatabase.execSQL("delete from foldertbl");
        sqlitedatabase.close();
    }

    public int deleteFolder(int i)
    {
        SQLiteDatabase sqlitedatabase = helper.getWritableDatabase();
        i = sqlitedatabase.delete("foldertbl", (new StringBuilder("id=")).append(i).toString(), null);
        sqlitedatabase.close();
        return i;
    }

    public ArrayList getAllFolder()
    {
        ArrayList arraylist;
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        arraylist = new ArrayList();
        sqlitedatabase = helper.getReadableDatabase();
        cursor = sqlitedatabase.rawQuery("select id,num,name,path from foldertbl", null);
        if (cursor == null || cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        if (cursor.moveToNext()) goto _L4; else goto _L3
_L3:
        cursor.close();
_L2:
        sqlitedatabase.close();
        return arraylist;
_L4:
        MusicFolder musicfolder = new MusicFolder();
        musicfolder.setId(cursor.getInt(cursor.getColumnIndex("id")));
        musicfolder.setNum(cursor.getInt(cursor.getColumnIndex("num")));
        musicfolder.setName(cursor.getString(cursor.getColumnIndex("name")));
        musicfolder.setPath(cursor.getString(cursor.getColumnIndex("path")));
        arraylist.add(musicfolder);
        if (true) goto _L1; else goto _L5
_L5:
    }

    public int getMusicCount(String s)
    {
        byte byte0 = -1;
        SQLiteDatabase sqlitedatabase = helper.getReadableDatabase();
        s = sqlitedatabase.query("musictbl", new String[] {
            "id"
        }, "folder_path=?", new String[] {
            s
        }, null, null, null);
        int i = byte0;
        if (s != null)
        {
            i = byte0;
            if (s.getCount() > 0)
            {
                i = s.getCount();
                s.close();
            }
        }
        sqlitedatabase.close();
        return i;
    }

    public long insertFolder(MusicFolder musicfolder)
    {
        SQLiteDatabase sqlitedatabase = helper.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("num", Integer.valueOf(musicfolder.getNum()));
        contentvalues.put("name", musicfolder.getName());
        contentvalues.put("path", musicfolder.getPath());
        long l = sqlitedatabase.insert("foldertbl", null, contentvalues);
        sqlitedatabase.close();
        return l;
    }

    public int updateFolder(MusicFolder musicfolder)
    {
        SQLiteDatabase sqlitedatabase = helper.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("num", Integer.valueOf(musicfolder.getNum()));
        contentvalues.put("name", musicfolder.getName());
        contentvalues.put("path", musicfolder.getPath());
        int i = sqlitedatabase.update("foldertbl", contentvalues, "id=?", new String[] {
            (new StringBuilder(String.valueOf(musicfolder.getId()))).toString()
        });
        sqlitedatabase.close();
        return i;
    }
}
