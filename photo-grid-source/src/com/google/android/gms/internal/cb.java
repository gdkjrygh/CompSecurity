// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.ValueCallback;

// Referenced classes of package com.google.android.gms.internal:
//            ca, by

final class cb
    implements ValueCallback
{

    final ca a;

    cb(ca ca1)
    {
        a = ca1;
        super();
    }

    public final void onReceiveValue(Object obj)
    {
        obj = (String)obj;
        a.d.a(a.b, a.c, ((String) (obj)));
    }
}
