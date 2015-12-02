// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.pm.PackageManager;
import com.facebook.config.a.a;
import com.facebook.contacts.upload.c;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.orca.annotations.IsContactsUploadPermitted;
import com.facebook.orca.annotations.IsNuxSmsForced;
import com.facebook.orca.annotations.IsPartialAccount;
import com.facebook.orca.annotations.IsSmsNuxSendCliffDisabled;
import com.facebook.orca.annotations.IsSmsReadPermitted;
import com.facebook.orca.nux.h;
import com.facebook.orca.prefs.az;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class bv extends d
{

    final com.facebook.orca.app.h a;

    private bv(com.facebook.orca.app.h h1)
    {
        a = h1;
        super();
    }

    bv(com.facebook.orca.app.h h1, i i)
    {
        this(h1);
    }

    public h a()
    {
        return new h((a)a(com/facebook/config/a/a), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (az)a(com/facebook/orca/prefs/az), (c)a(com/facebook/contacts/upload/c), (PackageManager)e().a(android/content/pm/PackageManager), b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsReadPermitted), b(java/lang/Boolean, com/facebook/orca/annotations/IsContactsUploadPermitted), b(java/lang/Boolean, com/facebook/orca/annotations/IsPartialAccount), b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsNuxSendCliffDisabled), b(java/lang/Boolean, com/facebook/orca/annotations/IsNuxSmsForced));
    }

    public Object b()
    {
        return a();
    }
}
