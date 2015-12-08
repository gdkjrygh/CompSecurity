// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.List;

abstract class dab extends czv
{

    private final daf c;
    final String d;
    private final boolean e;

    public dab(List list, String s, daf daf1, boolean flag)
    {
        super(list);
        c = daf1;
        d = s;
        e = flag;
    }

    protected final void c(View view)
    {
        c.a(view, d, e);
    }
}
