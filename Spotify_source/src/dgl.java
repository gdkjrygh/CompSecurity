// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.paste.widget.HeaderView;

public final class dgl extends jz
{

    private HeaderView b;

    private dgl(HeaderView headerview)
    {
        b = headerview;
        super();
    }

    public dgl(HeaderView headerview, byte byte0)
    {
        this(headerview);
    }

    public final int a(Object obj)
    {
        if (obj.equals(HeaderView.f(b)))
        {
            return -1;
        } else
        {
            return super.a(obj) + 1;
        }
    }

    public final Parcelable a()
    {
        if (HeaderView.e(b) != null)
        {
            return HeaderView.e(b).a();
        } else
        {
            return null;
        }
    }

    public final Object a(ViewGroup viewgroup, int i)
    {
        if (i == 0)
        {
            viewgroup.addView(HeaderView.f(b));
            return HeaderView.f(b);
        } else
        {
            return HeaderView.e(b).a(viewgroup, i - 1);
        }
    }

    public final void a(ViewGroup viewgroup)
    {
        if (HeaderView.e(b) != null)
        {
            HeaderView.e(b).a(viewgroup);
        }
    }

    public final void a(ViewGroup viewgroup, int i, Object obj)
    {
        if (i == 0)
        {
            viewgroup.removeView(HeaderView.f(b));
            return;
        } else
        {
            HeaderView.e(b).a(viewgroup, i - 1, obj);
            return;
        }
    }

    public final boolean a(View view, Object obj)
    {
        if (obj == HeaderView.f(b))
        {
            return view == HeaderView.f(b);
        } else
        {
            return HeaderView.e(b).a(view, obj);
        }
    }

    public final int b()
    {
        if (HeaderView.e(b) != null)
        {
            return HeaderView.e(b).b() + 1;
        } else
        {
            return 1;
        }
    }

    public final CharSequence b(int i)
    {
        if (i == 0)
        {
            return super.b(0);
        } else
        {
            return HeaderView.e(b).b(i - 1);
        }
    }

    public final void b(ViewGroup viewgroup, int i, Object obj)
    {
        if (HeaderView.e(b) != null)
        {
            HeaderView.e(b).b(viewgroup, i, obj);
        }
    }

    public final float c(int i)
    {
        if (i == 0)
        {
            return super.c(0);
        } else
        {
            return HeaderView.e(b).c(i - 1);
        }
    }
}
