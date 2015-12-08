// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.diagnostics;

import Cf;
import Cj;
import android.view.LayoutInflater;
import java.util.ArrayList;
import java.util.List;
import pi;

// Referenced classes of package com.snapchat.android.ui.diagnostics:
//            DiagnosticsView

final class <init> extends <init>
{

    private final List a = new ArrayList();

    public final void a(Cf cf)
    {
    }

    public final void a(Cj cj)
    {
        a.add(cj);
        notifyDataSetChanged();
    }

    public final void a(Cj cj, pi pi)
    {
        a.remove(cj);
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Object getItem(int i)
    {
        return a.get(i);
    }

    public (LayoutInflater layoutinflater)
    {
        super(layoutinflater);
    }
}
