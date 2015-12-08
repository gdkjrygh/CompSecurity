// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import android.text.TextUtils;
import com.android.slyce.a.a.c;
import com.android.slyce.a.ay;
import java.io.IOException;

// Referenced classes of package com.android.slyce.a.c:
//            af, ae, l, u, 
//            ac

class ag
    implements ay
{

    String a;
    final af b;

    ag(af af1)
    {
        b = af1;
        super();
    }

    public void a(String s)
    {
        b.b.c.j.b(s);
        if (a == null)
        {
            a = s.trim();
            if (!a.matches("HTTP/1.\\d 2\\d\\d .*"))
            {
                b.a.a(null);
                b.a.b(null);
                b.b.a.a(new IOException((new StringBuilder()).append("non 2xx status line: ").append(a).toString()), b.a);
            }
        } else
        if (TextUtils.isEmpty(s.trim()))
        {
            b.a.a(null);
            b.a.b(null);
            b.b.f.a(b.a, b.b.c, b.b.d, b.b.e, b.b.a);
            return;
        }
    }
}
