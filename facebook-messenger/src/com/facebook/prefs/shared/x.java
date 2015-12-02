// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import android.content.Context;
import com.facebook.common.executors.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.prefs.shared:
//            w, y

public final class x extends d
{

    public x()
    {
    }

    public w a()
    {
        return new w((Context)a(android/content/Context), (a)a(com/facebook/common/executors/a), (com.facebook.d.b.a)a(com/facebook/d/b/a), (y)a(com/facebook/prefs/shared/y));
    }

    public Object b()
    {
        return a();
    }

    public boolean equals(Object obj)
    {
        return obj instanceof x;
    }
}
