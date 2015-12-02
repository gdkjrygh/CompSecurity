// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.k;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import com.facebook.c.b;
import com.facebook.c.c;
import com.facebook.common.hardware.k;

// Referenced classes of package com.facebook.k:
//            j

class m
    implements b
{

    private final j a;

    public m(j j1)
    {
        a = j1;
    }

    public void a(Context context, Intent intent, c c)
    {
        context = com.facebook.k.j.b(a).c();
        if (context != null && context.isConnected())
        {
            j.a(a);
        }
    }
}
