// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.dataviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import com.nbcsports.liveextra.ui.player.PlayerActivity;

// Referenced classes of package com.nbcsports.liveextra.ui.player.dataviews:
//            DataEngine

public class PanelBottom extends FrameLayout
{

    DataEngine engine;
    AssetViewModel viewModel;

    public PanelBottom(Context context)
    {
        this(context, null);
    }

    public PanelBottom(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PanelBottom(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (!isInEditMode())
        {
            PlayerActivity.component().inject(this);
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        int i;
        if (engine != null)
        {
            if ((i = engine.getBottomPanel()) != 0)
            {
                addView(LayoutInflater.from(getContext()).inflate(i, this, false));
                return;
            }
        }
    }
}
