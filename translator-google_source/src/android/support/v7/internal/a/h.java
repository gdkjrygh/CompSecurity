// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.support.v4.view.ei;
import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;

// Referenced classes of package android.support.v7.internal.a:
//            e

final class h
    implements ei
{

    final e a;

    h(e e1)
    {
        a = e1;
        super();
    }

    public final void a()
    {
        ((View)e.c(a).getParent()).invalidate();
    }
}
