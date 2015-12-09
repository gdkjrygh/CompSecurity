// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.view.View;
import com.facebook.aw;

// Referenced classes of package com.facebook.login:
//            i, n

final class p
    implements i
{

    final View a;
    final n b;

    p(n n, View view)
    {
        b = n;
        a = view;
        super();
    }

    public final void a()
    {
        a.findViewById(aw.b).setVisibility(0);
    }

    public final void b()
    {
        a.findViewById(aw.b).setVisibility(8);
    }
}
