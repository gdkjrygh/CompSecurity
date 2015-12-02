// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.Context;
import com.facebook.auth.annotations.LoggedInUser;
import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.common.executors.ForUiThread;
import com.facebook.common.executors.a;
import com.facebook.contacts.data.p;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.l.k;
import com.facebook.orca.annotations.IsPresenceEnabled;
import com.facebook.orca.annotations.ShowOtherContactsDivebar;
import com.facebook.orca.contacts.divebar.ad;
import com.facebook.orca.contacts.divebar.e;
import com.facebook.orca.g.z;
import com.facebook.user.User;
import com.google.common.d.a.u;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            bi, bj

class bv extends d
{

    final bi a;

    private bv(bi bi)
    {
        a = bi;
        super();
    }

    bv(bi bi, bj bj)
    {
        this(bi);
    }

    public ad a()
    {
        return new ad((Context)e().a(android/content/Context), (e)a(com/facebook/orca/contacts/divebar/e), (com.facebook.contacts.a.d)a(com/facebook/contacts/a/d), b(com/facebook/user/e), b(com/facebook/orca/g/z), (k)a(com/facebook/l/k), (com.facebook.fbservice.ops.k)e().a(com/facebook/fbservice/ops/k), (u)a(com/google/common/d/a/u, com/facebook/common/executors/DefaultExecutorService), (Executor)a(java/util/concurrent/Executor, com/facebook/common/executors/ForUiThread), b(java/lang/Boolean, com/facebook/orca/annotations/IsPresenceEnabled), b(java/lang/Boolean, com/facebook/orca/annotations/ShowOtherContactsDivebar), b(com/facebook/user/User, com/facebook/auth/annotations/LoggedInUser), (a)a(com/facebook/common/executors/a), (com.facebook.contacts.data.k)a(com/facebook/contacts/data/k), (p)a(com/facebook/contacts/data/p));
    }

    public Object b()
    {
        return a();
    }
}
