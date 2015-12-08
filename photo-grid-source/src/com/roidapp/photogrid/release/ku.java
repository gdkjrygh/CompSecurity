// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.roidapp.photogrid.release:
//            kt, kz

final class ku
    implements Runnable
{

    final kt a;

    ku(kt kt1)
    {
        a = kt1;
        super();
    }

    public final void run()
    {
        String as[];
        as = new String[3];
        as[0] = "_data";
        as[1] = "date_modified";
        as[2] = "_size";
        Object obj = kt.a(a).getContentResolver().query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, as, null, null, "date_modified desc");
        int i = 0;
_L10:
        Object obj1;
        Object obj2;
        Exception exception;
        String as1[];
        String s;
        Integer ainteger[];
        Object obj3;
        if (i != 0)
        {
            kz kz1;
            long l;
            boolean flag;
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
                obj2 = kt.a(a).getContentResolver().query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, as, null, null, "date_modified desc");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
                kt.b(a).sendEmptyMessage(23);
                return;
            }
        } else
        {
            obj2 = obj;
        }
        kt.a(a, 60);
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        System.currentTimeMillis();
        kt.a(a, 61);
        if (((Cursor) (obj2)).getCount() <= 0) goto _L4; else goto _L3
_L3:
        l = (System.currentTimeMillis() - 0x134fd9000L) / 1000L;
        obj = null;
        i = 0;
_L8:
        try
        {
            flag = ((Cursor) (obj2)).moveToNext();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
            if (obj2 != null && !((Cursor) (obj2)).isClosed())
            {
                ((Cursor) (obj2)).close();
            }
            kt.b(a).sendEmptyMessage(23);
            kt.f(a);
            return;
        }
        if (!flag) goto _L6; else goto _L5
_L5:
        s = ((Cursor) (obj2)).getString(0);
        if (TextUtils.isEmpty(s)) goto _L8; else goto _L7
_L7:
        obj3 = kt.a(s);
        if (obj3 == null) goto _L8; else goto _L9
_L9:
        if (i >= 200)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        if (((Cursor) (obj2)).getLong(1) <= l || ((Cursor) (obj2)).getLong(2) <= 20480L)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        kz1 = new kz(a, (byte)0);
        obj1 = kz1;
        kz1.a = s;
        obj = kz1;
        obj1 = obj;
        obj.b = ((kz) (obj)).b + 1;
        i++;
        obj1 = ((String) (obj3)).toLowerCase(Locale.ENGLISH);
        if (!((String) (obj1)).contains("dcim/"))
        {
            break MISSING_BLOCK_LABEL_405;
        }
        if (!kt.c(a).containsKey(obj3))
        {
            break MISSING_BLOCK_LABEL_359;
        }
        obj1 = (kz)kt.c(a).get(obj3);
        obj1.b = ((kz) (obj1)).b + 1;
          goto _L8
        obj;
        ((Exception) (obj)).printStackTrace();
        i = 1;
        obj = null;
          goto _L10
        obj1 = new kz(a, (byte)0);
        obj1.a = s;
        obj1.b = ((kz) (obj1)).b + 1;
        kt.c(a).put(obj3, obj1);
          goto _L8
label0:
        {
            if (!((String) (obj1)).contains("/face"))
            {
                break MISSING_BLOCK_LABEL_504;
            }
            if (!kt.d(a).containsKey(obj3))
            {
                break label0;
            }
            obj1 = (kz)kt.d(a).get(obj3);
            obj1.b = ((kz) (obj1)).b + 1;
        }
          goto _L8
        obj1 = new kz(a, (byte)0);
        obj1.a = s;
        obj1.b = ((kz) (obj1)).b + 1;
        kt.d(a).put(obj3, obj1);
          goto _L8
label1:
        {
            if (!kt.e(a).containsKey(obj3))
            {
                break label1;
            }
            obj1 = (kz)kt.e(a).get(obj3);
            obj1.b = ((kz) (obj1)).b + 1;
        }
          goto _L8
        obj1 = new kz(a, (byte)0);
        obj1.a = s;
        obj1.b = ((kz) (obj1)).b + 1;
        kt.e(a).put(obj3, obj1);
          goto _L8
        exception;
        obj = obj1;
        obj1 = exception;
_L18:
        kt.a(a, 75);
        ((Exception) (obj1)).printStackTrace();
          goto _L8
_L6:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_645;
        }
        if (!((Cursor) (obj2)).isClosed())
        {
            kt.a(a, 76);
            ((Cursor) (obj2)).close();
        }
        obj1 = new String[kt.c(a).size() + 1 + kt.e(a).size() + kt.d(a).size()];
        as1 = new String[kt.c(a).size() + 1 + kt.e(a).size() + kt.d(a).size()];
        ainteger = new Integer[kt.c(a).size() + 1 + kt.e(a).size() + kt.d(a).size()];
        kt.a(a, 80);
        obj1[0] = kt.a(a).getString(0x7f0702cd);
        if (obj == null) goto _L12; else goto _L11
_L11:
        ainteger[0] = Integer.valueOf(((kz) (obj)).b);
        as1[0] = ((kz) (obj)).a;
_L15:
        obj = kt.c(a).keySet().iterator();
        i = 1;
_L14:
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj3 = (String)((Iterator) (obj)).next();
        obj1[i] = ((String) (obj3));
        obj3 = (kz)kt.c(a).get(obj3);
        ainteger[i] = Integer.valueOf(((kz) (obj3)).b);
        as1[i] = ((kz) (obj3)).a;
        kt.a(a, 84);
        i++;
        if (true) goto _L14; else goto _L13
_L12:
        ainteger[0] = Integer.valueOf(0);
        as1[0] = null;
          goto _L15
_L13:
        obj = kt.d(a).keySet().iterator();
_L16:
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_1072;
        }
        obj3 = (String)((Iterator) (obj)).next();
        obj1[i] = ((String) (obj3));
        obj3 = (kz)kt.d(a).get(obj3);
        ainteger[i] = Integer.valueOf(((kz) (obj3)).b);
        as1[i] = ((kz) (obj3)).a;
        kt.a(a, 86);
        i++;
          goto _L16
        obj = kt.e(a).keySet().iterator();
_L17:
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_1163;
        }
        obj3 = (String)((Iterator) (obj)).next();
        obj1[i] = ((String) (obj3));
        obj3 = (kz)kt.e(a).get(obj3);
        ainteger[i] = Integer.valueOf(((kz) (obj3)).b);
        as1[i] = ((kz) (obj3)).a;
        i++;
          goto _L17
        obj = new HashMap();
        ((HashMap) (obj)).put("folders_array", obj1);
        ((HashMap) (obj)).put("first_pics", as1);
        ((HashMap) (obj)).put("count", ainteger);
        kt.a(a, 87);
        obj1 = Message.obtain();
        obj1.what = 17;
        obj1.obj = obj;
        kt.b(a).sendMessage(((Message) (obj1)));
        kt.f(a);
        return;
_L4:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_1269;
        }
        if (!((Cursor) (obj2)).isClosed())
        {
            kt.a(a, 88);
            ((Cursor) (obj2)).close();
        }
        kt.b(a).sendEmptyMessage(24);
        kt.a(a, 89);
        kt.f(a);
        return;
_L2:
        kt.b(a).sendEmptyMessage(24);
        kt.a(a, 90);
        kt.f(a);
        return;
        obj1;
          goto _L18
        obj1;
          goto _L18
    }
}
