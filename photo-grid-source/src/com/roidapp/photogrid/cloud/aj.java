// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.c.t;
import com.roidapp.baselib.d.a;
import com.roidapp.baselib.e.r;
import com.roidapp.baselib.e.s;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            ak

public final class aj
    implements s
{

    private static final String a;
    private static volatile boolean b = false;
    private SharedPreferences c;

    public aj()
    {
    }

    private List a(String s1, String s2)
    {
        Object obj;
        ArrayList arraylist;
        JSONObject jsonobject;
        jsonobject = null;
        arraylist = null;
        obj = jsonobject;
        if (TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        s1 = (new JSONObject(s1)).optJSONArray("data");
        obj = jsonobject;
        if (s1 == null) goto _L2; else goto _L3
_L3:
        obj = new ArrayList();
        int j;
        arraylist = new ArrayList();
        j = s1.length();
        int i = 0;
_L13:
        if (i >= j) goto _L5; else goto _L4
_L4:
        jsonobject = s1.optJSONObject(i);
        if (jsonobject == null) goto _L7; else goto _L6
_L6:
        String s3;
        String s4;
        s3 = jsonobject.optString("name");
        s4 = jsonobject.optString("realName");
        if (s3 == null) goto _L7; else goto _L8
_L8:
        String s5;
        String s6;
        long l;
        long l1;
        s5 = (new StringBuilder("http://dl.pg.ksmobile.com/fonts/preview/")).append(jsonobject.optString("preview")).toString();
        l = jsonobject.optLong("size", 0L);
        s6 = jsonobject.optString("language");
        l1 = jsonobject.optLong("CRC");
        if (!s2.equals(s6)) goto _L10; else goto _L9
_L9:
        ((List) (obj)).add(new ak(this, s3, s4, s5, l, s6, l1, (byte)0));
          goto _L7
_L10:
        arraylist.add(new ak(this, s3, s4, s5, l, s6, l1, (byte)0));
          goto _L7
        s1;
        s2 = ((String) (obj));
        obj = s1;
        s1 = s2;
_L11:
        ((JSONException) (obj)).printStackTrace();
        obj = s1;
_L2:
        return ((List) (obj));
_L5:
        ((List) (obj)).addAll(arraylist);
        return ((List) (obj));
        obj;
        s1 = arraylist;
        if (true) goto _L11; else goto _L7
_L7:
        i++;
        if (true) goto _L13; else goto _L12
_L12:
    }

    private static boolean b(String s1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!TextUtils.isEmpty(s1))
        {
            try
            {
                s1 = (new JSONObject(s1)).optJSONArray("data");
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
                return false;
            }
            flag = flag1;
            if (s1 != null)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final List a(String s1)
    {
        return a(com.roidapp.baselib.d.a.a(new File(a, "info"), "UTF-8"), s1);
    }

    public final void a(int i, Exception exception)
    {
        b = false;
        c = null;
    }

    public final void a(Object obj)
    {
        obj = (String)obj;
        if (b(((String) (obj))))
        {
            File file = new File(a);
            if ((file.isDirectory() || file.mkdirs()) && com.roidapp.baselib.d.a.a(((String) (obj)), new File(file, "info"), "UTF-8"))
            {
                if (c != null)
                {
                    c.edit().putLong("FontListTime", System.currentTimeMillis()).commit();
                }
                return;
            }
        }
        c = null;
    }

    public final boolean a(Context context)
    {
        if (context != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        boolean flag;
        if (!(new File(a, "info")).exists())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && b) goto _L1; else goto _L3
_L3:
        b = true;
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (n.i() % 3 != 2) goto _L1; else goto _L4
_L4:
        c = PreferenceManager.getDefaultSharedPreferences(context);
        if (c == null || System.currentTimeMillis() - c.getLong("FontListTime", 0L) < 0xf731400L) goto _L1; else goto _L5
_L5:
        context = new r("http://dl.pg.ksmobile.com/fonts/info", this);
        try
        {
            t.a().execute(context);
        }
        catch (NoClassDefFoundError noclassdeffounderror)
        {
            (new Thread(context)).start();
        }
        return true;
    }

    static 
    {
        a = (new StringBuilder()).append(com.roidapp.baselib.d.a.b()).append(File.separator).append(".Fonts").toString();
    }
}
