// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.widget.ListPopupWindow;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            SpinnerCompat

class gListener extends android.support.v7.widget.ForwardingListener
{

    final SpinnerCompat this$0;
    final opdownPopup val$popup;

    public ListPopupWindow getPopup()
    {
        return val$popup;
    }

    public boolean onForwardingStarted()
    {
        if (!SpinnerCompat.access$100(SpinnerCompat.this).isShowing())
        {
            SpinnerCompat.access$100(SpinnerCompat.this).show();
        }
        return true;
    }

    opdownPopup(opdownPopup opdownpopup)
    {
        this$0 = final_spinnercompat;
        val$popup = opdownpopup;
        super(View.this);
    }
}
