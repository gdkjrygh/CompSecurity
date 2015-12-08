// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.InputStream;

// Referenced classes of package bo.app:
//            kh, km, ki, jf

public final class kl
    implements kh
{

    private final kh a;

    public kl(kh kh1)
    {
        a = kh1;
    }

    public final InputStream a(String s, Object obj)
    {
        obj = a.a(s, obj);
        switch (km.a[ki.a(s).ordinal()])
        {
        default:
            return ((InputStream) (obj));

        case 1: // '\001'
        case 2: // '\002'
            return new jf(((InputStream) (obj)));
        }
    }
}
