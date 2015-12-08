// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.porcelain.delegates.PorcelainDefaultImageDelegate;

public final class dqb
{

    private final Context a;

    private dqb(Context context)
    {
        a = context;
    }

    public dqb(Context context, byte byte0)
    {
        this(context);
    }

    public final PorcelainDefaultImageDelegate a(com.spotify.mobile.android.porcelain.delegates.PorcelainDefaultImageDelegate.LoadPolicy loadpolicy)
    {
        return new PorcelainDefaultImageDelegate(a, loadpolicy);
    }
}
