// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.view;

import android.view.View;
import android.widget.Button;
import com.pinterest.ui.imageview.ProportionalImageView;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.home.view:
//            HomefeedBuilderGridCell

public class _cls2
{

    public static void inject(butterknife.idCell idcell, final HomefeedBuilderGridCell target, Object obj)
    {
        View view = idcell.idCell(obj, 0x7f0f004b, "field '_image' and method 'onTopicClick'");
        target._image = (ProportionalImageView)view;
        class _cls1 extends DebouncingOnClickListener
        {

            final HomefeedBuilderGridCell val$target;

            public final void doClick(View view1)
            {
                target.onTopicClick(view1);
            }

            _cls1()
            {
                target = homefeedbuildergridcell;
                super();
            }
        }

        view.setOnClickListener(new _cls1());
        target._title = (PTextView)idcell._title(obj, 0x7f0f004f, "field '_title'");
        target._subtitle = (PTextView)idcell._subtitle(obj, 0x7f0f02f5, "field '_subtitle'");
        idcell = idcell._subtitle(obj, 0x7f0f01b3, "field '_followBt' and method 'onFollowClick'");
        target._followBt = (Button)idcell;
        class _cls2 extends DebouncingOnClickListener
        {

            final HomefeedBuilderGridCell val$target;

            public final void doClick(View view1)
            {
                target.onFollowClick(view1);
            }

            _cls2()
            {
                target = homefeedbuildergridcell;
                super();
            }
        }

        idcell.setOnClickListener(new _cls2());
    }

    public static void reset(HomefeedBuilderGridCell homefeedbuildergridcell)
    {
        homefeedbuildergridcell._image = null;
        homefeedbuildergridcell._title = null;
        homefeedbuildergridcell._subtitle = null;
        homefeedbuildergridcell._followBt = null;
    }

    public _cls2()
    {
    }
}
