// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.c.a;

import android.text.TextUtils;
import com.qihoo360.mobilesafe.core.d.b;

// Referenced classes of package com.qihoo.security.appbox.c.a:
//            b

class a
    implements Runnable
{

    final com.qihoo.security.appbox.c.a.b a;

    public void run()
    {
        String s = b.a(a).a();
        if (!TextUtils.isEmpty(s) && s.equals("com.qihoo.security.lite"))
        {
            com.qihoo.security.appbox.c.a.b.b(a);
            return;
        } else
        {
            a.b();
            return;
        }
    }

    (com.qihoo.security.appbox.c.a.b b1)
    {
        a = b1;
        super();
    }
}
