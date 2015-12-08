// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.animation.Animator;
import android.widget.ArrayAdapter;
import com.kik.m.c;
import com.kik.view.adapters.au;

// Referenced classes of package kik.android.widget:
//            dh, ResizeEventList

final class di extends c
{

    final dh a;

    di(dh dh1)
    {
        a = dh1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (a.c instanceof au)
        {
            ((au)a.c).a(false);
        }
        a.e.setVerticalScrollBarEnabled(true);
        a.e.setOverScrollMode(0);
        a.c.notifyDataSetChanged();
    }
}
