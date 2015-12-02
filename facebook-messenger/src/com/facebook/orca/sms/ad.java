// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.facebook.backgroundtasks.b;
import com.facebook.common.time.a;
import com.facebook.orca.prefs.n;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.orca.sms:
//            ac, ae, af

class ad
    implements Callable
{

    final ac a;

    ad(ac ac1)
    {
        a = ac1;
        super();
    }

    public b a()
    {
        if (a.d())
        {
            Object obj = a.k();
            com.facebook.orca.sms.ac.a(a).a(((ae) (obj)).b);
            com.facebook.orca.sms.ac.a(a).b(((ae) (obj)).a);
            com.facebook.orca.sms.ac.a(a).c(((ae) (obj)).d);
            com.facebook.orca.sms.ac.a(a).d(((ae) (obj)).c);
            com.facebook.orca.sms.ac.a(a).b();
            obj = com.facebook.orca.sms.ac.b(a).b();
            ((e) (obj)).a(n.k, ac.c(a).a());
            ((e) (obj)).a();
        }
        return new b(true);
    }

    public Object call()
    {
        return a();
    }
}
