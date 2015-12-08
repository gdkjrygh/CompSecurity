// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.kik.android.a;
import com.kik.cache.ContactImageView;
import com.kik.cache.ad;
import com.kik.m.d;
import java.util.List;
import kik.a.d.aa;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.e.r;
import kik.a.e.w;
import kik.android.util.ao;
import kik.android.util.cq;
import kik.android.widget.RobotoTextView;

// Referenced classes of package kik.android.chat.fragment:
//            ad, av, au, aw

public final class at extends kik.android.chat.fragment.ad
{

    private List d;
    private w e;
    private r f;
    private ao g;
    private k h;
    private boolean i;
    private a j;
    private boolean k;

    public at(k k1, List list, w w1, ad ad1, ao ao, int l, int i1, 
            boolean flag, r r, a a1)
    {
        super(ad1, l, i1);
        h = k1;
        d = list;
        e = w1;
        g = ao;
        k = flag;
        i = false;
        j = a1;
        f = r;
    }

    static ao a(at at1)
    {
        return at1.g;
    }

    public final void a(List list, int l, int i1, boolean flag)
    {
        d = list;
        k = flag;
        super.a(l, i1);
    }

    public final boolean areAllItemsEnabled()
    {
        return false;
    }

    protected final boolean b()
    {
        boolean flag;
        if (d.size() >= 49)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return !flag;
    }

    protected final boolean c()
    {
        return true;
    }

    public final int getCount()
    {
        int i1 = d.size();
        int l = i1;
        if (b())
        {
            l = i1 + 1;
        }
        return (int)Math.ceil((double)(l + 1) / (double)b);
    }

    public final Object getItem(int l)
    {
        return d.get(l);
    }

    public final long getItemId(int l)
    {
        return (long)l;
    }

    public final View getView(int l, View view, ViewGroup viewgroup)
    {
        int i1;
        if (view == null || ((ad.b)view.getTag()).a.length != b)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            view = new LinearLayout(viewgroup.getContext());
            view.setOrientation(0);
            view.setGravity(1);
            view.setPadding(c, 0, c, 0);
            ad.b b1 = new ad.b(this);
            for (i1 = 0; i1 < b; i1++)
            {
                View view1 = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030024, viewgroup, false);
                ad.a a2 = new ad.a(this);
                a2.a = (ContactImageView)view1.findViewById(0x7f0e00c6);
                a2.b = (RobotoTextView)view1.findViewById(0x7f0e00c8);
                a2.c = (ImageView)view1.findViewById(0x7f0e00c7);
                a2.e = (FrameLayout)view1.findViewById(0x7f0e00c5);
                view.addView(view1);
                view1.setPadding(c, view1.getPaddingTop(), c, view1.getPaddingBottom());
                a2.d = view1;
                b1.a[i1] = a2;
            }

            view.setTag(b1);
        }
        int i2;
        int j2;
        if (b())
        {
            i2 = 0;
        } else
        {
            i2 = -1;
        }
        viewgroup = (ad.b)view.getTag();
        j2 = 0;
        while (j2 < b) 
        {
            int j1 = b * l + j2;
            if (!d.isEmpty() || k)
            {
                view.setVisibility(0);
                ad.a a1 = viewgroup.a(j2);
                if (b() && j1 == i2)
                {
                    if (a1 != null && a1.d != null)
                    {
                        a1.d.setVisibility(0);
                        a1.a.e(0x7f020035);
                        a1.a.a(null, a, false, f, j);
                        a1.c.setVisibility(8);
                        a1.e.setForeground(a1.d.getResources().getDrawable(0x7f020134));
                        a1.b.setText(0x7f09028a);
                        a1.d.setOnClickListener(new av(this));
                        com.kik.m.d.a(a1.d, "AUTOMATION_CHAT_INFO_GROUP_MEMBER_ADD");
                    }
                } else
                if (j1 == i2 + 1)
                {
                    if (a1 != null && a1.d != null)
                    {
                        a1.d.setVisibility(0);
                        a1.e.setForeground(a1.d.getResources().getDrawable(0x7f020069));
                        a1.a.e(0x7f020305);
                        a1.a.a(e.d(), a);
                        a1.d.setOnClickListener(new au(this));
                        a1.b.setTypeface(null, 2);
                        boolean flag2 = i;
                        boolean flag1 = flag2;
                        if (!i)
                        {
                            flag1 = flag2;
                            if (h != null)
                            {
                                if (h.t() && ((n)h).A())
                                {
                                    flag1 = true;
                                } else
                                {
                                    flag1 = false;
                                }
                            }
                        }
                        if (flag1)
                        {
                            a1.c.setImageResource(0x7f020003);
                            a1.c.setVisibility(0);
                        } else
                        {
                            a1.c.setVisibility(8);
                        }
                        a1.b.setText(0x7f090327);
                        if (e.d().c != null)
                        {
                            com.kik.m.d.a(a1.d, (new StringBuilder("AUTOMATION_CHAT_INFO_GROUP_MEMBER_")).append(e.d().c.toUpperCase()).toString());
                        }
                    }
                } else
                {
                    j1 -= a();
                    if (j1 < d.size())
                    {
                        k k1 = (k)d.get(j1);
                        if (a1 != null && a1.d != null)
                        {
                            a1.d.setVisibility(0);
                            a1.e.setForeground(a1.d.getResources().getDrawable(0x7f020069));
                            a1.a.e(0x7f020305);
                            a1.a.a(k1, a, false, f, j);
                            a1.b.setText(cq.a(k1));
                            a1.d.setOnClickListener(new aw(this, k1));
                            int l1 = 0;
                            if (h != null)
                            {
                                ImageView imageview;
                                boolean flag;
                                if (h.t() && ((n)h).d(k1))
                                {
                                    l1 = 1;
                                } else
                                {
                                    l1 = 0;
                                }
                                a1.c.setImageResource(0x7f020003);
                            }
                            flag = l1;
                            if (l1 == 0)
                            {
                                flag = l1;
                                if (k1.i())
                                {
                                    flag = true;
                                    a1.c.setImageResource(0x7f020094);
                                }
                            }
                            imageview = a1.c;
                            if (flag)
                            {
                                l1 = 0;
                            } else
                            {
                                l1 = 8;
                            }
                            imageview.setVisibility(l1);
                            com.kik.m.d.a(a1.d, (new StringBuilder("AUTOMATION_CHAT_INFO_GROUP_MEMBER_")).append(k1.e().toUpperCase()).toString());
                        }
                    } else
                    {
                        a1.d.setVisibility(4);
                    }
                }
            } else
            {
                view.setVisibility(8);
            }
            j2++;
        }
        return view;
    }

    public final boolean isEmpty()
    {
        return false;
    }

    public final boolean isEnabled(int l)
    {
        return false;
    }
}
