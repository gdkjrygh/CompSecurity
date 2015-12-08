// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import com.google.android.libraries.translate.e.l;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            LocationProfile, w, o

final class q
    implements l
{

    final l a;
    final o b;

    q(o o, l l1)
    {
        b = o;
        a = l1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (LocationProfile)obj;
        if (obj == null)
        {
            a.a(Boolean.valueOf(false));
            return;
        } else
        {
            (new w(b, a)).a(new LocationProfile[] {
                obj
            });
            return;
        }
    }
}
