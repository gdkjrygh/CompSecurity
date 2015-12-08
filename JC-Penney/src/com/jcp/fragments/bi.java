// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import com.jcp.b.b;

// Referenced classes of package com.jcp.fragments:
//            bh

class bi
    implements android.view.View.OnClickListener
{

    final bh a;

    bi(bh bh1)
    {
        a = bh1;
        super();
    }

    public void onClick(View view)
    {
        bh.a(a, "This link will be opened in a browser.", b.w());
    }
}
