// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

public final class djb
{

    private final Context a;
    private final djj b;

    djb(Context context, djj djj1)
    {
        a = context;
        b = djj1;
    }

    public final dja a(Fragment fragment)
    {
        if (dgn.a(a))
        {
            return new dje(b, a, fragment);
        } else
        {
            return new djf(b, a, fragment);
        }
    }

    public final djb a(View view)
    {
        b.f = view;
        return this;
    }

    public final djb a(dgm dgm)
    {
        b.i = dgm;
        return this;
    }

    public final djb a(boolean flag)
    {
        b.j = flag;
        return this;
    }

    public final djb b(View view)
    {
        b.g = view;
        return this;
    }

    public final djb c(View view)
    {
        b.h = view;
        return this;
    }
}
