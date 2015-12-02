// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.inject.d;
import com.facebook.messages.threads.ui.name.a;
import com.facebook.orca.common.ui.widgets.text.f;
import com.facebook.orca.f.k;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class ch extends d
{

    final h a;

    private ch(h h)
    {
        a = h;
        super();
    }

    ch(h h, i i)
    {
        this(h);
    }

    public f a()
    {
        return new f((Context)a(android/content/Context), (k)a(com/facebook/orca/f/k), (a)a(com/facebook/messages/threads/ui/name/a));
    }

    public Object b()
    {
        return a();
    }
}
