// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging.views;

import android.view.KeyEvent;
import android.widget.Spinner;
import android.widget.TextView;

// Referenced classes of package com.fitbit.food.ui.logging.views:
//            ServingSizeView

class a
    implements android.widget.ctionListener
{

    final ServingSizeView a;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        a.e();
        a.b.performClick();
        return false;
    }

    (ServingSizeView servingsizeview)
    {
        a = servingsizeview;
        super();
    }
}
