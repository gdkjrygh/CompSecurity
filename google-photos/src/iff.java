// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class iff
    implements hgo
{

    iff()
    {
    }

    public final int a()
    {
        return ce.g;
    }

    public final int a(int i)
    {
        return i;
    }

    public final void a(afn afn)
    {
        afn = (ifi)afn;
        android.content.Context context = ((ifi) (afn)).a.getContext();
        ((ifi) (afn)).a.setOnClickListener(new ifg(this, context, afn));
    }

    public final int b(int i)
    {
        return 0;
    }

    public final long b()
    {
        return -1L;
    }
}
