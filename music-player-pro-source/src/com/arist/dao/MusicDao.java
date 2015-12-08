// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.arist.entity.Music;
import com.arist.entity.MusicFolder;
import java.util.ArrayList;

// Referenced classes of package com.arist.dao:
//            DBOpenHelper

public class MusicDao
{

    private DBOpenHelper helper;

    public MusicDao(Context context)
    {
        helper = new DBOpenHelper(context);
    }

    public void deleteAllMusic()
    {
        SQLiteDatabase sqlitedatabase = helper.getWritableDatabase();
        sqlitedatabase.execSQL("delete from musictbl");
        sqlitedatabase.close();
    }

    public int deleteMusic(int i)
    {
        SQLiteDatabase sqlitedatabase = helper.getWritableDatabase();
        i = sqlitedatabase.delete("musictbl", (new StringBuilder("id=")).append(i).toString(), null);
        sqlitedatabase.close();
        return i;
    }

    public int getAlbumNum()
    {
        return getAlbums().size();
    }

    public ArrayList getAlbums()
    {
        ArrayList arraylist;
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        arraylist = new ArrayList();
        sqlitedatabase = helper.getReadableDatabase();
        cursor = sqlitedatabase.query("musictbl", new String[] {
            "album_id", "album"
        }, null, null, "album_id", null, null);
        if (cursor == null || cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        if (cursor.moveToNext()) goto _L3; else goto _L2
_L2:
        cursor.close();
        sqlitedatabase.close();
        return arraylist;
_L3:
        MusicFolder musicfolder = new MusicFolder();
        musicfolder.setId(cursor.getInt(cursor.getColumnIndex("album_id")));
        musicfolder.setName(cursor.getString(cursor.getColumnIndex("album")));
        musicfolder.setNum(getMusicNumByAlbumId(cursor.getInt(cursor.getColumnIndex("album_id"))));
        musicfolder.setPath("album");
        arraylist.add(musicfolder);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public ArrayList getAllMusic()
    {
        ArrayList arraylist;
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        arraylist = new ArrayList();
        sqlitedatabase = helper.getReadableDatabase();
        cursor = sqlitedatabase.rawQuery("select id,duration,album_id,size,title,data,album,artist,folder_path from musictbl", null);
        if (cursor == null || cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        if (cursor.moveToNext()) goto _L3; else goto _L2
_L2:
        cursor.close();
        sqlitedatabase.close();
        return arraylist;
_L3:
        Music music = new Music();
        music.setId(cursor.getInt(cursor.getColumnIndex("id")));
        music.setDuration(cursor.getInt(cursor.getColumnIndex("duration")));
        music.setAlbumId(cursor.getInt(cursor.getColumnIndex("album_id")));
        music.setSize(cursor.getLong(cursor.getColumnIndex("size")));
        music.setTitle(cursor.getString(cursor.getColumnIndex("title")));
        music.setData(cursor.getString(cursor.getColumnIndex("data")));
        music.setAlbum(cursor.getString(cursor.getColumnIndex("album")));
        music.setArtist(cursor.getString(cursor.getColumnIndex("artist")));
        music.setFolderPath(cursor.getString(cursor.getColumnIndex("folder_path")));
        arraylist.add(music);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public int getArtistNum()
    {
        return getArtists().size();
    }

    public ArrayList getArtists()
    {
        ArrayList arraylist;
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        arraylist = new ArrayList();
        sqlitedatabase = helper.getReadableDatabase();
        cursor = sqlitedatabase.query("musictbl", new String[] {
            "artist"
        }, null, null, "artist", null, null);
        if (cursor == null || cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (cursor.moveToNext()) goto _L3; else goto _L2
_L2:
        cursor.close();
        sqlitedatabase.close();
        return arraylist;
_L3:
        MusicFolder musicfolder = new MusicFolder();
        i++;
        musicfolder.setId(i);
        musicfolder.setName(cursor.getString(cursor.getColumnIndex("artist")));
        musicfolder.setNum(getMusicNumbyArtist(cursor.getString(cursor.getColumnIndex("artist"))));
        musicfolder.setPath("artist");
        arraylist.add(musicfolder);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public ArrayList getFolder()
    {
        ArrayList arraylist;
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        arraylist = new ArrayList();
        sqlitedatabase = helper.getReadableDatabase();
        cursor = sqlitedatabase.query("musictbl", new String[] {
            "folder_path"
        }, null, null, "folder_path", null, null);
        if (cursor == null || cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        if (cursor.moveToNext()) goto _L3; else goto _L2
_L2:
        cursor.close();
        sqlitedatabase.close();
        return arraylist;
_L3:
        arraylist.add(cursor.getString(cursor.getColumnIndex("folder_path")));
        if (true) goto _L1; else goto _L4
_L4:
    }

    public ArrayList getMusic(String s)
    {
        ArrayList arraylist;
        SQLiteDatabase sqlitedatabase;
        arraylist = new ArrayList();
        sqlitedatabase = helper.getReadableDatabase();
        s = sqlitedatabase.query("musictbl", new String[] {
            "id", "duration", "album_id", "size", "title", "data", "album", "artist", "folder_path"
        }, "folder_path=?", new String[] {
            s
        }, null, null, null);
        if (s == null || s.getCount() <= 0) goto _L2; else goto _L1
_L1:
        if (s.moveToNext()) goto _L3; else goto _L2
_L2:
        s.close();
        sqlitedatabase.close();
        return arraylist;
_L3:
        Music music = new Music();
        music.setId(s.getInt(s.getColumnIndex("id")));
        music.setDuration(s.getInt(s.getColumnIndex("duration")));
        music.setAlbumId(s.getInt(s.getColumnIndex("album_id")));
        music.setSize(s.getLong(s.getColumnIndex("size")));
        music.setTitle(s.getString(s.getColumnIndex("title")));
        music.setData(s.getString(s.getColumnIndex("data")));
        music.setAlbum(s.getString(s.getColumnIndex("album")));
        music.setArtist(s.getString(s.getColumnIndex("artist")));
        music.setFolderPath(s.getString(s.getColumnIndex("folder_path")));
        arraylist.add(music);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public Music getMusicById(int i)
    {
        Object obj;
        Object obj1;
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        obj1 = null;
        sqlitedatabase = helper.getReadableDatabase();
        obj = (new StringBuilder(String.valueOf(i))).toString();
        cursor = sqlitedatabase.query("musictbl", new String[] {
            "duration", "album_id", "size", "title", "data", "album", "artist", "folder_path"
        }, "id=?", new String[] {
            obj
        }, null, null, null);
        obj = obj1;
        if (cursor == null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (cursor.getCount() <= 0) goto _L2; else goto _L3
_L3:
        obj = new Music();
        ((Music) (obj)).setId(i);
_L6:
        if (cursor.moveToNext()) goto _L4; else goto _L2
_L2:
        cursor.close();
        sqlitedatabase.close();
        return ((Music) (obj));
_L4:
        ((Music) (obj)).setDuration(cursor.getInt(cursor.getColumnIndex("duration")));
        ((Music) (obj)).setAlbumId(cursor.getInt(cursor.getColumnIndex("album_id")));
        ((Music) (obj)).setSize(cursor.getLong(cursor.getColumnIndex("size")));
        ((Music) (obj)).setTitle(cursor.getString(cursor.getColumnIndex("title")));
        ((Music) (obj)).setData(cursor.getString(cursor.getColumnIndex("data")));
        ((Music) (obj)).setAlbum(cursor.getString(cursor.getColumnIndex("album")));
        ((Music) (obj)).setArtist(cursor.getString(cursor.getColumnIndex("artist")));
        ((Music) (obj)).setFolderPath(cursor.getString(cursor.getColumnIndex("folder_path")));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Music getMusicByPath(String s)
    {
        Object obj;
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        obj = null;
        sqlitedatabase = helper.getReadableDatabase();
        cursor = sqlitedatabase.query("musictbl", new String[] {
            "id", "duration", "album_id", "size", "title", "data", "album", "artist", "folder_path"
        }, "data=?", new String[] {
            s
        }, null, null, null);
        s = obj;
        if (cursor == null) goto _L2; else goto _L1
_L1:
        s = obj;
        if (cursor.getCount() <= 0) goto _L2; else goto _L3
_L3:
        s = new Music();
_L6:
        if (cursor.moveToNext()) goto _L4; else goto _L2
_L2:
        cursor.close();
        sqlitedatabase.close();
        return s;
_L4:
        s.setId(cursor.getInt(cursor.getColumnIndex("id")));
        s.setDuration(cursor.getInt(cursor.getColumnIndex("duration")));
        s.setAlbumId(cursor.getInt(cursor.getColumnIndex("album_id")));
        s.setSize(cursor.getLong(cursor.getColumnIndex("size")));
        s.setTitle(cursor.getString(cursor.getColumnIndex("title")));
        s.setData(cursor.getString(cursor.getColumnIndex("data")));
        s.setAlbum(cursor.getString(cursor.getColumnIndex("album")));
        s.setArtist(cursor.getString(cursor.getColumnIndex("artist")));
        s.setFolderPath(cursor.getString(cursor.getColumnIndex("folder_path")));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int getMusicNumByAlbumId(int i)
    {
        ArrayList arraylist = getMusicsByAlbumId(i);
        if (arraylist != null)
        {
            return arraylist.size();
        } else
        {
            return 0;
        }
    }

    public int getMusicNumbyArtist(String s)
    {
        new ArrayList();
        s = getMusicsByArtist(s);
        if (s != null)
        {
            return s.size();
        } else
        {
            return 0;
        }
    }

    public ArrayList getMusicsByAlbumId(int i)
    {
        ArrayList arraylist;
        SQLiteDatabase sqlitedatabase;
        Object obj;
        arraylist = new ArrayList();
        sqlitedatabase = helper.getReadableDatabase();
        obj = (new StringBuilder()).append(i).toString();
        obj = sqlitedatabase.query("musictbl", new String[] {
            "id", "duration", "album_id", "size", "title", "data", "album", "artist", "folder_path"
        }, "album_id=?", new String[] {
            obj
        }, null, null, null);
        if (obj == null || ((Cursor) (obj)).getCount() <= 0) goto _L2; else goto _L1
_L1:
        if (((Cursor) (obj)).moveToNext()) goto _L3; else goto _L2
_L2:
        ((Cursor) (obj)).close();
        sqlitedatabase.close();
        return arraylist;
_L3:
        Music music = new Music();
        music.setId(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("id")));
        music.setDuration(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("duration")));
        music.setAlbumId(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("album_id")));
        music.setSize(((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndex("size")));
        music.setTitle(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("title")));
        music.setData(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("data")));
        music.setAlbum(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("album")));
        music.setArtist(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("artist")));
        music.setFolderPath(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("folder_path")));
        arraylist.add(music);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public ArrayList getMusicsByArtist(String s)
    {
        ArrayList arraylist;
        SQLiteDatabase sqlitedatabase;
        arraylist = new ArrayList();
        sqlitedatabase = helper.getReadableDatabase();
        s = sqlitedatabase.query("musictbl", new String[] {
            "id", "duration", "album_id", "size", "title", "data", "album", "artist", "folder_path"
        }, "artist=?", new String[] {
            s
        }, null, null, null);
        if (s == null || s.getCount() <= 0) goto _L2; else goto _L1
_L1:
        if (s.moveToNext()) goto _L3; else goto _L2
_L2:
        s.close();
        sqlitedatabase.close();
        return arraylist;
_L3:
        Music music = new Music();
        music.setId(s.getInt(s.getColumnIndex("id")));
        music.setDuration(s.getInt(s.getColumnIndex("duration")));
        music.setAlbumId(s.getInt(s.getColumnIndex("album_id")));
        music.setSize(s.getLong(s.getColumnIndex("size")));
        music.setTitle(s.getString(s.getColumnIndex("title")));
        music.setData(s.getString(s.getColumnIndex("data")));
        music.setAlbum(s.getString(s.getColumnIndex("album")));
        music.setArtist(s.getString(s.getColumnIndex("artist")));
        music.setFolderPath(s.getString(s.getColumnIndex("folder_path")));
        arraylist.add(music);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public ArrayList getTempAlbums()
    {
        ArrayList arraylist;
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        arraylist = new ArrayList();
        sqlitedatabase = helper.getReadableDatabase();
        cursor = sqlitedatabase.query("musictbl", new String[] {
            "album_id", "album"
        }, null, null, "album_id", null, null);
        if (cursor == null || cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        if (cursor.moveToNext()) goto _L3; else goto _L2
_L2:
        cursor.close();
        sqlitedatabase.close();
        return arraylist;
_L3:
        MusicFolder musicfolder = new MusicFolder();
        musicfolder.setId(cursor.getInt(cursor.getColumnIndex("album_id")));
        musicfolder.setName(cursor.getString(cursor.getColumnIndex("album")));
        musicfolder.setNum(getMusicNumByAlbumId(cursor.getInt(cursor.getColumnIndex("album_id"))));
        musicfolder.setPath("album");
        arraylist.add(musicfolder);
        if (arraylist.size() > 9)
        {
            cursor.close();
            sqlitedatabase.close();
            return arraylist;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public ArrayList getTempArtists()
    {
        ArrayList arraylist;
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        arraylist = new ArrayList();
        sqlitedatabase = helper.getReadableDatabase();
        cursor = sqlitedatabase.query("musictbl", new String[] {
            "artist"
        }, null, null, "artist", null, null);
        if (cursor == null || cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (cursor.moveToNext()) goto _L3; else goto _L2
_L2:
        cursor.close();
        sqlitedatabase.close();
        return arraylist;
_L3:
        MusicFolder musicfolder = new MusicFolder();
        i++;
        musicfolder.setId(i);
        musicfolder.setName(cursor.getString(cursor.getColumnIndex("artist")));
        musicfolder.setNum(getMusicNumbyArtist(cursor.getString(cursor.getColumnIndex("artist"))));
        musicfolder.setPath("artist");
        arraylist.add(musicfolder);
        if (arraylist.size() > 9)
        {
            cursor.close();
            sqlitedatabase.close();
            return arraylist;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public long insertMusic(Music music)
    {
        SQLiteDatabase sqlitedatabase = helper.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("id", (new StringBuilder()).append(music.getId()).toString());
        contentvalues.put("title", music.getTitle());
        contentvalues.put("data", music.getData());
        contentvalues.put("size", (new StringBuilder()).append(music.getSize()).toString());
        contentvalues.put("duration", Integer.valueOf(music.getDuration()));
        contentvalues.put("album", music.getAlbum());
        contentvalues.put("album_id", (new StringBuilder(String.valueOf(music.getAlbumId()))).toString());
        contentvalues.put("artist", music.getArtist());
        contentvalues.put("folder_path", music.getFolderPath());
        long l = sqlitedatabase.insert("musictbl", null, contentvalues);
        sqlitedatabase.close();
        return l;
    }

    public int updateMusic(Music music)
    {
        SQLiteDatabase sqlitedatabase = helper.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("title", music.getTitle());
        contentvalues.put("data", music.getData());
        contentvalues.put("size", (new StringBuilder()).append(music.getSize()).toString());
        contentvalues.put("duration", Integer.valueOf(music.getDuration()));
        contentvalues.put("album", music.getAlbum());
        contentvalues.put("album_id", (new StringBuilder()).append(music.getAlbumId()).toString());
        contentvalues.put("artist", music.getArtist());
        contentvalues.put("folder_path", music.getFolderPath());
        int i = sqlitedatabase.update("musictbl", contentvalues, "id=?", new String[] {
            (new StringBuilder(String.valueOf(music.getId()))).toString()
        });
        sqlitedatabase.close();
        return i;
    }
}
