// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class byo
    implements dcm
{

    private byh a;

    byo(byh byh1)
    {
        a = byh1;
        super();
    }

    public final android.view.View.DragShadowBuilder a(View view)
    {
        byh.b(a);
        return new daq(view);
    }

    public final void a(int i, int j)
    {
        byh.a(a, i, j);
    }

    public final boolean b(int i, int j)
    {
        while (!byh.a(a).a(i) || !byh.a(a).a(j) || byh.a(a).d(i).d == cnt.e || byh.a(a).d(j).d == cnt.e) 
        {
            return false;
        }
        return true;
    }
}
