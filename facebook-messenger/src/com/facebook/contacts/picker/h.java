// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import com.facebook.debug.log.b;
import com.facebook.widget.a.j;

// Referenced classes of package com.facebook.contacts.picker:
//            e, j

class h
    implements com.facebook.widget.a.h
{

    final com.facebook.contacts.picker.j a;
    final e b;

    h(e e1, com.facebook.contacts.picker.j j1)
    {
        b = e1;
        a = j1;
        super();
    }

    public void a(int i)
    {
    }

    public void a(j j1)
    {
        com.facebook.debug.log.b.b(e.a(), "Received filtering state: %s from: %s", new Object[] {
            j1, a.a().getClass().getSimpleName()
        });
        a.a(j1);
        e.c(b);
    }
}
