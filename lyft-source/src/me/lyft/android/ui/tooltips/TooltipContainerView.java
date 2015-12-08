// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.tooltips;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.lyft.scoop.Scoop;
import java.util.HashSet;
import java.util.Set;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.Preconditions;
import me.lyft.android.domain.tooltips.Tooltip;

// Referenced classes of package me.lyft.android.ui.tooltips:
//            TooltipView

public class TooltipContainerView extends FrameLayout
{

    IConstantsProvider constantsProvider;
    private final Set tooltipsList = new HashSet();

    public TooltipContainerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private void hideVisibleTooltips()
    {
        int j;
        for (int i = 0; i < getChildCount(); i = j + 1)
        {
            j = i;
            if (getChildAt(i).getVisibility() == 0)
            {
                removeViewAt(i);
                j = i - 1;
            }
        }

    }

    private boolean tryToShow(Tooltip tooltip, View view, int i)
    {
        if (!tooltip.shouldShow())
        {
            return false;
        }
        if (!tooltipsList.add(tooltip))
        {
            return false;
        } else
        {
            TooltipView tooltipview = (TooltipView)((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030142, this, false);
            addView(tooltipview);
            tooltipview.show(tooltip, view, i);
            return true;
        }
    }

    public void hideAll()
    {
        removeAllViews();
        tooltipsList.clear();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            hideVisibleTooltips();
        }
        return false;
    }

    public void tryToShowAndMarkShown(String s)
    {
        tryToShowAndMarkShown(s, null, 17);
    }

    public boolean tryToShowAndMarkShown(String s, View view, int i)
    {
        boolean flag;
        if (i == 48 || i == 80 || i == 17)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Expected gravity values: TOP|BOTTOM|CENTER");
        s = constantsProvider.getTooltip(s);
        if (tryToShow(s, view, i))
        {
            s.markShown();
            constantsProvider.saveTooltip(s);
            return true;
        } else
        {
            return false;
        }
    }
}
