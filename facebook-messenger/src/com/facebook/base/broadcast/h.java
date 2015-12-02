// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.broadcast;

import android.content.Context;
import android.content.Intent;
import com.facebook.c.k;
import java.util.Map;

// Referenced classes of package com.facebook.base.broadcast:
//            g, b

class h extends k
{

    final b a;
    final g b;

    h(g g1, Map map, b b1)
    {
        b = g1;
        a = b1;
        super(map);
    }

    protected boolean a(Context context, Intent intent)
    {
        return b.a();
    }
}
