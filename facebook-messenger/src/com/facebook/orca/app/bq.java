// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.res.Resources;
import com.facebook.inject.d;
import com.facebook.messages.threads.ui.name.a;
import com.facebook.messages.threads.ui.name.e;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class bq extends d
{

    final h a;

    private bq(h h)
    {
        a = h;
        super();
    }

    bq(h h, i i)
    {
        this(h);
    }

    public e a()
    {
        return new e((Resources)a(android/content/res/Resources), (a)a(com/facebook/messages/threads/ui/name/a), com.facebook.messages.threads.ui.name.d.USE_PARTICIPANTS_NAMES_ONLY);
    }

    public Object b()
    {
        return a();
    }
}
