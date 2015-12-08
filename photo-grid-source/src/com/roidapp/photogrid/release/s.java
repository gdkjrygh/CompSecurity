// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            r, PhotoGridActivity

final class s
    implements android.view.View.OnClickListener
{

    final r a;

    s(r r1)
    {
        a = r1;
        super();
    }

    public final void onClick(View view)
    {
        r.a(a).b(0, -1);
    }
}
