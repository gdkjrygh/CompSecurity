// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.c.a.b;
import android.view.ActionProvider;

// Referenced classes of package android.support.v7.internal.view.menu:
//            l, r, m

class q extends l
{

    q(Context context, b b)
    {
        super(context, b);
    }

    m a(ActionProvider actionprovider)
    {
        return new r(this, a, actionprovider);
    }
}
