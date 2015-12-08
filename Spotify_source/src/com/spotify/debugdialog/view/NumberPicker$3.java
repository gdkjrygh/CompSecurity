// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.debugdialog.view;

import android.view.ViewTreeObserver;
import android.widget.TextView;

// Referenced classes of package com.spotify.debugdialog.view:
//            NumberPicker

final class a
    implements android.view.r.OnPreDrawListener
{

    private NumberPicker a;

    public final boolean onPreDraw()
    {
        NumberPicker.b(a).getViewTreeObserver().removeOnPreDrawListener(this);
        a.a();
        return true;
    }

    ner(NumberPicker numberpicker)
    {
        a = numberpicker;
        super();
    }
}
