// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.internal:
//            b, zzbi

class c extends FrameLayout
{

    private final b a;
    private final zzbi b;
    private final View c;

    public c(Context context, zzbi zzbi, View view, b b1)
    {
        super(context);
        zzv.zzb(zzbi, "Native ad engine must not be null!");
        zzv.zzb(view, "Native ad bounding box must not be null!");
        b = zzbi;
        c = view;
        a = b1;
        addView(view);
        if (a != null)
        {
            addView(a);
        }
    }

    public zzbi a()
    {
        return b;
    }

    public View b()
    {
        return c;
    }
}
