// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.os.Handler;
import android.os.Message;
import java.util.List;

// Referenced classes of package com.roidapp.imagelib.filter:
//            c, aj

final class ak
    implements c
{

    final aj a;

    ak(aj aj1)
    {
        a = aj1;
        super();
    }

    public final void a(List list)
    {
        aj.g(a).obtainMessage(1030, list).sendToTarget();
    }
}
