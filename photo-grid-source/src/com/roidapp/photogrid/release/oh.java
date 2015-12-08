// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.a.c.d;

// Referenced classes of package com.roidapp.photogrid.release:
//            oa, og, ih

final class oh extends BaseAdapter
{

    og a;
    final oa b;
    private LayoutInflater c;

    public oh(oa oa1, Context context)
    {
        b = oa1;
        super();
        c = LayoutInflater.from(context);
    }

    public final int getCount()
    {
        if (oa.a(b))
        {
            return 2;
        }
        if (oa.e(b))
        {
            return !d.a() ? 3 : 4;
        }
        if (!oa.g(b) && !oa.h(b) || b.b() && !oa.h(b))
        {
            return oa.i(b).length + 1;
        } else
        {
            return oa.i(b).length;
        }
    }

    public final Object getItem(int i)
    {
        return null;
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
            view1 = c.inflate(0x7f0300fc, viewgroup, false);
        }
        if (view1.getTag() != null)
        {
            a = (og)view1.getTag();
        } else
        {
            a = new og();
            a.a = (TextView)view1.findViewById(0x7f0d03f7);
            a.b = (ImageView)view1.findViewById(0x7f0d03f9);
            a.c = (ImageView)view1.findViewById(0x7f0d03f8);
            view1.setTag(a);
        }
        if (!oa.a(b) && !oa.e(b))
        {
            if (!oa.g(b) && !oa.h(b) || b.b() && !oa.h(b))
            {
                if (i != 0)
                {
                    int j = oa.i(b).length;
                    if (j >= 5)
                    {
                        if (i == 5 && ih.C().u() == 0)
                        {
                            a.a.setText((new StringBuilder()).append(oa.i(b)[i - 1]).append("P").toString());
                            a.b.setImageResource(0x7f0203ac);
                            a.b.setVisibility(0);
                            return view1;
                        } else
                        {
                            a.a.setText((new StringBuilder()).append(oa.i(b)[i - 1]).append("P").toString());
                            a.b.setVisibility(8);
                            return view1;
                        }
                    }
                    if (i == j && ih.C().u() == 0)
                    {
                        a.a.setText((new StringBuilder()).append(oa.i(b)[i - 1]).append("P").toString());
                        a.b.setImageResource(0x7f0203ac);
                        a.b.setVisibility(0);
                        return view1;
                    } else
                    {
                        a.a.setText((new StringBuilder()).append(oa.i(b)[i - 1]).append("P").toString());
                        a.b.setVisibility(8);
                        return view1;
                    }
                } else
                {
                    a.a.setText(com.roidapp.photogrid.release.oa.d(b).getString(0x7f070269));
                    a.b.setVisibility(8);
                    return view1;
                }
            }
            int k = oa.i(b).length;
            if (k >= 5)
            {
                if (i == 4 && ih.C().u() == 0)
                {
                    a.a.setText((new StringBuilder()).append(oa.i(b)[i]).append("P").toString());
                    a.b.setVisibility(8);
                    return view1;
                } else
                {
                    a.a.setText((new StringBuilder()).append(oa.i(b)[i]).append("P").toString());
                    a.b.setVisibility(8);
                    return view1;
                }
            }
            if (i == k - 1 && ih.C().u() == 0)
            {
                a.a.setText((new StringBuilder()).append(oa.i(b)[i]).append("P").toString());
                a.b.setVisibility(8);
                return view1;
            } else
            {
                a.a.setText((new StringBuilder()).append(oa.i(b)[i]).append("P").toString());
                a.b.setVisibility(8);
                return view1;
            }
        }
        if (oa.e(b))
        {
            switch (i)
            {
            default:
                return view1;

            case 0: // '\0'
                a.a.setText(oa.b(b)[0]);
                return view1;

            case 1: // '\001'
                a.a.setText(oa.b(b)[1]);
                return view1;

            case 2: // '\002'
                a.a.setText(oa.b(b)[2]);
                return view1;

            case 3: // '\003'
                a.a.setText(oa.b(b)[3]);
                break;
            }
            return view1;
        }
        switch (i)
        {
        default:
            return view1;

        case 0: // '\0'
            a.a.setText(oa.b(b)[0]);
            return view1;

        case 1: // '\001'
            a.a.setText(oa.b(b)[1]);
            break;
        }
        return view1;
    }
}
