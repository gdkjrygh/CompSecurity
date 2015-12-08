// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.diagnostics;

import Cf;
import Cj;
import android.view.LayoutInflater;
import java.util.LinkedList;
import pi;

// Referenced classes of package com.snapchat.android.ui.diagnostics:
//            DiagnosticsView

final class <init> extends <init>
{

    final LinkedList a = new LinkedList();

    public final void a(Cf cf)
    {
    }

    public final void a(Cj cj)
    {
    }

    public final void a(Cj cj, pi pi)
    {
        a.addFirst(cj);
        if (a.size() > 100)
        {
            a.removeLast();
        }
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
