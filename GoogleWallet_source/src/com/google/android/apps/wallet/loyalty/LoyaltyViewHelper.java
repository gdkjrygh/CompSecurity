// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.wobs.add.UserDataPrompt;
import com.google.android.apps.wallet.wobs.add.UserDataPromptDisplay;
import com.google.android.apps.wallet.wobs.add.UserDataWidgetFactory;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import java.util.Queue;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            LoyaltyCardInfo, LoyaltyProgram

public class LoyaltyViewHelper
{

    private static final String TAG = com/google/android/apps/wallet/loyalty/LoyaltyViewHelper.getSimpleName();

    LoyaltyViewHelper()
    {
    }

    private static void addNextRow(Queue queue, ViewGroup viewgroup, LayoutInflater layoutinflater, Resources resources, UserDataWidgetFactory userdatawidgetfactory)
    {
        UserDataPromptDisplay userdatapromptdisplay = (UserDataPromptDisplay)queue.remove();
        com.google.android.apps.wallet.wobs.add.UserDataPrompt.InputType inputtype;
        if (queue.peek() != null)
        {
            inputtype = ((UserDataPromptDisplay)queue.peek()).getPrompt().getInputType();
        } else
        {
            inputtype = null;
        }
        if (userdatapromptdisplay.getPrompt().getInputType() == com.google.android.apps.wallet.wobs.add.UserDataPrompt.InputType.FIRST_NAME && inputtype == com.google.android.apps.wallet.wobs.add.UserDataPrompt.InputType.LAST_NAME || userdatapromptdisplay.getPrompt().getInputType() == com.google.android.apps.wallet.wobs.add.UserDataPrompt.InputType.STATE && inputtype == com.google.android.apps.wallet.wobs.add.UserDataPrompt.InputType.ZIPCODE)
        {
            layoutinflater = (LinearLayout)layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.wobs_prompt_entry_pair, viewgroup, false);
            int i = resources.getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.default_spacing) / 2;
            int j = resources.getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.default_spacing);
            resources = userdatapromptdisplay.getView();
            userdatawidgetfactory = new android.widget.LinearLayout.LayoutParams(0, -2, 1.0F);
            userdatawidgetfactory.setMargins(j, i, j / 2, i);
            resources.setLayoutParams(userdatawidgetfactory);
            layoutinflater.addView(resources);
            queue = ((UserDataPromptDisplay)queue.remove()).getView();
            resources = new android.widget.LinearLayout.LayoutParams(0, -2, 1.0F);
            resources.setMargins(j / 2, i, j, i);
            queue.setLayoutParams(resources);
            layoutinflater.addView(queue);
            viewgroup.addView(layoutinflater);
        } else
        if (userdatapromptdisplay.getPrompt().getId().intValue() == -9)
        {
            queue = (TextView)Views.findViewById(viewgroup.getRootView(), com.google.android.apps.walletnfcrel.R.id.BelowTitleText);
            if (userdatapromptdisplay.getPrompt().isModifiable())
            {
                if (queue.getVisibility() == 0)
                {
                    WLog.w(TAG, "Found program name in below card title, disabling it in preference to editable program name view.");
                    queue.setVisibility(8);
                }
                queue = (ViewGroup)Views.findViewById(viewgroup.getRootView(), com.google.android.apps.walletnfcrel.R.id.BelowCardTitle);
                viewgroup = userdatawidgetfactory.createInput(userdatapromptdisplay.getPrompt(), viewgroup, Integer.valueOf(com.google.android.apps.walletnfcrel.R.layout.loyalty_program_name_prompt_entry)).getInputView();
                viewgroup.setTag("TAG_EDITABLE_PROGRAM_NAME");
                queue.addView(viewgroup);
                return;
            }
            if (queue.getVisibility() == 0)
            {
                WLog.w(TAG, "Already has program name in below card title, not overwriting it with prompt");
                return;
            }
            if (userdatapromptdisplay.getPrompt().hasValue())
            {
                queue.setText(userdatapromptdisplay.getPrompt().getValue());
                queue.setVisibility(0);
                return;
            }
            if (!Strings.isNullOrEmpty(userdatapromptdisplay.getPrompt().getPrefilledValue()))
            {
                queue.setText(userdatapromptdisplay.getPrompt().getPrefilledValue());
                queue.setVisibility(0);
                return;
            }
        } else
        {
            viewgroup.addView(userdatapromptdisplay.getView());
            return;
        }
    }

    public static void placeProgramNameFromCardInfo(View view, LoyaltyCardInfo loyaltycardinfo)
    {
        if (view.findViewById(com.google.android.apps.walletnfcrel.R.id.BelowCardTitle).findViewWithTag("TAG_EDITABLE_PROGRAM_NAME") != null)
        {
            WLog.w(TAG, "Already has editable program name in below card title, ignoring program name from card info.");
        } else
        if (loyaltycardinfo.getProgram().getProgramName() != null)
        {
            view = (TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.BelowTitleText);
            if (view.getVisibility() == 0)
            {
                WLog.w(TAG, "Already has program name in below card title, overwriting it with cardInfo");
            }
            view.setText(loyaltycardinfo.getProgram().getProgramName());
            view.setVisibility(0);
            return;
        }
    }

    public final void placeUserDataPrompts(Iterable iterable, ViewGroup viewgroup, LayoutInflater layoutinflater, Resources resources, UserDataWidgetFactory userdatawidgetfactory)
    {
        for (iterable = Lists.newLinkedList(iterable); !iterable.isEmpty(); addNextRow(iterable, viewgroup, layoutinflater, resources, userdatawidgetfactory)) { }
    }

}
