// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.c.s;
import com.facebook.inject.d;
import com.facebook.orca.common.ui.titlebar.ap;
import com.facebook.orca.contacts.divebar.a;
import com.facebook.orca.contacts.divebar.e;
import com.facebook.orca.f.k;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class dk extends d
{

    final h a;

    private dk(h h)
    {
        a = h;
        super();
    }

    dk(h h, i i)
    {
        this(h);
    }

    public ap a()
    {
        return new ap((a)a(com/facebook/orca/contacts/divebar/a), (e)a(com/facebook/orca/contacts/divebar/e), (k)a(com/facebook/orca/f/k), (com.facebook.l.k)a(com/facebook/l/k), (s)a(com/facebook/c/s), (com.facebook.common.time.a)a(com/facebook/common/time/a), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d));
    }

    public Object b()
    {
        return a();
    }
}
