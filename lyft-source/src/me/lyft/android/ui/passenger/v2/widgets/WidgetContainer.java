// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.domain.payment.Money;

// Referenced classes of package me.lyft.android.ui.passenger.v2.widgets:
//            WidgetModule, WidgetContainerPresenter, FixedFareWidgetPresenter, PaymentWidgetPresenter, 
//            PrimeTimeWidgetPresenter, PriceEstimatePresenter

public class WidgetContainer extends LinearLayout
    implements WidgetContainerPresenter.WidgetContainerView
{

    ImageView ccConcurLogo;
    TextView ccLabel;
    ImageView ccLogo;
    TextView errorStateLabel;
    TextView fixedFareComparisonLabel;
    TextView fixedFarePriceLabel;
    ProgressBar fixedFareProgress;
    final FixedFareWidgetPresenter.FixedFareView fixedFareView = new FixedFareWidgetPresenter.FixedFareView() {

        final SpannableStringBuilder courierFareTextSpan = new SpannableStringBuilder();
        final WidgetContainer this$0;

        public void setComparisonLabel(Money money, String s)
        {
            money = money.format();
            courierFareTextSpan.clear();
            courierFareTextSpan.append(money);
            courierFareTextSpan.append(' ');
            courierFareTextSpan.append(s);
            courierFareTextSpan.setSpan(new StrikethroughSpan(), 0, money.length(), 33);
            fixedFareComparisonLabel.setText(courierFareTextSpan);
        }

        public void setFarePrice(Money money)
        {
            fixedFarePriceLabel.setText(money.format());
        }

        public void setLoading(boolean flag)
        {
            if (flag)
            {
                fixedFareWidget.setVisibility(4);
                fixedFareProgress.setVisibility(0);
                return;
            } else
            {
                fixedFareWidget.setVisibility(0);
                fixedFareProgress.setVisibility(4);
                return;
            }
        }

        public void showComparisonLabel(boolean flag)
        {
            TextView textview = fixedFareComparisonLabel;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            textview.setVisibility(i);
        }

            
            {
                this$0 = WidgetContainer.this;
                super();
            }
    };
    LinearLayout fixedFareWidget;
    FrameLayout fixedFareWidgetContainer;
    FixedFareWidgetPresenter fixedFareWidgetPresenter;
    LinearLayout paymentWidget;
    TextView paymentWidgetLabel;
    PaymentWidgetPresenter paymentWidgetPresenter;
    final PaymentWidgetPresenter.PaymentWidgetView paymentWidgetView = new PaymentWidgetPresenter.PaymentWidgetView() {

        final WidgetContainer this$0;

        public void setHasPaymentMethod(boolean flag)
        {
            ccLogo.setVisibility(0);
            if (!flag)
            {
                ccLabel.setVisibility(8);
                ccConcurLogo.setVisibility(8);
                ccLogo.setImageResource(0x7f02012c);
                paymentWidgetLabel.setText(0x7f07021b);
                return;
            } else
            {
                ccLabel.setVisibility(0);
                ccConcurLogo.setVisibility(8);
                paymentWidgetLabel.setText(0x7f07021c);
                return;
            }
        }

        public void setImageResource(int i)
        {
            ccLogo.setImageResource(i);
        }

        public void setLabel(String s)
        {
            ccLabel.setText(s);
        }

        public void showConcurRideReceipts(boolean flag)
        {
            ImageView imageview = ccConcurLogo;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            imageview.setVisibility(i);
        }

        public void showCreditCardLabel(boolean flag)
        {
            TextView textview = ccLabel;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            textview.setVisibility(i);
        }

            
            {
                this$0 = WidgetContainer.this;
                super();
            }
    };
    TextView priceEstimateLabel;
    ImageView priceEstimateLabelPlaceholder;
    PriceEstimatePresenter priceEstimatePresenter;
    final PriceEstimatePresenter.PriceEstimateView priceEstimateView = new PriceEstimatePresenter.PriceEstimateView() {

        final WidgetContainer this$0;

        public void setEstimate(Money money, Money money1)
        {
            money = getResources().getString(0x7f070177, new Object[] {
                Integer.valueOf(money1.getAmount().intValue() / 100), Integer.valueOf(money.getAmount().intValue() / 100)
            });
            priceEstimateLabel.setText(money);
        }

        public void showNeedsEstimate(boolean flag)
        {
            byte byte0 = 8;
            Object obj = priceEstimateLabelPlaceholder;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((ImageView) (obj)).setVisibility(i);
            obj = priceEstimateLabel;
            if (flag)
            {
                i = byte0;
            } else
            {
                i = 0;
            }
            ((TextView) (obj)).setVisibility(i);
        }

            
            {
                this$0 = WidgetContainer.this;
                super();
            }
    };
    LinearLayout priceEstimateWidget;
    TextView primeTimeAmountLabel;
    LinearLayout primeTimeWidget;
    PrimeTimeWidgetPresenter primeTimeWidgetPresenter;
    final PrimeTimeWidgetPresenter.PrimeTimeWidgetView primeTimeWidgetView = new PrimeTimeWidgetPresenter.PrimeTimeWidgetView() {

        final WidgetContainer this$0;

        public void setPrimeTimeAmount(int i)
        {
            String s = getResources().getString(0x7f0702b6, new Object[] {
                Integer.valueOf(i)
            });
            primeTimeAmountLabel.setText(s);
        }

            
            {
                this$0 = WidgetContainer.this;
                super();
            }
    };
    final Scoop scoop;
    WidgetContainerPresenter widgetContainerPresenter;

    public WidgetContainer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        scoop = Scoop.a(context.a(new Object[] {
            new WidgetModule()
        }), context.a());
        scoop.b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            widgetContainerPresenter.attachView(this);
            fixedFareWidgetPresenter.attachView(fixedFareView);
            paymentWidgetPresenter.attachView(paymentWidgetView);
            primeTimeWidgetPresenter.attachView(primeTimeWidgetView);
            priceEstimatePresenter.attachView(priceEstimateView);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        widgetContainerPresenter.detachView(this);
        fixedFareWidgetPresenter.detachView(fixedFareView);
        paymentWidgetPresenter.detachView(paymentWidgetView);
        primeTimeWidgetPresenter.detachView(primeTimeWidgetView);
        priceEstimatePresenter.detachView(priceEstimateView);
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
            priceEstimateWidget.setOnClickListener(new android.view.View.OnClickListener() {

                final WidgetContainer this$0;

                public void onClick(View view)
                {
                    priceEstimatePresenter.onPriceEstimateClick();
                }

            
            {
                this$0 = WidgetContainer.this;
                super();
            }
            });
            fixedFareWidget.setOnClickListener(new android.view.View.OnClickListener() {

                final WidgetContainer this$0;

                public void onClick(View view)
                {
                    fixedFareWidgetPresenter.onFixedFareWidgetClick();
                }

            
            {
                this$0 = WidgetContainer.this;
                super();
            }
            });
            paymentWidget.setOnClickListener(new android.view.View.OnClickListener() {

                final WidgetContainer this$0;

                public void onClick(View view)
                {
                    paymentWidgetPresenter.onPaymentWidgetClick();
                }

            
            {
                this$0 = WidgetContainer.this;
                super();
            }
            });
            return;
        }
    }

    public void showErrorMessage(String s)
    {
        errorStateLabel.setText(s);
    }

    public void showErrorWidget(boolean flag)
    {
        TextView textview = errorStateLabel;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
    }

    public void showFixedFareWidget(boolean flag)
    {
        FrameLayout framelayout = fixedFareWidgetContainer;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        framelayout.setVisibility(i);
    }

    public void showPaymentWidget(boolean flag)
    {
        LinearLayout linearlayout = paymentWidget;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        linearlayout.setVisibility(i);
    }

    public void showPriceEstimateWidget(boolean flag)
    {
        LinearLayout linearlayout = priceEstimateWidget;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        linearlayout.setVisibility(i);
    }

    public void showPrimeTimeWidget(boolean flag)
    {
        LinearLayout linearlayout = primeTimeWidget;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        linearlayout.setVisibility(i);
    }
}
