// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;

final class git extends bo
    implements nuc
{

    final nud b = new ntz(this);
    final SparseArray c = new SparseArray();
    private final fqc d;

    git(Context context, ay ay)
    {
        super(ay);
        d = (fqc)olm.a(context, fqc);
    }

    public final am a(int i)
    {
        int j = i;
        if (d.a())
        {
            j = giu.values().length - i - 1;
        }
        return giu.values()[j].a();
    }

    public final Object a(ViewGroup viewgroup, int i)
    {
        viewgroup = (am)super.a(viewgroup, i);
        c.put(i, viewgroup);
        return viewgroup;
    }

    public final nud a()
    {
        return b;
    }

    public final void a(ViewGroup viewgroup)
    {
        super.a(viewgroup);
        b.b();
    }

    public final void a(ViewGroup viewgroup, int i, Object obj)
    {
        super.a(viewgroup, i, obj);
        c.delete(i);
    }

    public final int b()
    {
        return giu.values().length;
    }
}
