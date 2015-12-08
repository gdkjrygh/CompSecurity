// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            bw

class bx extends bw
{

    bx()
    {
    }

    public final void c(View view, int i)
    {
        view.setImportantForAccessibility(i);
    }

    public final boolean w(View view)
    {
        return view.isLaidOut();
    }

    public final boolean x(View view)
    {
        return view.isAttachedToWindow();
    }
}
