// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kik.cache.ContactImageView;
import kik.android.widget.RobotoTextView;

public abstract class ad extends BaseAdapter
{
    protected final class a
    {

        ContactImageView a;
        RobotoTextView b;
        ImageView c;
        View d;
        FrameLayout e;
        final ad f;

        protected a()
        {
            f = ad.this;
            super();
        }
    }

    protected final class b
    {

        a a[];
        final ad b;

        final a a(int i)
        {
            if (i < 0 || i >= a.length)
            {
                return null;
            } else
            {
                return a[i];
            }
        }

        b()
        {
            b = ad.this;
            super();
            a = new a[ad.this.b];
        }
    }


    protected com.kik.cache.ad a;
    protected int b;
    protected int c;

    public ad(com.kik.cache.ad ad1, int i, int j)
    {
        b = 1;
        a = ad1;
        b = i;
        c = j;
    }

    protected final int a()
    {
        int j = 1;
        int i;
        if (c())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!b())
        {
            j = 0;
        }
        return i + j;
    }

    protected final void a(int i, int j)
    {
        b = i;
        c = j;
        notifyDataSetChanged();
    }

    public boolean areAllItemsEnabled()
    {
        return false;
    }

    protected abstract boolean b();

    protected abstract boolean c();

    public long getItemId(int i)
    {
        return (long)i;
    }

    public boolean isEmpty()
    {
        return false;
    }

    public boolean isEnabled(int i)
    {
        return false;
    }
}
