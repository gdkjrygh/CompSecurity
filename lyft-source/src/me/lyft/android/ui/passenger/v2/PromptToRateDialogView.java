// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.dialogs.DialogContainerView;
import me.lyft.android.utils.PlayStore;

public class PromptToRateDialogView extends DialogContainerView
{

    DialogFlow dialogFlow;
    Button negativeButton;
    Button neutralButton;
    Button positiveButton;
    ILyftPreferences preferences;

    public PromptToRateDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        positiveButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PromptToRateDialogView this$0;

            public void onClick(View view)
            {
                PlayStore.openGooglePlay(getContext());
                setRateAppPromptTimestampAndDismiss(0x7fffffffffffffffL);
            }

            
            {
                this$0 = PromptToRateDialogView.this;
                super();
            }
        });
        neutralButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PromptToRateDialogView this$0;

            public void onClick(View view)
            {
                setRateAppPromptTimestampAndDismiss(System.currentTimeMillis());
            }

            
            {
                this$0 = PromptToRateDialogView.this;
                super();
            }
        });
        negativeButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PromptToRateDialogView this$0;

            public void onClick(View view)
            {
                setRateAppPromptTimestampAndDismiss(0x7fffffffffffffffL);
            }

            
            {
                this$0 = PromptToRateDialogView.this;
                super();
            }
        });
    }

    void setRateAppPromptTimestampAndDismiss(long l)
    {
        preferences.setRateAppPromptTimestamp(l);
        dialogFlow.dismiss();
    }
}
