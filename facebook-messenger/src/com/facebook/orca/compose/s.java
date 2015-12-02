// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import com.facebook.orca.chatheads.c;
import com.facebook.orca.prefs.n;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;

// Referenced classes of package com.facebook.orca.compose:
//            ComposeFragment

class s
    implements c
{

    final ComposeFragment a;

    s(ComposeFragment composefragment)
    {
        a = composefragment;
        super();
    }

    public void a()
    {
        e e1 = ComposeFragment.G(a).b();
        e1.a(n.x, true);
        e1.a();
        com.facebook.orca.compose.ComposeFragment.d(a, true);
    }
}
