// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package kik.android.widget:
//            cx, dl

private final class b extends cx
{

    int b[];
    final dl c;
    private List d;

    public final View a(MotionEvent motionevent)
    {
        Iterator iterator;
        if (d == null)
        {
            return null;
        }
        getContentView().getLocationOnScreen(b);
        iterator = d.iterator();
_L2:
        View view;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_124;
        }
        view = (View)iterator.next();
        if (view == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag;
        view.getLocationOnScreen(b);
        flag = (new Rect(b[0], b[1], b[0] + view.getWidth(), b[1] + view.getHeight())).contains((int)motionevent.getRawX(), (int)motionevent.getRawY());
        if (flag)
        {
            return view;
        }
        continue; /* Loop/switch isn't completed */
        return null;
        Exception exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a()
    {
        if (d != null)
        {
            Iterator iterator = d.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                View view = (View)iterator.next();
                if (view != null)
                {
                    view.setSelected(false);
                }
            } while (true);
        }
    }

    public final void a(List list)
    {
        d = list;
    }

    public (dl dl1, View view)
    {
        c = dl1;
        super(view);
        b = new int[2];
    }
}
