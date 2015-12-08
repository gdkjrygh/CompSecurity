// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.roidapp.photogrid.cloud.a:
//            t

public abstract class l
    implements android.view.View.OnClickListener
{

    private int a;
    protected Context d;
    protected t e;
    protected boolean f;

    public l(Context context, int i, t t1)
    {
        d = context;
        a = i;
        e = t1;
    }

    public abstract View a(LayoutInflater layoutinflater, View view, ViewGroup viewgroup);

    public void a()
    {
        d = null;
    }

    public final int d()
    {
        return a;
    }

    public void onClick(View view)
    {
        if (e != null)
        {
            e.a(this);
        }
    }
}
