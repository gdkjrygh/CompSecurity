// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.appboy.ui.widget:
//            c

final class d
    implements android.widget.ViewSwitcher.ViewFactory
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public final View makeView()
    {
        return new ImageView(a.a.getApplicationContext());
    }
}
