// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import kik.android.widget.VelocityControlledViewPager;

// Referenced classes of package kik.android.chat.fragment:
//            ScanCodeTabFragment

public class A
{

    public static void inject(butterknife..ViewInjector viewinjector, ScanCodeTabFragment scancodetabfragment, Object obj)
    {
        android.view.View view = viewinjector.ViewInjector(obj, 0x7f0e0138);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624248' for field '_toggleHolder' was not found. If this view is optional add '@Optional' annotation.");
        }
        scancodetabfragment._toggleHolder = (LinearLayout)view;
        view = viewinjector._toggleHolder(obj, 0x7f0e01d6);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624406' for field '_scanToggle' was not found. If this view is optional add '@Optional' annotation.");
        }
        scancodetabfragment._scanToggle = (SeekBar)view;
        view = viewinjector._scanToggle(obj, 0x7f0e013a);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624250' for field '_codeIcon' was not found. If this view is optional add '@Optional' annotation.");
        }
        scancodetabfragment._codeIcon = (ImageView)view;
        view = viewinjector._codeIcon(obj, 0x7f0e0139);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624249' for field '_cameraIcon' was not found. If this view is optional add '@Optional' annotation.");
        }
        scancodetabfragment._cameraIcon = (ImageView)view;
        view = viewinjector._cameraIcon(obj, 0x7f0e0077);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624055' for field '_backButtonImage' was not found. If this view is optional add '@Optional' annotation.");
        }
        scancodetabfragment._backButtonImage = (ImageView)view;
        view = viewinjector._backButtonImage(obj, 0x7f0e0089);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624073' for field '_topBar' was not found. If this view is optional add '@Optional' annotation.");
        }
        scancodetabfragment._topBar = view;
        view = viewinjector._topBar(obj, 0x7f0e001d);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131623965' for field '_backButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        scancodetabfragment._backButton = view;
        viewinjector = viewinjector._backButton(obj, 0x7f0e0137);
        if (viewinjector == null)
        {
            throw new IllegalStateException("Required view with id '2131624247' for field '_viewPager' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            scancodetabfragment._viewPager = (VelocityControlledViewPager)viewinjector;
            return;
        }
    }

    public static void reset(ScanCodeTabFragment scancodetabfragment)
    {
        scancodetabfragment._toggleHolder = null;
        scancodetabfragment._scanToggle = null;
        scancodetabfragment._codeIcon = null;
        scancodetabfragment._cameraIcon = null;
        scancodetabfragment._backButtonImage = null;
        scancodetabfragment._topBar = null;
        scancodetabfragment._backButton = null;
        scancodetabfragment._viewPager = null;
    }

    public A()
    {
    }
}
