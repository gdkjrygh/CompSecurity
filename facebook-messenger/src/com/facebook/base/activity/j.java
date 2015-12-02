// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.activity;

import com.facebook.common.d.e;

// Referenced classes of package com.facebook.base.activity:
//            i

class j
    implements Runnable
{

    final e a;
    final i b;

    j(i i, e e1)
    {
        b = i;
        a = e1;
        super();
    }

    public void run()
    {
        a.a();
    }
}
