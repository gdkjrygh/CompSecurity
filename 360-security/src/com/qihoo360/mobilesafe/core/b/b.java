// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core.b;

import android.content.Context;
import com.qihoo360.mobilesafe.service.ProcessInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.qihoo360.mobilesafe.core.b:
//            e, a

public class b
{

    private static final String a = com/qihoo360/mobilesafe/core/b/b.getSimpleName();
    private Context b;

    public b(Context context)
    {
        b = context;
    }

    public List a(List list, Context context)
    {
        ArrayList arraylist = new ArrayList();
        if (list == null || list.isEmpty()) goto _L2; else goto _L1
_L1:
        Map map;
        ArrayList arraylist1;
        ArrayList arraylist2;
        ArrayList arraylist3;
        ArrayList arraylist4;
        map = e.a(context).c();
        context = e.a(context).d();
        arraylist1 = new ArrayList();
        arraylist2 = new ArrayList();
        arraylist3 = new ArrayList();
        arraylist4 = new ArrayList();
        list = list.iterator();
_L6:
        if (list.hasNext()) goto _L4; else goto _L3
_L3:
        arraylist.add(arraylist2);
        arraylist.add(arraylist4);
        arraylist.add(arraylist1);
        arraylist.add(arraylist3);
_L2:
        return arraylist;
_L4:
        ProcessInfo processinfo = (ProcessInfo)list.next();
        if (map.containsKey(processinfo.packageName))
        {
            if (((Integer)map.get(processinfo.packageName)).intValue() == 0)
            {
                arraylist3.add(processinfo);
            } else
            if (((Integer)map.get(processinfo.packageName)).intValue() == 1)
            {
                if (processinfo.flag == 2)
                {
                    arraylist4.add(processinfo);
                } else
                if (processinfo.flag == 4)
                {
                    processinfo.category = com.qihoo360.mobilesafe.core.b.a.a(b).a(processinfo.packageName);
                    if (processinfo.category == 0)
                    {
                        processinfo.category = com.qihoo360.mobilesafe.core.b.a.a(b).a(processinfo.processName);
                    }
                    arraylist1.add(processinfo);
                } else
                if (processinfo.flag == 3)
                {
                    arraylist4.add(processinfo);
                } else
                if (processinfo.flag == 0)
                {
                    arraylist2.add(processinfo);
                }
            }
        } else
        if (context.containsKey(processinfo.packageName))
        {
            arraylist3.add(processinfo);
        } else
        if (processinfo.flag == 4)
        {
            processinfo.category = com.qihoo360.mobilesafe.core.b.a.a(b).a(processinfo.packageName);
            if (processinfo.category == 0)
            {
                processinfo.category = com.qihoo360.mobilesafe.core.b.a.a(b).a(processinfo.processName);
            }
            arraylist1.add(processinfo);
        } else
        if (processinfo.flag == 3)
        {
            arraylist4.add(processinfo);
        } else
        if (processinfo.flag == 0)
        {
            arraylist2.add(processinfo);
        } else
        if (processinfo.flag != 1 && processinfo.flag == 2)
        {
            arraylist3.add(processinfo);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public List b(List list, Context context)
    {
        ArrayList arraylist = new ArrayList();
        if (list == null || list.isEmpty()) goto _L2; else goto _L1
_L1:
        ArrayList arraylist1;
        ArrayList arraylist2;
        arraylist1 = new ArrayList();
        arraylist2 = new ArrayList();
        list = list.iterator();
_L6:
        if (list.hasNext()) goto _L4; else goto _L3
_L3:
        arraylist.add(arraylist2);
        arraylist.add(arraylist1);
_L2:
        return arraylist;
_L4:
        ProcessInfo processinfo = (ProcessInfo)list.next();
        Map map = e.a(context).c();
        if (map.containsKey(processinfo.packageName) && ((Integer)map.get(processinfo.packageName)).intValue() == 1)
        {
            arraylist2.add(processinfo);
        } else
        {
            arraylist1.add(processinfo);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

}
