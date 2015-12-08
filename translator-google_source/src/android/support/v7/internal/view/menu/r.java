// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.b.a.b;
import android.view.ActionProvider;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemWrapperICS, s, o

final class r extends MenuItemWrapperICS
{

    r(Context context, b b)
    {
        super(context, b);
    }

    final o a(ActionProvider actionprovider)
    {
        return new s(this, a, actionprovider);
    }
}
