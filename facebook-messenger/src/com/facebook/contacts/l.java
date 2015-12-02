// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import android.content.res.Resources;
import com.facebook.contacts.data.a;
import com.facebook.inject.d;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.contacts:
//            a, b

class l extends d
{

    final com.facebook.contacts.a a;

    private l(com.facebook.contacts.a a1)
    {
        a = a1;
        super();
    }

    l(com.facebook.contacts.a a1, b b1)
    {
        this(a1);
    }

    public a a()
    {
        return new a((Resources)a(android/content/res/Resources), (ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper));
    }

    public Object b()
    {
        return a();
    }
}
