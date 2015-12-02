// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.content.Context;
import com.facebook.common.executors.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.stickers:
//            ak, al, am, an

class av extends d
{

    final am a;

    private av(am am)
    {
        a = am;
        super();
    }

    av(am am, an an)
    {
        this(am);
    }

    public ak a()
    {
        return new ak((Context)e().a(android/content/Context), (a)a(com/facebook/common/executors/a), (com.facebook.d.b.a)a(com/facebook/d/b/a), (al)a(com/facebook/orca/stickers/al));
    }

    public Object b()
    {
        return a();
    }
}
