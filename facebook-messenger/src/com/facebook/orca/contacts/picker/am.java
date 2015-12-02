// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.Context;
import android.view.LayoutInflater;
import com.facebook.contacts.picker.u;
import com.facebook.inject.d;
import com.facebook.user.i;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            bc, ak, al

class am extends d
{

    final ak a;

    private am(ak ak1)
    {
        a = ak1;
        super();
    }

    am(ak ak1, al al)
    {
        this(ak1);
    }

    public bc a()
    {
        return new bc((Context)a(android/content/Context), b(com/facebook/contacts/picker/u, ak.a(a)), (LayoutInflater)a(android/view/LayoutInflater), (i)a(com/facebook/user/i));
    }

    public Object b()
    {
        return a();
    }
}
