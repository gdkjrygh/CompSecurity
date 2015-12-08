// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kik.android.gifs.view.AspectRatioGifView;

// Referenced classes of package kik.android.widget:
//            GifWidget

public class 
{

    public static void inject(butterknife.jector jector, GifWidget gifwidget, Object obj)
    {
        android.view.View view = jector.yId(obj, 0x7f0e011e);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624222' for field '_gifFrame' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifwidget._gifFrame = (FrameLayout)view;
        view = jector.yId(obj, 0x7f0e0122);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624226' for field '_featuredButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifwidget._featuredButton = (FrameLayout)view;
        view = jector.yId(obj, 0x7f0e0124);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624228' for field '_searchButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifwidget._searchButton = (FrameLayout)view;
        view = jector.yId(obj, 0x7f0e0120);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624224' for field '_trendingButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifwidget._trendingButton = (FrameLayout)view;
        view = jector.yId(obj, 0x7f0e0125);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624229' for field '_searchButtonImage' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifwidget._searchButtonImage = (ImageView)view;
        view = jector.yId(obj, 0x7f0e0123);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624227' for field '_featuredButtonImage' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifwidget._featuredButtonImage = (ImageView)view;
        view = jector.yId(obj, 0x7f0e0121);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624225' for field '_trendingButtonImage' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifwidget._trendingButtonImage = (ImageView)view;
        view = jector.yId(obj, 0x7f0e011f);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624223' for field '_buttonBar' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifwidget._buttonBar = (LinearLayout)view;
        view = jector.yId(obj, 0x7f0e011d);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624221' for field '_selectionView' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifwidget._selectionView = (FrameLayout)view;
        view = jector.yId(obj, 0x7f0e0126);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624230' for field '_previewView' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifwidget._previewView = (FrameLayout)view;
        view = jector.yId(obj, 0x7f0e0127);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624231' for field '_previewImage' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifwidget._previewImage = (AspectRatioGifView)view;
        view = jector.yId(obj, 0x7f0e0128);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624232' for field '_rechooseButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifwidget._rechooseButton = (ImageView)view;
        view = jector.yId(obj, 0x7f0e0129);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624233' for field '_gifUseButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifwidget._gifUseButton = (ImageView)view;
        jector = jector.yId(obj, 0x7f0e012a);
        if (jector == null)
        {
            throw new IllegalStateException("Required view with id '2131624234' for field '_gifsCantLoad' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            gifwidget._gifsCantLoad = (LinearLayout)jector;
            return;
        }
    }

    public static void reset(GifWidget gifwidget)
    {
        gifwidget._gifFrame = null;
        gifwidget._featuredButton = null;
        gifwidget._searchButton = null;
        gifwidget._trendingButton = null;
        gifwidget._searchButtonImage = null;
        gifwidget._featuredButtonImage = null;
        gifwidget._trendingButtonImage = null;
        gifwidget._buttonBar = null;
        gifwidget._selectionView = null;
        gifwidget._previewView = null;
        gifwidget._previewImage = null;
        gifwidget._rechooseButton = null;
        gifwidget._gifUseButton = null;
        gifwidget._gifsCantLoad = null;
    }

    public ()
    {
    }
}
