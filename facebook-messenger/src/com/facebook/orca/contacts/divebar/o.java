// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.view.View;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            m, q

class o
    implements android.view.View.OnClickListener
{

    final m a;

    o(m m1)
    {
        a = m1;
        super();
    }

    public void onClick(View view)
    {
        m.a(a).a((new cb("click")).f("button").g("divebar_contacts_uploader_learn_more_btn"));
        m.b(a).b();
    }
}
