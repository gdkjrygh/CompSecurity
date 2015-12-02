// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.support.v4.a.e;
import com.facebook.analytics.av;
import com.facebook.c.s;
import com.facebook.contacts.upload.c;
import com.facebook.inject.d;
import com.facebook.orca.annotations.IsDivebarContactsUploaderPermitted;
import com.facebook.orca.contacts.divebar.h;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            bi, bj

class br extends d
{

    final bi a;

    private br(bi bi)
    {
        a = bi;
        super();
    }

    br(bi bi, bj bj)
    {
        this(bi);
    }

    public h a()
    {
        return new h(b(java/lang/Boolean, com/facebook/orca/annotations/IsDivebarContactsUploaderPermitted), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (e)a(android/support/v4/a/e), (c)a(com/facebook/contacts/upload/c), (av)a(com/facebook/analytics/av), (s)a(com/facebook/c/s));
    }

    public Object b()
    {
        return a();
    }
}
