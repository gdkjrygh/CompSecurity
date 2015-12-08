// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.TableLayout;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            fh, gg, gd

class b extends TableLayout
    implements fh
{

    View a;
    gd b;
    int c;
    final gg d;

    private int c()
    {
        int i = c;
        if (c == 0)
        {
            i = gg.a(d, getContext());
        }
        return i - b.a(H).getWidth() - b.a(J).getWidth() - 10;
    }

    public void a()
    {
        b();
    }

    public void a(View view)
    {
        a = view;
    }

    public void b()
    {
        int i = c();
        int j = b.a(J).getHeight();
        a.setLayoutParams(new android.widget.Row.LayoutParams(i, j));
    }

    (gg gg1, Context context, gd gd1, int i)
    {
        d = gg1;
        super(context);
        c = i;
        b = gd1;
    }
}
