// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.biz;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import com.arist.dao.MusicDao;
import com.arist.dao.MusicFolderDao;
import com.arist.entity.Music;
import com.arist.entity.MusicFolder;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class MusicBiz
{

    private Context context;
    private int count;
    private MusicFolderDao folderDao;
    private MusicDao musicDao;
    private int totalMusic;

    public MusicBiz(Context context1)
    {
        count = 0;
        totalMusic = 0;
        context = context1;
    }

    public int addAllMusicToDB()
    {
        Cursor cursor = context.getContentResolver().query(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[] {
            "_id", "title", "_data", "_size", "duration", "album", "album_id", "artist"
        }, "duration > 30000", null, null);
        if (cursor == null || cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        String as[];
        as = new String[8];
        as[0] = "_id";
        as[1] = "title";
        as[2] = "_data";
        as[3] = "_size";
        as[4] = "duration";
        as[5] = "album";
        as[6] = "album_id";
        as[7] = "artist";
_L6:
        if (cursor.moveToNext()) goto _L4; else goto _L3
_L3:
        cursor.close();
_L2:
        return count;
_L4:
        Music music = new Music();
        music.setId(cursor.getInt(cursor.getColumnIndex(as[0])));
        music.setTitle(cursor.getString(cursor.getColumnIndex(as[1])));
        music.setData(cursor.getString(cursor.getColumnIndex(as[2])));
        music.setSize(cursor.getLong(cursor.getColumnIndex(as[3])));
        music.setDuration(cursor.getInt(cursor.getColumnIndex(as[4])));
        music.setAlbum(cursor.getString(cursor.getColumnIndex(as[5])));
        music.setAlbumId(cursor.getInt(cursor.getColumnIndex(as[6])));
        music.setArtist(cursor.getString(cursor.getColumnIndex(as[7])));
        music.setFolderPath((new File(music.getData())).getParentFile().getAbsolutePath());
        if (musicDao.insertMusic(music) > -1L)
        {
            count = count + 1;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int addMusicFolderToDB()
    {
        new ArrayList();
        ArrayList arraylist = musicDao.getFolder();
        Iterator iterator = arraylist.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return arraylist.size();
            }
            String s = (String)iterator.next();
            String s1 = (new File(s)).getName();
            MusicFolder musicfolder = new MusicFolder();
            musicfolder.setNum(folderDao.getMusicCount(s));
            musicfolder.setName(s1);
            musicfolder.setPath(s);
            folderDao.insertFolder(musicfolder);
        } while (true);
    }

    public int getCount()
    {
        return count;
    }

    public Music getMusicByData(String s)
    {
        Object obj = null;
        Cursor cursor = context.getContentResolver().query(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[] {
            "_id", "title", "_data", "_size", "duration", "album", "album_id", "artist"
        }, "_data=?", new String[] {
            s
        }, null);
        String as[] = new String[8];
        as[0] = "_id";
        as[1] = "title";
        as[2] = "_data";
        as[3] = "_size";
        as[4] = "duration";
        as[5] = "album";
        as[6] = "album_id";
        as[7] = "artist";
        s = obj;
        if (cursor != null)
        {
            s = obj;
            if (cursor.moveToNext())
            {
                s = new Music();
                s.setId(cursor.getInt(cursor.getColumnIndex(as[0])));
                s.setTitle(cursor.getString(cursor.getColumnIndex(as[1])));
                s.setData(cursor.getString(cursor.getColumnIndex(as[2])));
                s.setSize(cursor.getLong(cursor.getColumnIndex(as[3])));
                s.setDuration(cursor.getInt(cursor.getColumnIndex(as[4])));
                s.setAlbum(cursor.getString(cursor.getColumnIndex(as[5])));
                s.setAlbumId(cursor.getInt(cursor.getColumnIndex(as[6])));
                s.setArtist(cursor.getString(cursor.getColumnIndex(as[7])));
                s.setFolderPath((new File(s.getData())).getParentFile().getAbsolutePath());
                cursor.close();
            }
        }
        return s;
    }

    public ArrayList getRecentAddMusic()
    {
        ArrayList arraylist;
        String as[];
        Cursor cursor;
        long l;
        arraylist = new ArrayList();
        l = System.currentTimeMillis() / 1000L;
        as = new String[8];
        as[0] = "_id";
        as[1] = "title";
        as[2] = "_data";
        as[3] = "_size";
        as[4] = "duration";
        as[5] = "album";
        as[6] = "album_id";
        as[7] = "artist";
        cursor = context.getContentResolver().query(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[] {
            "_id", "title", "_data", "_size", "duration", "album", "album_id", "artist", "date_added"
        }, "mime_type!=?", new String[] {
            "audio/amr"
        }, null);
        if (cursor == null || cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        if (cursor.moveToNext()) goto _L4; else goto _L3
_L3:
        cursor.close();
_L2:
        return arraylist;
_L4:
        if ((long)cursor.getInt(cursor.getColumnIndex("date_added")) > l - 0x15180L)
        {
            Music music = new Music();
            music.setId(cursor.getInt(cursor.getColumnIndex(as[0])));
            music.setTitle(cursor.getString(cursor.getColumnIndex(as[1])));
            music.setData(cursor.getString(cursor.getColumnIndex(as[2])));
            music.setSize(cursor.getLong(cursor.getColumnIndex(as[3])));
            music.setDuration(cursor.getInt(cursor.getColumnIndex(as[4])));
            music.setAlbum(cursor.getString(cursor.getColumnIndex(as[5])));
            music.setAlbumId(cursor.getInt(cursor.getColumnIndex(as[6])));
            music.setArtist(cursor.getString(cursor.getColumnIndex(as[7])));
            music.setFolderPath((new File(music.getData())).getParentFile().getAbsolutePath());
            arraylist.add(music);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public int getTotalMusic()
    {
        Cursor cursor = context.getContentResolver().query(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[] {
            "_id"
        }, "duration > 30000", null, null);
        if (cursor != null && cursor.getCount() > 0)
        {
            totalMusic = cursor.getCount();
            cursor.close();
        }
        return totalMusic;
    }

    public void setFolderDao(MusicFolderDao musicfolderdao)
    {
        folderDao = musicfolderdao;
    }

    public void setMusicDao(MusicDao musicdao)
    {
        musicDao = musicdao;
    }
}
