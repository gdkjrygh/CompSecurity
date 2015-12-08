// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import com.spotify.android.paste.widget.prettylist.StickyListView;

public final class div extends FrameLayout
    implements dir
{

    private final StickyListView a;
    private dii b;

    public div(Context context)
    {
        super(context);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        a = new StickyListView(context);
        a.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        addView(a);
    }

    public final StickyListView a()
    {
        return a;
    }

    public final void a(int i)
    {
        a.a(i);
    }

    public final void a(View view)
    {
    }

    public final void a(dii dii1)
    {
        b = dii1;
    }

    public final void a(String s)
    {
        if (b != null)
        {
            b.a(s);
        }
    }

    public final void a(boolean flag)
    {
    }

    public final dip b()
    {
        return null;
    }

    public final void b(View view)
    {
        a.a(view);
        a.b(view);
    }

    public final void b(boolean flag)
    {
    }

    public final ListView c()
    {
        return a.a;
    }

    public final void c(boolean flag)
    {
    }

    public final ImageView d()
    {
        return null;
    }

    public final void e()
    {
        a.a(true);
    }

    public final void f()
    {
        a.a(false);
    }

    public final View g()
    {
        return this;
    }
}
