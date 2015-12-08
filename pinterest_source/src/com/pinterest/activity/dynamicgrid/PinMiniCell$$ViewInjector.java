// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;

import android.view.View;
import android.widget.TextView;
import com.pinterest.ui.imageview.GrayWebImageView;
import com.pinterest.ui.imageview.ProportionalImageView;

// Referenced classes of package com.pinterest.activity.dynamicgrid:
//            PinMiniCell

public class _cls1
{

    public static void inject(butterknife.MiniCell minicell, final PinMiniCell target, Object obj)
    {
        View view = minicell.MiniCell(obj, 0x7f0f004b, "field '_image' and method 'onImageClicked'");
        target._image = (GrayWebImageView)view;
        class _cls1 extends DebouncingOnClickListener
        {

            final PinMiniCell val$target;

            public final void doClick(View view1)
            {
                target.onImageClicked(view1);
            }

            _cls1()
            {
                target = pinminicell;
                super();
            }
        }

        view.setOnClickListener(new _cls1());
        target._priceTv = (TextView)minicell._priceTv(obj, 0x7f0f04b6, "field '_priceTv'");
        target._icon = (ProportionalImageView)minicell.lImageView(obj, 0x7f0f0076, "field '_icon'");
        target._descTv = (TextView)minicell._descTv(obj, 0x7f0f02f9, "field '_descTv'");
        target._title = (TextView)minicell._title(obj, 0x7f0f0077, "field '_title'");
        target._subtitle = (TextView)minicell._subtitle(obj, 0x7f0f01d1, "field '_subtitle'");
    }

    public static void reset(PinMiniCell pinminicell)
    {
        pinminicell._image = null;
        pinminicell._priceTv = null;
        pinminicell._icon = null;
        pinminicell._descTv = null;
        pinminicell._title = null;
        pinminicell._subtitle = null;
    }

    public _cls1()
    {
    }
}
