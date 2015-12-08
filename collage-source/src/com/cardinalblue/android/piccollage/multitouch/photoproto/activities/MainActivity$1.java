// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.multitouch.photoproto.activities;

import android.content.SharedPreferences;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.controller.o;
import com.cardinalblue.android.piccollage.model.StickerBundle;
import com.cardinalblue.android.piccollage.model.a.a;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.multitouch.photoproto.activities:
//            MainActivity

class a
    implements Callable
{

    final a a;
    final MainActivity b;

    public Object call()
        throws Exception
    {
        Map map;
        boolean flag;
        a.getReadableDatabase();
        a.close();
        map = k.b("cardinalblue_video_ad_metadata").getAll();
        flag = map.isEmpty();
        if (flag)
        {
            com.cardinalblue.android.piccollage.multitouch.photoproto.activities.MainActivity.a(b).sendEmptyMessageDelayed(1, 2000L);
            return null;
        }
        o o1;
        List list;
        o1 = o.a();
        list = o1.g();
        int i = 0;
        Iterator iterator = map.keySet().iterator();
_L2:
        Object obj1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_216;
        }
        obj1 = (String)iterator.next();
        iterator1 = list.iterator();
_L4:
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        StickerBundle stickerbundle = (StickerBundle)iterator1.next();
        if (!stickerbundle.f().equals(obj1)) goto _L4; else goto _L3
_L3:
        obj1 = new File(o1.f(), (new StringBuilder()).append(stickerbundle.f()).append(".bundle").toString());
        if (!((File) (obj1)).exists() || !((File) (obj1)).isDirectory()) goto _L2; else goto _L5
_L5:
        com.cardinalblue.android.piccollage.multitouch.photoproto.activities.MainActivity.a(b, ((File) (obj1)));
        i++;
          goto _L2
        if (i != map.size()) goto _L7; else goto _L6
_L6:
        k.b("cardinalblue_video_ad_metadata").edit().clear().commit();
_L9:
        com.cardinalblue.android.piccollage.multitouch.photoproto.activities.MainActivity.a(b).sendEmptyMessageDelayed(1, 2000L);
        return null;
_L7:
        f.a(new IllegalStateException((new StringBuilder()).append("it have to removes ").append(map.size()).append(" sticker packs, but it only removes ").append(i).toString()));
        if (true) goto _L9; else goto _L8
_L8:
        Object obj;
        obj;
        f.a(((Throwable) (obj)));
        com.cardinalblue.android.piccollage.multitouch.photoproto.activities.MainActivity.a(b).sendEmptyMessageDelayed(1, 2000L);
        return null;
        obj;
        com.cardinalblue.android.piccollage.multitouch.photoproto.activities.MainActivity.a(b).sendEmptyMessageDelayed(1, 2000L);
        throw obj;
    }

    Y(MainActivity mainactivity, a a1)
    {
        b = mainactivity;
        a = a1;
        super();
    }
}
