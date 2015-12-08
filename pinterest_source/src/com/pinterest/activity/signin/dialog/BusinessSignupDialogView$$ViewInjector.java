// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.view.View;
import android.widget.Button;
import com.pinterest.ui.text.PEditText;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            BusinessSignupDialogView

public class _cls3
{

    public static void inject(butterknife.DialogView dialogview, final BusinessSignupDialogView target, Object obj)
    {
        target._email = (PEditText)dialogview._email(obj, 0x7f0f0174, "field '_email'");
        target._password = (PEditText)dialogview._password(obj, 0x7f0f0175, "field '_password'");
        target._businessName = (PEditText)dialogview._businessName(obj, 0x7f0f019c, "field '_businessName'");
        View view = dialogview._businessName(obj, 0x7f0f019d, "field '_businessType' and method 'onAccountTypeClicked'");
        target._businessType = (Button)view;
        class _cls1 extends DebouncingOnClickListener
        {

            final BusinessSignupDialogView val$target;

            public final void doClick(View view1)
            {
                target.onAccountTypeClicked();
            }

            _cls1()
            {
                target = businesssignupdialogview;
                super();
            }
        }

        view.setOnClickListener(new _cls1());
        target._website = (PEditText)dialogview._website(obj, 0x7f0f019e, "field '_website'");
        view = dialogview._website(obj, 0x7f0f019f, "field '_createBt' and method 'onSignupClicked'");
        target._createBt = (Button)view;
        class _cls2 extends DebouncingOnClickListener
        {

            final BusinessSignupDialogView val$target;

            public final void doClick(View view1)
            {
                target.onSignupClicked();
            }

            _cls2()
            {
                target = businesssignupdialogview;
                super();
            }
        }

        view.setOnClickListener(new _cls2());
        dialogview = dialogview.DialogView(obj, 0x7f0f01a0, "field '_term' and method 'onTosClicked'");
        target._term = dialogview;
        class _cls3 extends DebouncingOnClickListener
        {

            final BusinessSignupDialogView val$target;

            public final void doClick(View view1)
            {
                target.onTosClicked();
            }

            _cls3()
            {
                target = businesssignupdialogview;
                super();
            }
        }

        dialogview.setOnClickListener(new _cls3());
    }

    public static void reset(BusinessSignupDialogView businesssignupdialogview)
    {
        businesssignupdialogview._email = null;
        businesssignupdialogview._password = null;
        businesssignupdialogview._businessName = null;
        businesssignupdialogview._businessType = null;
        businesssignupdialogview._website = null;
        businesssignupdialogview._createBt = null;
        businesssignupdialogview._term = null;
    }

    public _cls3()
    {
    }
}
