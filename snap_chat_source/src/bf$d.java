// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewPropertyAnimator;

static class > extends >
{

    public final void a(bf bf1, View view, bi bi)
    {
        if (bi != null)
        {
            view.animate().setListener(new <init>(bi, view));
            return;
        } else
        {
            view.animate().setListener(null);
            return;
        }
    }

    >()
    {
    }
}
