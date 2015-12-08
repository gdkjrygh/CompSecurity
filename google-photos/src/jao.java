// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class jao
    implements dup, jbj, omb
{

    private final am a;
    private Context b;

    public jao(am am)
    {
        a = am;
    }

    public final hgo a(dum dum)
    {
        return new jaj(b, dum);
    }

    public final void a(int i)
    {
        ((dxz)olm.a(b, dxz)).a(b, jaq.b(i));
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = context;
    }

    public final void a(olm olm1)
    {
        olm1.a(jbj, this);
    }

    public final hhg b()
    {
        return new dwm();
    }
}
