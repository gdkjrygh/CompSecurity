// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.res.Resources;
import com.facebook.contacts.picker.ac;
import com.facebook.contacts.picker.u;
import com.facebook.contacts.picker.x;
import com.facebook.o;
import com.google.common.a.es;
import com.google.common.a.et;
import javax.inject.a;

class i
    implements a
{

    private final a a;
    private final a b;
    private final a c;
    private final Resources d;

    public i(a a1, a a2, a a3, Resources resources)
    {
        a = a1;
        b = a2;
        c = a3;
        d = resources;
    }

    private es c()
    {
        et et1 = es.e();
        et1.b(new ac((u)b.b(), null, true));
        et1.b(new ac((u)c.b(), d.getString(o.groups_section_header), false));
        return et1.b();
    }

    public u a()
    {
        if (!((Boolean)a.b()).booleanValue())
        {
            return (u)b.b();
        } else
        {
            return new x(c());
        }
    }

    public Object b()
    {
        return a();
    }
}
