// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.roidapp.photogrid.a.j;
import com.roidapp.photogrid.a.l;

// Referenced classes of package com.roidapp.photogrid.release:
//            qi

final class qn
    implements j
{

    final qi a;

    qn(qi qi1)
    {
        a = qi1;
        super();
    }

    public final void a(l l1)
    {
        if (l1.d())
        {
            qi.a(a, false);
            Log.e("iab", (new StringBuilder("setup failed")).append(l1.a()).append("/").append(l1.b()).toString());
            l1 = Message.obtain();
            l1.what = 3;
            l1.arg1 = 1;
            qi.d(a).sendMessage(l1);
            return;
        } else
        {
            Log.e("iab", "setup success");
            qi.a(a, true);
            qi.d(a).sendEmptyMessage(2);
            return;
        }
    }
}
