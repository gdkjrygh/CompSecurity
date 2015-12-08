// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.LabsFlavor;
import com.dominos.android.sdk.core.models.LabsSize;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.store.MenuManager;

public class LabsVariantView extends RelativeLayout
{

    private MenuManager mMenuManager;
    MobileSession mMobileSession;
    RelativeLayout productTypeContainer;
    TextView productTypeLabel;
    TextView sectionViewLabel;

    public LabsVariantView(Context context)
    {
        super(context);
    }

    public LabsVariantView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public LabsVariantView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void bind(LabsVariant labsvariant, boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        LabsFlavor labsflavor = mMenuManager.getFlavor(labsvariant);
        if (labsflavor != null)
        {
            stringbuilder.append(labsflavor.getName());
        }
        if (!flag)
        {
            LabsSize labssize = mMenuManager.getSize(labsvariant);
            if (labssize != null)
            {
                if (labsflavor != null)
                {
                    stringbuilder.append(" - ");
                }
                stringbuilder.append(labssize.getName());
            }
        }
        if (stringbuilder.length() == 0)
        {
            productTypeLabel.setText(labsvariant.getName());
            return;
        } else
        {
            productTypeLabel.setText(stringbuilder.toString());
            return;
        }
    }

    public void hideHeader()
    {
        sectionViewLabel.setVisibility(8);
    }

    protected void onAfterInject()
    {
        mMenuManager = (MenuManager)mMobileSession.getManager("menu_manager");
    }

    public void setItemBackground(int i)
    {
        productTypeContainer.setBackgroundResource(i);
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
        FontManager.applyDominosFont(productTypeLabel);
    }
}
