// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.InputStream;

// Referenced classes of package bo.app:
//            km, kr, kn, jk

public final class kq
    implements km
{

    private final km a;

    public kq(km km1)
    {
        a = km1;
    }

    public final InputStream a(String s, Object obj)
    {
        obj = a.a(s, obj);
        switch (kr.a[kn.a(s).ordinal()])
        {
        default:
            return ((InputStream) (obj));

        case 1: // '\001'
        case 2: // '\002'
            return new jk(((InputStream) (obj)));
        }
    }
}
