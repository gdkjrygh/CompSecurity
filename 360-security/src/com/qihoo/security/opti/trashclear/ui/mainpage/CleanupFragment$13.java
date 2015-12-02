// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import com.nineoldandroids.a.a;
import com.nineoldandroids.a.b;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment, BottomInfoView

class a extends b
{

    final b a;
    final CleanupFragment b;

    public void b(a a1)
    {
        b.a.setVisibility(4);
        b.a.clearAnimation();
        if (a != null)
        {
            a.b(a1);
        }
    }

    (CleanupFragment cleanupfragment, b b1)
    {
        b = cleanupfragment;
        a = b1;
        super();
    }
}
