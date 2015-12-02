// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.auth.viewercontext.e;
import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.contacts.data.l;
import com.facebook.inject.d;
import com.facebook.orca.annotations.CurrentFolder;
import com.facebook.orca.annotations.IsClientSmsEnabled;
import com.facebook.orca.annotations.IsMergeThreadsEnabled;
import com.facebook.orca.annotations.IsSmsReadPermitted;
import com.facebook.orca.f.g;
import com.facebook.orca.f.i;
import com.facebook.orca.f.r;
import com.facebook.orca.f.z;
import com.facebook.orca.l.a;
import com.facebook.orca.notify.av;
import com.facebook.orca.prefs.b;
import com.facebook.orca.threads.FolderName;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.orca.app:
//            g, h, i

class ay extends d
{

    final h a;

    private ay(h h)
    {
        a = h;
        super();
    }

    ay(h h, com.facebook.orca.app.i j)
    {
        this(h);
    }

    public a a()
    {
        return new a((ExecutorService)a(java/util/concurrent/ExecutorService, com/facebook/common/executors/DefaultExecutorService), (e)a(com/facebook/auth/viewercontext/e), (l)a(com/facebook/contacts/data/l), (g)a(com/facebook/orca/f/g), (i)a(com/facebook/orca/f/i), (com.facebook.orca.app.g)a(com/facebook/orca/app/g), (av)a(com/facebook/orca/notify/av), (z)a(com/facebook/orca/f/z), (com.facebook.orca.prefs.av)a(com/facebook/orca/prefs/av), (b)a(com/facebook/orca/prefs/b), (com.facebook.orca.f.l)a(com/facebook/orca/f/l), (com.facebook.orca.threads.g)a(com/facebook/orca/threads/g), (r)a(com/facebook/orca/f/r), b(java/lang/Boolean, com/facebook/orca/annotations/IsMergeThreadsEnabled), b(java/lang/Boolean, com/facebook/orca/annotations/IsClientSmsEnabled), b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsReadPermitted), b(com/facebook/orca/threads/FolderName, com/facebook/orca/annotations/CurrentFolder));
    }

    public Object b()
    {
        return a();
    }
}
