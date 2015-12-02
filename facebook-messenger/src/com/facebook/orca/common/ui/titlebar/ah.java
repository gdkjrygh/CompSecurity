// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import com.google.common.d.a.s;
import com.google.common.d.a.w;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            ac, ai

class ah
    implements Runnable
{

    final ac a;

    ah(ac ac1)
    {
        a = ac1;
        super();
    }

    public void run()
    {
        ac.a(a, 0.0F).a(new ai(this), w.a());
        ac.b(a, 0);
    }
}
