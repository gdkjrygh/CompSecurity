// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.res.Configuration;
import android.widget.TextView;
import me.lyft.android.common.Strings;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui:
//            FullscreenPhotoView

class this._cls0
    implements Action1
{

    final FullscreenPhotoView this$0;

    public void call(Configuration configuration)
    {
        byte byte1 = 8;
        if (configuration.orientation == 1)
        {
            configuration = photoTitleTextView;
            byte byte0;
            if (Strings.isNullOrEmpty(params.getTitle()))
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            configuration.setVisibility(byte0);
            configuration = photoSubtitleTextView;
            if (Strings.isNullOrEmpty(params.getSubtitle()))
            {
                byte0 = byte1;
            } else
            {
                byte0 = 0;
            }
            configuration.setVisibility(byte0);
        } else
        if (configuration.orientation == 2)
        {
            photoTitleTextView.setVisibility(8);
            photoSubtitleTextView.setVisibility(8);
            return;
        }
    }

    public volatile void call(Object obj)
    {
        call((Configuration)obj);
    }

    PhotoScreen()
    {
        this$0 = FullscreenPhotoView.this;
        super();
    }
}
