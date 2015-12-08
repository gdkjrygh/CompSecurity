// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.core.models.LabsCategory;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsSize;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.utils.ImageManagerCDN;
import com.dominos.utils.ResUtils;
import java.util.List;

public class LabsProductLineView extends RelativeLayout
{

    private static final double PRODUCT_PRICE_FREE = 0D;
    TextView header;
    private String left_string;
    private String light;
    private final Context mContext;
    MobileSession mMobileSession;
    TextView productLineDescriptionText;
    ImageView productLineImageView;
    TextView productLineLabelText;
    TextView productLineOptionDescriptionText;
    TextView productLinePriceText;
    TextView productLineQuantityText;
    ResUtils resourceUtility;
    private String right_string;
    private String whole_string;

    public LabsProductLineView(Context context)
    {
        super(context);
        mContext = context;
        whole_string = getContext().getString(0x7f080341);
        left_string = getContext().getString(0x7f08018a);
        right_string = getContext().getString(0x7f080283);
        light = getContext().getString(0x7f08018b);
    }

    private SpannableString makeSpannableString(String s)
    {
        SpannableString spannablestring = new SpannableString(s);
        int i = s.indexOf(whole_string);
        if (i != -1)
        {
            spannablestring.setSpan(new ForegroundColorSpan(0xffff0000), i, whole_string.length() + i, 0);
        }
        i = s.indexOf(left_string);
        if (i != -1)
        {
            spannablestring.setSpan(new ForegroundColorSpan(0xffff0000), i, left_string.length() + i, 0);
        }
        i = s.indexOf(right_string);
        if (i != -1)
        {
            spannablestring.setSpan(new ForegroundColorSpan(0xffff0000), i, right_string.length() + i, 0);
        }
        return spannablestring;
    }

    private void setImage(int i, String s, String s1)
    {
        if (s.equals(""))
        {
            ImageManagerCDN.INSTANCE.addMenuImage(productLineImageView, s1);
        } else
        {
            ImageManagerCDN.INSTANCE.addMenuImage(productLineImageView, s);
        }
        s1.equals("");
        productLineImageView.setTag(Integer.valueOf(i));
        setTag(Integer.valueOf(i));
    }

    private void setImage(LabsProduct labsproduct)
    {
        ImageManagerCDN.INSTANCE.addMenuImage(productLineImageView, labsproduct.getCode());
        productLineImageView.setTag(labsproduct);
    }

    private void setOptionDescription(String s)
    {
        if (s.equalsIgnoreCase(""))
        {
            productLineOptionDescriptionText.setVisibility(8);
            return;
        } else
        {
            productLineOptionDescriptionText.setVisibility(0);
            productLineOptionDescriptionText.setText(makeSpannableString(s));
            return;
        }
    }

    private void setPrice(double d)
    {
        if (d == 0.0D)
        {
            productLinePriceText.setText(mContext.getString(0x7f08025c));
            return;
        } else
        {
            productLinePriceText.setText(NumberUtil.formatPrice(Double.valueOf(d)));
            return;
        }
    }

    public void bind(LabsProductLine labsproductline)
    {
        productLineLabelText.setText(labsproductline.getProduct().getTitle());
        productLineQuantityText.setText(String.valueOf(labsproductline.getQuantity()));
        Object obj;
        Object obj1;
        String s;
        if (labsproductline.getProduct().getVariants() != null && labsproductline.getProduct().getVariants().size() > 1)
        {
            productLineDescriptionText.setText(labsproductline.getFormattedFlavor());
        } else
        if (labsproductline.getProduct().getProductType().equals("Drinks"))
        {
            productLineDescriptionText.setText(labsproductline.getSize().getName());
        } else
        {
            productLineDescriptionText.setText("");
        }
        obj = getContext().getString(0x7f080341);
        obj1 = getContext().getString(0x7f08018a);
        s = getContext().getString(0x7f080283);
        setOptionDescription(labsproductline.getOptionDescription(resourceUtility.getOptionToQuantityMap(), ((String) (obj)), ((String) (obj1)), s));
        setPrice(labsproductline.getPrice());
        obj1 = labsproductline.getProduct();
        obj = (MenuManager)mMobileSession.getManager("menu_manager");
        if (((MenuManager) (obj)).isMenuLoaded())
        {
            obj = ((MenuManager) (obj)).getCategoryForProduct(((LabsProduct) (obj1)).getCode());
            if (obj != null)
            {
                obj = ((LabsCategory) (obj)).getParentCode();
            } else
            {
                obj = "";
            }
            obj1 = ((LabsProduct) (obj1)).getCode();
        } else
        {
            obj = "";
            obj1 = "";
        }
        setImage(labsproductline.getId(), ((String) (obj1)), ((String) (obj)));
    }

    public void bindAndHidQuantityBubbles(LabsProductLine labsproductline)
    {
        productLineQuantityText.setVisibility(8);
        bind(labsproductline);
    }

    void setupFonts()
    {
        FontManager.applyDominosFont(productLineLabelText);
        FontManager.applyDominosFont(productLineQuantityText);
        FontManager.applyDominosFont(productLineDescriptionText);
        FontManager.applyDominosFont(productLineOptionDescriptionText);
        FontManager.applyDominosFont(productLinePriceText);
        FontManager.applyDominosFont(header);
    }
}
