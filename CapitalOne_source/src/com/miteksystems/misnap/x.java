// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.os.Handler;
import android.view.View;

// Referenced classes of package com.miteksystems.misnap:
//            u

final class x
    implements android.view.View.OnClickListener
{

    final u a;

    x(u u1)
    {
        a = u1;
        super();
    }

    public final void onClick(View view)
    {
        a.j.sendEmptyMessage(7);
    }
}
