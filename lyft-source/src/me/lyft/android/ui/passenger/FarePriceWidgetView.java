// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.payment.NullMoney;
import me.lyft.android.domain.ride.FixedFare;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.ReactiveProperty;
import rx.functions.Action1;

public class FarePriceWidgetView extends LinearLayout
    implements PaymentWidgetContainerView.MapWidget
{

    static final Interpolator ANIM_INTERPOLATOR = new DecelerateInterpolator(1.2F);
    static final int ANIM_TIME = 500;
    TextView comparisonLabel;
    final SpannableStringBuilder courierFareText = new SpannableStringBuilder();
    DialogFlow dialogFlow;
    final Action1 fareChange = new Action1() {

        final FarePriceWidgetView this$0;

        public volatile void call(Object obj)
        {
            call((FixedFare)obj);
        }

        public void call(FixedFare fixedfare)
        {
            Object obj;
label0:
            {
                if (!fixedfare.isNull())
                {
                    farePrice.setText(fixedfare.getTotalMoney().format());
                    obj = fixedfare.getComparisonMoney();
                    fixedfare = fixedfare.getComparisonText();
                    if (!NullMoney.isNull(((Money) (obj))) && !Strings.isNullOrEmpty(fixedfare))
                    {
                        break label0;
                    }
                    comparisonLabel.setVisibility(8);
                }
                return;
            }
            comparisonLabel.setVisibility(0);
            obj = ((Money) (obj)).format();
            courierFareText.clear();
            courierFareText.append(((CharSequence) (obj)));
            courierFareText.append(' ');
            courierFareText.append(fixedfare);
            courierFareText.setSpan(new StrikethroughSpan(), 0, ((String) (obj)).length(), 33);
            comparisonLabel.setText(courierFareText);
        }

            
            {
                this$0 = FarePriceWidgetView.this;
                super();
            }
    };
    TextView farePrice;
    final ReactiveProperty fareProperty = ReactiveProperty.create(FixedFare.empty());
    final Runnable hideEndAction = new Runnable() {

        final FarePriceWidgetView this$0;

        public void run()
        {
            setVisibility(8);
        }

            
            {
                this$0 = FarePriceWidgetView.this;
                super();
            }
    };
    boolean isShowing;

    public FarePriceWidgetView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        isShowing = false;
    }

    private void hide(boolean flag)
    {
        if (!flag)
        {
            setTranslationX(-getMeasuredWidth());
            setVisibility(8);
            return;
        } else
        {
            ViewCompat.o(this).b(-getMeasuredWidth()).a(500L).a(ANIM_INTERPOLATOR).a(hideEndAction).b();
            return;
        }
    }

    private void show(boolean flag)
    {
        super.setVisibility(0);
        if (!flag)
        {
            super.setTranslationX(0.0F);
            return;
        } else
        {
            ViewCompat.o(this).b(0.0F).a(500L).a(ANIM_INTERPOLATOR).b();
            return;
        }
    }

    private void show(boolean flag, boolean flag1)
    {
        isShowing = flag;
        if (flag)
        {
            show(flag1);
            return;
        } else
        {
            hide(flag1);
            return;
        }
    }

    public void animateButtonVisibility(boolean flag)
    {
        show(flag, true);
    }

    public boolean isShowing()
    {
        return isShowing;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Binder.attach(this).bind(fareProperty, fareChange);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        Scoop.a(this).b(this);
        ButterKnife.a(this);
    }

    public boolean performClick()
    {
        FixedFare fixedfare = (FixedFare)fareProperty.get();
        if (!fixedfare.isNull())
        {
            dialogFlow.show(new PassengerDialogs.CourierRideTypeInfoDialog(fixedfare.getTotalMoney(), fixedfare.getComparisonMoney(), fixedfare.getComparisonText()));
        }
        return super.performClick();
    }

    public void setButtonVisibility(boolean flag)
    {
        show(flag, false);
    }

    public void setCourierFare(FixedFare fixedfare)
    {
        if (!fixedfare.isNull())
        {
            fareProperty.onNext(fixedfare);
        }
    }

}
