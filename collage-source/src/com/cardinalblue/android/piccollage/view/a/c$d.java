// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            c

public static class a extends android.support.v7.widget.clerView.ViewHolder
{

    private int a;

    public void a()
    {
        Bitmap bitmap = Bitmap.createBitmap(2, 2, android.graphics.ap.Config.ARGB_8888);
        bitmap.eraseColor(a);
        ((ImageView)itemView.findViewById(0x7f100231)).setImageBitmap(bitmap);
    }

    public er(View view, int i)
    {
        super(view);
        a = i;
    }
}
