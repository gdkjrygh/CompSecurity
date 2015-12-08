// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;

import android.view.View;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.commerce.dialog:
//            CommerceOptionsDialog

public class _cls2
{

    public static void inject(butterknife.ptionsDialog ptionsdialog, final CommerceOptionsDialog target, Object obj)
    {
        View view = ptionsdialog.ptionsDialog(obj, 0x7f0f0110, "field 'edit' and method 'handleEditClicked'");
        target.edit = (PTextView)view;
        class _cls1 extends DebouncingOnClickListener
        {

            final CommerceOptionsDialog val$target;

            public final void doClick(View view1)
            {
                target.handleEditClicked();
            }

            _cls1()
            {
                target = commerceoptionsdialog;
                super();
            }
        }

        view.setOnClickListener(new _cls1());
        class _cls2 extends DebouncingOnClickListener
        {

            final CommerceOptionsDialog val$target;

            public final void doClick(View view1)
            {
                target.handleDeleteClicked();
            }

            _cls2()
            {
                target = commerceoptionsdialog;
                super();
            }
        }

        ptionsdialog.ptionsDialog(obj, 0x7f0f0111, "method 'handleDeleteClicked'").setOnClickListener(new _cls2());
    }

    public static void reset(CommerceOptionsDialog commerceoptionsdialog)
    {
        commerceoptionsdialog.edit = null;
    }

    public _cls2()
    {
    }
}
