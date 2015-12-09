// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services;

import android.os.Handler;
import com.aviary.android.feather.common.threading.a;
import com.aviary.android.feather.common.threading.b;
import java.util.Set;

// Referenced classes of package com.aviary.android.feather.library.services:
//            BadgeService

class a
    implements b
{

    final BadgeService a;

    public void a(a a1)
    {
label0:
        {
            if (a1 != null)
            {
                try
                {
                    a1 = (Set)a1.get();
                }
                // Misplaced declaration of an exception variable
                catch (a a1)
                {
                    a1.printStackTrace();
                    a1 = null;
                }
                if (a1 != null)
                {
                    int i = com.aviary.android.feather.library.services.BadgeService.b(a).size();
                    com.aviary.android.feather.library.services.BadgeService.b(a).addAll(a1);
                    if (com.aviary.android.feather.library.services.BadgeService.b(a).size() != i && a.c != null)
                    {
                        break label0;
                    }
                }
            }
            return;
        }
        a.c.post(new Runnable() {

            final BadgeService._cls3 a;

            public void run()
            {
                BadgeService.c(a.a);
            }

            
            {
                a = BadgeService._cls3.this;
                super();
            }
        });
    }

    _cls1.a(BadgeService badgeservice)
    {
        a = badgeservice;
        super();
    }
}
