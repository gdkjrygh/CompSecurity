// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.view.View;
import android.widget.RelativeLayout;
import com.pandora.android.activity.a;
import com.pandora.android.data.j;
import com.pandora.android.provider.b;
import com.pandora.radio.util.k;
import p.cm.an;
import p.cw.c;

// Referenced classes of package com.pandora.android.ads:
//            j

class b
    implements android.view..OnClickListener
{

    final j a;
    final com.pandora.radio.data.b b;
    final com.pandora.android.ads.j c;

    public void onClick(View view)
    {
        switch (com.pandora.android.ads.a[com.pandora.android.ads.j.b(c).ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown state - ").append(com.pandora.android.ads.j.b(c)).toString());

        case 1: // '\001'
            com.pandora.android.ads.j.a(c, com.pandora.android.ads.b);
            // fall through

        case 5: // '\005'
        case 6: // '\006'
            return;

        case 2: // '\002'
            (new an()).execute(new Object[] {
                a.j()
            });
            com.pandora.android.ads.j.a(c, com.pandora.android.ads.c);
            return;

        case 3: // '\003'
            com.pandora.android.activity.a.a(com.pandora.android.ads.j.a(c).getContext(), a.h());
            b.a.b().o().a(com.pandora.radio.util.f, b);
            return;

        case 4: // '\004'
            com.pandora.android.ads.j.a(c, com.pandora.android.ads.b);
            break;
        }
    }

    .b(com.pandora.android.ads.j j1, j j2, com.pandora.radio.data.b b1)
    {
        c = j1;
        a = j2;
        b = b1;
        super();
    }
}
