// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.b;

import android.util.SparseArray;
import android.view.View;

// Referenced classes of package com.qihoo.security.ui.b:
//            a

public static class 
{

    public View b;
    public SparseArray c;

    public View a(int i)
    {
        if (c != null)
        {
            View view = (View)c.get(i);
            if (view != null)
            {
                return view;
            }
        }
        return b.findViewById(i);
    }

    public ()
    {
    }
}
