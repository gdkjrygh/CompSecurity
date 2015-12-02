// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.common.base.Preconditions;
import java.util.List;

// Referenced classes of package com.facebook.orca.photos.view:
//            b, c

public class a extends BaseAdapter
{

    private List a;
    private Context b;

    public a(Context context, List list)
    {
        a = list;
        b = context;
    }

    public int getCount()
    {
        return a.size();
    }

    public Object getItem(int i)
    {
        return a.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return 1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = ((ViewGroup) (getItem(i)));
        Preconditions.checkNotNull(viewgroup, "Null item in PhotoGalleryAdapter.getView");
        b b1 = (b)viewgroup;
        viewgroup = (c)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new c(b);
        }
        view.setPhotoMessageItem(b1);
        return view;
    }

    public int getViewTypeCount()
    {
        return 1;
    }
}
