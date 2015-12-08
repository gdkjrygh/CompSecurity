// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class ide extends fud
{

    public nwc c;
    private final idf d;
    private int e;

    public ide(am am, opd opd, idf idf1)
    {
        super(am, opd, b.yD);
        d = idf1;
    }

    public final ei a(int i, Bundle bundle)
    {
        return new idg(b, e);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        super.a(context, olm1, bundle);
        e = ((mmr)olm1.a(mmr)).d();
    }

    public final void a(ei ei, Object obj)
    {
        ei = (nwc)obj;
        c = ei;
        d.a(ei);
    }

    public final boolean b()
    {
        return c != null;
    }

    public final void c()
    {
        b(null);
    }
}
