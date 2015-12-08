// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;

import android.view.View;
import android.widget.Button;
import com.pinterest.ui.imageview.ProportionalImageView;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.dynamicgrid:
//            UserStoryCell

public class _cls3
{

    public static void inject(butterknife.toryCell torycell, final UserStoryCell target, Object obj)
    {
        View view = torycell.toryCell(obj, 0x7f0f004b, "field '_image' and method 'onTopicClick'");
        target._image = (ProportionalImageView)view;
        class _cls1 extends DebouncingOnClickListener
        {

            final UserStoryCell val$target;

            public final void doClick(View view1)
            {
                target.onTopicClick(view1);
            }

            _cls1()
            {
                target = userstorycell;
                super();
            }
        }

        view.setOnClickListener(new _cls1());
        view = torycell.toryCell(obj, 0x7f0f004f, "field '_title' and method 'onTopicClick'");
        target._title = (PTextView)view;
        class _cls2 extends DebouncingOnClickListener
        {

            final UserStoryCell val$target;

            public final void doClick(View view1)
            {
                target.onTopicClick(view1);
            }

            _cls2()
            {
                target = userstorycell;
                super();
            }
        }

        view.setOnClickListener(new _cls2());
        torycell = torycell.toryCell(obj, 0x7f0f01b3, "field '_followBt' and method 'onFollowClick'");
        target._followBt = (Button)torycell;
        class _cls3 extends DebouncingOnClickListener
        {

            final UserStoryCell val$target;

            public final void doClick(View view1)
            {
                target.onFollowClick(view1);
            }

            _cls3()
            {
                target = userstorycell;
                super();
            }
        }

        torycell.setOnClickListener(new _cls3());
    }

    public static void reset(UserStoryCell userstorycell)
    {
        userstorycell._image = null;
        userstorycell._title = null;
        userstorycell._followBt = null;
    }

    public _cls3()
    {
    }
}
