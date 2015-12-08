// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.confirm;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.controls.MenuButtonToolbar;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.ui.HeightObservableLayout;
import me.lyft.android.utils.DrawableUtils;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.confirm:
//            ConfirmModule, ConfirmPresenter, RequestRideButtonPresenter

public class ConfirmPickupView extends RelativeLayout
    implements ConfirmPresenter.ConfirmView, RequestRideButtonPresenter.RequestRideButton
{

    ImageButton centerToCurrentLocationButton;
    ConfirmPresenter confirmPresenter;
    Button confirmRideButton;
    HeightObservableLayout containerBottom;
    HeightObservableLayout containerTop;
    TextView pickupAddressField;
    RequestRideButtonPresenter requestRideButtonController;
    final Scoop scoop;
    MenuButtonToolbar toolbar;

    public ConfirmPickupView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        scoop = Scoop.a(context.a(new Object[] {
            new ConfirmModule()
        }), context.a());
        scoop.b(this);
    }

    public Observable observeBottomContainerHeight()
    {
        return containerBottom.observeHeightChange();
    }

    public Observable observeTopContainerHeight()
    {
        return containerTop.observeHeightChange();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            confirmPresenter.attachView(this);
            requestRideButtonController.attachView(this);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        requestRideButtonController.detachView(this);
        confirmPresenter.detachView(this);
        super.onDetachedFromWindow();
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
            toolbar.addItem(0x7f0d0005, 0x7f02012a).hideItem(0x7f0d0005);
            toolbar.showDivider();
            toolbar.setOnItemClickAction(new Action1() {

                final ConfirmPickupView this$0;

                public void call(Integer integer)
                {
                    if (integer.intValue() == 0x7f0d0005)
                    {
                        confirmPresenter.resetToPickupStep();
                    }
                }

                public volatile void call(Object obj)
                {
                    call((Integer)obj);
                }

            
            {
                this$0 = ConfirmPickupView.this;
                super();
            }
            });
            confirmRideButton.setOnClickListener(new android.view.View.OnClickListener() {

                final ConfirmPickupView this$0;

                public void onClick(View view)
                {
                    requestRideButtonController.requestRide();
                }

            
            {
                this$0 = ConfirmPickupView.this;
                super();
            }
            });
            centerToCurrentLocationButton.setOnClickListener(new android.view.View.OnClickListener() {

                final ConfirmPickupView this$0;

                public void onClick(View view)
                {
                    confirmPresenter.centerMapToCurrentLocation();
                }

            
            {
                this$0 = ConfirmPickupView.this;
                super();
            }
            });
            pickupAddressField.setOnClickListener(new android.view.View.OnClickListener() {

                final ConfirmPickupView this$0;

                public void onClick(View view)
                {
                    confirmPresenter.onPickupAddressClick();
                }

            
            {
                this$0 = ConfirmPickupView.this;
                super();
            }
            });
            return;
        }
    }

    public void setDestinationAddress(String s)
    {
    }

    public void setDestinationAddressLoading()
    {
    }

    public void setDestinationAddressUnavailable()
    {
    }

    public void setPickupAddress(String s)
    {
        pickupAddressField.setText(s);
    }

    public void setPickupAddressLoading()
    {
        pickupAddressField.setText(getResources().getString(0x7f070240));
    }

    public void setPickupAddressUnavailable()
    {
        pickupAddressField.setText(getResources().getString(0x7f070064));
    }

    public void setRequestButtonBackground(String s, String s1)
    {
        s = DrawableUtils.getButtonDrawableForHexColors(getContext(), s, s1);
        confirmRideButton.setBackgroundDrawable(s);
    }

    public void setRequestButtonText(String s)
    {
        confirmRideButton.setText(s);
    }

    public void showCancelOption(boolean flag)
    {
        toolbar.setItemVisible(0x7f0d0005, flag);
    }
}
