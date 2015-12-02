// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import com.nineoldandroids.a.a;
import com.nineoldandroids.a.b;
import com.qihoo.security.alasticbutton.ElasticImageButton;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment

private class <init> extends b
{

    final CleanupFragment a;
    private boolean b;

    public void a(boolean flag)
    {
        b = flag;
    }

    public void b(a a1)
    {
        CleanupFragment.j(a).a(true);
        if (b)
        {
            if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a, com.qihoo.security.recommend.commendType.Clean))
            {
                CleanupFragment.d(a, 0L);
                return;
            } else
            {
                CleanupFragment.ad(a);
                return;
            }
        } else
        {
            CleanupFragment.ad(a);
            return;
        }
    }

    private (CleanupFragment cleanupfragment)
    {
        a = cleanupfragment;
        super();
    }

    a(CleanupFragment cleanupfragment, a a1)
    {
        this(cleanupfragment);
    }
}
