// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.b;

import android.content.Context;
import com.facebook.inject.d;
import com.facebook.ui.images.a.a;

// Referenced classes of package com.facebook.ui.media.b:
//            a, c, d

class f extends d
{

    final c a;

    private f(c c)
    {
        a = c;
        super();
    }

    f(c c, com.facebook.ui.media.b.d d1)
    {
        this(c);
    }

    public com.facebook.ui.media.b.a a()
    {
        return new com.facebook.ui.media.b.a((Context)a(android/content/Context), (a)a(com/facebook/ui/images/a/a), (com.facebook.a.a)a(com/facebook/a/a), (com.facebook.common.executors.a)a(com/facebook/common/executors/a), (com.facebook.ui.media.attachments.d)a(com/facebook/ui/media/attachments/d));
    }

    public Object b()
    {
        return a();
    }
}
