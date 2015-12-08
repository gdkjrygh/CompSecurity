// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata.recipe;

import com.pinterest.api.igmodel.IgModel;
import com.pinterest.api.model.metadata.recipe.CookTimes;

// Referenced classes of package com.pinterest.api.igmodel.metadata.recipe:
//            TypeTime

public class IgCookTimes
    implements IgModel
{

    public TypeTime a;
    public TypeTime b;
    public TypeTime c;

    public IgCookTimes()
    {
    }

    public final CookTimes a()
    {
        CookTimes cooktimes = new CookTimes();
        if (a != null)
        {
            cooktimes.setTotalDisplay(cooktimes.findDisplay(0, a.a, a.b));
        }
        if (b != null)
        {
            cooktimes.setPrepDisplay(cooktimes.findDisplay(1, b.a, b.b));
        }
        if (c != null)
        {
            cooktimes.setCookDisplay(cooktimes.findDisplay(2, c.a, c.b));
        }
        return cooktimes;
    }

    public Object getModel()
    {
        return a();
    }
}
