// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.tinder.enums.SqlDataType;
import com.tinder.model.Match;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProfilePhoto;
import com.tinder.utils.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.tinder.b:
//            b, j, c, l, 
//            f

public final class m extends b
{

    private final j a = new j();
    private c b[];

    public m()
    {
        b = (new c[] {
            new c("id", SqlDataType.TEXT, true), new c("user_id", SqlDataType.TEXT, false), new c("image_url", SqlDataType.TEXT, false), new c("origin_x", SqlDataType.INTEGER, false), new c("origin_y", SqlDataType.INTEGER, false), new c("height", SqlDataType.INTEGER, false), new c("width", SqlDataType.INTEGER, false), new c("xoffset_percent", SqlDataType.REAL, false), new c("yoffset_percent", SqlDataType.REAL, false), new c("xdistance_percent", SqlDataType.REAL, false), 
            new c("ydistance_percent", SqlDataType.REAL, false), new c("photo_order", SqlDataType.INTEGER, false)
        });
    }

    public static ContentValues a(ProfilePhoto profilephoto, String s, int i)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("id", profilephoto.getPhotoId());
        contentvalues.put("user_id", s);
        contentvalues.put("image_url", profilephoto.imageUrl);
        contentvalues.put("origin_x", Integer.valueOf(profilephoto.originX));
        contentvalues.put("origin_y", Integer.valueOf(profilephoto.originY));
        contentvalues.put("height", Integer.valueOf(profilephoto.height));
        contentvalues.put("width", Integer.valueOf(profilephoto.width));
        contentvalues.put("xoffset_percent", Float.valueOf(profilephoto.xOffsetPercent));
        contentvalues.put("yoffset_percent", Float.valueOf(profilephoto.yOffsetPercent));
        contentvalues.put("photo_order", Integer.valueOf(i));
        return contentvalues;
    }

    public static void a(String s)
    {
        l.a().a("photos", "user_id", s);
        l.a().a("photos_processed", "user_id", s);
    }

    public static void a(ArrayList arraylist, String s)
    {
        for (int i = 0; i < arraylist.size(); i++)
        {
            ProfilePhoto profilephoto = (ProfilePhoto)arraylist.get(i);
            l.a().a("photos", a(profilephoto, s, i));
            Object obj = profilephoto.processedPhotos;
            profilephoto.getPhotoId();
            for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); l.a().a("photos_processed", ((ContentValues) (obj))))
            {
                obj = j.a((ProcessedPhoto)iterator.next());
            }

        }

    }

    public static void a(Map map)
    {
        Map map1 = j.e();
        Object obj = l.a().a.query("photos", new String[] {
            "*"
        }, null, null, null, null, "photo_order");
        Object obj1 = obj;
        if (((Cursor) (obj)).getCount() <= 0) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        if (!((Cursor) (obj)).moveToNext()) goto _L2; else goto _L3
_L3:
        obj1 = obj;
        Object obj3 = ((Cursor) (obj)).getString(0);
        obj1 = obj;
        Object obj2 = ((Cursor) (obj)).getString(1);
        obj1 = obj;
        String s = ((Cursor) (obj)).getString(2);
        obj1 = obj;
        int i = ((Cursor) (obj)).getInt(3);
        obj1 = obj;
        int k = ((Cursor) (obj)).getInt(4);
        obj1 = obj;
        int i1 = ((Cursor) (obj)).getInt(5);
        obj1 = obj;
        int j1 = ((Cursor) (obj)).getInt(6);
        obj1 = obj;
        float f1 = ((Cursor) (obj)).getFloat(7);
        obj1 = obj;
        float f2 = ((Cursor) (obj)).getFloat(8);
        obj1 = obj;
        obj3 = new ProfilePhoto(s, ((String) (obj3)), j1, i1, ((Cursor) (obj)).getFloat(9), ((Cursor) (obj)).getFloat(10), f1, f2, i, k, (List)map1.get(obj3));
        obj1 = obj;
        obj2 = (Match)map.get(obj2);
        if (obj2 == null) goto _L1; else goto _L4
_L4:
        obj1 = obj;
        ((Match) (obj2)).addPhoto(((ProfilePhoto) (obj3)));
          goto _L1
        obj1;
        map = ((Map) (obj));
        obj = obj1;
_L10:
        v.b(((OutOfMemoryError) (obj)).getMessage());
        f.a(map);
        return;
_L2:
        f.a(((Cursor) (obj)));
        return;
        map;
        obj = null;
_L8:
        obj1 = obj;
        v.b(map.getMessage());
        f.a(((Cursor) (obj)));
        return;
        map;
        obj1 = null;
_L6:
        f.a(((Cursor) (obj1)));
        throw map;
        map;
        continue; /* Loop/switch isn't completed */
        obj;
        obj1 = map;
        map = ((Map) (obj));
        if (true) goto _L6; else goto _L5
_L5:
        map;
        if (true) goto _L8; else goto _L7
_L7:
        obj;
        map = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static ArrayList b(String s)
    {
        Object obj;
        obj = l.a().a;
        String s1 = (new StringBuilder("user_id='")).append(s).append('\'').toString();
        obj = ((SQLiteDatabase) (obj)).query("photos", new String[] {
            "*"
        }, s1, null, null, null, "photo_order");
        Object obj1 = new ArrayList(((Cursor) (obj)).getCount());
        if (s == null) goto _L2; else goto _L1
_L1:
        if (((Cursor) (obj)).getCount() <= 0) goto _L2; else goto _L3
_L3:
        ((Cursor) (obj)).moveToFirst();
        float f1;
        float f2;
        float f3;
        float f4;
        String s2;
        int i;
        int k;
        int i1;
        int j1;
        for (; !((Cursor) (obj)).isAfterLast(); ((ArrayList) (obj1)).add(new ProfilePhoto(s2, s, j1, i1, f3, f4, f1, f2, i, k, j.b(s))))
        {
            s = ((Cursor) (obj)).getString(0);
            s2 = ((Cursor) (obj)).getString(2);
            i = ((Cursor) (obj)).getInt(3);
            k = ((Cursor) (obj)).getInt(4);
            i1 = ((Cursor) (obj)).getInt(5);
            j1 = ((Cursor) (obj)).getInt(6);
            f1 = ((Cursor) (obj)).getFloat(7);
            f2 = ((Cursor) (obj)).getFloat(8);
            f3 = ((Cursor) (obj)).getFloat(9);
            f4 = ((Cursor) (obj)).getFloat(10);
            ((Cursor) (obj)).moveToNext();
        }

          goto _L4
        obj1;
        s = ((String) (obj));
        obj = obj1;
_L13:
        v.b(((Exception) (obj)).getMessage());
        obj = new ArrayList(0);
        if (s != null && !s.isClosed())
        {
            s.close();
        }
        return ((ArrayList) (obj));
_L2:
        HashMap hashmap;
        Iterator iterator;
        s = j.a(s);
        hashmap = new HashMap(s.size());
        iterator = s.iterator();
_L9:
        if (!iterator.hasNext()) goto _L6; else goto _L5
_L5:
        ProcessedPhoto processedphoto;
        String s3;
        processedphoto = (ProcessedPhoto)iterator.next();
        s3 = processedphoto.id;
        if (!hashmap.containsKey(s3)) goto _L8; else goto _L7
_L7:
        s = (ProfilePhoto)hashmap.get(s3);
_L10:
        ((ProfilePhoto) (s)).processedPhotos.add(processedphoto);
        hashmap.put(s3, s);
          goto _L9
        s;
_L11:
        if (obj != null && !((Cursor) (obj)).isClosed())
        {
            ((Cursor) (obj)).close();
        }
        throw s;
_L8:
        s = new ProfilePhoto(s3);
          goto _L10
_L6:
        for (s = hashmap.values().iterator(); s.hasNext(); ((ArrayList) (obj1)).add((ProfilePhoto)s.next())) { }
_L4:
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
          goto _L11
        obj1;
        obj = s;
        s = ((String) (obj1));
          goto _L11
        obj;
        s = null;
        if (true) goto _L13; else goto _L12
_L12:
    }

    protected final c[] a()
    {
        return b;
    }

    protected final String b()
    {
        return "photos";
    }
}
