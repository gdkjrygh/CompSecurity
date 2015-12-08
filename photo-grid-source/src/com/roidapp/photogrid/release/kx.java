// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.roidapp.baselib.d.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

// Referenced classes of package com.roidapp.photogrid.release:
//            kt

final class kx
    implements Runnable
{

    final int a;
    final kt b;

    kx(kt kt1, int i)
    {
        b = kt1;
        a = i;
        super();
    }

    public final void run()
    {
        Object obj;
        ArrayList arraylist;
        int i;
        int j;
        String as[] = new String[1];
        as[0] = "_data";
        Object obj1 = String.format(Locale.ENGLISH, "%s >= ?", new Object[] {
            "date_modified"
        });
        long l = (System.currentTimeMillis() - 0x134fd9000L) / 1000L;
        String as1[] = new String[1];
        as1[0] = String.valueOf(l);
        String s;
        Exception exception;
        String s1;
        Object obj2;
        boolean flag;
        try
        {
            obj = com.roidapp.photogrid.release.kt.a(b).getContentResolver().query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, as, ((String) (obj1)), as1, "date_modified desc");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
            i = 1;
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        i = 0;
_L4:
        if (i != 0)
        {
            try
            {
                Thread.sleep(3000L);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((InterruptedException) (obj)).printStackTrace();
            }
            try
            {
                obj = com.roidapp.photogrid.release.kt.a(b).getContentResolver().query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, as, ((String) (obj1)), as1, "date_modified desc");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
                kt.b(b).sendEmptyMessage(4);
                return;
            }
        }
        com.roidapp.photogrid.release.kt.a(b, 60);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_741;
        }
        com.roidapp.photogrid.release.kt.a(b, 61);
        if (((Cursor) (obj)).getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_668;
        }
        arraylist = new ArrayList();
        s1 = com.roidapp.baselib.d.a.a();
        i = 0;
_L2:
        try
        {
            flag = ((Cursor) (obj)).moveToNext();
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            exception.printStackTrace();
            if (obj != null && !((Cursor) (obj)).isClosed())
            {
                ((Cursor) (obj)).close();
            }
            obj = Message.obtain();
            obj.what = 27;
            obj.arg1 = a;
            obj.obj = null;
            kt.b(b).sendMessage(((Message) (obj)));
            return;
        }
        if (!flag || i > 200)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        obj1 = ((Cursor) (obj)).getString(0);
        j = i;
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i;
        obj2 = ((String) (obj1)).toLowerCase(Locale.ENGLISH);
        s = ((String) (obj1));
        j = i;
        if (((String) (obj2)).startsWith("/mnt"))
        {
            break MISSING_BLOCK_LABEL_278;
        }
        s = ((String) (obj1));
        j = i;
        if (!((String) (obj2)).startsWith("mnt"))
        {
            break MISSING_BLOCK_LABEL_278;
        }
        j = i;
        s = (new StringBuilder()).append(File.separator).append(((String) (obj1))).toString();
        j = i;
        obj2 = com.roidapp.photogrid.release.kt.a(s);
        if (obj2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i;
        obj1 = new File(s);
        j = i;
        if (!((String) (obj2)).equals(s1))
        {
            break MISSING_BLOCK_LABEL_395;
        }
        j = i;
        if (!((File) (obj1)).exists())
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i;
        l = ((File) (obj1)).length();
        if (l <= 20480L)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = new android.graphics.BitmapFactory.Options();
        obj2.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(((File) (obj1)).getAbsolutePath(), ((android.graphics.BitmapFactory.Options) (obj2)));
        if (((android.graphics.BitmapFactory.Options) (obj2)).outWidth <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = ((android.graphics.BitmapFactory.Options) (obj2)).outHeight;
        if (j <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i;
        if (((File) (obj1)).length() <= 20480L)
        {
            continue; /* Loop/switch isn't completed */
        }
        i++;
        j = i;
        arraylist.add(s);
        continue; /* Loop/switch isn't completed */
        exception;
        com.roidapp.photogrid.release.kt.a(b, 75);
        exception.printStackTrace();
        i = j;
        continue; /* Loop/switch isn't completed */
        Exception exception1;
        exception1;
        j = i;
        exception1.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_590;
        }
        if (!((Cursor) (obj)).isClosed())
        {
            com.roidapp.photogrid.release.kt.a(b, 76);
            ((Cursor) (obj)).close();
        }
        com.roidapp.photogrid.release.kt.a(b, 80);
        HashMap hashmap = new HashMap();
        hashmap.put("pics", ((Object) (arraylist.toArray(new String[0]))));
        com.roidapp.photogrid.release.kt.a(b, 87);
        Message message2 = Message.obtain();
        message2.what = 27;
        message2.arg1 = a;
        message2.obj = hashmap;
        kt.b(b).sendMessage(message2);
        return;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_696;
        }
        if (!((Cursor) (obj)).isClosed())
        {
            com.roidapp.photogrid.release.kt.a(b, 88);
            ((Cursor) (obj)).close();
        }
        Message message1 = Message.obtain();
        message1.what = 27;
        message1.arg1 = a;
        message1.obj = null;
        kt.b(b).sendMessage(message1);
        com.roidapp.photogrid.release.kt.a(b, 89);
        return;
        Message message = Message.obtain();
        message.what = 27;
        message.arg1 = a;
        message.obj = null;
        kt.b(b).sendMessage(message);
        com.roidapp.photogrid.release.kt.a(b, 90);
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
