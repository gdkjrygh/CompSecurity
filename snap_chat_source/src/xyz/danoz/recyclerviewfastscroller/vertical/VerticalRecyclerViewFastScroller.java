// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package xyz.danoz.recyclerviewfastscroller.vertical;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import aoB;
import aoC;
import aoE;
import aoF;
import aoG;
import xyz.danoz.recyclerviewfastscroller.AbsRecyclerViewFastScroller;

public class VerticalRecyclerViewFastScroller extends AbsRecyclerViewFastScroller
{

    private aoG e;
    private aoC f;

    public VerticalRecyclerViewFastScroller(Context context)
    {
        this(context, null);
    }

    public VerticalRecyclerViewFastScroller(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public VerticalRecyclerViewFastScroller(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    static View a(VerticalRecyclerViewFastScroller verticalrecyclerviewfastscroller)
    {
        return verticalrecyclerviewfastscroller.a;
    }

    static View b(VerticalRecyclerViewFastScroller verticalrecyclerviewfastscroller)
    {
        return verticalrecyclerviewfastscroller.a;
    }

    static View c(VerticalRecyclerViewFastScroller verticalrecyclerviewfastscroller)
    {
        return verticalrecyclerviewfastscroller.a;
    }

    static View d(VerticalRecyclerViewFastScroller verticalrecyclerviewfastscroller)
    {
        return verticalrecyclerviewfastscroller.b;
    }

    public final void a(float f1)
    {
        if (f == null)
        {
            return;
        } else
        {
            b.setY(f.a(f1));
            return;
        }
    }

    protected final void b()
    {
        aoB aob = new aoB(new aoB.a() {

            private VerticalRecyclerViewFastScroller a;

            public final float a()
            {
                return VerticalRecyclerViewFastScroller.a(a).getY();
            }

            
            {
                a = VerticalRecyclerViewFastScroller.this;
                super();
            }
        }, new aoB.a() {

            private VerticalRecyclerViewFastScroller a;

            public final float a()
            {
                return (VerticalRecyclerViewFastScroller.b(a).getY() + (float)VerticalRecyclerViewFastScroller.c(a).getHeight()) - (float)VerticalRecyclerViewFastScroller.d(a).getHeight();
            }

            
            {
                a = VerticalRecyclerViewFastScroller.this;
                super();
            }
        });
        e = new aoF(aob);
        f = new aoC(aob);
    }

    protected final int c()
    {
        return aoA.b.vertical_recycler_fast_scroller_layout;
    }

    protected final aoE d()
    {
        return e;
    }
}
