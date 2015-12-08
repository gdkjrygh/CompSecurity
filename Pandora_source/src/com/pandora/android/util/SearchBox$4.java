// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

// Referenced classes of package com.pandora.android.util:
//            SearchBox

class a
    implements android.view.Listener
{

    final SearchBox a;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            a.a.setCursorVisible(true);
        }
        return false;
    }

    (SearchBox searchbox)
    {
        a = searchbox;
        super();
    }
}
