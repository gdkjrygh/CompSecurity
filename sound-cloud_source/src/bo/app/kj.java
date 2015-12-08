// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.InputStream;

// Referenced classes of package bo.app:
//            kh, kk, ki

public final class kj
    implements kh
{

    private final kh a;

    public kj(kh kh1)
    {
        a = kh1;
    }

    public final InputStream a(String s, Object obj)
    {
        switch (kk.a[ki.a(s).ordinal()])
        {
        default:
            return a.a(s, obj);

        case 1: // '\001'
        case 2: // '\002'
            throw new IllegalStateException();
        }
    }
}
