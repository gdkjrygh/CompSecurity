// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.inject.d;
import com.facebook.orca.common.ui.widgets.text.a;
import com.facebook.orca.threadview.dn;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class dg extends d
{

    final h a;

    private dg(h h)
    {
        a = h;
        super();
    }

    dg(h h, i i)
    {
        this(h);
    }

    public dn a()
    {
        return new dn((Context)a(android/content/Context), (a)a(com/facebook/orca/common/ui/widgets/text/a));
    }

    public Object b()
    {
        return a();
    }
}
