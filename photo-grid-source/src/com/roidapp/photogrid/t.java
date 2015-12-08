// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.preference.PreferenceManager;
import com.roidapp.cloudlib.template.g;

// Referenced classes of package com.roidapp.photogrid:
//            u, s

final class t
    implements Runnable
{

    final g a;
    final s b;

    t(s s1, g g1)
    {
        b = s1;
        a = g1;
        super();
    }

    public final void run()
    {
        a.a(new u(PreferenceManager.getDefaultSharedPreferences(s.a(b)), (byte)0));
    }
}
