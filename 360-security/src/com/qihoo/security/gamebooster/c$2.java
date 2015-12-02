// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.text.Html;
import com.qihoo.security.support.b;
import com.qihoo360.mobilesafe.b.q;

// Referenced classes of package com.qihoo.security.gamebooster:
//            c

class b
    implements Runnable
{

    final String a;
    final String b;
    final c c;

    public void run()
    {
        q.a().a(Html.fromHtml(a));
        com.qihoo.security.support.b.a(11112, b, null);
    }

    (c c1, String s, String s1)
    {
        c = c1;
        a = s;
        b = s1;
        super();
    }
}
