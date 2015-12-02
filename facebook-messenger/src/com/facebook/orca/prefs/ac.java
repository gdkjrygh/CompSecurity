// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import com.facebook.orca.stickers.c;
import com.facebook.orca.stickers.e;
import com.facebook.orca.stickers.v;
import com.facebook.prefs.shared.d;

// Referenced classes of package com.facebook.orca.prefs:
//            ab, OrcaInternalPreferenceActivity

class ac
    implements Runnable
{

    final ab a;

    ac(ab ab1)
    {
        a = ab1;
        super();
    }

    public void run()
    {
        com.facebook.orca.prefs.OrcaInternalPreferenceActivity.c(a.a).b();
        com.facebook.orca.prefs.OrcaInternalPreferenceActivity.d(a.a).b();
        com.facebook.orca.prefs.OrcaInternalPreferenceActivity.e(a.a).b().b(v.a).a();
    }
}
