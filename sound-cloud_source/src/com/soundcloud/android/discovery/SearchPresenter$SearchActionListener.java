// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.soundcloud.android.discovery:
//            SearchPresenter

private class <init>
    implements android.widget.rchActionListener
{

    final SearchPresenter this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 0 || i == 3)
        {
            SearchPresenter.access$1700(SearchPresenter.this);
            return true;
        } else
        {
            return false;
        }
    }

    private ()
    {
        this$0 = SearchPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
