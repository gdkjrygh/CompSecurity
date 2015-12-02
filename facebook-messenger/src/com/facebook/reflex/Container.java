// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.facebook.reflex:
//            Widget

public class Container extends Widget
{

    private ArrayList b;

    public Container()
    {
        b = new ArrayList();
        a(initialize());
    }

    private native void addChild(Widget widget);

    private native int initialize();

    private native void nativeSetChildren(Object aobj[]);

    private native void nativeSetMaskToBounds(boolean flag);

    private native void removeChild(Widget widget);

    public void a()
    {
        super.a();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((Widget)iterator.next()).a()) { }
    }

    public void a(Widget widget)
    {
        boolean flag1 = true;
        boolean flag;
        if (widget != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        if (!b.contains(widget))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        b.add(widget);
        if (i())
        {
            widget.a();
        }
        addChild(widget);
    }

    public void a(ArrayList arraylist)
    {
        if (b.equals(arraylist))
        {
            return;
        }
        if (i())
        {
            Iterator iterator = b.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Widget widget = (Widget)iterator.next();
                if (!arraylist.contains(widget))
                {
                    widget.b();
                }
            } while (true);
            iterator = arraylist.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Widget widget1 = (Widget)iterator.next();
                if (!b.contains(widget1))
                {
                    widget1.a();
                }
            } while (true);
        }
        b.clear();
        b.addAll(arraylist);
        nativeSetChildren(b.toArray());
    }

    public void a(boolean flag)
    {
        nativeSetMaskToBounds(flag);
    }

    public void b()
    {
        super.b();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((Widget)iterator.next()).b()) { }
    }

    public boolean b(Widget widget)
    {
        return b.contains(widget);
    }

    public void c(Widget widget)
    {
        boolean flag;
        if (widget != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        Preconditions.checkState(b.contains(widget));
        b.remove(widget);
        if (i())
        {
            widget.b();
        }
        removeChild(widget);
    }
}
