// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import android.widget.TextView;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            ac

class ad
    implements Runnable
{

    final ac a;

    ad(ac ac1)
    {
        a = ac1;
        super();
    }

    public void run()
    {
        ac.b(a).setText(ac.a(a, ac.a(a)));
    }
}
