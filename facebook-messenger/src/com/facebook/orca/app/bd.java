// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.res.Resources;
import com.facebook.inject.d;
import com.facebook.orca.common.ui.a.b;
import com.facebook.orca.emoji.z;
import com.facebook.orca.share.a;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class bd extends d
{

    final h a;

    private bd(h h)
    {
        a = h;
        super();
    }

    bd(h h, i i)
    {
        this(h);
    }

    public b a()
    {
        return new b((Resources)a(android/content/res/Resources), (a)a(com/facebook/orca/share/a), (z)a(com/facebook/orca/emoji/z));
    }

    public Object b()
    {
        return a();
    }
}
