// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewPropertyAnimator;

class oi extends og
{

    oi()
    {
    }

    public final void a(View view, oq oq)
    {
        view.animate().setUpdateListener(new on(oq, view));
    }
}
