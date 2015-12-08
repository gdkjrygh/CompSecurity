// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.utils.PlayStore;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            DialogContainerView

public class UpdateAppDialogView extends DialogContainerView
{

    ActivityController activityController;
    DialogFlow dialogFlow;
    TextView messageTextView;
    Button okButton;
    private final me.lyft.android.ui.Dialogs.UpdateAppDialog params;

    public UpdateAppDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (me.lyft.android.ui.Dialogs.UpdateAppDialog)context.a();
    }

    private void goToPlayStore()
    {
        PlayStore.openGooglePlay(getContext());
        dialogFlow.dismiss();
    }

    public boolean onBack()
    {
        activityController.finish();
        return true;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        messageTextView.setText(params.getMessage());
        okButton.setOnClickListener(new android.view.View.OnClickListener() {

            final UpdateAppDialogView this$0;

            public void onClick(View view)
            {
                goToPlayStore();
            }

            
            {
                this$0 = UpdateAppDialogView.this;
                super();
            }
        });
    }

}
