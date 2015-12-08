// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;
import java.util.Set;

final class hzx
    implements hzi
{

    private MenuItem a;

    hzx(hzw hzw, MenuItem menuitem)
    {
        a = menuitem;
        super();
    }

    public final boolean a(ekp ekp1)
    {
        ekp1 = (gax)ekp1.b(gax);
        if (ekp1 != null && ekp1.q().contains(gav.a))
        {
            a.setVisible(true);
            return false;
        } else
        {
            return true;
        }
    }
}
