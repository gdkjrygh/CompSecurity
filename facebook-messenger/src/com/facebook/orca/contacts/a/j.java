// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.a;

import android.content.res.Resources;
import com.facebook.contacts.picker.ac;
import com.facebook.contacts.picker.n;
import com.facebook.contacts.picker.u;
import com.facebook.contacts.picker.x;
import com.facebook.inject.d;
import com.facebook.o;
import com.facebook.orca.contacts.picker.m;
import com.google.common.a.es;
import com.google.common.a.et;

public class j extends d
{

    public j()
    {
    }

    private es f()
    {
        et et1 = es.e();
        et1.b(new ac((u)a(com/facebook/contacts/picker/n), null, true));
        et1.b(new ac((m)a(com/facebook/orca/contacts/picker/m), ((Resources)a(android/content/res/Resources)).getString(o.phone_address_book_section_header), false));
        et1.b(new ac((u)a(com/facebook/orca/contacts/picker/ac), ((Resources)a(android/content/res/Resources)).getString(o.friends_of_friends_section_header), false));
        return et1.b();
    }

    public u a()
    {
        return new x(f());
    }

    public Object b()
    {
        return a();
    }
}
