// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class byx
    implements android.view.View.OnLongClickListener
{

    private View a;
    private byv b;

    byx(byv byv1, View view)
    {
        b = byv1;
        a = view;
        super();
    }

    public final boolean onLongClick(View view)
    {
        return byh.a(a) && byh.d(b.a).onLongClick(a);
    }
}
