// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class ang.Object
    implements Runnable
{

    private List a;
    private vJ b;

    public final void run()
    {
        vJ.d(b).a(a);
        b.b();
    }

    public (vJ vj, List list)
    {
        b = vj;
        a = list;
        super();
    }
}
