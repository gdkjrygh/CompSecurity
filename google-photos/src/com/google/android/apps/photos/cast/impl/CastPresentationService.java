// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.cast.impl;

import android.content.Context;
import android.view.Display;
import b;
import egv;
import lyj;
import lyl;
import lym;
import olm;

public final class CastPresentationService
    implements lym
{

    private Context a;
    private lyl b;
    private lyj c;

    public CastPresentationService()
    {
    }

    public final void a(Context context)
    {
        a = context;
        b = (lyl)olm.a(context, lyl);
    }

    public final void a(Display display)
    {
        c = b.a(a, display, b.lo, new egv());
        c.show();
    }
}
