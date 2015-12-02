// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.reflex;

import com.facebook.orca.threadlist.i;
import com.facebook.reflex.ah;
import com.facebook.reflex.aj;

// Referenced classes of package com.facebook.orca.reflex:
//            k

class l
    implements ah
{

    final k a;

    l(k k1)
    {
        a = k1;
        super();
    }

    public void a(aj aj1, float f, float f1)
    {
        i j = k.a(a);
        boolean flag;
        if (aj1 == aj.Fling)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(f, f1, flag);
    }
}
