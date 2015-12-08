// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.ViewTreeObserver;

// Referenced classes of package android.support.v7.internal.widget:
//            SpinnerCompat

class val.layoutListener
    implements android.widget.pat.DropdownPopup._cls3
{

    final val.layoutListener this$1;
    final android.view.tListener val$layoutListener;

    public void onDismiss()
    {
        ViewTreeObserver viewtreeobserver = getViewTreeObserver();
        if (viewtreeobserver != null)
        {
            viewtreeobserver.removeGlobalOnLayoutListener(val$layoutListener);
        }
    }

    ()
    {
        this$1 = final_;
        val$layoutListener = android.view.tListener.this;
        super();
    }
}
