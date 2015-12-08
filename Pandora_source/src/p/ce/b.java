// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ce;

import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import p.df.a;

// Referenced classes of package p.ce:
//            e, g

public class b extends e
{

    private final String a = "Rating";
    private final Uri b = Uri.parse("content://com.google.android.music.MusicContent/audio");

    public b()
    {
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
            break MISSING_BLOCK_LABEL_153;
        }
        arraylist.add(new g(s, s1, s2, true, e.a.b(s, s2), p.ce.e.a.a(s1, s2), p.ce.e.a.a(s2), Integer.toString(cursor.getInt(4)), "", "", "", false));
        p.df.a.c("GoogleCloudMusicLibrary", "Artist: %s - Album: %s - Song: %s IsMusic %s - GoogleCloudLibrary", new Object[] {
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
        return true;
    }

    String[] b()
    {
        return (new String[] {
            "title", "album", "artist", "is_music", "Rating"
        });
    }

    Uri c()
    {
        return b;
    }
}
