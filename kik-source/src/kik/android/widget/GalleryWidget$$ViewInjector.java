// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.widget.GridView;
import android.widget.TextView;
import kik.android.util.KikSpinner;

// Referenced classes of package kik.android.widget:
//            GalleryWidget

public class 
{

    public static void inject(butterknife.jector jector, GalleryWidget gallerywidget, Object obj)
    {
        android.view.View view = jector.jector(obj, 0x7f0e0111);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624209' for field '_folderDropdown' was not found. If this view is optional add '@Optional' annotation.");
        }
        gallerywidget._folderDropdown = (KikSpinner)view;
        view = jector.Dropdown(obj, 0x7f0e0112);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624210' for field '_grid' was not found. If this view is optional add '@Optional' annotation.");
        }
        gallerywidget._grid = (GridView)view;
        view = jector.Dropdown(obj, 0x7f0e0110);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624208' for field '_noPhotosText' was not found. If this view is optional add '@Optional' annotation.");
        }
        gallerywidget._noPhotosText = (TextView)view;
        view = jector.osText(obj, 0x7f0e0113);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624211' for field '_dimBackground' was not found. If this view is optional add '@Optional' annotation.");
        }
        gallerywidget._dimBackground = view;
        jector = jector.kground(obj, 0x7f0e010f);
        if (jector == null)
        {
            throw new IllegalStateException("Required view with id '2131624207' for field '_topDivider' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            gallerywidget._topDivider = jector;
            return;
        }
    }

    public static void reset(GalleryWidget gallerywidget)
    {
        gallerywidget._folderDropdown = null;
        gallerywidget._grid = null;
        gallerywidget._noPhotosText = null;
        gallerywidget._dimBackground = null;
        gallerywidget._topDivider = null;
    }

    public ()
    {
    }
}
