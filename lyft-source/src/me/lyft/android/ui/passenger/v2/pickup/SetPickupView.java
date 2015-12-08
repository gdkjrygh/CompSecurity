// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.pickup;

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
import java.util.List;
import me.lyft.android.controls.MenuButtonToolbar;
import me.lyft.android.controls.RideTypeSwitcher;
import me.lyft.android.controls.SwitcherSelection;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.ui.HeightObservableLayout;
import me.lyft.android.ui.tooltips.TooltipContainerView;
import rx.Observable;
import rx.functions.Action0;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.pickup:
//            SetPickupModule, RideTypeSwitcherPresenter, SetPickupPresenter

public class SetPickupView extends RelativeLayout
    implements RideTypeSwitcherPresenter.RideTypeSwitcherView, SetPickupPresenter.PickupView
{

    ImageButton centerToCurrentLocationButton;
    HeightObservableLayout containerBottom;
    HeightObservableLayout containerTop;
    TextView pickupAddressField;
    RideTypeSwitcher rideTypeSwitcher;
    RideTypeSwitcherPresenter rideTypeSwitcherController;
    final Scoop scoop;
    Button setPickupButton;
    SetPickupPresenter setPickupPresenter;
    MenuButtonToolbar toolbar;
    TooltipContainerView tooltipContainerView;

    public SetPickupView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        scoop = Scoop.a(context.a(new Object[] {
            new SetPickupModule()
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
            rideTypeSwitcherController.attachView(this);
            setPickupPresenter.attachView(this);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        rideTypeSwitcherController.detachView(this);
        setPickupPresenter.detachView(this);
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
            toolbar.addItem((new me.lyft.android.controls.Toolbar.ToolbarItem(0x7f0d0018, 0x7f02015f)).setLayoutId(0x7f03008a)).hideItem(0x7f0d0018);
            toolbar.addItem(0x7f0d0011, 0x7f020144).hideItem(0x7f0d0011);
            toolbar.hideDivider();
            toolbar.setOnItemClickAction(new Action1() {

                final SetPickupView this$0;

                public void call(Integer integer)
                {
                    if (integer.intValue() == 0x7f0d0018)
                    {
                        setPickupPresenter.onInviteFriendsToolbarItemClick();
                    } else
                    if (integer.intValue() == 0x7f0d0011)
                    {
                        setPickupPresenter.onDriverModeToolbarItemClick();
                        return;
                    }
                }

                public volatile void call(Object obj)
                {
                    call((Integer)obj);
                }

            
            {
                this$0 = SetPickupView.this;
                super();
            }
            });
            setPickupButton.setOnClickListener(new android.view.View.OnClickListener() {

                final SetPickupView this$0;

                public void onClick(View view)
                {
                    setPickupPresenter.onSetPickupClick();
                }

            
            {
                this$0 = SetPickupView.this;
                super();
            }
            });
            pickupAddressField.setOnClickListener(new android.view.View.OnClickListener() {

                final SetPickupView this$0;

                public void onClick(View view)
                {
                    setPickupPresenter.onPickupAddressClick();
                }

            
            {
                this$0 = SetPickupView.this;
                super();
            }
            });
            centerToCurrentLocationButton.setOnClickListener(new android.view.View.OnClickListener() {

                final SetPickupView this$0;

                public void onClick(View view)
                {
                    setPickupPresenter.centerMapToCurrentLocation();
                }

            
            {
                this$0 = SetPickupView.this;
                super();
            }
            });
            rideTypeSwitcher.setThumbClickListener(new Action0() {

                final SetPickupView this$0;

                public void call()
                {
                    rideTypeSwitcherController.onThumbClick();
                }

            
            {
                this$0 = SetPickupView.this;
                super();
            }
            });
            rideTypeSwitcher.setOnSelectionChangeListener(new Action1() {

                final SetPickupView this$0;

                public volatile void call(Object obj)
                {
                    call((SwitcherSelection)obj);
                }

                public void call(SwitcherSelection switcherselection)
                {
                    rideTypeSwitcherController.setSelectedRideType(switcherselection);
                }

            
            {
                this$0 = SetPickupView.this;
                super();
            }
            });
            return;
        }
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

    public void setRideType(String s, boolean flag)
    {
        if (flag)
        {
            rideTypeSwitcher.animateThumbToItemId(s);
            return;
        } else
        {
            rideTypeSwitcher.moveThumbToItemId(s);
            return;
        }
    }

    public void setRideTypeSwitcherItems(List list)
    {
        rideTypeSwitcher.setItems(list);
    }

    public boolean showCourierTooltip()
    {
        boolean flag = false;
        View view = rideTypeSwitcher.getThumbViewAt(0);
        if (view != null)
        {
            tooltipContainerView.tryToShowAndMarkShown("courierPromo", view, 80);
            flag = true;
        }
        return flag;
    }

    public void showDriverModeToggle(boolean flag)
    {
        toolbar.setItemVisible(0x7f0d0011, flag);
    }

    public void showInviteFriendsToolbarItem(boolean flag)
    {
        toolbar.setItemVisible(0x7f0d0018, flag);
    }

    public void showSwitchToDriverToolbarItem(boolean flag)
    {
        if (flag)
        {
            toolbar.showDriverModeToggle();
            return;
        } else
        {
            toolbar.hideDriverModeToggle();
            return;
        }
    }
}
