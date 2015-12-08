// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.core;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.net.Uri;
import android.preference.PreferenceManager;
import com.roidapp.baselib.d.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.videolib.core:
//            e, l, m, d

public final class n
{

    private static Map a = new HashMap();

    private static Context a(Context context, String s)
    {
        Context context1;
        Context context2;
        context1 = null;
        if (a.containsKey(s))
        {
            context1 = (Context)((WeakReference)a.get(s)).get();
        }
        context2 = context1;
        if (context1 != null) goto _L2; else goto _L1
_L1:
        context = context.createPackageContext(s, 2);
        context1 = context;
_L4:
        context2 = context1;
        if (context1 != null)
        {
            a.put(s, new WeakReference(context1));
            context2 = context1;
        }
_L2:
        return context2;
        context;
        context.printStackTrace();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean a(Context context)
    {
        return com.roidapp.baselib.c.n.a(context, "com.roidapp.photogrid.plugin.video");
    }

    private static void b(Context context, String s)
    {
        Intent intent1;
        try
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri uri = Uri.parse(s);
            intent.setFlags(0x10000000);
            intent.setData(uri);
            intent.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
            context.startActivity(intent);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            try
            {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri uri1 = Uri.parse(s);
                intent2.setFlags(0x10000000);
                intent2.setData(uri1);
                intent2.setPackage("com.android.browser");
                context.startActivity(intent2);
                return;
            }
            catch (Exception exception1)
            {
                exception.printStackTrace();
            }
            s = Uri.parse(s);
            intent1 = new Intent("android.intent.action.VIEW");
            intent1.setFlags(0x10000000);
            intent1.setData(s);
        }
        try
        {
            context.startActivity(intent1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    public static boolean b(Context context)
    {
        String s = (new StringBuilder()).append(com.roidapp.baselib.d.a.b()).append("/.video/").toString();
        if ((new File(s)).exists()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i = 0;
_L7:
        if (i >= com.roidapp.videolib.core.e.a.length) goto _L4; else goto _L3
_L3:
        Object obj;
        String s1;
        s1 = (new StringBuilder()).append(s).append(File.separator).append(com.roidapp.videolib.core.e.a[i]).toString();
        obj = new File(s1);
        if (!((File) (obj)).exists()) goto _L6; else goto _L5
_L5:
        obj = new FileInputStream(((File) (obj)));
        String s2 = com.roidapp.videolib.core.l.a(((InputStream) (obj)));
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        boolean flag = s2.equalsIgnoreCase(PreferenceManager.getDefaultSharedPreferences(context).getString((new StringBuilder("video")).append(s1).toString(), ""));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return false;
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        i++;
          goto _L7
        context;
        context = null;
_L11:
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
            return false;
        }
          goto _L6
        context;
        obj = null;
_L9:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw context;
_L4:
        return true;
        context;
        if (true) goto _L9; else goto _L8
_L8:
        context;
        context = ((Context) (obj));
        if (true) goto _L11; else goto _L10
_L10:
_L6:
        if (true) goto _L1; else goto _L12
_L12:
    }

    public static int c(Context context)
    {
        Object obj;
        String s;
        boolean flag;
        flag = false;
        s = (new StringBuilder()).append(com.roidapp.baselib.d.a.b()).append("/.video/").toString();
        obj = new File(s);
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).mkdirs();
        }
        if (((File) (obj)).exists()) goto _L2; else goto _L1
_L1:
        int k = 1;
_L10:
        return k;
_L2:
        ArrayList arraylist1;
        int i;
        arraylist1 = new ArrayList();
        i = 0;
_L7:
        if (i >= com.roidapp.videolib.core.e.a.length) goto _L4; else goto _L3
_L3:
        String s1;
        s1 = (new StringBuilder()).append(s).append(File.separator).append(com.roidapp.videolib.core.e.a[i]).toString();
        obj = new File(s1);
        if (((File) (obj)).exists()) goto _L6; else goto _L5
_L5:
        arraylist1.add(com.roidapp.videolib.core.e.a[i]);
_L8:
        i++;
          goto _L7
_L6:
        FileInputStream fileinputstream = new FileInputStream(((File) (obj)));
        obj = fileinputstream;
        String s3 = com.roidapp.videolib.core.l.a(fileinputstream);
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        obj = fileinputstream;
        if (s3.equalsIgnoreCase(PreferenceManager.getDefaultSharedPreferences(context).getString((new StringBuilder("video")).append(s1).toString(), "")))
        {
            break MISSING_BLOCK_LABEL_223;
        }
        obj = fileinputstream;
        arraylist1.add(com.roidapp.videolib.core.e.a[i]);
        try
        {
            fileinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
          goto _L8
        obj;
        fileinputstream = null;
_L14:
        obj = fileinputstream;
        arraylist1.add(com.roidapp.videolib.core.e.a[i]);
        if (fileinputstream != null)
        {
            try
            {
                fileinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
          goto _L8
        context;
        obj = null;
_L13:
        ArrayList arraylist;
        m am[];
        String s2;
        Object obj1;
        ArrayList arraylist2;
        int j;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (Exception exception) { }
        }
        throw context;
_L4:
        k = ((flag) ? 1 : 0);
        if (arraylist1.size() == 0) goto _L10; else goto _L9
_L9:
        obj = a(context, "com.roidapp.photogrid.plugin.video");
        if (obj == null)
        {
            return 2;
        }
        am = e(context);
        if (am == null || am.length <= 0)
        {
            return 2;
        }
        arraylist = new ArrayList();
        for (j = 0; j < am.length; j++)
        {
            obj1 = am[j].c;
            arraylist2 = am[j].d;
            arraylist.addAll(((java.util.Collection) (obj1)));
            arraylist.addAll(arraylist2);
        }

        j = 0;
_L12:
        k = ((flag) ? 1 : 0);
        if (j >= arraylist.size()) goto _L10; else goto _L11
_L11:
        k = 0;
        while (k < arraylist1.size()) 
        {
            if (((d)arraylist.get(j)).a.equalsIgnoreCase((String)arraylist1.get(k)))
            {
                s2 = (new StringBuilder()).append(s).append(File.separator).append((String)arraylist1.get(k)).toString();
                obj1 = new File(s2);
                if (((File) (obj1)).exists() && ((d)arraylist.get(j)).b.equalsIgnoreCase(com.roidapp.videolib.core.l.a(s2)))
                {
                    PreferenceManager.getDefaultSharedPreferences(context).edit().putString((new StringBuilder("video")).append(s2).toString(), ((d)arraylist.get(j)).b).commit();
                } else
                {
                    if (((File) (obj1)).exists())
                    {
                        ((File) (obj1)).delete();
                    }
                    com.roidapp.baselib.d.a.a(((Context) (obj)).getAssets(), ((File) (obj1)), (String)arraylist1.get(k));
                    PreferenceManager.getDefaultSharedPreferences(context).edit().putString((new StringBuilder("video")).append(s2).toString(), ((d)arraylist.get(j)).b).commit();
                }
            }
            k++;
        }
        j++;
          goto _L12
          goto _L10
        context;
          goto _L13
        Exception exception1;
        exception1;
          goto _L14
    }

    public static void d(Context context)
    {
        if (!com.roidapp.baselib.c.n.a(context, "com.android.vending"))
        {
            break MISSING_BLOCK_LABEL_137;
        }
        Intent intent;
        Uri uri = Uri.parse("market://details?id=com.roidapp.photogrid.plugin.video");
        intent = new Intent("android.intent.action.VIEW");
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            intent.setFlags(0x10000000);
        }
        intent.setClassName("com.android.vending", "com.google.android.finsky.activities.MainActivity");
        intent.setData(uri);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        context.startActivity(intent);
_L2:
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        Intent intent1;
        try
        {
            Uri uri1 = Uri.parse("market://details?id=com.roidapp.photogrid.plugin.video");
            intent1 = new Intent("android.intent.action.VIEW");
            if (android.os.Build.VERSION.SDK_INT < 19)
            {
                intent1.setFlags(0x10000000);
            }
            intent1.setPackage("com.android.vending");
            intent1.setData(uri1);
        }
        catch (Exception exception1)
        {
            b(context, "https://play.google.com/store/apps/details?id=com.roidapp.photogrid.plugin.video");
            exception1.printStackTrace();
            return;
        }
        if (context == null) goto _L2; else goto _L1
_L1:
        context.startActivity(intent1);
        return;
        b(context, "https://play.google.com/store/apps/details?id=com.roidapp.photogrid.plugin.video");
        return;
    }

    private static m[] e(Context context)
    {
        context = a(context, "com.roidapp.photogrid.plugin.video");
        if (context == null)
        {
            return null;
        }
        context = context.getAssets().open("video.plugin");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_380;
        }
        context = new JSONObject(com.roidapp.videolib.c.a.a(context, "utf-8"));
        context.getLong("id");
        context = context.optJSONArray("infos");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_380;
        }
        m am[];
        if (context.length() == 0)
        {
            break MISSING_BLOCK_LABEL_380;
        }
        am = new m[context.length()];
        int i = 0;
_L12:
        m m1;
        Object obj;
        if (i >= context.length())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = context.optJSONObject(i);
        m1 = new m();
        if (((JSONObject) (obj)).has("id"))
        {
            m1.a = ((JSONObject) (obj)).optLong("id");
        }
        if (((JSONObject) (obj)).has("type"))
        {
            m1.b = ((JSONObject) (obj)).optString("type");
        }
        if (!((JSONObject) (obj)).has("effect")) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray;
        m1.d = new ArrayList();
        jsonarray = ((JSONObject) (obj)).optJSONArray("effect");
        if (jsonarray == null) goto _L2; else goto _L3
_L3:
        if (jsonarray.length() <= 0) goto _L2; else goto _L4
_L4:
        int j = 0;
_L5:
        if (j >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj2 = jsonarray.getJSONObject(j);
        obj2 = new d(((JSONObject) (obj2)).getString("file"), ((JSONObject) (obj2)).getString("md5"));
        m1.d.add(obj2);
        j++;
        if (true) goto _L5; else goto _L2
_L2:
        if (!((JSONObject) (obj)).has("mask")) goto _L7; else goto _L6
_L6:
        m1.c = new ArrayList();
        obj = ((JSONObject) (obj)).optJSONArray("mask");
        if (obj == null) goto _L7; else goto _L8
_L8:
        if (((JSONArray) (obj)).length() <= 0) goto _L7; else goto _L9
_L9:
        j = 0;
_L10:
        if (j >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = ((JSONArray) (obj)).getJSONObject(j);
        obj1 = new d(((JSONObject) (obj1)).getString("file"), ((JSONObject) (obj1)).getString("md5"));
        m1.c.add(obj1);
        j++;
        if (true) goto _L10; else goto _L7
_L7:
        am[i] = m1;
        i++;
        if (true) goto _L12; else goto _L11
_L11:
        return am;
        context;
        return null;
        context;
        return null;
    }

}
