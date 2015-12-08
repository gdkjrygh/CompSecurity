// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class gzn
    implements Iterator
{

    private final View a;
    private final List b = new ArrayList();
    private boolean c;

    gzn(View view)
    {
        a = (View)p.a(view);
    }

    private void a()
    {
        if (c)
        {
            return;
        } else
        {
            a(a);
            c = true;
            return;
        }
    }

    private void a(View view)
    {
        b.add(view);
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int j = view.getChildCount();
            for (int i = 0; i < j; i++)
            {
                a(view.getChildAt(i));
            }

        }
    }

    public final boolean hasNext()
    {
        a();
        return !b.isEmpty();
    }

    public final Object next()
    {
        a();
        if (b.isEmpty())
        {
            throw new NoSuchElementException();
        } else
        {
            return (View)b.remove(b.size() - 1);
        }
    }

    public final void remove()
    {
        throw new UnsupportedOperationException("cannot remove views");
    }
}
