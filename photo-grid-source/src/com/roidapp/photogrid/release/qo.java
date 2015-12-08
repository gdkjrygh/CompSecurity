// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.roidapp.photogrid.a.i;
import com.roidapp.photogrid.a.l;
import com.roidapp.photogrid.a.m;
import com.roidapp.photogrid.a.o;

// Referenced classes of package com.roidapp.photogrid.release:
//            qi

final class qo
    implements i
{

    final qi a;

    qo(qi qi1)
    {
        a = qi1;
        super();
    }

    public final void a(l l1, o o1)
    {
        if (!l1.c()) goto _L2; else goto _L1
_L1:
        Log.e("iab", "purchase success");
        m.a(a.getActivity(), 1);
        l1 = o1.a();
        if (!"com.roidapp.photogrid.remove_ad_year".equals(l1)) goto _L4; else goto _L3
_L3:
        m.b(a.getActivity(), 1);
_L5:
        qi.d(a).sendEmptyMessage(4);
        return;
_L4:
        if ("com.roidapp.photogrid.remove_ad_lifelong".equals(l1))
        {
            m.c(a.getActivity(), 1);
        }
        if (true) goto _L5; else goto _L2
_L2:
        Log.e("iab", (new StringBuilder("purchase failed")).append(l1.a()).append("/").append(l1.b()).toString());
        m.a(a.getActivity(), 0);
        l1 = Message.obtain();
        l1.what = 3;
        l1.arg1 = 2;
        qi.d(a).sendMessage(l1);
        return;
    }
}
