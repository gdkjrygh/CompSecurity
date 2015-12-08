// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.view;

import android.view.View;
import android.widget.TextView;
import com.pinterest.ui.imageview.ProportionalImageView;
import com.pinterest.ui.text.PImageButton;
import org.lucasr.twowayview.TwoWayView;

// Referenced classes of package com.pinterest.activity.home.view:
//            HomefeedBuilderListCell, HomefeedBuilderInterestFollowButton

public class _cls3
{

    public static void inject(butterknife.stCell stcell, final HomefeedBuilderListCell target, Object obj)
    {
        View view = stcell.stCell(obj, 0x7f0f036a, "field '_topicName' and method 'onTopicClick'");
        target._topicName = (TextView)view;
        class _cls1 extends DebouncingOnClickListener
        {

            final HomefeedBuilderListCell val$target;

            public final void doClick(View view1)
            {
                target.onTopicClick(view1);
            }

            _cls1()
            {
                target = homefeedbuilderlistcell;
                super();
            }
        }

        view.setOnClickListener(new _cls1());
        view = stcell.stCell(obj, 0x7f0f004b, "field '_image' and method 'onTopicClick'");
        target._image = (ProportionalImageView)view;
        class _cls2 extends DebouncingOnClickListener
        {

            final HomefeedBuilderListCell val$target;

            public final void doClick(View view1)
            {
                target.onTopicClick(view1);
            }

            _cls2()
            {
                target = homefeedbuilderlistcell;
                super();
            }
        }

        view.setOnClickListener(new _cls2());
        target._followBtn = (HomefeedBuilderInterestFollowButton)stcell.terestFollowButton(obj, 0x7f0f01b3, "field '_followBtn'");
        target._samplePinList = (TwoWayView)stcell._samplePinList(obj, 0x7f0f036c, "field '_samplePinList'");
        stcell = stcell._samplePinList(obj, 0x7f0f036b, "field '_dismissTopicButton' and method 'onDismissTopicClick'");
        target._dismissTopicButton = (PImageButton)stcell;
        class _cls3 extends DebouncingOnClickListener
        {

            final HomefeedBuilderListCell val$target;

            public final void doClick(View view1)
            {
                target.onDismissTopicClick(view1);
            }

            _cls3()
            {
                target = homefeedbuilderlistcell;
                super();
            }
        }

        stcell.setOnClickListener(new _cls3());
    }

    public static void reset(HomefeedBuilderListCell homefeedbuilderlistcell)
    {
        homefeedbuilderlistcell._topicName = null;
        homefeedbuilderlistcell._image = null;
        homefeedbuilderlistcell._followBtn = null;
        homefeedbuilderlistcell._samplePinList = null;
        homefeedbuilderlistcell._dismissTopicButton = null;
    }

    public _cls3()
    {
    }
}
