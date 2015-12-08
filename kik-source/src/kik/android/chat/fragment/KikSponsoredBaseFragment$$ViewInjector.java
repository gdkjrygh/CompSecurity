// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.LinearLayout;
import android.widget.ListView;

// Referenced classes of package kik.android.chat.fragment:
//            KikSponsoredBaseFragment

public class 
{

    public static void inject(butterknife..ViewInjector viewinjector, KikSponsoredBaseFragment kiksponsoredbasefragment, Object obj)
    {
        android.view.View view = viewinjector.ViewInjector(obj, 0x7f0e0086);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624070' for field '_contactsList' was not found. If this view is optional add '@Optional' annotation.");
        }
        kiksponsoredbasefragment._contactsList = (ListView)view;
        view = viewinjector._contactsList(obj, 0x7f0e0087);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624071' for field '_loadingLayout' was not found. If this view is optional add '@Optional' annotation.");
        }
        kiksponsoredbasefragment._loadingLayout = (LinearLayout)view;
        viewinjector = viewinjector._loadingLayout(obj, 0x7f0e003e);
        if (viewinjector == null)
        {
            throw new IllegalStateException("Required view with id '2131623998' for field '_emptyView' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            kiksponsoredbasefragment._emptyView = (LinearLayout)viewinjector;
            return;
        }
    }

    public static void reset(KikSponsoredBaseFragment kiksponsoredbasefragment)
    {
        kiksponsoredbasefragment._contactsList = null;
        kiksponsoredbasefragment._loadingLayout = null;
        kiksponsoredbasefragment._emptyView = null;
    }

    public ()
    {
    }
}
