// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;

import com.google.android.libraries.translate.offline.b;
import com.google.android.libraries.translate.offline.f;
import com.google.android.libraries.translate.offline.k;
import com.google.android.libraries.translate.offline.o;

// Referenced classes of package com.google.android.libraries.translate.core:
//            k, Singleton

final class e extends com.google.android.libraries.translate.core.k
{

    e()
    {
    }

    protected final Object a()
    {
        Object obj = Singleton.a();
        f f1 = new f(((android.content.Context) (obj)));
        obj = new k(((android.content.Context) (obj)), b.a(((android.content.Context) (obj))), f1);
        return new o(Singleton.a(), ((com.google.android.libraries.translate.offline.d) (obj)), f1);
    }
}
