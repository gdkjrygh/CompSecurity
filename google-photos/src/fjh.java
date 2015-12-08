// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView;

final class fjh
    implements Runnable
{

    private ViewGroup a;
    private fjg b;

    fjh(fjg fjg1, ViewGroup viewgroup)
    {
        b = fjg1;
        a = viewgroup;
        super();
    }

    public final void run()
    {
        int i = a.getChildCount();
        if (i > 0)
        {
            i = a.getChildAt(i - 1).getBottom();
            fjg fjg1 = b;
            int j = fjg1.b.c;
            if (j > 0)
            {
                fjg1.b.a(ojm.d, j - fjg1.c.top);
            }
            j = Math.round(((float)fjg1.b.a(ojm.d) * fjg1.a) / 100F);
            i += fjg1.c.bottom;
            if (i < j)
            {
                fjg1.b.a(ojm.c, i);
                fjg1.b.a(ExpandingScrollView.b);
            } else
            {
                fjg1.b.a(ojm.c, j);
                fjg1.b.a(ExpandingScrollView.a);
            }
            fjg1.a();
        }
    }
}
