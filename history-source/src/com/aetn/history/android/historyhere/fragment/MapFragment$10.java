// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapFragment

class this._cls0
    implements android.widget.orActionListener
{

    final MapFragment this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 3 || i == 6 || keyevent.getAction() == 0 && keyevent.getKeyCode() == 66)
        {
            textview = textview.getText().toString();
            MapFragment.access$2100(MapFragment.this, textview);
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = MapFragment.this;
        super();
    }
}
