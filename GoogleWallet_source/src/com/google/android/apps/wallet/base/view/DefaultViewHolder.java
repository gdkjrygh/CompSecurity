// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.wallet.util.view.Views;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.base.view:
//            ViewHolder

public class DefaultViewHolder
    implements ViewHolder
{

    private int rootLayoutId;
    protected View rootView;

    protected DefaultViewHolder(int i)
    {
        rootLayoutId = 0;
        rootLayoutId = i;
    }

    public final void createView(LayoutInflater layoutinflater)
    {
        createView(layoutinflater, null);
    }

    public final void createView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        boolean flag;
        if (rootLayoutId != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Must have a valid layout to inflate.");
        setView(layoutinflater.inflate(rootLayoutId, viewgroup, false));
    }

    public final View findViewById(int i)
    {
        boolean flag;
        if (rootView != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Root view should be set by calling setView() or createView()");
        return Views.findViewById(rootView, i);
    }

    protected final Context getContext()
    {
        boolean flag;
        if (rootView != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Root view should be set by calling setView() or createView()");
        return rootView.getContext();
    }

    public final View getView()
    {
        return rootView;
    }

    protected void setView(View view)
    {
        rootView = (View)Preconditions.checkNotNull(view);
        Views.setTag(view, this);
    }
}
