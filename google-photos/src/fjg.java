// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView;

public final class fjg
    implements fjf
{

    final float a;
    ExpandingScrollView b;
    Rect c;
    private final Activity d;
    private final float e;
    private View f;
    private ojl g;

    public fjg(Activity activity, float f1, float f2)
    {
        c = new Rect(0, 0, 0, 0);
        g = new fji(this);
        d = activity;
        e = f1;
        a = f2;
    }

    static Activity a(fjg fjg1)
    {
        return fjg1.d;
    }

    public final fjg a(olm olm1)
    {
        olm1.a(fjf, this);
        return this;
    }

    void a()
    {
        f.setPadding(c.left, 0, c.right, c.bottom + (b.c - b.a(ojm.d)));
    }

    public final void a(View view, Rect rect)
    {
        f = view;
        c = rect;
        a();
    }

    public final void a(ViewGroup viewgroup)
    {
        viewgroup.post(new fjh(this, viewgroup));
    }

    public final void a(ExpandingScrollView expandingscrollview)
    {
        b = expandingscrollview;
        expandingscrollview.a(ojm.b, 0.0F);
        expandingscrollview.a(ojm.c, e);
        expandingscrollview.a(ojm.c, false);
        expandingscrollview.a(g);
    }
}
