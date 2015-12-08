// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.LongSparseArray;
import com.google.android.apps.moviemaker.music.DefaultLocalMusicDetailExtractor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class cse
{

    static final String a = cse.getSimpleName();
    private static final List d = Arrays.asList(new String[] {
        "Music", "Download"
    });
    private static final Uri e = Uri.parse("content://media/external/audio/albumart");
    public HashMap b;
    csp c;
    private csh f;

    private cse(csh csh1)
    {
        b = new HashMap();
        f = (csh)b.a(csh1, "detailExtractor", null);
    }

    public static cse a(Context context, cjs cjs, ckx ckx, css css1)
    {
        cse cse1 = new cse(new DefaultLocalMusicDetailExtractor(cjs, ckx));
        cse1.b.clear();
        LongSparseArray longsparsearray = new LongSparseArray();
        cjs = context.getContentResolver().query(android.provider.MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, new String[] {
            "_id", "album_art"
        }, null, null, null);
        if (cjs != null && cjs.moveToFirst())
        {
            do
            {
                ckx = cjs.getString(cjs.getColumnIndex("_id"));
                String s = cjs.getString(cjs.getColumnIndex("album_art"));
                longsparsearray.put(Long.valueOf(ckx).longValue(), s);
            } while (cjs.moveToNext());
        }
        Cursor cursor = context.getContentResolver().query(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[] {
            "_display_name", "artist", "title", "album", "album_id", "_id"
        }, "is_music = 1", null, null);
        if (cursor == null || !cursor.moveToFirst())
        {
            return cse1;
        }
        do
        {
            String s1 = cursor.getString(cursor.getColumnIndex("_display_name"));
            cjs = cursor.getString(cursor.getColumnIndex("artist"));
            String s2 = cursor.getString(cursor.getColumnIndex("title"));
            ckx = cursor.getString(cursor.getColumnIndex("album"));
            long l = cursor.getLong(cursor.getColumnIndex("album_id"));
            long l1 = cursor.getLong(cursor.getColumnIndex("_id"));
            String s3 = (String)longsparsearray.get(l);
            HashMap hashmap = cse1.b;
            context = cjs;
            if (b.e(cjs, "<unknown>"))
            {
                context = null;
            }
            cjs = ckx;
            if (d.contains(ckx))
            {
                cjs = null;
            }
            if (s3 == null)
            {
                ckx = null;
            } else
            {
                ckx = ContentUris.withAppendedId(e, l);
            }
            hashmap.put(s1, new cqa(context, s2, cjs, ckx, new cqc(s1), l1, -4L, true));
        } while (cursor.moveToNext());
        cse1.c = ((css)b.a(css1, "musicDetailCacheFactory", null)).a(new csf(cse1), new csg(cse1));
        return cse1;
    }

    static csh a(cse cse1)
    {
        return cse1.f;
    }

    static cvn a(cse cse1, cnx cnx1)
    {
        int i = 0;
        cse1 = new cvn();
        cse1.e = -1;
        cse1.d = cnx1.c;
        cse1.c = cnx1.e;
        cse1.b = cnx1.b;
        cnx1 = cnx1.a();
        cse1.a = new int[cnx1.length];
        long l = 0L;
        int k = cnx1.length;
        int j = 0;
        while (i < k) 
        {
            long l1 = cnx1[i];
            ((cvn) (cse1)).a[j] = (int)(l1 - l);
            j++;
            i++;
            l = l1;
        }
        return cse1;
    }

    static String a()
    {
        return a;
    }

    public final cqa a(cqc cqc1)
    {
        return (cqa)b.get(cqc1.c);
    }

}
