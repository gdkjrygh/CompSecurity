// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import com.google.common.base.Preconditions;
import java.util.HashSet;

// Referenced classes of package com.facebook.reflex:
//            Widget, af, ai, ag, 
//            v, aj, ah

public class List extends Widget
    implements af
{

    private final HashSet b;
    private ah c;
    private v d;

    public List()
    {
        this(ai.Vertical, ag.Inertial);
    }

    public List(ai ai1, ag ag1)
    {
        boolean flag1 = true;
        super();
        b = new HashSet();
        boolean flag;
        if (ai1 == ai.Horizontal)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (ag1 != ag.Paginated)
        {
            flag1 = false;
        }
        a(initialize(flag, flag1));
    }

    private void didContentSizeChange(int i)
    {
        if (d != null)
        {
            d.a(i);
        }
    }

    private void drop(Widget widget)
    {
        widget.b();
    }

    private native int initialize(boolean flag, boolean flag1);

    private native void nativeInsertItemAt(int i, Widget widget);

    private native void nativeMoveItemTo(int i, Widget widget);

    private native void nativeRemoveItem(Widget widget);

    private void prepare(Widget widget)
    {
        Preconditions.checkArgument(b.contains(widget));
        widget.b(f());
        widget.a();
    }

    private native void registerForContentSize(boolean flag);

    private native void registerForScroll(boolean flag);

    public void b(int i)
    {
        super.b(i);
    }

    protected void didScroll(int i, float f, float f1)
    {
        if (c != null)
        {
            c.a(aj.convertFromOrdinal(i), f, f1);
        }
    }
}
