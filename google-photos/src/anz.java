// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;

public final class anz
    implements anp
{

    private final avy a;

    anz(InputStream inputstream, aqp aqp)
    {
        a = new avy(inputstream, aqp);
        a.mark(0x500000);
    }

    public final Object a()
    {
        a.reset();
        return a;
    }

    public final void b()
    {
        a.b();
    }
}
