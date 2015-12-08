// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.view.View;

// Referenced classes of package com.google.android.apps.translate.widget:
//            ScrollTextView

final class ar
    implements android.view.View.OnClickListener
{

    final ScrollTextView a;

    ar(ScrollTextView scrolltextview)
    {
        a = scrolltextview;
        super();
    }

    public final void onClick(View view)
    {
        if (!ScrollTextView.a(a) && ScrollTextView.b(a) != null)
        {
            ScrollTextView.b(a).onClick(view);
        }
    }
}
