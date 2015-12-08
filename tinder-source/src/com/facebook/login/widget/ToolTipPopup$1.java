// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import android.widget.PopupWindow;
import java.lang.ref.WeakReference;

// Referenced classes of package com.facebook.login.widget:
//            ToolTipPopup

final class a
    implements android.view.r.OnScrollChangedListener
{

    final ToolTipPopup a;

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

    ngedListener(ToolTipPopup tooltippopup)
    {
        a = tooltippopup;
        super();
    }
}
