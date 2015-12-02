// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.b;

import android.content.res.Resources;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.ProgressBar;

// Referenced classes of package com.facebook.orca.photos.b:
//            w

public class ab
{

    private final Resources a;
    private boolean b;

    public ab(Resources resources)
    {
        a = resources;
    }

    private void a(boolean flag, View view)
    {
        if (flag && !b)
        {
            view.setVisibility(0);
            b = true;
            ((TransitionDrawable)view.getBackground()).startTransition(0);
        }
        if (!flag && b)
        {
            ((TransitionDrawable)view.getBackground()).reverseTransition(300);
            b = false;
            view.setVisibility(8);
        }
    }

    public void a(w w1, ProgressBar progressbar, View view)
    {
        if (progressbar == null || view == null)
        {
            return;
        }
        if (w1 == null)
        {
            progressbar.setVisibility(8);
            a(false, view);
            return;
        }
        if (w1.b == -1)
        {
            progressbar.setVisibility(8);
            a(true, view);
            return;
        }
        if (w1.c)
        {
            progressbar.setVisibility(8);
            a(false, view);
            return;
        } else
        {
            a(true, view);
            progressbar.setVisibility(0);
            progressbar.setProgress(w1.b);
            return;
        }
    }
}
