// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.lyft.scoop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import dagger.ObjectGraph;

// Referenced classes of package com.lyft.scoop:
//            Screen

public final class Scoop
{

    private static final Scoop a = new Scoop(null, null);
    private final ObjectGraph b;
    private final Screen c;

    private Scoop(ObjectGraph objectgraph, Screen screen)
    {
        b = objectgraph;
        c = screen;
    }

    public static Scoop a(View view)
    {
        if (view.isInEditMode())
        {
            return a;
        } else
        {
            return ((IHaveScoop)view.getContext()).a();
        }
    }

    public static Scoop a(ObjectGraph objectgraph)
    {
        return new Scoop(objectgraph, null);
    }

    public static Scoop a(ObjectGraph objectgraph, Screen screen)
    {
        return new Scoop(objectgraph, screen);
    }

    public LayoutInflater a(Context context)
    {
        return LayoutInflater.from(context).cloneInContext(b(context));
    }

    public Screen a()
    {
        return c;
    }

    public transient ObjectGraph a(Object aobj[])
    {
        if (this == a)
        {
            return b;
        } else
        {
            return b.plus(aobj);
        }
    }

    public Context b(Context context)
    {
        return new ScoopContextWrapper(context, this);
    }

    public void b(View view)
    {
        if (view.isInEditMode())
        {
            return;
        } else
        {
            b.inject(view);
            return;
        }
    }


    private class IHaveScoop
    {

        public abstract Scoop a();
    }


    private class ScoopContextWrapper extends ContextWrapper
        implements IHaveScoop
    {

        private final Scoop a;

        public Scoop a()
        {
            return a;
        }

        public ScoopContextWrapper(Context context, Scoop scoop)
        {
            super(context);
            a = scoop;
        }
    }

}
