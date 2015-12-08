// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            je, jb, jd

final class a
    implements Runnable
{

    final jb a;
    final je b;

    public final void run()
    {
        a.h().a(a);
        for (Iterator iterator = je.a(b).iterator(); iterator.hasNext(); iterator.next()) { }
        je.b(a);
    }

    (je je1, jb jb1)
    {
        b = je1;
        a = jb1;
        super();
    }
}
