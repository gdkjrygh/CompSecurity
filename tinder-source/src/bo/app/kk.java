// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.InputStream;

// Referenced classes of package bo.app:
//            kg, kl, kh, je

public final class kk
    implements kg
{

    private final kg a;

    public kk(kg kg1)
    {
        a = kg1;
    }

    public final InputStream a(String s, Object obj)
    {
        obj = a.a(s, obj);
        switch (kl.a[kh.a(s).ordinal()])
        {
        default:
            return ((InputStream) (obj));

        case 1: // '\001'
        case 2: // '\002'
            return new je(((InputStream) (obj)));
        }
    }
}
