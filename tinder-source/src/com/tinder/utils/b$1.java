// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import com.google.android.gms.common.api.c;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.d;
import com.tinder.managers.g;
import com.tinder.model.SparksEvent;
import java.lang.ref.WeakReference;

// Referenced classes of package com.tinder.utils:
//            b, o

final class t>
    implements t>
{

    final b a;

    public final void a()
    {
        a.a();
        (new SparksEvent("App.Close")).put("registered", Boolean.valueOf(ManagerApp.h().g().f())).fire();
        b.b = true;
        com.tinder.utils.b.c = false;
        com.tinder.managers.a.a();
        g g1 = a.f;
        g1.c = true;
        if (g1.a != null)
        {
            g1.a.c();
        }
        if (com.tinder.utils.o.a(com.tinder.utils.b.a(a)))
        {
            ((a)com.tinder.utils.b.a(a).get()).m();
        }
    }

    erence(b b1)
    {
        a = b1;
        super();
    }
}
