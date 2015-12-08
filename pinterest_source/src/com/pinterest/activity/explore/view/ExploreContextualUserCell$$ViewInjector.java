// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.view;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.pinterest.activity.explore.view:
//            ExploreContextualUserCell, ExploreUserPinGridView

public class _cls1
{

    public static void inject(butterknife.lUserCell lusercell, final ExploreContextualUserCell target, Object obj)
    {
        target._title = (TextView)lusercell._title(obj, 0x7f0f0077, "field '_title'");
        target._subTitle = (TextView)lusercell._subTitle(obj, 0x7f0f01d1, "field '_subTitle'");
        target._userPinsGridView = (ExploreUserPinGridView)lusercell.idView(obj, 0x7f0f01d5, "field '_userPinsGridView'");
        class _cls1 extends DebouncingOnClickListener
        {

            final ExploreContextualUserCell val$target;

            public final void doClick(View view)
            {
                target.onUserCellClicked(view);
            }

            _cls1()
            {
                target = explorecontextualusercell;
                super();
            }
        }

        lusercell.lUserCell(obj, 0x7f0f01d2, "method 'onUserCellClicked'").setOnClickListener(new _cls1());
    }

    public static void reset(ExploreContextualUserCell explorecontextualusercell)
    {
        explorecontextualusercell._title = null;
        explorecontextualusercell._subTitle = null;
        explorecontextualusercell._userPinsGridView = null;
    }

    public _cls1()
    {
    }
}
