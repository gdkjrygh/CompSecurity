// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.a;

import android.view.View;
import android.view.ViewGroup;
import com.fitbit.ui.views.ChooseItemView;

// Referenced classes of package com.fitbit.ui.a:
//            c

public abstract class b extends c
{

    public b()
    {
    }

    protected abstract CharSequence a(Object obj);

    protected CharSequence b(Object obj)
    {
        return "";
    }

    protected boolean c(Object obj)
    {
        return false;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = ChooseItemView.a(viewgroup.getContext());
        } else
        {
            view = (ChooseItemView)view;
        }
        viewgroup = ((ViewGroup) (getItem(i)));
        view.a(a(viewgroup));
        view.b(b(viewgroup));
        if (c(viewgroup))
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.a(i);
        return view;
    }
}
