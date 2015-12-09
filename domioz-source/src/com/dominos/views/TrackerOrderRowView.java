// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;

// Referenced classes of package com.dominos.views:
//            QuantityView

public class TrackerOrderRowView extends LinearLayout
{

    public static final String TAG = com/dominos/views/QuantityView.getSimpleName();
    TextView mLineDescription;
    TextView mLinePrice;

    public TrackerOrderRowView(Context context)
    {
        super(context);
    }

    public void bind(String s, String s1)
    {
        mLineDescription.setText(s);
        mLinePrice.setText(s1);
    }

    void setupFonts()
    {
        FontManager.applyDominosFont(this);
    }

}
