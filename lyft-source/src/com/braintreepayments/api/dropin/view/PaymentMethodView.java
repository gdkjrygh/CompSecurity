// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.braintreepayments.api.models.Card;
import com.braintreepayments.api.models.PaymentMethod;

public class PaymentMethodView extends RelativeLayout
{

    private static final int UNKNOWN_IMAGE_ID = -1;
    private CharSequence mDescription;
    private TextView mDescriptionView;
    private TextView mDescriptorView;
    private ImageView mIconView;
    private PaymentType mType;

    public PaymentMethodView(Context context)
    {
        super(context);
        mType = PaymentType.UNKNOWN;
        init(context);
    }

    public PaymentMethodView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mType = PaymentType.UNKNOWN;
        init(context);
    }

    public PaymentMethodView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mType = PaymentType.UNKNOWN;
        init(context);
    }

    private View findView(int i)
    {
        return findViewById(i);
    }

    private void init(Context context)
    {
        LayoutInflater.from(context).inflate(com.braintreepayments.api.dropin.R.layout.bt_payment_method, this);
        mIconView = (ImageView)findView(com.braintreepayments.api.dropin.R.id.bt_payment_method_icon);
        mDescriptorView = (TextView)findView(com.braintreepayments.api.dropin.R.id.bt_payment_method_type);
        mDescriptionView = (TextView)findView(com.braintreepayments.api.dropin.R.id.bt_payment_method_description);
        refresh();
    }

    private void refresh()
    {
        if (mType.mPictureResId != -1)
        {
            mIconView.setImageResource(mType.mPictureResId);
            mIconView.setVisibility(0);
        } else
        {
            mIconView.setVisibility(8);
        }
        mDescriptorView.setText(getContext().getString(mType.mDescriptorStringId));
        mDescriptionView.setText(mDescription);
    }

    public void setPaymentMethodDetails(PaymentMethod paymentmethod)
    {
        mType = PaymentType.forType(paymentmethod.getTypeLabel());
        if (paymentmethod instanceof Card)
        {
            mDescription = String.format(getResources().getString(com.braintreepayments.api.dropin.R.string.bt_card_descriptor), new Object[] {
                ((Card)paymentmethod).getLastTwo()
            });
        } else
        {
            mDescription = paymentmethod.getDescription();
        }
        refresh();
    }

    private class PaymentType extends Enum
    {

        private static final PaymentType $VALUES[];
        public static final PaymentType AMEX;
        public static final PaymentType DINERS;
        public static final PaymentType DISCOVER;
        public static final PaymentType JCB;
        public static final PaymentType MAESTRO;
        public static final PaymentType MASTERCARD;
        public static final PaymentType PAYPAL;
        public static final PaymentType UNKNOWN;
        public static final PaymentType VISA;
        private String mCanonicalName;
        private final int mDescriptorStringId;
        private final int mPictureResId;

        static PaymentType forType(String s)
        {
            PaymentType apaymenttype[] = values();
            int j = apaymenttype.length;
            for (int i = 0; i < j; i++)
            {
                PaymentType paymenttype = apaymenttype[i];
                if (paymenttype.mCanonicalName.equals(s))
                {
                    return paymenttype;
                }
            }

            return UNKNOWN;
        }

        public static PaymentType valueOf(String s)
        {
            return (PaymentType)Enum.valueOf(com/braintreepayments/api/dropin/view/PaymentMethodView$PaymentType, s);
        }

        public static PaymentType[] values()
        {
            return (PaymentType[])$VALUES.clone();
        }

        static 
        {
            VISA = new PaymentType("VISA", 0, com.braintreepayments.api.dropin.R.drawable.bt_visa, com.braintreepayments.api.dropin.R.string.bt_descriptor_visa, "Visa");
            MASTERCARD = new PaymentType("MASTERCARD", 1, com.braintreepayments.api.dropin.R.drawable.bt_mastercard, com.braintreepayments.api.dropin.R.string.bt_descriptor_mastercard, "MasterCard");
            DISCOVER = new PaymentType("DISCOVER", 2, com.braintreepayments.api.dropin.R.drawable.bt_discover, com.braintreepayments.api.dropin.R.string.bt_descriptor_discover, "Discover");
            AMEX = new PaymentType("AMEX", 3, com.braintreepayments.api.dropin.R.drawable.bt_amex, com.braintreepayments.api.dropin.R.string.bt_descriptor_amex, "American Express");
            JCB = new PaymentType("JCB", 4, com.braintreepayments.api.dropin.R.drawable.bt_jcb, com.braintreepayments.api.dropin.R.string.bt_descriptor_jcb, "JCB");
            DINERS = new PaymentType("DINERS", 5, com.braintreepayments.api.dropin.R.drawable.bt_diners, com.braintreepayments.api.dropin.R.string.bt_descriptor_diners, "Diners");
            MAESTRO = new PaymentType("MAESTRO", 6, com.braintreepayments.api.dropin.R.drawable.bt_maestro, com.braintreepayments.api.dropin.R.string.bt_descriptor_maestro, "Maestro");
            PAYPAL = new PaymentType("PAYPAL", 7, com.braintreepayments.api.dropin.R.drawable.bt_paypal, com.braintreepayments.api.dropin.R.string.bt_descriptor_paypal, "PayPal");
            UNKNOWN = new PaymentType("UNKNOWN", 8, -1, com.braintreepayments.api.dropin.R.string.bt_descriptor_unknown, "unknown");
            $VALUES = (new PaymentType[] {
                VISA, MASTERCARD, DISCOVER, AMEX, JCB, DINERS, MAESTRO, PAYPAL, UNKNOWN
            });
        }



        private PaymentType(String s, int i, int j, int k, String s1)
        {
            super(s, i);
            mPictureResId = j;
            mDescriptorStringId = k;
            mCanonicalName = s1;
        }
    }

}
