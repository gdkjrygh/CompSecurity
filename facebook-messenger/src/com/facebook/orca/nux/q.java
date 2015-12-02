// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.nux;

import android.view.View;
import com.facebook.orca.app.g;
import com.facebook.orca.prefs.n;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;

// Referenced classes of package com.facebook.orca.nux:
//            k

class q
    implements android.view.View.OnClickListener
{

    final k a;

    q(k k1)
    {
        a = k1;
        super();
    }

    public void onClick(View view)
    {
        k.f(a).b().a(n.g, true).a();
        com.facebook.orca.nux.k.g(a).a();
        k.h(a);
    }
}
