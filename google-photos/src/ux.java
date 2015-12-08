// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;

final class ux
    implements oq
{

    private uu a;

    ux(uu uu1)
    {
        a = uu1;
        super();
    }

    public final void a()
    {
        ((View)uu.c(a).getParent()).invalidate();
    }
}
