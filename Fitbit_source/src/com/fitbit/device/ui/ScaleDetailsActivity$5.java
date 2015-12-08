// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.fitbit.device.ui:
//            ScaleDetailsActivity

class a
    implements android.widget.Listener
{

    final ScaleDetailsActivity a;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            ScaleDetailsActivity.b(a);
            return true;
        } else
        {
            return false;
        }
    }

    er(ScaleDetailsActivity scaledetailsactivity)
    {
        a = scaledetailsactivity;
        super();
    }
}
