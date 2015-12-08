// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.ViewTreeObserver;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageEditFreeCropActivity

final class ij
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final TextView a;
    final ImageEditFreeCropActivity b;

    ij(ImageEditFreeCropActivity imageeditfreecropactivity, TextView textview)
    {
        b = imageeditfreecropactivity;
        a = textview;
        super();
    }

    public final void onGlobalLayout()
    {
        a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        ImageEditFreeCropActivity.a(b);
    }
}
