// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.view.View;
import com.pandora.android.activity.a;
import com.pandora.android.provider.b;
import com.pandora.radio.data.y;
import com.pandora.radio.util.k;
import p.cw.c;

// Referenced classes of package com.pandora.android.util:
//            o

class a
    implements android.view..OnClickListener
{

    final o a;

    public void onClick(View view)
    {
        if (com.pandora.android.util.o.a(a) == null)
        {
            return;
        } else
        {
            com.pandora.android.activity.a.a(com.pandora.android.util.o.a(a), null, true, false, p.cw.b, null);
            b.a.b().o().a("replay_click", com.pandora.android.util.o.a(a).c());
            return;
        }
    }

    b(o o1)
    {
        a = o1;
        super();
    }
}
