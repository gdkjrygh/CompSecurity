// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security;

import android.content.Context;
import android.content.res.Resources;
import com.qihoo.security.app.e;
import com.qihoo.security.h.h;
import com.qihoo.security.support.b;

// Referenced classes of package com.qihoo.security:
//            a

static final class  extends Thread
{

    final Context a;

    public void run()
    {
        h.a(a);
        if (a.getResources().getBoolean(0x7f070008))
        {
            e.a();
        }
        b.a(a);
        b.a(10006);
    }

    (Context context)
    {
        a = context;
        super();
    }
}
