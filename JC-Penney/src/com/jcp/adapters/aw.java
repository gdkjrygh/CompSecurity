// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.jcp.g.a;
import com.jcp.productcategories.modal.Modal;
import com.jcp.util.bq;
import com.squareup.a.ak;
import com.squareup.a.ba;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            ax

public class aw extends ArrayAdapter
{

    private Context a;
    private List b;

    public aw(Context context, List list)
    {
        super(context, 0x7f03008d);
        b = list;
        a = context;
    }

    private String a(String s)
    {
        String s1;
        String s2;
        if (!bq.a(s) && s.contains(".tif"))
        {
            s1 = s.replace(".tif", "");
        } else
        {
            s1 = s;
        }
        s2 = s1;
        if (!bq.a(s1))
        {
            s2 = s1;
            if (s.contains(" "))
            {
                s2 = s.replace(" ", "%20");
            }
        }
        return s2;
    }

    public int getCount()
    {
        return b.size();
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        if (view == null)
        {
            viewgroup = new ax(this);
            view = ((LayoutInflater)a.getSystemService("layout_inflater")).inflate(0x7f03008d, null);
            com.jcp.adapters.ax.a(viewgroup, (TextView)view.findViewById(0x7f0e0338));
            com.jcp.adapters.ax.a(viewgroup, (ImageView)view.findViewById(0x7f0e0337));
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ax)view.getTag();
        }
        obj = (Modal)b.get(i);
        com.jcp.adapters.ax.a(viewgroup).setText(((Modal) (obj)).getName().toUpperCase());
        obj = a(((Modal) (obj)).getTitleImage());
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            com.jcp.g.a.a().a(((String) (obj))).b(0x7f02017f).a(ax.b(viewgroup));
        }
        return view;
    }
}
