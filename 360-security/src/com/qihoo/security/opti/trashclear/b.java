// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.qihoo.security.SecurityApplication;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.InflaterInputStream;

public class b
{

    private static b a = null;
    private static Context b;
    private final Comparator c = new Comparator() {

        final b a;
        private final Collator b = Collator.getInstance();

        public int a(Map map, Map map1)
        {
            if (Integer.valueOf((String)map.get("pkgMemorySize")).intValue() < Integer.valueOf((String)map1.get("pkgMemorySize")).intValue())
            {
                return 1;
            }
            if (Integer.valueOf((String)map.get("pkgMemorySize")).intValue() > Integer.valueOf((String)map1.get("pkgMemorySize")).intValue())
            {
                return -1;
            }
            String s1 = (String)map.get("pkgName");
            String s = (String)map1.get("pkgName");
            map = s1;
            if (s1 == null)
            {
                map = "";
            }
            map1 = s;
            if (s == null)
            {
                map1 = "";
            }
            return b.compare(map, map1);
        }

        public int compare(Object obj, Object obj1)
        {
            return a((Map)obj, (Map)obj1);
        }

            
            {
                a = b.this;
                super();
            }
    };

    private b()
    {
        b = SecurityApplication.a();
    }

    private int a(ActivityManager activitymanager, int j)
    {
        if (activitymanager == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        activitymanager = activitymanager.getProcessMemoryInfo(new int[] {
            j
        })[0];
        if (activitymanager == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        j = activitymanager.getTotalPss();
        return j;
        activitymanager;
        return -1;
    }

    public static b a()
    {
        if (a == null)
        {
            a = new b();
        }
        return a;
    }

    private HashMap a(String s, int j)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("pkgName", s);
        hashmap.put("pkgMemorySize", String.valueOf(j));
        return hashmap;
    }

    private void b(List list)
    {
        list;
        JVM INSTR monitorenter ;
        Collections.sort(list, c);
        list;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean i()
    {
        return h() < 3;
    }

    public ArrayList a(Context context)
    {
        Object obj;
        ActivityManager activitymanager;
        activitymanager = (ActivityManager)context.getSystemService("activity");
        obj = new ArrayList();
        context = activitymanager.getRunningAppProcesses();
        if (context == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = (new ArrayList(context)).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        String s1;
        int j;
        context = (android.app.ActivityManager.RunningAppProcessInfo)iterator.next();
        if (((android.app.ActivityManager.RunningAppProcessInfo) (context)).pkgList == null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        s1 = ((android.app.ActivityManager.RunningAppProcessInfo) (context)).pkgList[0];
        j = a(activitymanager, ((android.app.ActivityManager.RunningAppProcessInfo) (context)).pid);
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        if (TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_217;
        }
        context = a(s1, j);
_L6:
        if (context == null) goto _L5; else goto _L4
_L4:
        ((List) (obj)).add(context);
          goto _L5
        context;
_L2:
        if (((List) (obj)).size() > 1)
        {
            b(((List) (obj)));
        }
        context = new ArrayList();
        if (((List) (obj)).size() > 0)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                String s = (String)((HashMap)((Iterator) (obj)).next()).get("pkgName");
                if (!context.contains(s))
                {
                    context.add(s);
                }
            } while (context.size() != 10);
        }
        return context;
        context = null;
          goto _L6
    }

    public void a(List list)
    {
        int j = 1;
        if (list != null && list.size() > 0)
        {
            int k = list.size();
            String s = (String)list.get(0);
            String s1 = s;
            if (k > 1)
            {
                do
                {
                    s1 = s;
                    if (j >= k)
                    {
                        break;
                    }
                    s = (new StringBuilder()).append(s).append(";").append((String)list.get(j)).toString();
                    j++;
                } while (true);
            }
            SharedPref.a(b, "clear_pre_pkg_data", s1);
            return;
        } else
        {
            SharedPref.a(b, "clear_pre_pkg_data", "");
            return;
        }
    }

    public List b()
    {
        ArrayList arraylist = new ArrayList();
        System.currentTimeMillis();
        Object obj;
        Object obj1;
        Object obj3;
        InputStreamReader inputstreamreader;
        String s;
        BufferedReader bufferedreader;
        try
        {
            obj = new FileInputStream(Utils.pathAppend(b.getFilesDir().getAbsolutePath(), "o_c_pre.dat"));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        obj3 = obj;
        Object obj2;
        if (obj == null)
        {
            try
            {
                obj3 = b.getAssets().open("o_c_pre.dat");
            }
            catch (Exception exception)
            {
                obj3 = obj;
            }
        }
        obj = "";
        inputstreamreader = new InputStreamReader(new InflaterInputStream(((InputStream) (obj3))), "UTF-8");
        obj1 = obj;
        bufferedreader = new BufferedReader(inputstreamreader);
_L5:
        obj1 = obj;
        s = bufferedreader.readLine();
        if (s == null) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L4; else goto _L3
_L3:
        obj = s;
_L6:
        obj1 = obj;
        arraylist.add(s);
          goto _L5
        obj;
        obj = obj1;
_L10:
        try
        {
            ((InputStream) (obj3)).close();
            inputstreamreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2) { }
        // Misplaced declaration of an exception variable
        catch (Object obj2) { }
_L7:
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            SharedPref.a(b, "clear_default_pre_pkg_data", ((String) (obj)));
        }
        return arraylist;
_L4:
        obj1 = obj;
        obj = (new StringBuilder()).append(((String) (obj))).append(";").append(s).toString();
          goto _L6
_L2:
        try
        {
            ((InputStream) (obj3)).close();
            inputstreamreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2) { }
        // Misplaced declaration of an exception variable
        catch (Object obj2) { }
          goto _L7
        obj;
        inputstreamreader = null;
_L9:
        try
        {
            ((InputStream) (obj3)).close();
            inputstreamreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2) { }
        // Misplaced declaration of an exception variable
        catch (Object obj2) { }
        throw obj;
        obj;
        if (true) goto _L9; else goto _L8
_L8:
        obj2;
        inputstreamreader = null;
          goto _L10
    }

    public ArrayList c()
    {
        Object obj;
        String s;
        ArrayList arraylist;
        arraylist = new ArrayList();
        obj = SharedPref.b(b, "clear_pre_pkg_data", "");
        s = SharedPref.b(b, "clear_default_pre_pkg_data", "");
        if (TextUtils.isEmpty(s))
        {
            arraylist.addAll(b());
        } else
        {
            arraylist.addAll(Arrays.asList(s.split(";")));
        }
        s = null;
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
        obj = a(b);
_L4:
        if (obj != null)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                s = (String)((Iterator) (obj)).next();
                if (!arraylist.contains(s))
                {
                    arraylist.add(s);
                }
            } while (true);
        }
        break; /* Loop/switch isn't completed */
_L2:
        String as[] = ((String) (obj)).split(";");
        obj = s;
        if (as != null)
        {
            obj = s;
            if (as.length > 0)
            {
                obj = Arrays.asList(as);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return arraylist;
    }

    public boolean d()
    {
        if (e()) goto _L2; else goto _L1
_L1:
        if (f()) goto _L4; else goto _L3
_L3:
        SharedPref.a(b, "clear_pre_num", 0);
_L5:
        return true;
_L4:
        if (i()) goto _L5; else goto _L2
_L2:
        return false;
    }

    public boolean e()
    {
        boolean flag = true;
        long l = System.currentTimeMillis();
        long l1 = SharedPref.b(b, "last_trash_clear_time", 0L);
        if (l - l1 > 0x3dcc500L || l < l1)
        {
            flag = false;
        }
        return flag;
    }

    public boolean f()
    {
        return System.currentTimeMillis() - SharedPref.b(b, "clear_default_pre_last_time", 0L) <= 0x3dcc500L;
    }

    public void g()
    {
        int j = SharedPref.b(b, "clear_pre_num", 0);
        if (j < 3)
        {
            SharedPref.a(b, "clear_pre_num", j + 1);
        }
    }

    public int h()
    {
        return SharedPref.b(b, "clear_pre_num", 0);
    }

}
