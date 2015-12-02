// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.fbservice.ops.c;
import com.facebook.inject.d;
import com.facebook.orca.annotations.CurrentFolder;
import com.facebook.orca.f.k;
import com.facebook.orca.threadlist.af;
import com.facebook.orca.threadlist.m;
import com.facebook.orca.threads.FolderType;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class cr extends d
{

    final h a;

    private cr(h h)
    {
        a = h;
        super();
    }

    cr(h h, i i)
    {
        this(h);
    }

    public m a()
    {
        return new m((Context)a(android/content/Context), (af)a(com/facebook/orca/threadlist/af), (k)a(com/facebook/orca/f/k), (c)a(com/facebook/fbservice/ops/c), b(com/facebook/orca/threads/FolderType, com/facebook/orca/annotations/CurrentFolder));
    }

    public Object b()
    {
        return a();
    }
}
