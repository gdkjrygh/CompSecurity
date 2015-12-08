// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.view.View;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            CommerceStatementCreditFeedHeroView

public class _cls2
{

    public static void inject(butterknife.edHeroView edheroview, final CommerceStatementCreditFeedHeroView target, Object obj)
    {
        target.title = (PTextView)edheroview.title(obj, 0x7f0f0113, "field 'title'");
        target.disclaimer = (PTextView)edheroview.disclaimer(obj, 0x7f0f0114, "field 'disclaimer'");
        class _cls1 extends DebouncingOnClickListener
        {

            final CommerceStatementCreditFeedHeroView val$target;

            public final void doClick(View view)
            {
                target.handleShopButtonClicked();
            }

            _cls1()
            {
                target = commercestatementcreditfeedheroview;
                super();
            }
        }

        edheroview.edHeroView(obj, 0x7f0f0115, "method 'handleShopButtonClicked'").setOnClickListener(new _cls1());
        class _cls2 extends DebouncingOnClickListener
        {

            final CommerceStatementCreditFeedHeroView val$target;

            public final void doClick(View view)
            {
                target.handleCancelClicked();
            }

            _cls2()
            {
                target = commercestatementcreditfeedheroview;
                super();
            }
        }

        edheroview.edHeroView(obj, 0x7f0f0112, "method 'handleCancelClicked'").setOnClickListener(new _cls2());
    }

    public static void reset(CommerceStatementCreditFeedHeroView commercestatementcreditfeedheroview)
    {
        commercestatementcreditfeedheroview.title = null;
        commercestatementcreditfeedheroview.disclaimer = null;
    }

    public _cls2()
    {
    }
}
