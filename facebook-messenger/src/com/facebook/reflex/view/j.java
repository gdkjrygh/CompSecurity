// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view;

import android.database.DataSetObserver;
import com.facebook.reflex.view.c.d;
import com.facebook.reflex.view.c.o;

// Referenced classes of package com.facebook.reflex.view:
//            h

class j extends DataSetObserver
{

    final h a;

    j(h h1)
    {
        a = h1;
        super();
    }

    public void onChanged()
    {
        h.a(a).a();
        h.b(a).b();
        h.c(a);
        a.requestLayout();
    }

    public void onInvalidated()
    {
        h.a(a).a();
        h.b(a).a();
        h.a(a, new d(com.facebook.reflex.view.h.d(a), h.e(a), h.f(a), h.g(a), h.h(a)));
        h.c(a);
        a.requestLayout();
    }
}
