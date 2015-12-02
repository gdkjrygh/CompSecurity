// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.support.v4.a.e;
import android.view.inputmethod.InputMethodManager;
import com.facebook.analytics.av;
import com.facebook.c.s;
import com.facebook.inject.d;
import com.facebook.orca.annotations.IsClientSmsEnabled;
import com.facebook.orca.annotations.IsSmsReadPermitted;
import com.facebook.orca.common.ui.titlebar.a;
import com.facebook.orca.contacts.divebar.bl;
import com.facebook.orca.contacts.divebar.bn;
import com.facebook.orca.f.k;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            bi, bj

class bs extends d
{

    final bi a;

    private bs(bi bi)
    {
        a = bi;
        super();
    }

    bs(bi bi, bj bj)
    {
        this(bi);
    }

    public a a()
    {
        return new a((InputMethodManager)a(android/view/inputmethod/InputMethodManager), (k)a(com/facebook/orca/f/k), (av)a(com/facebook/analytics/av), (com.facebook.config.a.a)a(com/facebook/config/a/a), b(java/lang/Boolean, com/facebook/orca/annotations/IsClientSmsEnabled), b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsReadPermitted), (com.facebook.orca.common.ui.a.a)a(com/facebook/orca/common/ui/a/a), c(com/facebook/orca/contacts/divebar/bl), (e)a(android/support/v4/a/e), (s)a(com/facebook/c/s), (bn)a(com/facebook/orca/contacts/divebar/bn), (com.facebook.orca.presence.d)a(com/facebook/orca/presence/d));
    }

    public Object b()
    {
        return a();
    }
}
