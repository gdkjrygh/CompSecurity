// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty.discovery;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.base.view.DefaultViewHolder;
import com.google.common.base.Strings;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

// Referenced classes of package com.google.android.apps.wallet.loyalty.discovery:
//            SimplifiedLoyaltyProgramListItemBinder

final class this._cls0 extends DefaultViewHolder
{

    private TextView mCallToAction;
    private TextView mMerchantName;
    private TextView mProgramName;
    private ImageView programLogo;
    final SimplifiedLoyaltyProgramListItemBinder this$0;

    public final void setCallToAction(int i)
    {
        mCallToAction.setText(i);
    }

    public final void setCallToAction(String s)
    {
        mCallToAction.setText(s);
    }

    public final void setCallToActionVisible(boolean flag)
    {
        TextView textview = mCallToAction;
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

    public final void setMerchantName(String s)
    {
        mMerchantName.setText(s);
    }

    public final void setProgramLogo(String s)
    {
        if (Strings.isNullOrEmpty(s))
        {
            programLogo.setImageResource(com.google.android.apps.walletnfcrel.ItemDisplay.programLogo);
            return;
        } else
        {
            SimplifiedLoyaltyProgramListItemBinder.access$000(SimplifiedLoyaltyProgramListItemBinder.this).load(Uri.parse(s)).resizeDimen(com.google.android.apps.walletnfcrel.ItemDisplay.this._fld0, com.google.android.apps.walletnfcrel.ItemDisplay.this._fld0).placeholder(com.google.android.apps.walletnfcrel.ItemDisplay.this._fld0).error(com.google.android.apps.walletnfcrel.ItemDisplay.this._fld0).into(programLogo);
            return;
        }
    }

    public final void setProgramName(String s)
    {
        mProgramName.setText(s);
    }

    public final void setView(View view)
    {
        super.setView(view);
        programLogo = (ImageView)findViewById(com.google.android.apps.walletnfcrel.ItemDisplay.findViewById);
        mMerchantName = (TextView)findViewById(com.google.android.apps.walletnfcrel.ItemDisplay.findViewById);
        mProgramName = (TextView)findViewById(com.google.android.apps.walletnfcrel.ItemDisplay.findViewById);
        mCallToAction = (TextView)findViewById(com.google.android.apps.walletnfcrel.ItemDisplay.findViewById);
    }

    protected ()
    {
        this$0 = SimplifiedLoyaltyProgramListItemBinder.this;
        super(com.google.android.apps.walletnfcrel.ItemDisplay.this._fld0);
    }
}
