// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.overlay.h;
import com.google.android.gms.common.internal.u;

// Referenced classes of package com.google.android.gms.internal:
//            cw

public final class cv
{

    final cw a;
    final Context b;
    final ViewGroup c;
    h d;

    public cv(Context context, ViewGroup viewgroup, cw cw)
    {
        this(context, viewgroup, cw, (byte)0);
    }

    private cv(Context context, ViewGroup viewgroup, cw cw, byte byte0)
    {
        b = context;
        c = viewgroup;
        a = cw;
        d = null;
    }

    public final h a()
    {
        u.b("getAdVideoUnderlay must be called from the UI thread.");
        return d;
    }
}
