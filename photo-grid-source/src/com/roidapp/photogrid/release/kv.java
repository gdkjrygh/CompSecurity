// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Message;
import com.roidapp.baselib.d.a;
import java.io.File;
import java.util.HashMap;

// Referenced classes of package com.roidapp.photogrid.release:
//            kt, rf

final class kv
    implements Runnable
{

    final kt a;

    kv(kt kt1)
    {
        a = kt1;
        super();
    }

    public final void run()
    {
        String as[];
        String as1[];
        String s = (new StringBuilder("%")).append(com.roidapp.baselib.d.a.a()).append(File.separator).append("%").toString();
        as = new String[1];
        as[0] = s;
        as1 = new String[1];
        as1[0] = "_data";
        Object obj = com.roidapp.photogrid.release.kt.a(a).getContentResolver().query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, as1, "_data LIKE ?", as, "date_added desc");
        int i = 0;
_L5:
        Object obj1;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_618;
        }
        try
        {
            Thread.sleep(3000L);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((InterruptedException) (obj)).printStackTrace();
        }
        obj1 = com.roidapp.photogrid.release.kt.a(a).getContentResolver().query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, as1, "_data LIKE ?", as, "date_added desc");
_L10:
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        if (((Cursor) (obj1)).getCount() <= 0) goto _L4; else goto _L3
        obj;
        ((Exception) (obj)).printStackTrace();
        i = 1;
        obj = null;
          goto _L5
        obj;
        ((Exception) (obj)).printStackTrace();
        obj = Message.obtain();
        obj.what = 21;
        kt.b(a).sendMessage(((Message) (obj)));
_L9:
        return;
_L3:
        i = ((Cursor) (obj1)).getCount();
        obj = null;
        while (((Cursor) (obj1)).moveToNext()) 
        {
            String s1 = ((Cursor) (obj1)).getString(0);
            if (!rf.b(s1))
            {
                i--;
            } else
            if (obj == null)
            {
                obj = s1;
            }
        }
        String s2 = com.roidapp.baselib.d.a.a();
        ((Cursor) (obj1)).moveToFirst();
        HashMap hashmap = new HashMap();
        hashmap.put("folders_array", new String[] {
            s2
        });
        hashmap.put("first_pics", new String[] {
            obj
        });
        hashmap.put("count", new Integer[] {
            Integer.valueOf(i)
        });
        obj = Message.obtain();
        obj.what = 21;
        obj.obj = hashmap;
        kt.b(a).sendMessage(((Message) (obj)));
        kt.f(a);
_L7:
        if (obj1 != null && !((Cursor) (obj1)).isClosed())
        {
            ((Cursor) (obj1)).close();
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        obj = com.roidapp.baselib.d.a.a();
        File file = new File(((String) (obj)));
        if (file.exists())
        {
            String as4[] = file.list();
            if (as4 != null && as4.length > 0)
            {
                String as2[] = new String[as4.length];
                String as3[] = new String[as4.length];
                Integer ainteger[] = new Integer[as4.length];
                as2[0] = ((String) (obj));
                ainteger[0] = Integer.valueOf(as4.length);
                as3[0] = (new StringBuilder()).append(((String) (obj))).append("/").append(as4[as4.length - 1]).toString();
                obj = new HashMap();
                ((HashMap) (obj)).put("folders_array", as2);
                ((HashMap) (obj)).put("first_pics", as3);
                ((HashMap) (obj)).put("count", ainteger);
                Message message = Message.obtain();
                message.what = 21;
                message.obj = obj;
                kt.b(a).sendMessage(message);
                kt.f(a);
            } else
            {
                obj = Message.obtain();
                obj.what = 21;
                kt.b(a).sendMessage(((Message) (obj)));
                kt.f(a);
            }
        } else
        {
            obj = Message.obtain();
            obj.what = 21;
            kt.b(a).sendMessage(((Message) (obj)));
            kt.f(a);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        obj = Message.obtain();
        obj.what = 21;
        kt.b(a).sendMessage(((Message) (obj)));
        if (true) goto _L7; else goto _L6
_L6:
        if (true) goto _L9; else goto _L8
_L8:
        obj1 = obj;
          goto _L10
    }
}
