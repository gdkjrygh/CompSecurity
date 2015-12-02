// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.os.Handler;
import com.facebook.common.executors.ForUiThread;
import com.facebook.fbservice.ops.k;
import com.facebook.inject.d;
import com.facebook.orca.annotations.CurrentFolder;
import com.facebook.orca.prefs.av;
import com.facebook.orca.threads.FolderName;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class cz extends d
{

    final h a;

    private cz(h h)
    {
        a = h;
        super();
    }

    cz(h h, i i)
    {
        this(h);
    }

    public av a()
    {
        return new av((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (k)a(com/facebook/fbservice/ops/k), (com.facebook.orca.f.k)a(com/facebook/orca/f/k), b(com/facebook/orca/threads/FolderName, com/facebook/orca/annotations/CurrentFolder), (Handler)a(android/os/Handler, com/facebook/common/executors/ForUiThread));
    }

    public Object b()
    {
        return a();
    }
}
