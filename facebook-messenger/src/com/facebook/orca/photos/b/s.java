// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.b;

import com.facebook.analytics.av;
import com.facebook.common.e.h;
import com.facebook.inject.d;
import com.facebook.j.a.a.a;
import com.facebook.orca.annotations.MessengerImageResizer;
import com.google.common.base.Stopwatch;

// Referenced classes of package com.facebook.orca.photos.b:
//            aa, o, p

class s extends d
{

    final o a;

    private s(o o)
    {
        a = o;
        super();
    }

    s(o o, p p)
    {
        this(o);
    }

    public aa a()
    {
        return new aa((av)a(com/facebook/analytics/av), (h)a(com/facebook/common/e/h), b(com/facebook/j/a/a/a, com/facebook/orca/annotations/MessengerImageResizer), (Stopwatch)a(com/google/common/base/Stopwatch));
    }

    public Object b()
    {
        return a();
    }
}
