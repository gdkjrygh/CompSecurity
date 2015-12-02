// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage.opti;

import com.qihoo.security.enginehelper.clean.a;
import com.qihoo.security.service.ProcessClearService;
import com.qihoo360.mobilesafe.b.e;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage.opti:
//            ClearListActivity

class a
    implements a
{

    final ClearListActivity a;

    public void a()
    {
        a.p();
    }

    public void a(float f, float f1, boolean flag)
    {
        a.a(f, f1, flag, ClearListActivity.i(a));
    }

    public void a(com.qihoo.security.ui.exam.tus tus)
    {
        com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a, tus);
        ClearListActivity.g(a).a(ClearListActivity.b(a, tus));
    }

    public void a(List list)
    {
        if (list == null || list.size() <= 0) goto _L2; else goto _L1
_L1:
        com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a, ClearListActivity.d(a));
        ClearListActivity.k(a).a(list);
        list = list.iterator();
_L6:
        if (!list.hasNext()) goto _L4; else goto _L3
_L3:
        if (((TrashInfo)list.next()).type != 37) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L8:
        if (flag)
        {
            ProcessClearService.c();
        }
_L2:
        return;
_L4:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void b(List list)
    {
label0:
        {
            if (list != null && list.size() > 0)
            {
                com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a, ClearListActivity.d(a));
                if (((TrashInfo)list.get(0)).type != 37)
                {
                    break label0;
                }
                ProcessClearService.c();
            }
            return;
        }
        ClearListActivity.k(a).a(list);
    }

    (ClearListActivity clearlistactivity)
    {
        a = clearlistactivity;
        super();
    }
}
