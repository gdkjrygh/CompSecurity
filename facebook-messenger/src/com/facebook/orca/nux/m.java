// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.nux;

import android.view.View;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;

// Referenced classes of package com.facebook.orca.nux:
//            k

class m
    implements android.view.View.OnClickListener
{

    final k a;

    m(k k1)
    {
        a = k1;
        super();
    }

    public void onClick(View view)
    {
        k.a(a).a((new cb("click")).f("button").g("find_contacts_accept_btn"));
        k.b(a);
        k.c(a);
    }
}
