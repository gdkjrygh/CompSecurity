// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core.b;

import android.content.Context;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.opti.sysclear.model.Data;
import com.qihoo360.mobilesafe.opti.sysclear.model.Item;
import com.qihoo360.mobilesafe.support.NativeManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a
{

    private static a a = null;
    private Data b;

    public a(Context context)
    {
        b = null;
        b(context);
    }

    public static a a(Context context)
    {
        com/qihoo360/mobilesafe/core/b/a;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new a(context.getApplicationContext());
        }
        context = a;
        com/qihoo360/mobilesafe/core/b/a;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private Item a(JSONObject jsonobject)
    {
        Item item;
        try
        {
            item = new Item();
            item.setName(jsonobject.optString("name"));
            item.setCategory(b(jsonobject.optString("category")));
            item.setFlag(b(jsonobject.optString("flag")));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        return item;
    }

    private List a(JSONArray jsonarray)
        throws JSONException
    {
        if (jsonarray != null && jsonarray.length() >= 1) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((List) (obj));
_L2:
        ArrayList arraylist = new ArrayList();
        int j = jsonarray.length();
        int i = 0;
        do
        {
            obj = arraylist;
            if (i >= j)
            {
                continue;
            }
            arraylist.add(a(jsonarray.optJSONObject(i)));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private byte[] a(InputStream inputstream)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[1024];
_L1:
        int i = inputstream.read(abyte0);
        if (i == -1)
        {
            try
            {
                bytearrayoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
            return bytearrayoutputstream.toByteArray();
        }
        bytearrayoutputstream.write(abyte0, 0, i);
          goto _L1
    }

    private int b(String s)
    {
        int i;
        try
        {
            i = Integer.valueOf(s).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0;
        }
        return i;
    }

    public int a(int i, String s)
    {
        Object obj = null;
        i;
        JVM INSTR tableswitch 101 104: default 32
    //                   101 62
    //                   102 54
    //                   103 70
    //                   104 78;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (obj == null) goto _L7; else goto _L6
_L6:
        obj = ((List) (obj)).iterator();
_L10:
        if (((Iterator) (obj)).hasNext()) goto _L8; else goto _L7
_L7:
        return 0;
_L3:
        obj = b();
        continue; /* Loop/switch isn't completed */
_L2:
        obj = a();
        continue; /* Loop/switch isn't completed */
_L4:
        obj = c();
        continue; /* Loop/switch isn't completed */
_L5:
        obj = d();
        continue; /* Loop/switch isn't completed */
_L8:
        Item item = (Item)((Iterator) (obj)).next();
        if (!s.equals(item.getName())) goto _L10; else goto _L9
_L9:
        return item.getFlag();
        if (true) goto _L1; else goto _L11
_L11:
    }

    public int a(String s)
    {
        Object obj;
        int i;
        boolean flag;
        obj = b();
        flag = false;
        i = ((flag) ? 1 : 0);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj)).iterator();
_L10:
        if (((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        i = ((flag) ? 1 : 0);
_L2:
        if (i != 0) goto _L6; else goto _L5
_L5:
        obj = a();
        if (obj == null) goto _L6; else goto _L7
_L7:
        obj = ((List) (obj)).iterator();
_L12:
        if (((Iterator) (obj)).hasNext()) goto _L8; else goto _L6
_L6:
        return i;
_L4:
        Item item = (Item)((Iterator) (obj)).next();
        if (!s.equals(item.getName()) || item.getFlag() != 4) goto _L10; else goto _L9
_L9:
        i = item.getCategory();
          goto _L2
_L8:
        item = (Item)((Iterator) (obj)).next();
        if (!s.equals(item.getName()) || item.getFlag() != 4) goto _L12; else goto _L11
_L11:
        return item.getCategory();
          goto _L2
    }

    public List a()
    {
        if (b != null)
        {
            return b.getProcess_();
        } else
        {
            return null;
        }
    }

    public List b()
    {
        if (b != null)
        {
            return b.getPackage_();
        } else
        {
            return null;
        }
    }

    public boolean b(Context context)
    {
        context = Utils.openLatestInputFile(context, "o_c_spb.dat");
        if (context != null)
        {
            context = Utils.getDESDecryptInputStream(context, NativeManager.a);
            try
            {
                JSONObject jsonobject = new JSONObject(new String(a(context), "UTF-8"));
                b = new Data();
                b.setSystem_(a(jsonobject.optJSONArray("system_")));
                b.setProcess_(a(jsonobject.optJSONArray("process_")));
                b.setSharedUserId_(a(jsonobject.optJSONArray("sharedUserId_")));
                b.setSuper_(a(jsonobject.optJSONArray("super_")));
                b.setPackage_(a(jsonobject.optJSONArray("package_")));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            if (context != null)
            {
                try
                {
                    context.close();
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public List c()
    {
        if (b != null)
        {
            return b.getSuper_();
        } else
        {
            return null;
        }
    }

    public List d()
    {
        if (b != null)
        {
            return b.getSharedUserId_();
        } else
        {
            return null;
        }
    }

}
