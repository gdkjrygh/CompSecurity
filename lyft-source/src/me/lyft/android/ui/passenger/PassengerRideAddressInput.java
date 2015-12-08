// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import me.lyft.android.common.Unit;
import rx.Observable;
import rx.subjects.PublishSubject;

public class PassengerRideAddressInput extends RelativeLayout
{

    public static final int ADDRESS_SWITCH_ANIMATION_SPEED = 250;
    public static final float DROPOFF_SELECTED_WEIGHT = 0.35F;
    public static final float NOTHING_SELECTED_WEIGHT = 0.5F;
    public static final float PICKUP_SELECTED_WEIGHT = 0.65F;
    private static final String TAG = "PassengerRideAddressInput";
    TextView dropoffAddressTextView;
    private PublishSubject dropoffClicked;
    private PublishSubject dropoffFocused;
    TextView etaTextView;
    TextView pickupAddressTextView;
    private PublishSubject pickupClicked;
    View pickupDropoffView;
    private PublishSubject pickupFocused;
    TextView singleAddressTextView;
    View singleAddressView;
    View spacer;

    public PassengerRideAddressInput(Context context)
    {
        super(context);
        pickupClicked = PublishSubject.create();
        dropoffClicked = PublishSubject.create();
        pickupFocused = PublishSubject.create();
        dropoffFocused = PublishSubject.create();
        init();
    }

    public PassengerRideAddressInput(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        pickupClicked = PublishSubject.create();
        dropoffClicked = PublishSubject.create();
        pickupFocused = PublishSubject.create();
        dropoffFocused = PublishSubject.create();
        init();
    }

    public PassengerRideAddressInput(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        pickupClicked = PublishSubject.create();
        dropoffClicked = PublishSubject.create();
        pickupFocused = PublishSubject.create();
        dropoffFocused = PublishSubject.create();
        init();
    }

    private void animateLayoutWeight(final View view, float f)
    {
        ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
            ((android.widget.LinearLayout.LayoutParams)view.getLayoutParams()).weight, f
        });
        valueanimator.setDuration(250L);
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final PassengerRideAddressInput this$0;
            final View val$view;

            public void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                setLayoutWeight(view, (Float)valueanimator1.getAnimatedValue());
            }

            
            {
                this$0 = PassengerRideAddressInput.this;
                view = view1;
                super();
            }
        });
        valueanimator.start();
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0300c7, this);
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            setInputsFocusable(true);
            pickupAddressTextView.setOnClickListener(new android.view.View.OnClickListener() {

                final PassengerRideAddressInput this$0;

                public void onClick(View view)
                {
                    pickupClicked.onNext(Unit.create());
                }

            
            {
                this$0 = PassengerRideAddressInput.this;
                super();
            }
            });
            singleAddressView.setOnClickListener(new android.view.View.OnClickListener() {

                final PassengerRideAddressInput this$0;

                public void onClick(View view)
                {
                    pickupClicked.onNext(Unit.create());
                }

            
            {
                this$0 = PassengerRideAddressInput.this;
                super();
            }
            });
            pickupAddressTextView.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

                final PassengerRideAddressInput this$0;

                public void onFocusChange(View view, boolean flag)
                {
                    if (flag)
                    {
                        stretchPickup();
                        pickupFocused.onNext(view);
                    }
                }

            
            {
                this$0 = PassengerRideAddressInput.this;
                super();
            }
            });
            dropoffAddressTextView.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

                final PassengerRideAddressInput this$0;

                public void onFocusChange(View view, boolean flag)
                {
                    if (flag)
                    {
                        stretchDropoff();
                        dropoffFocused.onNext(view);
                    }
                }

            
            {
                this$0 = PassengerRideAddressInput.this;
                super();
            }
            });
            dropoffAddressTextView.setOnClickListener(new android.view.View.OnClickListener() {

                final PassengerRideAddressInput this$0;

                public void onClick(View view)
                {
                    dropoffClicked.onNext(Unit.create());
                }

            
            {
                this$0 = PassengerRideAddressInput.this;
                super();
            }
            });
            dropoffAddressTextView.setHint(Html.fromHtml(getContext().getString(0x7f070226)));
            pickupAddressTextView.setHint(Html.fromHtml(getContext().getString(0x7f07023d)));
            return;
        }
    }

    private void setLayoutWeight(View view, Float float1)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        layoutparams.weight = float1.floatValue();
        view.setLayoutParams(layoutparams);
    }

    private void stretchDropoff()
    {
        stretchPickup(0.35F);
    }

    private void stretchPickup()
    {
        stretchPickup(0.65F);
    }

    private void stretchPickup(float f)
    {
        animateLayoutWeight(pickupAddressTextView, f);
        animateLayoutWeight(dropoffAddressTextView, 1.0F - f);
    }

    private void stretchPickupDropoffEqually()
    {
        stretchPickup(0.5F);
    }

    public void focusAndStretchDropoffAddress()
    {
        stretchDropoff();
        dropoffAddressTextView.requestFocus();
    }

    public void focusAndStretchPickupAddress()
    {
        stretchPickup();
        pickupAddressTextView.requestFocus();
    }

    public Observable observeDropoffClick()
    {
        return dropoffClicked.asObservable();
    }

    public Observable observeDropoffFocused()
    {
        return dropoffFocused.asObservable();
    }

    public Observable observePickupClick()
    {
        return pickupClicked.asObservable();
    }

    public Observable observePickupFocused()
    {
        return pickupFocused.asObservable();
    }

    public void setDropoffAddress(String s)
    {
        dropoffAddressTextView.setText(s);
    }

    public void setEta(String s)
    {
        etaTextView.setText(s);
    }

    public void setInputsFocusable(boolean flag)
    {
        pickupAddressTextView.setFocusable(flag);
        dropoffAddressTextView.setFocusable(flag);
        pickupAddressTextView.setFocusableInTouchMode(flag);
        dropoffAddressTextView.setFocusableInTouchMode(flag);
    }

    public void setPickupAddress(String s)
    {
        singleAddressTextView.setText(s);
        pickupAddressTextView.setText(s);
    }

    public void showDropoffOnly()
    {
        singleAddressView.setVisibility(0);
        singleAddressTextView.setCompoundDrawablesWithIntrinsicBounds(0x7f02016f, 0, 0, 0);
        pickupDropoffView.setVisibility(8);
        singleAddressTextView.setHint(Html.fromHtml(getContext().getString(0x7f070226)));
    }

    public void showPickupAndDropoff()
    {
        singleAddressView.setVisibility(8);
        pickupDropoffView.setVisibility(0);
    }

    public void showPickupOnly()
    {
        singleAddressView.setVisibility(0);
        singleAddressTextView.setCompoundDrawablesWithIntrinsicBounds(0x7f020170, 0, 0, 0);
        pickupDropoffView.setVisibility(8);
        singleAddressTextView.setHint("");
    }

    public void unfocusStretchEqually()
    {
        stretchPickupDropoffEqually();
        pickupDropoffView.requestFocus();
    }







}
