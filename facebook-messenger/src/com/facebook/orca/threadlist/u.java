// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.content.Intent;
import com.facebook.base.fragment.b;
import com.facebook.base.fragment.c;
import com.facebook.orca.nux.k;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.threadlist:
//            t

class u
    implements c
{

    final t a;

    u(t t1)
    {
        a = t1;
        super();
    }

    public void a(b b, Intent intent)
    {
        Preconditions.checkArgument(intent.hasExtra("thread_id"));
        if (t.a(a) != null)
        {
            t.a(a).d();
        }
        b = intent.getStringExtra("thread_id");
        t.a(a, b);
    }
}
