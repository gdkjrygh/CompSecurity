// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.view;

import com.nineoldandroids.a.a;
import com.nineoldandroids.a.b;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.qihoo.security.ui.result.view:
//            BaseResultFragment

class a extends b
{

    final BaseResultFragment a;

    public void b(a a1)
    {
        com.qihoo.security.ui.result.view.BaseResultFragment.a(a, new b() {

            final BaseResultFragment._cls6 a;

            public void b(a a2)
            {
                if (BaseResultFragment.g(a.a))
                {
                    BaseResultFragment.e(a.a);
                    return;
                } else
                {
                    BaseResultFragment.h(a.a).set(true);
                    return;
                }
            }

            
            {
                a = BaseResultFragment._cls6.this;
                super();
            }
        });
    }

    _cls1.a(BaseResultFragment baseresultfragment)
    {
        a = baseresultfragment;
        super();
    }
}
