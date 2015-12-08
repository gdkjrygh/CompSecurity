// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.res.Resources;
import android.widget.LinearLayout;

// Referenced classes of package kik.android.widget:
//            GifWidget

final class bs
    implements Runnable
{

    final GifWidget a;

    bs(GifWidget gifwidget)
    {
        a = gifwidget;
        super();
    }

    public final void run()
    {
        a._gifsCantLoad.setBackgroundColor(a.getResources().getColor(0x7f0c0007));
        a._gifsCantLoad.setVisibility(0);
    }
}
