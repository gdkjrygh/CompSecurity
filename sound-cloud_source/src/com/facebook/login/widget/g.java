// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import android.widget.PopupWindow;
import java.lang.ref.WeakReference;

// Referenced classes of package com.facebook.login.widget:
//            f

final class g
    implements android.view.ViewTreeObserver.OnScrollChangedListener
{

    final f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    public final void onScrollChanged()
    {
label0:
        {
            if (a.b.get() != null && a.e != null && a.e.isShowing())
            {
                if (!a.e.isAboveAnchor())
                {
                    break label0;
                }
                a.d.b();
            }
            return;
        }
        a.d.a();
    }
}
