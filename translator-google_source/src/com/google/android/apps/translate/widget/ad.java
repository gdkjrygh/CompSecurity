// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.widget.ListPopupWindow;
import com.google.android.libraries.translate.e.o;

// Referenced classes of package com.google.android.apps.translate.widget:
//            ac, LangSpinner, ab, ae

final class ad extends ListPopupWindow
    implements ac
{

    final LangSpinner a;

    public ad(LangSpinner langspinner)
    {
        a = langspinner;
        super(langspinner.getContext());
        setOnDismissListener(langspinner);
        setModal(true);
        setOnItemClickListener(langspinner);
        setAdapter(LangSpinner.b(langspinner));
        setAnchorView(langspinner);
        if (o.e)
        {
            langspinner.setOnTouchListener(createDragToOpenListener(langspinner));
        }
    }

    public final void show()
    {
        if (LangSpinner.b(a).isEmpty() && LangSpinner.c(a) != null)
        {
            LangSpinner.b(a).addAll(LangSpinner.c(a).a(a));
        }
        super.show();
    }
}
