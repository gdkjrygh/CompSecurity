// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.bind.widget.LoadingView;

public interface ViewProvider
{

    public static final ViewProvider DEFAULT_EMPTY_VIEW_PROVIDER = new ViewProvider() {

        public final View getView$70191498(ViewGroup viewgroup)
        {
            return new View(viewgroup.getContext());
        }

    };
    public static final ViewProvider DEFAULT_ERROR_VIEW_PROVIDER = new ViewProvider() {

        public final View getView$70191498(ViewGroup viewgroup)
        {
            viewgroup = new TextView(viewgroup.getContext());
            viewgroup.setText("Error! (replace me)");
            return viewgroup;
        }

    };
    public static final ViewProvider DEFAULT_LOADING_VIEW_PROVIDER = new ViewProvider() {

        public final View getView$70191498(ViewGroup viewgroup)
        {
            return new LoadingView(viewgroup.getContext());
        }

    };

    public abstract View getView$70191498(ViewGroup viewgroup);

}
