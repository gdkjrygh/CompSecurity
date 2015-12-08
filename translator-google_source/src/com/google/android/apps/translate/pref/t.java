// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import com.google.android.libraries.translate.offline.a.a;

// Referenced classes of package com.google.android.apps.translate.pref:
//            s, r

final class t
    implements Runnable
{

    final s a;

    t(s s1)
    {
        a = s1;
        super();
    }

    public final void run()
    {
        r.d(a.a).d();
        r.d(a.a).b();
    }
}
