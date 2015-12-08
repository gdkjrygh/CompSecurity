// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.view.View;
import android.widget.CheckedTextView;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            PersonalizationSettingDialog

public class _cls2
{

    public static void inject(butterknife.ettingDialog ettingdialog, final PersonalizationSettingDialog target, Object obj)
    {
        View view = ettingdialog.ettingDialog(obj, 0x7f0f017b, "field '_recentSitesCb' and method 'onRecentSitesClick'");
        target._recentSitesCb = (CheckedTextView)view;
        class _cls1 extends DebouncingOnClickListener
        {

            final PersonalizationSettingDialog val$target;

            public final void doClick(View view1)
            {
                target.onRecentSitesClick(view1);
            }

            _cls1()
            {
                target = personalizationsettingdialog;
                super();
            }
        }

        view.setOnClickListener(new _cls1());
        ettingdialog = ettingdialog.ettingDialog(obj, 0x7f0f017c, "field '_adPartnersCb' and method 'onAdPartnersClick'");
        target._adPartnersCb = (CheckedTextView)ettingdialog;
        class _cls2 extends DebouncingOnClickListener
        {

            final PersonalizationSettingDialog val$target;

            public final void doClick(View view1)
            {
                target.onAdPartnersClick(view1);
            }

            _cls2()
            {
                target = personalizationsettingdialog;
                super();
            }
        }

        ettingdialog.setOnClickListener(new _cls2());
    }

    public static void reset(PersonalizationSettingDialog personalizationsettingdialog)
    {
        personalizationsettingdialog._recentSitesCb = null;
        personalizationsettingdialog._adPartnersCb = null;
    }

    public _cls2()
    {
    }
}
