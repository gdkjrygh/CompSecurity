// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class adk
{

    int a;
    int b;
    boolean c;
    final adi d;

    adk(adi adi1)
    {
        d = adi1;
        super();
    }

    final void a()
    {
        int i;
        if (c)
        {
            i = d.c.c();
        } else
        {
            i = d.c.b();
        }
        b = i;
    }

    public final void a(View view)
    {
        if (c)
        {
            b = d.c.b(view) + d.c.a();
        } else
        {
            b = d.c.a(view);
        }
        a = d.getPosition(view);
    }

    public final String toString()
    {
        return (new StringBuilder("AnchorInfo{mPosition=")).append(a).append(", mCoordinate=").append(b).append(", mLayoutFromEnd=").append(c).append('}').toString();
    }
}
