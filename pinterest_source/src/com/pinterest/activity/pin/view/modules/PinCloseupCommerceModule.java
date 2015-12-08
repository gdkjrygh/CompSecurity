// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.commerce.model.StatementCreditExtraData;
import com.pinterest.activity.commerce.view.CloseupStatementCreditHero;
import com.pinterest.activity.commerce.view.ShopPinsFromButton;
import com.pinterest.api.model.BuyableProduct;
import com.pinterest.api.model.Pin;
import com.pinterest.data.CommerceApiManager;
import com.pinterest.di.components.ActivityComponent;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.experiences.Experience;
import com.pinterest.schemas.experiences.Placement;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupBaseModule

public class PinCloseupCommerceModule extends PinCloseupBaseModule
{

    private static final int MAX_LINES_DESCRIPTION = 5;
    CommerceApiManager _commerceApiManager;
    TextView _moreDescriptionTextView;
    TextView _productDescriptionTextView;
    private boolean _redrawLayout;
    TextView _returnPolicyTextView;
    ShopPinsFromButton _shopPinsFromButton;

    public PinCloseupCommerceModule(Context context)
    {
        super(context);
        _redrawLayout = true;
    }

    private String getDescription(BuyableProduct buyableproduct)
    {
        String s1 = buyableproduct.getDescription();
        String s = s1;
        if (StringUtils.isEmpty(s1))
        {
            s = buyableproduct.getShortDescription();
        }
        buyableproduct = s;
        if (StringUtils.isEmpty(s))
        {
            buyableproduct = _pin.getDescription();
        }
        return buyableproduct;
    }

    private boolean shouldDisplayShopButton(String s, String s1)
    {
        return !TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1);
    }

    void expandTextClicked()
    {
        _productDescriptionTextView.setMaxLines(0x7fffffff);
        _productDescriptionTextView.setEllipsize(null);
        _moreDescriptionTextView.setVisibility(8);
        _redrawLayout = false;
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_COMMERCE;
    }

    protected boolean hasContent()
    {
        return _pin.getBuyableProduct() != null;
    }

    protected void init()
    {
        Context context = getContext();
        if (!(context instanceof BaseActivity))
        {
            throw new IllegalStateException("Closeup modules should be instances of BaseActivity");
        } else
        {
            ((BaseActivity)context).getComponent().inject(this);
            _padding.left = (int)Resources.dimension(0x7f0a0184);
            _padding.top = (int)Resources.dimension(0x7f0a0186);
            _padding.right = (int)Resources.dimension(0x7f0a0184);
            return;
        }
    }

    protected void initView()
    {
        setBackgroundColor(-1);
        setOrientation(1);
        removeAllViews();
        inflate(getContext(), 0x7f030044, this);
        ButterKnife.a(this);
        setVisibility(8);
        final ExperienceValue expValue = Experiences.a(String.valueOf(Placement.ANDROID_PIN_CLOSEUP_COMMERCE_TAKEOVER.getValue()));
        if (expValue != null && expValue.b == Experience.ANDROID_STATEMENT_CREDIT_PIN_CLOSEUP.getValue() && expValue.g != null)
        {
            expValue.d();
            StatementCreditExtraData statementcreditextradata = new StatementCreditExtraData(expValue.g);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            layoutparams.topMargin = (int)Resources.dimension(0x7f0a0162);
            layoutparams.bottomMargin = (int)Resources.dimension(0x7f0a0162);
            final CloseupStatementCreditHero promotionView = new CloseupStatementCreditHero(getContext());
            promotionView.bind(statementcreditextradata.getDisplayAmount(), statementcreditextradata.getIncentiveName());
            promotionView.setUserActionListener(new _cls1());
            addView(promotionView, 0, layoutparams);
        }
    }

    protected void onMeasure(int i, int j)
    {
        if (!_redrawLayout || getVisibility() == 8)
        {
            super.onMeasure(i, j);
        } else
        {
            _productDescriptionTextView.setMaxLines(0x7fffffff);
            _moreDescriptionTextView.setVisibility(8);
            super.onMeasure(i, j);
            if (_productDescriptionTextView.getLineCount() > 5)
            {
                _productDescriptionTextView.setMaxLines(5);
                _moreDescriptionTextView.setVisibility(0);
                super.onMeasure(i, j);
                return;
            }
        }
    }

    void returnPolicyTextViewClicked()
    {
        final BuyableProduct buyableProduct = _pin.getBuyableProduct();
        if (buyableProduct == null)
        {
            return;
        } else
        {
            _commerceApiManager.g(buyableProduct.getMerchantId(), new _cls2());
            return;
        }
    }

    protected boolean shouldUpdateView()
    {
        BuyableProduct buyableproduct = _pin.getBuyableProduct();
        return buyableproduct != null && !TextUtils.equals(getDescription(buyableproduct), _productDescriptionTextView.getText());
    }

    protected void updateView()
    {
        Object obj = _pin.getBuyableProduct();
        if (obj == null)
        {
            setVisibility(8);
            return;
        }
        _productDescriptionTextView.setMaxLines(5);
        _productDescriptionTextView.setText(getDescription(((BuyableProduct) (obj))));
        String s1 = ((BuyableProduct) (obj)).getMerchantName();
        String s = ((BuyableProduct) (obj)).getCanonicalMerchantDomain();
        obj = s;
        if (TextUtils.isEmpty(s))
        {
            obj = _pin.getCanonicalMerchantDomain();
        }
        if (shouldDisplayShopButton(s1, ((String) (obj))))
        {
            _shopPinsFromButton.bind(s1, ((String) (obj)));
            _shopPinsFromButton.setVisibility(0);
        }
        setVisibility(0);
    }

    private class _cls1
        implements com.pinterest.activity.commerce.view.CloseupStatementCreditHero.UserActionListener
    {

        final PinCloseupCommerceModule this$0;
        final ExperienceValue val$expValue;
        final CloseupStatementCreditHero val$promotionView;

        public void onCompleteAndDismiss()
        {
            expValue.b();
            removeView(promotionView);
        }

        _cls1()
        {
            this$0 = PinCloseupCommerceModule.this;
            expValue = experiencevalue;
            promotionView = closeupstatementcredithero;
            super();
        }
    }


    private class _cls2 extends PinterestCallback
    {

        final PinCloseupCommerceModule this$0;
        final BuyableProduct val$buyableProduct;

        public void failure(PinterestError pinteresterror)
        {
            ClickThroughUtil.gotoPinLink(buyableProduct.getCanonicalMerchantDomain(), _pin, _apiTag);
        }

        public void success(ApiResponse apiresponse, Response response)
        {
            apiresponse = (Merchant)apiresponse.getData();
            response = apiresponse.getReturnPolicyUrl();
            if (!TextUtils.isEmpty(response))
            {
                ClickThroughUtil.gotoPinLink(response, _pin, _apiTag);
                return;
            } else
            {
                ClickThroughUtil.gotoPinLink(apiresponse.getMerchantUrl(), _pin, _apiTag);
                return;
            }
        }

        public volatile void success(Object obj, Response response)
        {
            success((ApiResponse)obj, response);
        }

        _cls2()
        {
            this$0 = PinCloseupCommerceModule.this;
            buyableProduct = buyableproduct;
            super();
        }
    }

}
