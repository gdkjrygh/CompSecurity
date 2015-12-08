// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v4.view:
//            af, aj

static class ator extends ator
{

    public final void a(af af1, View view, aj aj)
    {
        if (aj != null)
        {
            view.animate().setListener(new <init>(aj, view));
            return;
        } else
        {
            view.animate().setListener(null);
            return;
        }
    }

    ator()
    {
    }
}
