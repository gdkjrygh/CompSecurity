// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;

// Referenced classes of package com.skype.android.widget:
//            ActionSpinner

final class a
    implements android.view.Listener
{

    final ActionSpinner a;

    public final boolean onLongClick(View view)
    {
        if (a.a.size() == 1)
        {
            if (a.c != null)
            {
                Toast.makeText(a.getContext(), a.c, 1).show();
            }
            return true;
        } else
        {
            return false;
        }
    }

    (ActionSpinner actionspinner)
    {
        a = actionspinner;
        super();
    }
}
