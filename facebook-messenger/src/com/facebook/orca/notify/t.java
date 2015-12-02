// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.view.View;

// Referenced classes of package com.facebook.orca.notify:
//            s, j

class t
    implements Runnable
{

    final View a;
    final s b;

    t(s s1, View view)
    {
        b = s1;
        a = view;
        super();
    }

    public void run()
    {
        j.a(b.a, a);
    }
}
