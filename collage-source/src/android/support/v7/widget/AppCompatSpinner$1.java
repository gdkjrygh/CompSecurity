// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            AppCompatSpinner, ListPopupWindow

class wardingListener extends wardingListener
{

    final AppCompatSpinner this$0;
    final opdownPopup val$popup;

    public ListPopupWindow getPopup()
    {
        return val$popup;
    }

    public boolean onForwardingStarted()
    {
        if (!AppCompatSpinner.access$000(AppCompatSpinner.this).isShowing())
        {
            AppCompatSpinner.access$000(AppCompatSpinner.this).show();
        }
        return true;
    }

    opdownPopup(opdownPopup opdownpopup)
    {
        this$0 = final_appcompatspinner;
        val$popup = opdownpopup;
        super(View.this);
    }
}
