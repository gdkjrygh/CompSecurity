// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.widget:
//            j, g

public class q
{

    public q()
    {
    }

    public static boolean a(g g, View view, int i)
    {
        Preconditions.checkArgument(view instanceof j);
        if (!((j)view).a())
        {
            ((ViewGroup)g).addView(view, i);
            return true;
        } else
        {
            return false;
        }
    }
}
