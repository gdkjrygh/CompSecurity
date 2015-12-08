// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.a;

import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.fitbit.ui.a:
//            c

public static class a
    implements a
{

    private final View a;

    public View a(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = a;
        }
        return new View(viewgroup.getContext());
    }

    public up(View view)
    {
        a = view;
    }
}
