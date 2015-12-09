// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.io.InputStream;

// Referenced classes of package a.a:
//            jf, ji, jg

public final class jh
    implements jf
{

    private final jf a;

    public jh(jf jf1)
    {
        a = jf1;
    }

    public final InputStream a(String s, Object obj)
    {
        switch (ji.a[jg.a(s).ordinal()])
        {
        default:
            return a.a(s, obj);

        case 1: // '\001'
        case 2: // '\002'
            throw new IllegalStateException();
        }
    }
}
