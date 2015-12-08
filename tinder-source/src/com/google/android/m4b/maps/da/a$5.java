// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.da;

import android.content.Context;
import android.view.View;
import com.google.android.m4b.maps.g.g;

// Referenced classes of package com.google.android.m4b.maps.da:
//            a

public final class b
    implements android.view..OnClickListener
{

    private Context a;
    private int b;

    public final void onClick(View view)
    {
        a.startActivity(g.b(b));
    }

    public (Context context, int i)
    {
        a = context;
        b = i;
        super();
    }
}
