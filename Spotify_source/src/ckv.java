// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.ViewGroup;

public final class ckv
{

    final ckw a;
    final Context b;
    final ViewGroup c;
    bhw d;

    public ckv(Context context, ViewGroup viewgroup, ckw ckw)
    {
        this(context, viewgroup, ckw, (byte)0);
    }

    private ckv(Context context, ViewGroup viewgroup, ckw ckw, byte byte0)
    {
        b = context;
        c = viewgroup;
        a = ckw;
        d = null;
    }

    public final bhw a()
    {
        btl.b("getAdVideoUnderlay must be called from the UI thread.");
        return d;
    }
}
