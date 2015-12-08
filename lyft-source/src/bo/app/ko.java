// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.InputStream;

// Referenced classes of package bo.app:
//            km, kp, kn

public final class ko
    implements km
{

    private final km a;

    public ko(km km1)
    {
        a = km1;
    }

    public final InputStream a(String s, Object obj)
    {
        switch (kp.a[kn.a(s).ordinal()])
        {
        default:
            return a.a(s, obj);

        case 1: // '\001'
        case 2: // '\002'
            throw new IllegalStateException();
        }
    }
}
