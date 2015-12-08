// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.a;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.RingtoneManager;
import android.net.Uri;
import android.util.Log;
import com.arist.activity.MyApplication;
import com.arist.b.b;
import com.arist.c.f;
import com.arist.c.i;
import com.arist.model.b.c;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.arist.model.a:
//            b

public final class a
{

    public static final Object a = new Object();

    public a()
    {
    }

    public static int a(Context context)
    {
        i.a();
        c c1 = new c(context);
        ArrayList arraylist;
        ArrayList arraylist1;
        ArrayList arraylist2;
        Object obj;
        int j;
        if (MyApplication.e.l())
        {
            j = 60000;
        } else
        {
            j = 0;
        }
        obj = b(context, j);
        c1.a(j, ((ArrayList) (obj)));
        arraylist = c1.a();
        arraylist1 = new ArrayList();
        arraylist2 = new ArrayList();
        obj = ((ArrayList) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                c1.a(arraylist1);
                c1.a(arraylist2);
                c1.g();
                (new com.arist.model.a.b()).a();
                i.a("updateMusicDatabase");
                context.sendBroadcast(new Intent(com.arist.c.a.z));
                return c1.b();
            }
            b b1 = (b)((Iterator) (obj)).next();
            j = a(arraylist, b1);
            if (j == 0)
            {
                arraylist1.add(b1);
            } else
            if (j == 1)
            {
                arraylist2.add(b1);
            }
        } while (true);
    }

    private static int a(ArrayList arraylist, b b1)
    {
        arraylist = arraylist.iterator();
        b b2;
        do
        {
            if (!arraylist.hasNext())
            {
                return 0;
            }
            b2 = (b)arraylist.next();
        } while (b2.e() == null || !b2.e().equals(b1.e()));
        return b2.c() == b1.c() ? 2 : 1;
    }

    public static boolean a(Context context, int j)
    {
        try
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("is_ringtone", Boolean.valueOf(true));
            context.getContentResolver().update(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, contentvalues, "_id=?", new String[] {
                String.valueOf(j)
            });
            RingtoneManager.setActualDefaultRingtoneUri(context, 1, Uri.withAppendedPath(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, (new StringBuilder(String.valueOf(j))).toString()));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return false;
        }
        return true;
    }

    private static ArrayList b(Context context, int j)
    {
        ArrayList arraylist = new ArrayList();
        Object obj;
        context = context.getContentResolver();
        obj = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        String s = (new StringBuilder("duration > ")).append(j).append(" and is_music=1").toString();
        obj = context.query(((Uri) (obj)), new String[] {
            "_id", "title", "_data", "_size", "duration", "album", "album_id", "artist"
        }, s, null, null);
        if (obj == null) goto _L2; else goto _L1
_L1:
        context = ((Context) (obj));
        if (((Cursor) (obj)).getCount() <= 0) goto _L2; else goto _L3
_L3:
        context = ((Context) (obj));
        String as[] = new String[8];
        as[0] = "_id";
        as[1] = "title";
        as[2] = "_data";
        as[3] = "_size";
        as[4] = "duration";
        as[5] = "album";
        as[6] = "album_id";
        as[7] = "artist";
_L6:
        context = ((Context) (obj));
        boolean flag = ((Cursor) (obj)).moveToNext();
        if (flag) goto _L4; else goto _L2
_L2:
        com.arist.c.b.a(((Cursor) (obj)), null);
_L7:
        Log.i("MediaDatabase", (new StringBuilder(String.valueOf(arraylist.size()))).toString());
        return arraylist;
_L4:
        context = ((Context) (obj));
        b b1 = new b();
        context = ((Context) (obj));
        b1.a(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex(as[0])));
        context = ((Context) (obj));
        b1.c(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex(as[1])));
        context = ((Context) (obj));
        b1.d(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex(as[2])));
        context = ((Context) (obj));
        b1.a(((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndex(as[3])));
        context = ((Context) (obj));
        b1.b(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex(as[4])));
        context = ((Context) (obj));
        b1.e(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex(as[5])));
        context = ((Context) (obj));
        b1.c(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex(as[6])));
        context = ((Context) (obj));
        b1.f(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex(as[7])));
        context = ((Context) (obj));
        if (!com.arist.c.c.a(b1.e())) goto _L6; else goto _L5
_L5:
        context = ((Context) (obj));
        arraylist.add(b1);
          goto _L6
        Exception exception;
        exception;
_L10:
        context = ((Context) (obj));
        exception.printStackTrace();
        com.arist.c.b.a(((Cursor) (obj)), null);
          goto _L7
        obj;
        context = null;
_L9:
        com.arist.c.b.a(context, null);
        throw obj;
        obj;
        if (true) goto _L9; else goto _L8
_L8:
        exception;
        obj = null;
          goto _L10
    }

}
