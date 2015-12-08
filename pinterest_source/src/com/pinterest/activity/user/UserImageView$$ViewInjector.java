// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user;

import android.view.View;
import android.widget.TextView;
import com.pinterest.ui.imageview.GrayWebImageView;

// Referenced classes of package com.pinterest.activity.user:
//            UserImageView

public class _cls1
{

    public static void inject(butterknife.w w, final UserImageView target, Object obj)
    {
        target._userIv = (GrayWebImageView)w.iew(obj, 0x7f0f0444, "field '_userIv'");
        target._usernameTv = (TextView)w._usernameTv(obj, 0x7f0f0443, "field '_usernameTv'");
        target._divider = w._divider(obj, 0x7f0f0068, "field '_divider'");
        w = w._divider(obj, 0x7f0f0445, "field '_updatePictureTv' and method 'onUpdatePictureClicked'");
        target._updatePictureTv = (TextView)w;
        class _cls1 extends DebouncingOnClickListener
        {

            final UserImageView val$target;

            public final void doClick(View view)
            {
                target.onUpdatePictureClicked(view);
            }

            _cls1()
            {
                target = userimageview;
                super();
            }
        }

        w.setOnClickListener(new _cls1());
    }

    public static void reset(UserImageView userimageview)
    {
        userimageview._userIv = null;
        userimageview._usernameTv = null;
        userimageview._divider = null;
        userimageview._updatePictureTv = null;
    }

    public _cls1()
    {
    }
}
