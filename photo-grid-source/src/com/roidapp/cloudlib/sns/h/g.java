// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.h;

import android.view.View;
import com.roidapp.baselib.c.aj;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.q;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.g.b;
import com.roidapp.cloudlib.sns.z;
import java.io.IOException;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.cloudlib.sns.h:
//            a

final class g extends aa
{

    private WeakReference a;
    private String b;
    private String c;

    public g(a a1, String s, String s1)
    {
        a = new WeakReference(a1);
        b = s;
        c = s1;
    }

    public final void b(int i, Exception exception)
    {
        a a1 = (a)a.get();
        if (a1 == null) goto _L2; else goto _L1
_L1:
        if (!(exception instanceof z)) goto _L4; else goto _L3
_L3:
        ((z)exception).a();
        JVM INSTR tableswitch 1005 1005: default 48
    //                   1005 73;
           goto _L5 _L6
_L5:
        com.roidapp.cloudlib.sns.h.a.a(a1, at.be, false);
_L8:
        if (com.roidapp.cloudlib.sns.h.a.g(a1) != null)
        {
            com.roidapp.cloudlib.sns.h.a.g(a1).setVisibility(8);
        }
_L2:
        return;
_L6:
        com.roidapp.cloudlib.sns.h.a.a(a1, at.bl, false);
        continue; /* Loop/switch isn't completed */
_L4:
        if (exception instanceof IOException)
        {
            com.roidapp.cloudlib.sns.h.a.a(a1, at.e, true);
        } else
        {
            com.roidapp.cloudlib.sns.h.a.a(a1, at.be, false);
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void c(Object obj)
    {
        obj = q.a(aj.a());
        p p1 = ((q) (obj)).c();
        if (p1 != null && p1.b != null)
        {
            p1.b.b = b;
            p1.b.d = c;
            ((q) (obj)).a(p1);
            com.roidapp.cloudlib.sns.g.b.a().a(p1, b, c);
            obj = (a)a.get();
            if (obj != null && ((a) (obj)).isAdded())
            {
                ((a) (obj)).dismiss();
                return;
            }
        }
    }
}
