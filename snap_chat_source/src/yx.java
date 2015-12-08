// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;

public final class yx extends android.support.v7.widget.RecyclerView.a
{

    private final LayoutInflater c;
    private List d;

    public yx(List list, LayoutInflater layoutinflater)
    {
        d = list;
        c = layoutinflater;
    }

    public final int a(int i)
    {
        return ((yt)d.get(i)).a();
    }

    public final android.support.v7.widget.RecyclerView.v a(ViewGroup viewgroup, int i)
    {
        switch (i)
        {
        default:
            throw new RuntimeException((new StringBuilder("Unexpected viewtype for collaborator item: ")).append(i).toString());

        case 0: // '\0'
            return new ys(c.inflate(0x7f04004b, viewgroup, false));

        case 1: // '\001'
            return new yw(c.inflate(0x7f04004a, viewgroup, false));

        case 2: // '\002'
            return new yw(c.inflate(0x7f04004a, viewgroup, false));
        }
    }

    public final void a(android.support.v7.widget.RecyclerView.v v, int i)
    {
        ((yu)v).a((yt)d.get(i));
    }

    public final int b()
    {
        return d.size();
    }
}
