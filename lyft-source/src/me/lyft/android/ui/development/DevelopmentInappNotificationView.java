// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.infrastructure.lyft.notifications.InAppNotificationDTO;
import me.lyft.android.rx.Binder;
import rx.functions.Action1;
import rx.subjects.BehaviorSubject;

public class DevelopmentInappNotificationView extends LinearLayout
{

    private Binder binder;
    EditText developmentInappNotificationEditText;
    Button developmentInappNotificationShowButton;
    Button developmentShowInviteRecommended;
    DialogFlow dialogFlow;
    Toolbar toolbar;
    BehaviorSubject uiEnabled;

    public DevelopmentInappNotificationView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        uiEnabled = BehaviorSubject.create();
        Scoop.a(this).b(this);
    }

    private void openInappNotification(InAppNotificationDTO inappnotificationdto)
    {
        dialogFlow.show(new me.lyft.android.ui.Dialogs.InAppNotificationDialog(inappnotificationdto.getSourceUrl()));
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        binder.bind(uiEnabled, new Action1() {

            final DevelopmentInappNotificationView this$0;

            public void call(Boolean boolean1)
            {
                developmentInappNotificationShowButton.setEnabled(boolean1.booleanValue());
                developmentShowInviteRecommended.setEnabled(boolean1.booleanValue());
            }

            public volatile void call(Object obj)
            {
                call((Boolean)obj);
            }

            
            {
                this$0 = DevelopmentInappNotificationView.this;
                super();
            }
        });
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        toolbar.setTitle(getContext().getString(0x7f070366));
    }

    public void showInAppNotificationOnClick(View view)
    {
        view = developmentInappNotificationEditText.getText().toString();
        InAppNotificationDTO inappnotificationdto = new InAppNotificationDTO(null, view);
        if (!Strings.isNullOrEmpty(view))
        {
            openInappNotification(inappnotificationdto);
        }
    }

    public void showInviteRecommendedOnClick(View view)
    {
        dialogFlow.show(new me.lyft.android.ui.passenger.PassengerDialogs.InviteRecommendedDialog());
    }
}
