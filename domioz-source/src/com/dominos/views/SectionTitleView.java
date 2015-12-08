// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;

// Referenced classes of package com.dominos.views:
//            SauceSelectorView

public class SectionTitleView extends LinearLayout
{

    private static final String TAG = com/dominos/views/SauceSelectorView.getSimpleName();
    TextView sectionViewLabel;

    public SectionTitleView(Context context)
    {
        super(context);
    }

    public void bind(String s)
    {
        sectionViewLabel.setText(s);
    }

    void setupFonts()
    {
        FontManager.applyDominosFont(this);
    }

}
