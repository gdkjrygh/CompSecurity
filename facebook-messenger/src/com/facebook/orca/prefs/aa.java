// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import com.facebook.ui.images.cache.a;

// Referenced classes of package com.facebook.orca.prefs:
//            z, OrcaInternalPreferenceActivity

class aa
    implements Runnable
{

    final z a;

    aa(z z1)
    {
        a = z1;
        super();
    }

    public void run()
    {
        com.facebook.orca.prefs.OrcaInternalPreferenceActivity.a(a.a).c();
    }
}
