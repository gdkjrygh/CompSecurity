// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ce;

import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import java.util.ArrayList;
import java.util.List;
import p.df.a;

// Referenced classes of package p.ce:
//            e, g

public class c extends e
{

    private final Uri a;

    public c()
    {
        a = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
    }

    List a(Cursor cursor)
    {
        ArrayList arraylist = new ArrayList(cursor.getCount());
        cursor.moveToFirst();
_L2:
        String s;
        String s1;
        String s2;
        s = cursor.getString(0);
        s1 = cursor.getString(1);
        s2 = cursor.getString(2);
        boolean flag;
        if (cursor.getInt(3) == 0)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        arraylist.add(new g(s, s1, s2, false, e.a.b(s, s2), p.ce.e.a.a(s1, s2), p.ce.e.a.a(s2), "", "", "", "", false));
        p.df.a.c("LocalExternalMusicLibrary", "Artist: %s - Album: %s - Song: %s isMusic %s - LocalExternalMemoryLibrary", new Object[] {
            s2, s1, s, String.valueOf(flag)
        });
        flag = cursor.moveToNext();
        if (flag) goto _L2; else goto _L1
_L1:
        cursor.close();
        return arraylist;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    public boolean a()
    {
        String s = Environment.getExternalStorageState();
        return s != null && (s.equals("mounted") || s.equals("mounted_ro"));
    }

    String[] b()
    {
        return (new String[] {
            "title", "album", "artist", "is_music"
        });
    }

    Uri c()
    {
        return a;
    }
}
