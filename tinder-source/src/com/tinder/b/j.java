// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.tinder.enums.SqlDataType;
import com.tinder.enums.UserPhotoSize;
import com.tinder.model.ProcessedPhoto;
import com.tinder.utils.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.tinder.b:
//            b, c, l

public final class j extends b
{

    private c a[];

    public j()
    {
        a = (new c[] {
            new c("id", SqlDataType.TEXT, false), new c("user_id", SqlDataType.TEXT, false), new c("position", SqlDataType.INTEGER, false), new c("image_url", SqlDataType.TEXT, false), new c("height", SqlDataType.INTEGER, false), new c("width", SqlDataType.INTEGER, false), new c("unique_id", SqlDataType.TEXT, true)
        });
    }

    public static ContentValues a(ProcessedPhoto processedphoto)
    {
        ContentValues contentvalues = new ContentValues(6);
        contentvalues.put("id", processedphoto.id);
        contentvalues.put("user_id", processedphoto.ownerUserId);
        contentvalues.put("image_url", processedphoto.imageUrl);
        contentvalues.put("height", Integer.valueOf(processedphoto.height));
        contentvalues.put("width", Integer.valueOf(processedphoto.width));
        contentvalues.put("unique_id", (new StringBuilder()).append(processedphoto.id).append(processedphoto.width).toString());
        return contentvalues;
    }

    public static List a(String s)
    {
        Object obj;
        Object obj2;
        obj = null;
        obj2 = null;
        Object obj1 = l.a().b("photos_processed", (new StringBuilder("user_id='")).append(s).append('\'').toString());
        obj = new ArrayList(((Cursor) (obj1)).getCount());
        for (; ((Cursor) (obj1)).moveToNext(); ((List) (obj)).add(new ProcessedPhoto(((Cursor) (obj1)).getString(0), s, ((Cursor) (obj1)).getString(3), ((Cursor) (obj1)).getInt(5), ((Cursor) (obj1)).getInt(4)))) { }
          goto _L1
        obj;
        s = ((String) (obj1));
        obj1 = obj;
_L5:
        obj = s;
        v.b(((Exception) (obj1)).toString());
        obj = s;
        obj1 = new ArrayList(0);
        if (s != null && !s.isClosed())
        {
            s.close();
        }
        return ((List) (obj1));
_L1:
        if (obj1 != null && !((Cursor) (obj1)).isClosed())
        {
            ((Cursor) (obj1)).close();
            return ((List) (obj));
        } else
        {
            return ((List) (obj));
        }
        s;
_L3:
        if (obj != null && !((Cursor) (obj)).isClosed())
        {
            ((Cursor) (obj)).close();
        }
        throw s;
        s;
        obj = obj1;
        if (true) goto _L3; else goto _L2
_L2:
        obj1;
        s = obj2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static ArrayList b(String s)
    {
        Object obj;
        obj = l.a().a;
        String s1 = (new StringBuilder("id='")).append(s).append('\'').toString();
        obj = ((SQLiteDatabase) (obj)).query("photos_processed", new String[] {
            "*"
        }, s1, null, null, null, null);
        Object obj1;
        new ArrayList(((Cursor) (obj)).getCount());
        obj1 = new ArrayList(((Cursor) (obj)).getCount());
        if (s == null) goto _L2; else goto _L1
_L1:
        if (((Cursor) (obj)).getCount() > 0)
        {
            ((Cursor) (obj)).moveToFirst();
            String s2;
            String s3;
            int i;
            int k;
            for (; !((Cursor) (obj)).isAfterLast(); ((ArrayList) (obj1)).add(new ProcessedPhoto(s, s2, s3, i, k)))
            {
                s2 = ((Cursor) (obj)).getString(1);
                s3 = ((Cursor) (obj)).getString(3);
                i = ((Cursor) (obj)).getInt(5);
                k = ((Cursor) (obj)).getInt(4);
                ((Cursor) (obj)).getInt(2);
                ((Cursor) (obj)).moveToNext();
            }

        }
          goto _L2
        obj1;
        s = ((String) (obj));
        obj = obj1;
_L6:
        v.b(((Exception) (obj)).toString());
        obj = new ArrayList(0);
        if (s != null && !s.isClosed())
        {
            s.close();
        }
        return ((ArrayList) (obj));
_L2:
        if (obj != null && !((Cursor) (obj)).isClosed())
        {
            ((Cursor) (obj)).close();
            return ((ArrayList) (obj1));
        } else
        {
            return ((ArrayList) (obj1));
        }
        s;
        obj = null;
_L4:
        if (obj != null && !((Cursor) (obj)).isClosed())
        {
            ((Cursor) (obj)).close();
        }
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        obj1;
        obj = s;
        s = ((String) (obj1));
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        s = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static Map e()
    {
        Object obj = null;
        Object obj1 = l.a().a.query("photos_processed", new String[] {
            "*"
        }, null, null, null, null, null);
        obj = obj1;
        new HashMap(((Cursor) (obj1)).getCount());
        obj = obj1;
        Object obj2 = new HashMap(((Cursor) (obj1)).getCount());
_L2:
        obj = obj1;
        if (!((Cursor) (obj1)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        String s = ((Cursor) (obj1)).getString(0);
        obj = obj1;
        String s1 = ((Cursor) (obj1)).getString(1);
        obj = obj1;
        String s2 = ((Cursor) (obj1)).getString(3);
        obj = obj1;
        int i = ((Cursor) (obj1)).getInt(5);
        obj = obj1;
        int k = ((Cursor) (obj1)).getInt(4);
        obj = obj1;
        if (((Map) (obj2)).containsKey(s))
        {
            break MISSING_BLOCK_LABEL_158;
        }
        obj = obj1;
        ((Map) (obj2)).put(s, new ArrayList(UserPhotoSize.values().length));
        obj = obj1;
        ((ArrayList)((Map) (obj2)).get(s)).add(new ProcessedPhoto(s, s1, s2, i, k));
        if (true) goto _L2; else goto _L1
        obj2;
        obj = obj1;
        obj1 = obj2;
_L6:
        v.b(((OutOfMemoryError) (obj1)).getMessage());
        obj1 = new HashMap(0);
        if (obj != null && !((Cursor) (obj)).isClosed())
        {
            ((Cursor) (obj)).close();
        }
        return ((Map) (obj1));
_L1:
        if (obj1 != null && !((Cursor) (obj1)).isClosed())
        {
            ((Cursor) (obj1)).close();
            return ((Map) (obj2));
        } else
        {
            return ((Map) (obj2));
        }
        obj2;
        obj1 = obj;
        obj = obj2;
_L4:
        if (obj1 != null && !((Cursor) (obj1)).isClosed())
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
        obj2;
        obj1 = obj;
        obj = obj2;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final c[] a()
    {
        return a;
    }

    protected final String b()
    {
        return "photos_processed";
    }
}
