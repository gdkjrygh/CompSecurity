// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.widget.PopupWindow;
import asg;
import java.lang.ref.WeakReference;

// Referenced classes of package com.facebook.widget:
//            ToolTipPopup

final class a
    implements android.view.r.OnScrollChangedListener
{

    private ToolTipPopup a;

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

    ollChangedListener(ToolTipPopup tooltippopup)
    {
        a = tooltippopup;
        super();
    }
}
