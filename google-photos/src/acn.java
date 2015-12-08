// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class acn
{

    public final acp a;
    public final aco b = new aco();
    public final List c = new ArrayList();

    public acn(acp acp1)
    {
        a = acp1;
    }

    public final int a()
    {
        return a.a() - c.size();
    }

    int a(int i)
    {
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        i = -1;
        return i;
        int j;
        int k;
        int l;
        k = a.a();
        j = i;
          goto _L1
        continue; /* Loop/switch isn't completed */
        j += l;
    }

    public void a(View view)
    {
        c.add(view);
        a.c(view);
    }

    public final void a(View view, int i, android.view.ViewGroup.LayoutParams layoutparams, boolean flag)
    {
        if (i < 0)
        {
            i = a.a();
        } else
        {
            i = a(i);
        }
        b.a(i, flag);
        if (flag)
        {
            a(view);
        }
        a.a(view, i, layoutparams);
    }

    public final void a(View view, int i, boolean flag)
    {
        if (i < 0)
        {
            i = a.a();
        } else
        {
            i = a(i);
        }
        b.a(i, flag);
        if (flag)
        {
            a(view);
        }
        a.a(view, i);
    }

    public final int b()
    {
        return a.a();
    }

    final void b(int i)
    {
        i = a(i);
        View view = a.b(i);
        if (view == null)
        {
            return;
        }
        if (b.c(i))
        {
            b(view);
        }
        a.a(i);
    }

    public boolean b(View view)
    {
        if (c.remove(view))
        {
            a.d(view);
            return true;
        } else
        {
            return false;
        }
    }

    final int c(View view)
    {
        int i;
        for (i = a.a(view); i == -1 || b.b(i);)
        {
            return -1;
        }

        return i - b.d(i);
    }

    public final View c(int i)
    {
        i = a(i);
        return a.b(i);
    }

    public final View d(int i)
    {
        return a.b(i);
    }

    final boolean d(View view)
    {
        return c.contains(view);
    }

    public final String toString()
    {
        return (new StringBuilder()).append(b.toString()).append(", hidden list:").append(c.size()).toString();
    }
}
