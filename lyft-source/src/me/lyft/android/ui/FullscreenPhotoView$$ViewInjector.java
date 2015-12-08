// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui:
//            FullscreenPhotoView

public class 
    implements butterknife.jector
{

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (FullscreenPhotoView)obj, obj1);
    }

    public void inject(butterknife.jector jector, FullscreenPhotoView fullscreenphotoview, Object obj)
    {
        fullscreenphotoview.photoImageView = (ImageView)jector.ageView((View)jector.ageView(obj, 0x7f0d0228, "field 'photoImageView'"), 0x7f0d0228, "field 'photoImageView'");
        fullscreenphotoview.photoTitleTextView = (TextView)jector.tleTextView((View)jector.tleTextView(obj, 0x7f0d0229, "field 'photoTitleTextView'"), 0x7f0d0229, "field 'photoTitleTextView'");
        fullscreenphotoview.photoSubtitleTextView = (TextView)jector.btitleTextView((View)jector.btitleTextView(obj, 0x7f0d022a, "field 'photoSubtitleTextView'"), 0x7f0d022a, "field 'photoSubtitleTextView'");
    }

    public volatile void reset(Object obj)
    {
        reset((FullscreenPhotoView)obj);
    }

    public void reset(FullscreenPhotoView fullscreenphotoview)
    {
        fullscreenphotoview.photoImageView = null;
        fullscreenphotoview.photoTitleTextView = null;
        fullscreenphotoview.photoSubtitleTextView = null;
    }

    public ()
    {
    }
}
