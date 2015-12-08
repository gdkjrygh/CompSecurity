// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.sdkutils.concurrent;

import com.kik.g.p;
import kik.a.e.l;

// Referenced classes of package kik.android.sdkutils.concurrent:
//            e

public final class d extends e
{

    private l d;

    public d(String s, l l1)
    {
        super(s);
        d = l1;
    }

    public final p a()
    {
        c = false;
        a = d.b((String)b);
        return a;
    }

    public final Object call()
    {
        return a();
    }
}
