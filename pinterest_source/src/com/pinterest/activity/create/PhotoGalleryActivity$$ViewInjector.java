// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.widget.GridView;
import android.widget.TextView;
import com.pinterest.ui.actionbar.ActionBar;

// Referenced classes of package com.pinterest.activity.create:
//            PhotoGalleryActivity

public class 
{

    public static void inject(butterknife.ity ity, PhotoGalleryActivity photogalleryactivity, Object obj)
    {
        photogalleryactivity._gridView = (GridView)ity._gridView(obj, 0x7f0f008f, "field '_gridView'");
        photogalleryactivity._folderTextView = (TextView)ity._folderTextView(obj, 0x7f0f0091, "field '_folderTextView'");
        photogalleryactivity._header = ity._header(obj, 0x7f0f0090, "field '_header'");
        photogalleryactivity._actionBarWrapper = (ActionBar)ity._actionBarWrapper(obj, 0x7f0f008e, "field '_actionBarWrapper'");
    }

    public static void reset(PhotoGalleryActivity photogalleryactivity)
    {
        photogalleryactivity._gridView = null;
        photogalleryactivity._folderTextView = null;
        photogalleryactivity._header = null;
        photogalleryactivity._actionBarWrapper = null;
    }

    public ()
    {
    }
}
