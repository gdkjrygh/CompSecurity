// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v4.view:
//            dt, ed, dq, eg

class dw extends dt
{

    dw()
    {
    }

    public final void a(dq dq, View view, eg eg)
    {
        if (eg != null)
        {
            view.animate().setListener(new ed(eg, view));
            return;
        } else
        {
            view.animate().setListener(null);
            return;
        }
    }
}
