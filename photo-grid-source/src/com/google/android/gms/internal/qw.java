// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.internal:
//            tj, qx, pl, yn, 
//            vo, qv, vq

final class qw extends tj
{

    private final qv a;
    private final vq b;

    public qw(String s, qv qv1, vq vq1)
    {
        super(s, new qx(vq1, qv1));
        a = qv1;
        b = vq1;
    }

    protected final vo a(pl pl1)
    {
        return vo.a(new ByteArrayInputStream(pl1.b), yn.a(pl1));
    }

    protected final void a(Object obj)
    {
        obj = (InputStream)obj;
        b.a(a.a(((InputStream) (obj))));
    }
}
