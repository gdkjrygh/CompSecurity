// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.ViewGroup;

// Referenced classes of package kik.android.chat.fragment:
//            WebVideoFragment

public class 
{

    public static void inject(butterknife..ViewInjector viewinjector, WebVideoFragment webvideofragment, Object obj)
    {
        android.view.View view = viewinjector.ViewInjector(obj, 0x7f0e009c);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624092' for field '_loadingLayout' was not found. If this view is optional add '@Optional' annotation.");
        }
        webvideofragment._loadingLayout = (ViewGroup)view;
        viewinjector = viewinjector._loadingLayout(obj, 0x7f0e009d);
        if (viewinjector == null)
        {
            throw new IllegalStateException("Required view with id '2131624093' for field '_errorLayout' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            webvideofragment._errorLayout = (ViewGroup)viewinjector;
            return;
        }
    }

    public static void reset(WebVideoFragment webvideofragment)
    {
        webvideofragment._loadingLayout = null;
        webvideofragment._errorLayout = null;
    }

    public ()
    {
    }
}
