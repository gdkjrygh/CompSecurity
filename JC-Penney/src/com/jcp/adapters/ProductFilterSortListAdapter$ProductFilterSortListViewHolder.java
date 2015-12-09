// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

// Referenced classes of package com.jcp.adapters:
//            ProductFilterSortListAdapter

public class a
{

    final ProductFilterSortListAdapter a;
    protected CheckBox mCheckBox;
    protected ImageView mColorIcon;
    protected RelativeLayout mRowLayout;
    protected TextView mTitle;

    protected (ProductFilterSortListAdapter productfiltersortlistadapter, View view)
    {
        a = productfiltersortlistadapter;
        super();
        ButterKnife.inject(this, view);
    }
}
