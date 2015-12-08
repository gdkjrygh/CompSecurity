// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.graphics.Rect;
import android.view.View;
import kik.android.chat.KikApplication;

// Referenced classes of package kik.android.widget:
//            GifSearchFragment

final class ba extends android.support.v7.widget.RecyclerView.g
{

    final GifSearchFragment a;
    private int b;

    ba(GifSearchFragment gifsearchfragment)
    {
        a = gifsearchfragment;
        super();
        b = KikApplication.a(1);
    }

    public final void a(Rect rect, View view)
    {
        rect.left = b;
        rect.right = b;
        rect.top = b;
        rect.bottom = b;
    }
}
