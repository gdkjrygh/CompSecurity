// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v4.view:
//            dd, dn, dq

class df extends dd
{

    df()
    {
    }

    public final void a(View view, dq dq)
    {
        view.animate().setUpdateListener(new dn(dq, view));
    }
}
