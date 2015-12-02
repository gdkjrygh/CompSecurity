// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.Context;
import android.view.LayoutInflater;
import com.facebook.contacts.picker.u;
import com.facebook.inject.d;
import com.facebook.orca.annotations.ForFavoritePickerList;
import com.facebook.orca.contacts.favorites.aa;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            bi, bj

class by extends d
{

    final bi a;

    private by(bi bi)
    {
        a = bi;
        super();
    }

    by(bi bi, bj bj)
    {
        this(bi);
    }

    public aa a()
    {
        return new aa((Context)a(android/content/Context), b(com/facebook/contacts/picker/u, com/facebook/orca/annotations/ForFavoritePickerList), (LayoutInflater)a(android/view/LayoutInflater));
    }

    public Object b()
    {
        return a();
    }
}
