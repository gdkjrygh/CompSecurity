// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.ListView;
import android.widget.TextView;

// Referenced classes of package kik.android.chat.fragment:
//            AbTestsFragment

public class 
{

    public static void inject(butterknife..ViewInjector viewinjector, AbTestsFragment abtestsfragment, Object obj)
    {
        android.view.View view = viewinjector.ViewInjector(obj, 0x7f0e000d);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131623949' for field '_testsList' was not found. If this view is optional add '@Optional' annotation.");
        }
        abtestsfragment._testsList = (ListView)view;
        viewinjector = viewinjector._testsList(obj, 0x7f0e0078);
        if (viewinjector == null)
        {
            throw new IllegalStateException("Required view with id '2131624056' for field '_title' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            abtestsfragment._title = (TextView)viewinjector;
            return;
        }
    }

    public static void reset(AbTestsFragment abtestsfragment)
    {
        abtestsfragment._testsList = null;
        abtestsfragment._title = null;
    }

    public ()
    {
    }
}
