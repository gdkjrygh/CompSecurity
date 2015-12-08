// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal:
//            qi

public final class qk extends qi
{

    public qk()
    {
    }

    public final boolean a(View view)
    {
        return view.isAttachedToWindow();
    }

    public final android.view.ViewGroup.LayoutParams d()
    {
        return new android.view.ViewGroup.LayoutParams(-1, -1);
    }
}
