// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.actionsheet;

import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package com.pinterest.ui.actionsheet:
//            ActionSheetFragment

public class _cls2
{

    public static void inject(butterknife.nt nt, final ActionSheetFragment target, Object obj)
    {
        target._sheetContainer = (LinearLayout)nt._sheetContainer(obj, 0x7f0f01da, "field '_sheetContainer'");
        View view = nt._sheetContainer(obj, 0x7f0f01d9, "field '_dismissBg' and method 'dismissClicked'");
        target._dismissBg = view;
        class _cls1 extends DebouncingOnClickListener
        {

            final ActionSheetFragment val$target;

            public final void doClick(View view1)
            {
                target.dismissClicked(view1);
            }

            _cls1()
            {
                target = actionsheetfragment;
                super();
            }
        }

        view.setOnClickListener(new _cls1());
        class _cls2 extends DebouncingOnClickListener
        {

            final ActionSheetFragment val$target;

            public final void doClick(View view1)
            {
                target.dismissClicked(view1);
            }

            _cls2()
            {
                target = actionsheetfragment;
                super();
            }
        }

        nt.nt(obj, 0x7f0f01db, "method 'dismissClicked'").setOnClickListener(new _cls2());
    }

    public static void reset(ActionSheetFragment actionsheetfragment)
    {
        actionsheetfragment._sheetContainer = null;
        actionsheetfragment._dismissBg = null;
    }

    public _cls2()
    {
    }
}
