// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.utils.Keyboard;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentView

public class PaymentScreenView extends LinearLayout
    implements IHandleBack
{

    AppFlow appFlow;
    private final Action1 onToolbarHomeClicked = new Action1() {

        final PaymentScreenView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            Keyboard.hideKeyboard(PaymentScreenView.this);
        }

            
            {
                this$0 = PaymentScreenView.this;
                super();
            }
    };
    PaymentScreens.PaymentBaseScreen params;
    PaymentView paymentView;
    SlideMenuController slideMenuController;
    Toolbar toolbar;

    public PaymentScreenView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (PaymentScreens.PaymentBaseScreen)context.a();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        slideMenuController.enableMenu();
        Binder.attach(this).bind(toolbar.observeHomeClick(), onToolbarHomeClicked);
    }

    public boolean onBack()
    {
        appFlow.resetTo(new me.lyft.android.ui.MainScreens.RideScreen());
        return true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        slideMenuController.disableMenu();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        toolbar.showTitle().setTitle(getContext().getString(0x7f070242));
    }
}
