// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewPropertyAnimator;

class oh extends oe
{

    oh()
    {
    }

    public final void a(ob ob, View view, oo oo)
    {
        if (oo != null)
        {
            view.animate().setListener(new om(oo, view));
            return;
        } else
        {
            view.animate().setListener(null);
            return;
        }
    }
}
