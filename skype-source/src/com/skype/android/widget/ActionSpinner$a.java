// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.skype.android.widget:
//            ActionSpinner

private final class a
    implements android.widget.emClickListener
{

    android.widget.emClickListener a;
    final ActionSpinner b;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (b.b != null)
        {
            b.b.onItemSelected(adapterview, view, i, l);
        }
        a.onItemClick(adapterview, view, i, l);
    }

    tener(ActionSpinner actionspinner, android.widget.emClickListener emclicklistener)
    {
        b = actionspinner;
        super();
        a = emclicklistener;
    }
}
