// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.utils.ImageManagerCDN;

public class LabsProductView extends RelativeLayout
{

    RelativeLayout choiceContainer;
    TextView choiceViewDescription;
    LinearLayout choiceViewGlass;
    ImageView choiceViewImage;
    TextView choiceViewLabel;
    TextView sectionViewLabel;

    public LabsProductView(Context context)
    {
        super(context);
    }

    public LabsProductView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public LabsProductView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void setImage(LabsProduct labsproduct)
    {
        ImageManagerCDN.INSTANCE.addMenuImage(choiceViewImage, labsproduct.getImageCode());
        choiceViewImage.setTag(labsproduct);
    }

    public void bind(LabsProduct labsproduct)
    {
        choiceViewLabel.setText(labsproduct.getName());
        choiceViewDescription.setText(labsproduct.getDescription());
        setImage(labsproduct);
    }

    public void hideHeader()
    {
        sectionViewLabel.setVisibility(8);
    }

    public void setItemBackground(int i)
    {
        choiceContainer.setBackgroundResource(i);
    }

    public void setSectionHeader(String s)
    {
        if (StringHelper.isNotEmpty(s))
        {
            sectionViewLabel.setText(s);
            sectionViewLabel.setVisibility(0);
            return;
        } else
        {
            sectionViewLabel.setVisibility(8);
            return;
        }
    }

    void setupFonts()
    {
        FontManager.applyDominosFont(sectionViewLabel);
        FontManager.applyDominosFont(choiceViewLabel);
        FontManager.applyDominosFont(choiceViewDescription);
    }
}
