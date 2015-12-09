// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.nineoldandroids.a.a;

// Referenced classes of package com.a.a.a:
//            a

public abstract class b extends com.a.a.a.a
{

    public b(BaseAdapter baseadapter)
    {
        super(baseadapter);
    }

    protected abstract a a(ViewGroup viewgroup, View view);

    public a[] b(ViewGroup viewgroup, View view)
    {
        return (new a[] {
            a(viewgroup, view)
        });
    }
}
