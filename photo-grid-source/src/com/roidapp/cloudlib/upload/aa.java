// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.bumptech.glide.a;
import com.bumptech.glide.b;
import com.bumptech.glide.d;
import com.bumptech.glide.h;
import com.bumptech.glide.load.b.e;
import com.bumptech.glide.p;
import com.roidapp.baselib.c.u;
import com.roidapp.baselib.view.RoundImageView;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.sns.b.x;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.upload:
//            x

final class aa extends BaseAdapter
{

    final com.roidapp.cloudlib.upload.x a;
    private List b;

    public aa(com.roidapp.cloudlib.upload.x x1, List list)
    {
        a = x1;
        super();
        b = list;
    }

    public final void a(List list)
    {
        b = list;
    }

    public final int getCount()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.size();
        }
    }

    public final Object getItem(int i)
    {
        if (b != null)
        {
            return b.get(i);
        } else
        {
            return null;
        }
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(viewgroup.getContext()).inflate(as.am, null);
        }
        view = (RoundImageView)u.a(view1, ar.ds);
        viewgroup = (TextView)u.a(view1, ar.dr);
        x x1 = (x)b.get(i);
        if (x1 != null)
        {
            String s = x1.h;
            h.a(a).a(s).i().a(e.c).a().a(new com.roidapp.cloudlib.sns.e.a(view));
            viewgroup.setText(x1.b);
        }
        return view1;
    }
}
