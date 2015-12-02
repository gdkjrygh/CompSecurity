// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import com.facebook.orca.app.dt;

// Referenced classes of package com.facebook.orca.prefs:
//            ad, OrcaInternalPreferenceActivity

class ae
    implements Runnable
{

    final ad a;

    ae(ad ad1)
    {
        a = ad1;
        super();
    }

    public void run()
    {
        OrcaInternalPreferenceActivity.f(a.a).a();
    }
}
