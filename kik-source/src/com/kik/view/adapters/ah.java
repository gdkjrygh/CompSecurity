// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.widget.Adapter;

// Referenced classes of package com.kik.view.adapters:
//            bb

public final class ah extends bb
{

    private String a;
    private String b;

    public ah(Context context)
    {
        super(context);
        a = context.getString(0x7f090172);
        b = context.getString(0x7f090276).toUpperCase();
    }

    public final void a(Adapter adapter)
    {
        super.c(a, adapter);
    }

    public final void b(Adapter adapter)
    {
        super.c(b, adapter);
    }
}
