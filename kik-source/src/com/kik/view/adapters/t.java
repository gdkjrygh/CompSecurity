// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.kik.cache.ContactImageView;
import com.kik.cache.ad;
import com.kik.m.d;
import java.util.List;
import kik.a.d.a.a;
import kik.a.d.a.b;
import kik.a.d.a.g;
import kik.a.d.a.m;
import kik.a.d.f;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.d.s;
import kik.a.e.l;
import kik.a.e.r;
import kik.android.chat.KikApplication;
import kik.android.util.cq;
import kik.android.util.cv;
import kik.android.widget.IconImageView;
import org.c.c;

public final class t extends ArrayAdapter
{
    private static final class a
    {

        ImageView a;
        ImageView b;
        IconImageView c;
        TextView d;
        TextView e;
        ContactImageView f;
        ImageView g;
        TextView h;
        TextView i;
        ImageView j;

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final org.c.b i = org.c.c.a("ConversationsAdapter");
    boolean a;
    private final LayoutInflater b;
    private List c;
    private boolean d;
    private boolean e;
    private final ad f;
    private final com.kik.android.a g;
    private boolean h;
    private final r j;
    private final l k;
    private kik.a.e.n l;

    public t(Context context, List list, ad ad, r r1, l l1, kik.a.e.n n1, com.kik.android.a a1)
    {
        super(context, 0, list);
        a = true;
        d = true;
        e = false;
        h = false;
        c = list;
        b = LayoutInflater.from(context);
        f = ad;
        j = r1;
        k = l1;
        l = n1;
        g = a1;
    }

    public t(Context context, List list, ad ad, r r1, l l1, kik.a.e.n n1, com.kik.android.a a1, 
            byte byte0)
    {
        super(context, 0, list);
        a = true;
        d = true;
        e = false;
        h = false;
        c = list;
        b = LayoutInflater.from(context);
        d = false;
        f = ad;
        j = r1;
        k = l1;
        l = n1;
        g = a1;
    }

    private f a(int i1)
    {
        if (c.size() > i1)
        {
            return (f)c.get(i1);
        } else
        {
            return null;
        }
    }

    public final void a()
    {
        e = true;
    }

    public final void a(List list)
    {
        c = list;
    }

    public final void b()
    {
        h = false;
    }

    public final void c()
    {
        a = false;
    }

    public final int getCount()
    {
        return c.size();
    }

    public final Object getItem(int i1)
    {
        return a(i1);
    }

    public final View getView(int i1, View view, ViewGroup viewgroup)
    {
        a a1;
        View view1;
        Object obj;
        f f1;
        if (view == null)
        {
            view1 = b.inflate(0x7f030070, viewgroup, false);
            a1 = new a((byte)0);
            a1.f = (ContactImageView)view1.findViewById(0x7f0e016e);
            a1.g = (ImageView)view1.findViewById(0x7f0e0170);
            a1.a = (ImageView)view1.findViewById(0x7f0e0175);
            a1.e = (TextView)view1.findViewById(0x7f0e0173);
            a1.d = (TextView)view1.findViewById(0x7f0e0177);
            a1.h = (TextView)view1.findViewById(0x7f0e0171);
            a1.b = (ImageView)view1.findViewById(0x7f0e016f);
            a1.c = (IconImageView)view1.findViewById(0x7f0e0176);
            a1.i = (TextView)view1.findViewById(0x7f0e0174);
            a1.j = (ImageView)view1.findViewById(0x7f0e0178);
            com.kik.m.d.a(a1.j, "AUTOMATION_MUTED_ICON");
            view1.setTag(a1);
        } else
        {
            a1 = (a)view.getTag();
            view1 = view;
        }
        f1 = a(i1);
        view = k.a(f1.b(), false);
        obj = view;
        if (view == null)
        {
            obj = j.a(f1.b(), true);
        }
        if (f1.n())
        {
            a1.j.setVisibility(0);
        } else
        {
            a1.j.setVisibility(8);
        }
        if (f1.h() != null)
        {
            view = cq.a(j.a(f1.h(), true));
            viewgroup = (new StringBuilder(" ")).append(getContext().getString(0x7f090142)).toString();
            a1.e.setText(view);
            a1.i.setText(viewgroup);
        } else
        {
            if ((obj instanceof n) && ((k) (obj)).c() == null)
            {
                view = cq.a((n)obj, j);
            } else
            {
                viewgroup = ((k) (obj)).c();
                view = viewgroup;
                if (viewgroup == null)
                {
                    view = getContext().getString(0x7f090202);
                }
            }
            a1.e.setText(view);
            a1.i.setText("");
        }
        do
        {
            if (!(obj instanceof n))
            {
                a1.f.e(0x7f020305);
            }
            s s1 = f1.e();
            if (s1 != null)
            {
                view = j.a(s1.h(), false);
                a1.h.setText(cq.a(s1.e(), true).a);
                viewgroup = (kik.a.d.a.a)kik.a.d.a.g.a(s1, kik/a/d/a/a);
                Object obj1 = (kik.a.d.a.l)kik.a.d.a.g.a(s1, kik/a/d/a/l);
                m m1 = (m)kik.a.d.a.g.a(s1, kik/a/d/a/m);
                kik.a.d.a.d d1 = (kik.a.d.a.d)kik.a.d.a.g.a(s1, kik/a/d/a/d);
                if (view != null && view.m())
                {
                    a1.d.setText((new StringBuilder()).append("     ").append(getContext().getString(0x7f090056)).append("     ").toString());
                    a1.c.setVisibility(8);
                } else
                if (viewgroup != null)
                {
                    a1.d.setText("");
                    if (viewgroup.a("png-preview") != null)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    if (i1 != 0)
                    {
                        view = viewgroup.a("png-preview");
                        int j1;
                        int k1;
                        boolean flag;
                        boolean flag1;
                        if (view instanceof kik.a.d.d)
                        {
                            view = ((kik.a.d.d)view).b();
                        } else
                        {
                            view = null;
                        }
                        a1.c.a(view, l);
                        if (view != null)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                    } else
                    {
                        flag1 = a1.c.a(viewgroup, l);
                    }
                    if (flag1)
                    {
                        a1.c.setVisibility(0);
                    } else
                    {
                        a1.c.setVisibility(8);
                    }
                } else
                if (obj1 != null)
                {
                    a1.d.setText((new StringBuilder()).append("     ").append(((kik.a.d.a.l) (obj1)).a()).toString());
                    if (!cq.c(((kik.a.d.a.l) (obj1)).b()))
                    {
                        viewgroup = a1.g;
                        if (view != null && view.i())
                        {
                            i1 = 0;
                        } else
                        {
                            i1 = 8;
                        }
                        viewgroup.setVisibility(i1);
                    } else
                    {
                        a1.g.setVisibility(8);
                    }
                } else
                if (m1 != null)
                {
                    a1.d.setText((new StringBuilder()).append("     ").append(m1.a()).toString());
                } else
                if (d1 != null && d1.g())
                {
                    a1.d.setText((new StringBuilder()).append("     ").append(d1.e()).toString());
                    cv.e(new View[] {
                        a1.c
                    });
                } else
                {
                    flag = false;
                    a1.c.setImageBitmap(null);
                    a1.c.setVisibility(8);
                    view = s1.a();
                    viewgroup = (b)kik.a.d.a.g.a(s1, kik/a/d/a/b);
                    if (viewgroup != null)
                    {
                        if (viewgroup.a() == 1)
                        {
                            view = getContext().getString(0x7f09015e);
                        } else
                        {
                            view = getContext().getString(0x7f09015d, new Object[] {
                                Integer.valueOf(viewgroup.a())
                            });
                        }
                    }
                    if (view != null)
                    {
                        i1 = -1;
                        k1 = 0;
                        do
                        {
                            j1 = i1;
                            if (k1 >= 10)
                            {
                                break;
                            }
                            i1 = view.indexOf(' ', i1 + 1);
                            j1 = i1;
                            if (i1 == -1)
                            {
                                break;
                            }
                            k1++;
                        } while (true);
                        viewgroup = view;
                        i1 = ((flag) ? 1 : 0);
                        if (j1 != -1)
                        {
                            i1 = 1;
                            viewgroup = view.substring(0, j1);
                        }
                        if (viewgroup.length() > 60)
                        {
                            viewgroup = viewgroup.substring(0, 60);
                            i1 = 1;
                        }
                        view = viewgroup;
                        if (i1 != 0)
                        {
                            view = viewgroup.concat("...");
                        }
                    } else
                    {
                        view = "";
                    }
                    viewgroup = null;
                    obj1 = (kik.a.f.e.k)kik.a.d.a.g.a(s1, kik/a/f/e/k);
                    if (obj1 != null)
                    {
                        viewgroup = ((kik.a.f.e.k) (obj1)).b();
                    }
                    view = com.kik.android.c.f.a(a1.d.getContext(), view, viewgroup, KikApplication.b(a1.d.getLineHeight()), true, null);
                    view = (new SpannableStringBuilder("     ")).append(view).append("     ");
                    a1.d.setText(view);
                }
            } else
            {
                a1.h.setText("");
                a1.d.setText("");
                a1.c.setImageBitmap(null);
                a1.c.setVisibility(8);
            }
            if (a1.b != null)
            {
                if (f1.a(j) && d)
                {
                    a1.b.setVisibility(0);
                } else
                {
                    a1.b.setVisibility(4);
                }
            }
            a1.f.a(((k) (obj)), f, e, h, false, j, g);
            view = a1.g;
            if (!(obj instanceof n) && ((k) (obj)).i())
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            view.setVisibility(i1);
            if (s1 == null)
            {
                a1.a.setVisibility(4);
                return view1;
            }
            if (!s1.d())
            {
                a1.a.setVisibility(0);
                a1.a.setImageResource(0x7f070057);
                return view1;
            }
            a1.a.setVisibility(0);
            switch (f1.d().c())
            {
            default:
                a1.a.setImageDrawable(getContext().getResources().getDrawable(0x7f070039));
                return view1;

            case 200: 
                a1.a.setImageDrawable(getContext().getResources().getDrawable(0x7f07003d));
                return view1;

            case 500: 
                a1.a.setImageDrawable(getContext().getResources().getDrawable(0x7f07003c));
                return view1;

            case 300: 
                a1.a.setImageDrawable(getContext().getResources().getDrawable(0x7f07003b));
                return view1;

            case 400: 
                a1.a.setImageDrawable(getContext().getResources().getDrawable(0x7f070038));
                return view1;

            case 600: 
                a1.a.setImageDrawable(getContext().getResources().getDrawable(0x7f07003a));
                return view1;

            case -100: 
                a1.a.setImageDrawable(getContext().getResources().getDrawable(0x7f07003a));
                return view1;
                break;
            }
        } while (true);
    }

    public final boolean hasStableIds()
    {
        return true;
    }

    public final boolean isEmpty()
    {
        return super.isEmpty() && a;
    }

}
