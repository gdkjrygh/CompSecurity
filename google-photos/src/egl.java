// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v7.app.MediaRouteActionProvider;

final class egl extends MediaRouteActionProvider
{

    android.view.View.OnClickListener h;
    private final int i;
    private final int j;

    public egl(Context context, int k, int l)
    {
        super(context);
        i = k;
        j = l;
    }

    public final ts g()
    {
        egm egm1 = new egm(super.a, i, j);
        if (h != null)
        {
            egm1.setOnClickListener(h);
        }
        return egm1;
    }
}
