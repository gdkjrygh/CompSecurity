// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.view.View;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            f

class a
    implements android.view..OnClickListener
{

    final int a;
    final f b;

    public void onClick(View view)
    {
        if (f.a(b) != null)
        {
            f.a(b).a(a - 1);
        }
    }

    (f f1, int i)
    {
        b = f1;
        a = i;
        super();
    }
}
