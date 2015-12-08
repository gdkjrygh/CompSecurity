// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.dialogs.DialogContainerView;

public class TrainingRideNavigationDialogView extends DialogContainerView
{

    DialogFlow dialogFlow;
    ImageView dialogImageView;
    TextView dialogMessageTextView;
    TextView dialogTitleTextView;
    Button gotItButton;

    public TrainingRideNavigationDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            gotItButton.setOnClickListener(new android.view.View.OnClickListener() {

                final TrainingRideNavigationDialogView this$0;

                public void onClick(View view)
                {
                    dialogFlow.dismiss();
                }

            
            {
                this$0 = TrainingRideNavigationDialogView.this;
                super();
            }
            });
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            return;
        }
    }
}
