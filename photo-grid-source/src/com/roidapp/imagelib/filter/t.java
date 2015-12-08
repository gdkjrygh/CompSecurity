// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.os.Handler;
import android.os.Message;
import java.util.List;

// Referenced classes of package com.roidapp.imagelib.filter:
//            c, s

final class t
    implements c
{

    final s a;

    t(s s1)
    {
        a = s1;
        super();
    }

    public final void a(List list)
    {
        s.a(a).obtainMessage(1, list).sendToTarget();
    }
}
