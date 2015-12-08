// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.translate.widget.StarButton;
import com.google.android.libraries.translate.core.Entry;

// Referenced classes of package com.google.android.apps.translate:
//            m

final class b
{

    final View a;
    final TextView b;
    final TextView c;
    final StarButton d;
    Entry e;

    b(View view)
    {
        b = (TextView)view.findViewById(0x1020014);
        c = (TextView)view.findViewById(0x1020015);
        d = (StarButton)view.findViewById(m.btn_star);
        a = view.findViewById(m.card_bg_holder);
    }
}
