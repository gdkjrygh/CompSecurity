// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.dialogs.DialogContainerView;

public class CourierDriverInfoDialogView extends DialogContainerView
{

    MessageBus bus;
    DialogFlow dialogFlow;
    ImageView infoDialogHeader;
    Button okButton;

    public CourierDriverInfoDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    public int getImageResource()
    {
        return 0x7f0200d6;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        infoDialogHeader.setImageResource(getImageResource());
        infoDialogHeader.setBackgroundColor(getResources().getColor(0x7f0c0062));
        okButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CourierDriverInfoDialogView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
            }

            
            {
                this$0 = CourierDriverInfoDialogView.this;
                super();
            }
        });
        setOkButtonStyle();
    }

    protected void setOkButtonStyle()
    {
        okButton.setTextColor(getResources().getColorStateList(0x7f0c00ad));
        okButton.setBackgroundDrawable(getResources().getDrawable(0x7f02005b));
    }
}
