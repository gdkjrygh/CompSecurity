// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.a;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

// Referenced classes of package com.fitbit.ui.a:
//            c

class nit> extends c
{

    final c a;

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        throw new UnsupportedOperationException("Temp sublist cannot be used as ListAdapter");
    }

    up(c c1, List list, boolean flag)
    {
        a = c1;
        super(list, flag);
    }
}
