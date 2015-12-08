// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import com.pinterest.api.model.Pin;
import com.pinterest.api.model.PinMetadata;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.kit.utils:
//            CollectionUtils

public class AggregatedPinUtils
{

    public AggregatedPinUtils()
    {
    }

    public static boolean hasUserChangedDescription(Pin pin)
    {
        return pin != null && CollectionUtils.isNotEmpty(pin.editedFieldSet) && pin.editedFieldSet.contains("description");
    }

    public static boolean showUserDescription(Pin pin)
    {
        boolean flag1 = true;
        if (!hasUserChangedDescription(pin))
        {
            return false;
        }
        boolean flag;
        if (pin != null)
        {
            String s = pin.getDescription().trim();
            if (StringUtils.isNotBlank(pin.getSeoDescription()))
            {
                if (!StringUtils.equals(pin.getSeoDescription().trim(), s))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = true;
            }
            if (pin.getMetadata() != null)
            {
                pin = pin.getMetadata().getMetadataDisplay();
                if (flag && !StringUtils.equals(pin.toString(), s))
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
        } else
        {
            flag = false;
        }
        return flag;
    }
}
