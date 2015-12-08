// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;

final class foi extends foj
{

    private fog e;

    public foi(fog fog, Bundle bundle)
    {
        e = fog;
        super(fog, bundle);
    }

    public final int a()
    {
        return 1;
    }

    public final foj a(ah ah)
    {
        return new foj(e, a, b, c, super.d);
    }

    public final View b()
    {
        return null;
    }

    public final foh b(ah ah)
    {
        return new foh(e, ah, a, b, c, super.d);
    }

    public final void c(ah ah)
    {
    }

    public final String toString()
    {
        return (new StringBuilder("Frozen: ")).append(a.getName()).toString();
    }
}
