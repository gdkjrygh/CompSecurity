// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.dialogs.DialogContainerView;

public class LastRideDescriptionDialogView extends DialogContainerView
{

    DialogFlow dialogFlow;
    Button okButton;
    ILyftPreferences preferences;

    public LastRideDescriptionDialogView(Context context, AttributeSet attributeset)
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
            okButton.setOnClickListener(new android.view.View.OnClickListener() {

                final LastRideDescriptionDialogView this$0;

                public void onClick(View view)
                {
                    preferences.setLastRideDescriptionShown();
                }

            
            {
                this$0 = LastRideDescriptionDialogView.this;
                super();
            }
            });
            return;
        }
    }

    public boolean onBack()
    {
        preferences.setLastRideDescriptionShown();
        return super.onBack();
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
