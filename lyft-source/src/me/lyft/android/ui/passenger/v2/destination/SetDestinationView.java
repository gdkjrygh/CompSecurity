// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.destination;

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
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.destination:
//            SetDestinationModule, SetDestinationPresenter

public class SetDestinationView extends RelativeLayout
    implements SetDestinationPresenter.SetDestinationAndConfirmView
{

    ImageButton centerToCurrentLocationButton;
    HeightObservableLayout containerBottom;
    HeightObservableLayout containerTop;
    TextView destinationAddressView;
    TextView pickupAddressField;
    final Scoop scoop;
    Button setDestinationButton;
    SetDestinationPresenter setDestinationPresenter;
    MenuButtonToolbar toolbar;

    public SetDestinationView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        scoop = Scoop.a(context.a(new Object[] {
            new SetDestinationModule()
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
            setDestinationPresenter.attachView(this);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        setDestinationPresenter.detachView(this);
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
            pickupAddressField.setEnabled(false);
            toolbar.addItem(0x7f0d0005, 0x7f02012a).hideItem(0x7f0d0005);
            toolbar.showDivider();
            toolbar.setOnItemClickAction(new Action1() {

                final SetDestinationView this$0;

                public void call(Integer integer)
                {
                    if (integer.intValue() == 0x7f0d0005)
                    {
                        setDestinationPresenter.showPickupStep();
                    }
                }

                public volatile void call(Object obj)
                {
                    call((Integer)obj);
                }

            
            {
                this$0 = SetDestinationView.this;
                super();
            }
            });
            setDestinationButton.setOnClickListener(new android.view.View.OnClickListener() {

                final SetDestinationView this$0;

                public void onClick(View view)
                {
                    setDestinationPresenter.showNextStep();
                }

            
            {
                this$0 = SetDestinationView.this;
                super();
            }
            });
            centerToCurrentLocationButton.setOnClickListener(new android.view.View.OnClickListener() {

                final SetDestinationView this$0;

                public void onClick(View view)
                {
                    setDestinationPresenter.centerMapToCurrentLocation();
                }

            
            {
                this$0 = SetDestinationView.this;
                super();
            }
            });
            destinationAddressView.setOnClickListener(new android.view.View.OnClickListener() {

                final SetDestinationView this$0;

                public void onClick(View view)
                {
                    setDestinationPresenter.onDestinationAddressClick();
                }

            
            {
                this$0 = SetDestinationView.this;
                super();
            }
            });
            return;
        }
    }

    public void setDestinationAddress(String s)
    {
        destinationAddressView.setText(s);
    }

    public void setDestinationAddressLoading()
    {
        destinationAddressView.setText(getResources().getString(0x7f070240));
    }

    public void setDestinationAddressUnavailable()
    {
        destinationAddressView.setText(getResources().getString(0x7f070064));
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

    public void showCancelToolbarItem(boolean flag)
    {
        toolbar.setItemVisible(0x7f0d0005, flag);
    }
}
