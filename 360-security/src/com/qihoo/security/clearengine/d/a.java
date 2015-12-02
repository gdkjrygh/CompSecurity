// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.d;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.qihoo.security.clearengine.TrashType;
import com.qihoo.security.clearengine.surface.b;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashClearCategory;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class a
{

    public static b a(TrashType trashtype, List list)
    {
        trashtype = new b(trashtype);
        list = list.iterator();
_L3:
        Object obj;
        long l;
        long l1;
        if (!list.hasNext())
        {
            return trashtype;
        }
        obj = (TrashInfo)list.next();
        ((TrashInfo) (obj)).bundle.setClassLoader(com/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo.getClassLoader());
        ArrayList arraylist = ((TrashInfo) (obj)).bundle.getParcelableArrayList("subList");
        if (arraylist == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        obj = arraylist.iterator();
        l = 0L;
        l1 = 0L;
_L4:
        if (((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        trashtype.a = ((b) (trashtype)).a + l1;
        trashtype.b = ((b) (trashtype)).b + l;
          goto _L3
_L2:
        TrashInfo trashinfo = (TrashInfo)((Iterator) (obj)).next();
        long l2 = l1;
        if (trashinfo.isSelected)
        {
            l2 = l1 + trashinfo.size;
        }
        l = trashinfo.size + l;
        l1 = l2;
          goto _L4
        if (((TrashInfo) (obj)).isSelected)
        {
            trashtype.a = ((b) (trashtype)).a + ((TrashInfo) (obj)).size;
        }
        l = ((b) (trashtype)).b;
        trashtype.b = ((TrashInfo) (obj)).size + l;
        l = 0L;
        l1 = 0L;
          goto _L1
    }

    public static String a(Context context, String s, String s1)
    {
        try
        {
            Resources resources = context.getResources();
            context = resources.getString(resources.getIdentifier(s, "string", context.getPackageName()));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return s1;
        }
        return context;
    }

    public static Map a(List list)
    {
        HashMap hashmap = new HashMap();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return hashmap;
            }
            Iterator iterator1 = ((TrashClearCategory)iterator.next()).trashInfoList.iterator();
            while (iterator1.hasNext()) 
            {
                Object obj = (TrashInfo)iterator1.next();
                ((TrashInfo) (obj)).bundle.setClassLoader(com/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo.getClassLoader());
                if (((TrashInfo) (obj)).bundle != null && ((TrashInfo) (obj)).bundle.containsKey("subList"))
                {
                    list = ((TrashInfo) (obj)).bundle.getParcelableArrayList("subList");
                    if (list != null)
                    {
                        obj = list.iterator();
                        while (((Iterator) (obj)).hasNext()) 
                        {
                            TrashInfo trashinfo = (TrashInfo)((Iterator) (obj)).next();
                            List list1 = (List)hashmap.get(trashinfo.path);
                            list = list1;
                            if (list1 == null)
                            {
                                list = new ArrayList();
                                hashmap.put(trashinfo.path, list);
                            }
                            list.add(trashinfo);
                        }
                    }
                } else
                {
                    List list2 = (List)hashmap.get(((TrashInfo) (obj)).path);
                    list = list2;
                    if (list2 == null)
                    {
                        list = new ArrayList();
                        hashmap.put(((TrashInfo) (obj)).path, list);
                    }
                    list.add(obj);
                }
            }
        } while (true);
    }

    public static Map a(Map map)
    {
        System.currentTimeMillis();
        ConcurrentHashMap concurrenthashmap = new ConcurrentHashMap();
        Iterator iterator = map.keySet().iterator();
        do
        {
label0:
            {
                if (!iterator.hasNext())
                {
                    return concurrenthashmap;
                }
                TrashType trashtype = (TrashType)iterator.next();
                ArrayList arraylist = new ArrayList();
                for (Iterator iterator1 = ((List)map.get(trashtype)).iterator(); iterator1.hasNext(); arraylist.add(((TrashInfo)iterator1.next()).clone()))
                {
                    break label0;
                }

                concurrenthashmap.put(trashtype, arraylist);
            }
        } while (true);
    }

    public static boolean a(int i)
    {
        int ai[] = new int[14];
        int[] _tmp = ai;
        ai[0] = 34;
        ai[1] = 35;
        ai[2] = 33;
        ai[3] = 321;
        ai[4] = 32;
        ai[5] = 321;
        ai[6] = 323;
        ai[7] = 322;
        ai[8] = 36;
        ai[9] = 361;
        ai[10] = 362;
        ai[11] = 363;
        ai[12] = 364;
        ai[13] = 365;
        int k = ai.length;
        int j = 0;
        do
        {
            if (j >= k)
            {
                return false;
            }
            if (ai[j] == i)
            {
                return true;
            }
            j++;
        } while (true);
    }

    public static Map b(Map map)
    {
        ConcurrentHashMap concurrenthashmap = new ConcurrentHashMap();
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return concurrenthashmap;
            }
            TrashType trashtype = (TrashType)iterator.next();
            concurrenthashmap.put(trashtype, ((b)map.get(trashtype)).a());
        } while (true);
    }

    public static void b(List list)
    {
        if (list != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                Object obj = (TrashClearCategory)list.next();
                if (((TrashClearCategory) (obj)).trashInfoList != null)
                {
                    obj = ((TrashClearCategory) (obj)).trashInfoList.iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        TrashInfo trashinfo = (TrashInfo)((Iterator) (obj)).next();
                        if (trashinfo.type == 321 || trashinfo.type == 33)
                        {
                            trashinfo.bundle.setClassLoader(com/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo.getClassLoader());
                            if (!TextUtils.isEmpty(trashinfo.desc) && trashinfo.bundle != null && trashinfo.bundle.containsKey("subList"))
                            {
                                Object obj1 = trashinfo.bundle.getParcelableArrayList("subList");
                                if (obj1 != null)
                                {
                                    obj1 = ((List) (obj1)).iterator();
                                    while (((Iterator) (obj1)).hasNext()) 
                                    {
                                        TrashInfo trashinfo1 = (TrashInfo)((Iterator) (obj1)).next();
                                        if (trashinfo1.bundle == null)
                                        {
                                            trashinfo1.bundle = new Bundle();
                                        }
                                        trashinfo1.bundle.putString("app_name", trashinfo.desc);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
