// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

class mt extends ms
{

    mt()
    {
    }

    public final boolean A(View view)
    {
        return view.isAttachedToWindow();
    }

    public final void c(View view, int i)
    {
        view.setImportantForAccessibility(i);
    }

    public final boolean z(View view)
    {
        return view.isLaidOut();
    }
}
