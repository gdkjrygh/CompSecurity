// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageSelector

final class jx
    implements Runnable
{

    final int a;
    final ViewGroup b;
    final ImageSelector c;

    jx(ImageSelector imageselector, int i, ViewGroup viewgroup)
    {
        c = imageselector;
        a = i;
        b = viewgroup;
        super();
    }

    public final void run()
    {
        int i = a;
        int j = b.getChildAt(0).getMeasuredWidth() / 2;
        b.setPadding(i - j, 0, 0, 0);
    }
}
