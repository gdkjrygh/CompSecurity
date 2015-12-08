// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.io.Serializable;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            y, aa

static final class a
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private aa a;

    final Object readResolve()
    {
        return a.b();
    }

    (aa aa1)
    {
        a = aa1;
    }
}
