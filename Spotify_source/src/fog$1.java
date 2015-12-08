// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

final class ang.Object
    implements android.view.oup.OnHierarchyChangeListener
{

    private fog a;

    public final void onChildViewAdded(View view, View view1)
    {
        view = a.c.iterator();
        do
        {
            if (!view.hasNext())
            {
                break;
            }
            view1 = ((fok)view.next()).b();
            if (view1 != null)
            {
                view1.bringToFront();
            }
        } while (true);
    }

    public final void onChildViewRemoved(View view, View view1)
    {
    }

    (fog fog1)
    {
        a = fog1;
        super();
    }
}
