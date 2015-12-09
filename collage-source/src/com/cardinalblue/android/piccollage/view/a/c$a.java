// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.view.View;
import com.cardinalblue.android.piccollage.lib.a;
import com.cardinalblue.android.piccollage.model.gson.IBackground;
import com.cardinalblue.android.piccollage.view.CheckableCircleView;
import java.io.IOException;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            c

public static class b extends android.support.v7.widget.clerView.ViewHolder
{

    private int a;
    private int b;

    public void a(IBackground ibackground, boolean flag)
        throws IOException
    {
        CheckableCircleView checkablecircleview = (CheckableCircleView)itemView;
        checkablecircleview.setChecked(flag);
        com.cardinalblue.android.piccollage.lib.a(ibackground.getThumbnailPath()).a(checkablecircleview);
    }

    public IBackground(View view, int i, int j)
    {
        super(view);
        a = i;
        b = j;
        ((CheckableCircleView)view).a(a, b);
    }
}
