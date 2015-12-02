// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.c;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.facebook.c:
//            b, m, c

class n
    implements b
{

    final String a;
    final m b;

    n(m m1, String s)
    {
        b = m1;
        a = s;
        super();
    }

    public void a(Context context, Intent intent, c c)
    {
        b.a(context, intent, c, a);
    }
}
