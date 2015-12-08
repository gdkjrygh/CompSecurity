// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.photos.list.PhotoTileView;
import com.google.android.apps.photos.stories.StoryElementPickerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class iqn extends BaseAdapter
{

    final int a;
    final pex b;
    pev c;
    iui d;
    List e;
    iqs f;
    int g;
    private final Context h;
    private final android.view.View.OnClickListener i;
    private final int j;
    private final iqr k;

    public iqn(Context context, android.view.View.OnClickListener onclicklistener, pex pex, iqr iqr)
    {
        g = -1;
        h = context;
        i = new msj(onclicklistener);
        a = (new nvq(h)).a;
        j = context.getResources().getDimensionPixelOffset(b.Al);
        b = pex;
        k = iqr;
    }

    private int a(ViewGroup viewgroup)
    {
        return (viewgroup.getMeasuredWidth() - j * (a - 1)) / a;
    }

    private void a(ViewGroup viewgroup, iqo iqo1)
    {
        iqo1 = iqo1.c.iterator();
        for (int l = 0; iqo1.hasNext(); l++)
        {
            iqm iqm1 = (iqm)iqo1.next();
            a((StoryElementPickerView)viewgroup.getChildAt(l), iqm1);
        }

    }

    private void a(StoryElementPickerView storyelementpickerview, iqm iqm1)
    {
        iqm1.c;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 506
    //                   2 38;
           goto _L1 _L2 _L3
_L1:
        throw new RuntimeException("Unsupported story element type");
_L3:
        Object obj = iqm1.b;
        if (((peh) (obj)).a == 2)
        {
            storyelementpickerview.a(((peh) (obj)).c.b, true);
            b.a(storyelementpickerview, new msm(pxa.p));
        } else
        if (((peh) (obj)).a == 3)
        {
            int k1 = storyelementpickerview.getLayoutParams().width;
            int i2 = storyelementpickerview.getLayoutParams().height;
            float f1 = h.getResources().getDisplayMetrics().density;
            pev pev1 = c;
            Object obj2 = ((peh) (obj)).d.a;
            obj = ((pgs) (obj2)).a.a;
            Long long1 = ((pgs) (obj2)).b.a;
            obj2 = new ArrayList();
            pep apep[] = pev1.d.a;
            int j2 = apep.length;
            for (int l = 0; l < j2; l++)
            {
                pep pep1 = apep[l];
                if (pep1.b.b.a.longValue() > long1.longValue())
                {
                    break;
                }
                if (pep1.b.a.a.longValue() >= ((Long) (obj)).longValue())
                {
                    ((List) (obj2)).add(pep1);
                }
            }

            obj = new ArrayList();
            if (((List) (obj2)).isEmpty())
            {
                ((List) (obj)).add(b.d(0, 0));
            } else
            {
                ((List) (obj)).add(b.d(((pep)((List) (obj2)).get(0)).a.a.intValue(), ((pep)((List) (obj2)).get(0)).a.b.intValue()));
            }
            if (((List) (obj2)).size() > 1)
            {
                ((List) (obj)).add(b.d(((pep)((List) (obj2)).get(((List) (obj2)).size() - 1)).a.a.intValue(), ((pep)((List) (obj2)).get(((List) (obj2)).size() - 1)).a.b.intValue()));
            }
            storyelementpickerview.a(b.a(((List) (obj)), k1, i2, f1), true);
            b.a(storyelementpickerview, new msm(pxa.o));
        } else
        {
            throw new RuntimeException("Unsupported enrichment type");
        }
_L5:
        storyelementpickerview.setSelected(f.a(iqm1));
        storyelementpickerview.setTag(s.bY, iqm1);
        storyelementpickerview.setOnClickListener(i);
        storyelementpickerview.setVisibility(0);
        return;
_L2:
        Object obj1 = iqm1.a;
        if (((peq) (obj1)).b == 1)
        {
            Object obj3 = ite.a(((peq) (obj1)).d);
            gap gap = ite.a(((peq) (obj1)).d, d, ((mmr)olm.a(h, mmr)).d());
            storyelementpickerview.u.a(gap).a(storyelementpickerview.t.e()).a(storyelementpickerview.B);
            qdz qdz1;
            boolean flag;
            if (((peq) (obj1)).d.e != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            storyelementpickerview.A = flag;
            storyelementpickerview.invalidate();
            qdz1 = ite.b(((peq) (obj1)).d);
            if (qdz1 != null)
            {
                storyelementpickerview.setTag(s.bT, Float.valueOf((float)qdz1.b.longValue() / (float)qdz1.c.longValue()));
            }
            if (gap != null && obj3 != null)
            {
                storyelementpickerview.setTag(s.bR, gap);
                storyelementpickerview.setTag(s.bS, obj3);
                int i1;
                if (euv.a(((njx) (obj3))) == euv.c)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (i1 != 0)
                {
                    i1 = fsd.b;
                } else
                {
                    i1 = fsd.a;
                }
                storyelementpickerview.h = i1;
                obj3 = k;
                if (storyelementpickerview.y == null)
                {
                    storyelementpickerview.y = new fqj(StoryElementPickerView.s, storyelementpickerview, null);
                }
                storyelementpickerview.z = ((iqr) (obj3));
                storyelementpickerview.invalidate();
                obj3 = d.a(((peq) (obj1)).d.a);
                if (obj3 == null)
                {
                    obj1 = new ogv(pwt.y, new ogw[] {
                        ogw.a(1, ((peq) (obj1)).d.a)
                    });
                } else
                {
                    obj1 = b.a(h, pwt.y, ((ekp) (obj3)));
                }
                b.a(storyelementpickerview, ((msm) (obj1)));
            }
        } else
        if (((peq) (obj1)).b == 2)
        {
            int j1 = storyelementpickerview.getLayoutParams().width;
            int l1 = storyelementpickerview.getLayoutParams().height;
            float f2 = h.getResources().getDisplayMetrics().density;
            storyelementpickerview.a(b.a(b.a(((peq) (obj1)).e.a, false), j1, l1, f2), true);
            b.a(storyelementpickerview, new msm(pxa.q));
        } else
        {
            throw new RuntimeException("Unsupported moment type");
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private iqo b(int l)
    {
        return (iqo)e.get(l);
    }

    int a(int l)
    {
        int i1 = l;
        if (e != null)
        {
            i1 = l;
            if (l > 0)
            {
                i1 = l;
                if (l < e.size())
                {
                    i1 = l;
                    if (((iqo)e.get(l)).a != 0)
                    {
                        i1 = l;
                        if (((iqo)e.get(l - 1)).a == 0)
                        {
                            i1 = l - 1;
                        }
                    }
                }
            }
        }
        return i1;
    }

    public final int getCount()
    {
        if (e == null)
        {
            return 0;
        } else
        {
            return e.size();
        }
    }

    public final Object getItem(int l)
    {
        return b(l);
    }

    public final long getItemId(int l)
    {
        return (long)l;
    }

    public final int getItemViewType(int l)
    {
        return b(l).a;
    }

    public final View getView(int l, View view, ViewGroup viewgroup)
    {
        Object obj;
        if (c == null || f == null)
        {
            return null;
        }
        obj = b(l);
        getItemViewType(l);
        JVM INSTR tableswitch 0 2: default 56
    //                   0 67
    //                   1 100
    //                   2 607;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new RuntimeException("Unrecognized story element row type");
_L2:
        if (view == null)
        {
            view = LayoutInflater.from(h).inflate(b.AP, null);
        }
        ((TextView)view).setText(((iqo) (obj)).b);
        return view;
_L3:
        ViewGroup viewgroup1;
        if (view == null)
        {
            viewgroup1 = (ViewGroup)LayoutInflater.from(h).inflate(b.AR, viewgroup, false);
            view = (StoryElementPickerView)viewgroup1.findViewById(s.bw);
            b.a(view, new msm(pxa.g));
            view.w = true;
            view.invalidate();
        } else
        {
            viewgroup1 = (ViewGroup)view;
        }
        if (viewgroup.getMeasuredWidth() > 0 && viewgroup1.findViewById(s.bw).getLayoutParams().width <= 0)
        {
            l = a(viewgroup);
            view = new android.widget.FrameLayout.LayoutParams(viewgroup.getMeasuredWidth(), l);
            view.bottomMargin = j;
            StoryElementPickerView storyelementpickerview = (StoryElementPickerView)viewgroup1.findViewById(s.bw);
            storyelementpickerview.setLayoutParams(view);
            storyelementpickerview.x = Integer.valueOf(l);
            storyelementpickerview.invalidate();
            ((android.widget.FrameLayout.LayoutParams)viewgroup1.findViewById(s.aT).getLayoutParams()).rightMargin = h.getResources().getDimensionPixelOffset(b.Am) + a(viewgroup);
        }
        view = (iqm)((iqo) (obj)).c.get(0);
        a((StoryElementPickerView)viewgroup1.findViewById(s.bw), view);
        viewgroup = (ImageView)viewgroup1.findViewById(s.aT).findViewById(s.aU);
        if (((iqm) (view)).c != 2 || ((iqm) (view)).b.a != 2) goto _L6; else goto _L5
_L5:
        viewgroup.setImageResource(b.AD);
_L14:
        obj = (TextView)viewgroup1.findViewById(s.aT).findViewById(s.aV);
        ((iqm) (view)).c;
        JVM INSTR tableswitch 1 2: default 400
    //                   1 564
    //                   2 488;
           goto _L7 _L8 _L9
_L7:
        view = null;
_L10:
        viewgroup = view;
        if (view == null)
        {
            viewgroup = "";
        }
        ((TextView) (obj)).setText(viewgroup);
        return viewgroup1;
_L6:
        if (((iqm) (view)).c == 2 && ((iqm) (view)).b.a == 3)
        {
            viewgroup.setImageResource(b.AC);
        } else
        if (((iqm) (view)).c == 1 && ((iqm) (view)).a.b == 2)
        {
            viewgroup.setImageResource(b.AD);
        }
        continue; /* Loop/switch isn't completed */
_L9:
        view = ((iqm) (view)).b;
        if (((peh) (view)).a != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        view = ((peh) (view)).c.a;
          goto _L10
        if (((peh) (view)).a != 3) goto _L7; else goto _L11
_L11:
        if (((peh) (view)).d.b != null && ((peh) (view)).d.b.a != null)
        {
            view = ((peh) (view)).d.b.a;
        } else
        {
            view = "";
        }
          goto _L10
_L8:
        if (((peq) (view = ((iqm) (view)).a)).b != 2 || ((peq) (view)).e.a.a == null) goto _L7; else goto _L12
_L12:
        view = ((peq) (view)).e.a.a.c;
          goto _L10
_L4:
        if (view == null)
        {
            ViewGroup viewgroup2 = (ViewGroup)LayoutInflater.from(h).inflate(b.AQ, viewgroup, false);
            viewgroup2.setOnClickListener(null);
            l = 0;
            do
            {
                view = viewgroup2;
                if (l >= a)
                {
                    break;
                }
                viewgroup2.addView(LayoutInflater.from(h).inflate(b.AS, viewgroup2, false));
                l++;
            } while (true);
        } else
        {
            view = (ViewGroup)view;
        }
        for (l = 0; l < a; l++)
        {
            view.getChildAt(l).setVisibility(8);
        }

        if (viewgroup.getMeasuredWidth() > 0 && view.getChildAt(0).getLayoutParams().width <= 0)
        {
            int k1 = a(viewgroup);
            int l1 = viewgroup.getMeasuredWidth() - a * k1 - (a - 1) * j;
            l = 0;
            while (l < a) 
            {
                int i1;
                int j1;
                if (l < l1)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (l < l1)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                viewgroup = new android.widget.LinearLayout.LayoutParams(k1 + i1, j1 + k1);
                if (l == a - 1)
                {
                    i1 = 0;
                } else
                {
                    i1 = j;
                }
                viewgroup.rightMargin = i1;
                viewgroup.bottomMargin = j;
                view.getChildAt(l).setLayoutParams(viewgroup);
                l++;
            }
        }
        a(view, ((iqo) (obj)));
        return view;
        if (true) goto _L14; else goto _L13
_L13:
    }

    public final int getViewTypeCount()
    {
        return 3;
    }
}
