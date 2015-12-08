// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.roidapp.baselib.d.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

// Referenced classes of package com.roidapp.photogrid:
//            f

final class h
    implements Runnable
{

    final f a;

    h(f f1)
    {
        a = f1;
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
            obj = a.getActivity().getContentResolver().query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, as, ((String) (obj1)), as1, "date_modified desc");
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
                obj = a.getActivity().getContentResolver().query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, as, ((String) (obj1)), as1, "date_modified desc");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
                com.roidapp.photogrid.f.a(a).sendEmptyMessage(2);
                return;
            }
        }
        f.h();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_658;
        }
        f.h();
        if (((Cursor) (obj)).getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_606;
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
            obj.what = 1;
            obj.obj = null;
            com.roidapp.photogrid.f.a(a).sendMessage(((Message) (obj)));
            return;
        }
        if (!flag || i > 40)
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
            break MISSING_BLOCK_LABEL_265;
        }
        s = ((String) (obj1));
        j = i;
        if (!((String) (obj2)).startsWith("mnt"))
        {
            break MISSING_BLOCK_LABEL_265;
        }
        j = i;
        s = (new StringBuilder()).append(File.separator).append(((String) (obj1))).toString();
        j = i;
        obj2 = com.roidapp.photogrid.f.a(s);
        if (obj2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i;
        obj1 = new File(s);
        j = i;
        if (!((String) (obj2)).equals(s1))
        {
            break MISSING_BLOCK_LABEL_382;
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
        f.h();
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
            break MISSING_BLOCK_LABEL_556;
        }
        if (!((Cursor) (obj)).isClosed())
        {
            f.h();
            ((Cursor) (obj)).close();
        }
        f.h();
        HashMap hashmap = new HashMap();
        hashmap.put("pics", arraylist);
        f.h();
        Message message2 = Message.obtain();
        message2.what = 1;
        message2.obj = hashmap;
        com.roidapp.photogrid.f.a(a).sendMessage(message2);
        return;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_628;
        }
        if (!((Cursor) (obj)).isClosed())
        {
            f.h();
            ((Cursor) (obj)).close();
        }
        Message message1 = Message.obtain();
        message1.what = 1;
        message1.obj = null;
        com.roidapp.photogrid.f.a(a).sendMessage(message1);
        f.h();
        return;
        Message message = Message.obtain();
        message.what = 1;
        message.obj = null;
        com.roidapp.photogrid.f.a(a).sendMessage(message);
        f.h();
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
