// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.tooltips;

import me.lyft.android.common.Objects;
import me.lyft.android.infrastructure.lyft.constants.HintMetaDTO;

// Referenced classes of package me.lyft.android.domain.tooltips:
//            Tooltip

public class TooltipsMapper
{

    public TooltipsMapper()
    {
    }

    public static Tooltip createTooltip(HintMetaDTO hintmetadto, Tooltip tooltip)
    {
        Tooltip tooltip1 = new Tooltip();
        tooltip1.setId(hintmetadto.getId());
        tooltip1.setText(hintmetadto.getText());
        tooltip1.setMaxTimesToDisplay(((Integer)Objects.firstNonNull(hintmetadto.getNumDisplays(), Integer.valueOf(0))).intValue());
        tooltip1.setBackgroundColor(hintmetadto.getBackgroundColor());
        if (tooltip != null)
        {
            tooltip1.setTimesDisplayed(tooltip.getTimesDisplayed());
        }
        return tooltip1;
    }
}
