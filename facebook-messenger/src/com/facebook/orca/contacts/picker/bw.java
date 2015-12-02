// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.view.inputmethod.InputMethodManager;
import com.facebook.contacts.a.c;
import com.facebook.inject.d;
import com.facebook.orca.contacts.annotations.IsChatContextEnabled;
import com.facebook.orca.contacts.divebar.ap;
import com.facebook.orca.contacts.divebar.e;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            bj

class bw extends d
{

    private bw()
    {
    }

    bw(bj bj)
    {
        this();
    }

    public ap a()
    {
        return new ap(b(java/lang/Boolean, com/facebook/orca/contacts/annotations/IsChatContextEnabled), (com.facebook.backgroundlocation.status.d)a(com/facebook/backgroundlocation/status/d), (e)a(com/facebook/orca/contacts/divebar/e), (c)a(com/facebook/contacts/a/c), (com.facebook.contacts.a.d)a(com/facebook/contacts/a/d), (InputMethodManager)a(android/view/inputmethod/InputMethodManager));
    }

    public Object b()
    {
        return a();
    }
}
