// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import android.text.TextUtils;
import com.android.slyce.a.a.a;
import com.android.slyce.a.ag;
import java.io.IOException;

// Referenced classes of package com.android.slyce.a.c:
//            av, n, s, u, 
//            ba, bn, az, ax

class ay
    implements com.android.slyce.a.ay
{

    av a;
    String b;
    final n c;
    final ax d;

    ay(ax ax, n n1)
    {
        d = ax;
        c = n1;
        super();
        a = new av();
    }

    public void a(String s1)
    {
        try
        {
            s1 = s1.trim();
            if (b == null)
            {
                b = s1;
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            c.h.a(s1);
            return;
        }
        if (!TextUtils.isEmpty(s1))
        {
            a.b(s1);
            return;
        }
        s1 = b.split(" ", 3);
        if (s1.length < 2)
        {
            throw new Exception(new IOException("Not HTTP"));
        }
        c.f.a(a);
        String s2 = s1[0];
        s s3;
        c.f.a(s2);
        c.f.a(Integer.parseInt(s1[1]));
        s3 = c.f;
        if (s1.length == 3)
        {
            s1 = s1[2];
        } else
        {
            s1 = "";
        }
        s3.b(s1);
        c.h.a(null);
        s1 = c.f.a_();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        if (!"HEAD".equalsIgnoreCase(c.j.c()))
        {
            break MISSING_BLOCK_LABEL_238;
        }
        s1 = com.android.slyce.a.c.ba.a(s1.l(), null);
_L2:
        c.f.b(s1);
        return;
        s1 = com.android.slyce.a.c.az.a(s1, com.android.slyce.a.c.bn.a(s2), a, false);
        if (true) goto _L2; else goto _L1
_L1:
    }
}
