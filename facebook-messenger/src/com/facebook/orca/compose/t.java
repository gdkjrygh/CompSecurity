// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.content.Intent;
import com.facebook.c.s;
import com.facebook.orca.chatheads.c;

// Referenced classes of package com.facebook.orca.compose:
//            ComposeFragment

class t
    implements c
{

    final String a;
    final ComposeFragment b;

    t(ComposeFragment composefragment, String s1)
    {
        b = composefragment;
        a = s1;
        super();
    }

    public void a()
    {
        Intent intent = new Intent(a);
        ComposeFragment.H(b).b(intent, b.n());
    }
}
