// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            Toolbar

final class be
    implements android.view.View.OnClickListener
{

    final Toolbar a;

    be(Toolbar toolbar)
    {
        a = toolbar;
        super();
    }

    public final void onClick(View view)
    {
        a.c();
    }
}
