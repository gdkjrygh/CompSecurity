// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.kik.cache.ContactImageView;
import com.kik.cache.ad;
import com.kik.cache.av;
import java.util.List;
import kik.a.d.l;
import kik.a.d.m;
import kik.android.widget.RobotoTextView;

// Referenced classes of package kik.android.chat.fragment:
//            ad

public final class as extends kik.android.chat.fragment.ad
{

    private m d;

    public as(m m1, ad ad1, int i, int j)
    {
        super(ad1, i, j);
        d = m1;
    }

    public final void a(m m1, int i, int j)
    {
        d = m1;
        super.a(i, j);
    }

    public final boolean areAllItemsEnabled()
    {
        return false;
    }

    protected final boolean b()
    {
        return false;
    }

    protected final boolean c()
    {
        return false;
    }

    public final int getCount()
    {
        return (int)Math.ceil((double)d.d().size() / (double)b);
    }

    public final Object getItem(int i)
    {
        return d.d().get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        int j;
        if (view == null || ((ad.b)view.getTag()).a.length != b)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0)
        {
            view = new LinearLayout(viewgroup.getContext());
            view.setOrientation(0);
            view.setGravity(1);
            view.setPadding(c, 0, c, 0);
            ad.b b1 = new ad.b(this);
            for (j = 0; j < b; j++)
            {
                View view1 = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030024, viewgroup, false);
                ad.a a1 = new ad.a(this);
                a1.a = (ContactImageView)view1.findViewById(0x7f0e00c6);
                a1.b = (RobotoTextView)view1.findViewById(0x7f0e00c8);
                a1.c = (ImageView)view1.findViewById(0x7f0e00c7);
                a1.e = (FrameLayout)view1.findViewById(0x7f0e00c5);
                view.addView(view1);
                view1.setPadding(c, view1.getPaddingTop(), c, view1.getPaddingBottom());
                a1.d = view1;
                b1.a[j] = a1;
            }

            view.setTag(b1);
        }
        viewgroup = (ad.b)view.getTag();
        j = 0;
        while (j < b) 
        {
            int k = b * i + j;
            view.setVisibility(0);
            Object obj = viewgroup.a(j);
            if (k < d.d().size())
            {
                l l1 = (l)d.d().get(k);
                if (obj != null && ((ad.a) (obj)).d != null)
                {
                    ((ad.a) (obj)).d.setVisibility(0);
                    ((ad.a) (obj)).a.e(0x7f020305);
                    ((ad.a) (obj)).e.setForeground(null);
                    av av1 = av.a(l1.b(), ((ad.a) (obj)).a.getMeasuredWidth(), ((ad.a) (obj)).a.getMeasuredHeight());
                    ((ad.a) (obj)).a.a(av1, a);
                    ((ad.a) (obj)).b.setText(l1.a());
                    obj = ((ad.a) (obj)).c;
                    int i1;
                    if (l1.c())
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = 8;
                    }
                    ((ImageView) (obj)).setVisibility(i1);
                }
            } else
            {
                ((ad.a) (obj)).d.setVisibility(4);
            }
            j++;
        }
        return view;
    }

    public final boolean isEnabled(int i)
    {
        return false;
    }
}
