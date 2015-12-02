// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import android.view.View;
import com.qihoo360.mobilesafe.b.q;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui:
//            c

class a
    implements android.view..OnClickListener
{

    final c a;

    public void onClick(View view)
    {
label0:
        {
            if (a.i != null)
            {
                if (a.h)
                {
                    break label0;
                }
                q.a().a(0x7f0c0239);
            }
            return;
        }
        a.i.a(a);
        a.dismiss();
    }

    (c c1)
    {
        a = c1;
        super();
    }
}
