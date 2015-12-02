// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.categorylist;

import android.content.Context;
import android.widget.TextView;
import com.facebook.i;
import com.facebook.k;
import com.facebook.widget.f;

// Referenced classes of package com.facebook.bugreporter.activity.categorylist:
//            CategoryInfo

public class d extends f
{

    private final TextView a;
    private CategoryInfo b;

    public d(Context context)
    {
        super(context);
        setContentView(k.category_list_row_view);
        a = (TextView)getView(i.category_name);
    }

    public void setCategoryInfo(CategoryInfo categoryinfo)
    {
        b = categoryinfo;
        a.setText(categoryinfo.a);
    }
}
