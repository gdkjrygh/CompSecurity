// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage.opti;

import android.os.Handler;
import com.qihoo.security.clearengine.TrashType;
import com.qihoo.security.locale.d;
import com.qihoo.security.opti.trashclear.ui.e;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage.opti:
//            ClearListActivity

class a extends Thread
{

    final ClearListActivity a;

    public void run()
    {
        System.currentTimeMillis();
        Map map = ClearListActivity.a(a).a();
        if (!SharedPref.b(a.p, "sp_key_has_clear_memory", false) && ClearListActivity.b(a) > 0L)
        {
            TrashInfo trashinfo = new TrashInfo();
            trashinfo.type = 37;
            trashinfo.clearType = 2;
            trashinfo.isSelected = true;
            trashinfo.size = ClearListActivity.b(a);
            trashinfo.desc = a.o.a(0x7f0c0217);
            ArrayList arraylist = new ArrayList();
            arraylist.add(trashinfo);
            map.put(TrashType.CATE_MEMORY, arraylist);
            ClearListActivity.a(a).a(ClearListActivity.b(a));
        }
        ClearListActivity.a(a).b(map);
        ClearListActivity.c(a).sendEmptyMessage(2);
    }

    (ClearListActivity clearlistactivity)
    {
        a = clearlistactivity;
        super();
    }
}
