// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.ui.dialogs.DialogContainerView;

public class DestinyInfoDialogView extends DialogContainerView
{

    ImageView cancelButton;
    IConstantsProvider constantsProvider;
    TextView destinyHeaderLabel;
    TextView destinyHeaderText;
    TextView destinySectionOneLabel;
    TextView destinySectionOneText;
    TextView destinySectionTwoLabel;
    TextView destinySectionTwoText;
    DialogFlow dialogFlow;

    public DestinyInfoDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private void initView()
    {
        String s = constantsProvider.getConstants().getDestinyDialogHeaderLabel(getResources().getString(0x7f07010e));
        destinyHeaderLabel.setText(s);
        s = constantsProvider.getConstants().getDestinyDialogHeaderText(getResources().getString(0x7f07010f));
        destinyHeaderText.setText(s);
        s = constantsProvider.getConstants().getDestinyDialogSectionOneLabel(getResources().getString(0x7f070110));
        destinySectionOneLabel.setText(s);
        s = constantsProvider.getConstants().getDestinyDialogSectionOneText(getResources().getString(0x7f070111));
        destinySectionOneText.setText(s);
        s = constantsProvider.getConstants().getDestinyDialogSectionTwoLabel(getResources().getString(0x7f070112));
        destinySectionTwoLabel.setText(s);
        s = constantsProvider.getConstants().getDestinyDialogSectionTwoText(getResources().getString(0x7f070113));
        destinySectionTwoText.setText(s);
        cancelButton.setOnClickListener(new android.view.View.OnClickListener() {

            final DestinyInfoDialogView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
            }

            
            {
                this$0 = DestinyInfoDialogView.this;
                super();
            }
        });
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        initView();
    }
}
