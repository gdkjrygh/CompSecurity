// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow

private class <init> extends DataSetObserver
{

    final ListPopupWindow this$0;

    public void onChanged()
    {
        if (isShowing())
        {
            show();
        }
    }

    public void onInvalidated()
    {
        dismiss();
    }

    private ()
    {
        this$0 = ListPopupWindow.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
