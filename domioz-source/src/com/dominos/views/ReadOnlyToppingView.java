// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.core.models.LabsTopping;
import com.dominos.utils.ResUtils;

// Referenced classes of package com.dominos.views:
//            SauceSelectorView, ProductSpinner

public class ReadOnlyToppingView extends LinearLayout
{

    private static final String TAG = com/dominos/views/SauceSelectorView.getSimpleName();
    RelativeLayout controlLayout;
    ImageButton decrementButton;
    RelativeLayout detailLayout;
    ImageButton incrementButton;
    TextView label;
    RelativeLayout labelLayout;
    RadioGroup partRadioGroup;
    LinearLayout quantityControlLayout;
    TextView quantityLabel;
    ResUtils resUtils;
    ProductSpinner sauceSpinner;
    TextView sectionViewLabel;
    TextView tapTip;

    public ReadOnlyToppingView(Context context)
    {
        super(context);
    }

    public void bind(LabsTopping labstopping)
    {
        labelLayout.setVisibility(0);
        label.setText(labstopping.getName());
        detailLayout.setSelected(true);
        quantityLabel.setText(LabsTopping.getOptionQuantityName(labstopping.getQuantityForPart(labstopping.getPartWithQuantity()), resUtils.getOptionToQuantityMap()));
        decrementButton.setEnabled(false);
        incrementButton.setEnabled(false);
    }

    void setupFonts()
    {
        FontManager.applyDominosFont(this);
    }

}
