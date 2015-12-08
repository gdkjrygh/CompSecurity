// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.moviemaker.ui.StoryboardVideoPosterView;

final class byw
    implements android.view.View.OnClickListener
{

    private StoryboardVideoPosterView a;
    private View b;
    private byv c;

    byw(byv byv1, StoryboardVideoPosterView storyboardvideoposterview, View view)
    {
        c = byv1;
        a = storyboardvideoposterview;
        b = view;
        super();
    }

    public final void onClick(View view)
    {
        view = byh.i(c.a);
        boolean flag;
        if (view != null)
        {
            flag = ox.a((AccessibilityManager)view.getSystemService("accessibility"));
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view = a;
            if (b.f())
            {
                ((dbq) (view)).b.b(view);
            }
        }
        byh.d(c.a).onClick(b);
    }
}
