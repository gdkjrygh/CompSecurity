// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.photos.stories.StoryElementPickerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class ini extends omp
    implements android.view.View.OnClickListener, ca, iqr, moy, mti, mus
{

    private int a;
    private boolean ag;
    private dhk ah;
    private dif ai;
    private iqn b;
    private iqs c;
    private ListView d;
    private boolean e;
    private int f;
    private aav g;
    private mmr h;

    public ini()
    {
        a = 0;
        ai = new inj(this);
        new mut(af, this);
        (new msi(pxa.d)).a(ae);
        (new hzg(af)).a(ae);
    }

    static aav a(ini ini1, aav aav1)
    {
        ini1.g = aav1;
        return aav1;
    }

    static iqs a(ini ini1)
    {
        return ini1.c;
    }

    static void a(ini ini1, boolean flag)
    {
        Intent intent = new Intent();
        intent.putExtra("element_selection", ini1.c);
        ar ar1 = ini1.O_();
        byte byte0;
        if (flag)
        {
            byte0 = -1;
        } else
        {
            byte0 = 0;
        }
        ar1.setResult(byte0, intent);
        ini1.O_().finish();
    }

    static dhk b(ini ini1)
    {
        return ini1.ah;
    }

    static Rect c(ini ini1)
    {
        return ini1.u();
    }

    private boolean t()
    {
        return b == null || b.getCount() == 0;
    }

    private Rect u()
    {
        int ai1[] = new int[2];
        super.R.getLocationOnScreen(ai1);
        return new Rect(ai1[0], ai1[1], ai1[0] + super.R.getWidth(), ai1[1] + super.R.getHeight());
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = null;
        viewgroup = LayoutInflater.from(ad).inflate(b.AH, null);
        if (super.q.getParcelable("story_element_ref") != null)
        {
            layoutinflater = (pex)((mvf)super.q.getParcelable("story_element_ref")).a(new pex());
        }
        b = new iqn(ad, this, layoutinflater, this);
        d = (ListView)viewgroup.findViewById(s.bx);
        d.setAdapter(b);
        return viewgroup;
    }

    public final ei a(int i, Bundle bundle)
    {
        bundle = super.q.getParcelableArray("story_render_sizes");
        bundle = (android.graphics.Point[])Arrays.copyOf(bundle, bundle.length, [Landroid/graphics/Point;);
        return new isz(ad, (iul)ae.a(iul), h.d(), (iuj)super.q.getParcelable("story_ref"), null, null, true, true, bundle, (ekq)super.q.getParcelable("story_media_collection"), null, false);
    }

    public final void a(int i, int j, Intent intent)
    {
        if (i == 0)
        {
            ag = false;
            intent = O_().c();
            am am1 = intent.a("fullscreen");
            if (am1 != null)
            {
                intent.a().a(am1).b();
            }
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ((mtj)ae.a(mtj)).a(this);
        k().a(0, null, this);
        if (bundle != null)
        {
            a = bundle.getInt("story_load");
            c = (iqs)bundle.getParcelable("story_element_selection");
            e = bundle.getBoolean("restored_position", false);
            f = bundle.getInt("num_items_prev", -1);
            ag = bundle.getBoolean("showing_fullscreen", false);
        }
    }

    public final void a(StoryElementPickerView storyelementpickerview)
    {
        gap gap1 = (gap)storyelementpickerview.getTag(s.bR);
        njx njx1 = (njx)storyelementpickerview.getTag(s.bS);
        if (gap1 != null && njx1 != null)
        {
            ag = true;
            int ai1[] = new int[2];
            storyelementpickerview.getLocationOnScreen(ai1);
            Rect rect = new Rect(ai1[0], ai1[1], ai1[0] + storyelementpickerview.getWidth(), ai1[1] + storyelementpickerview.getHeight());
            super.R.getLocationOnScreen(ai1);
            storyelementpickerview = imz.a(rect, gap1, u(), ((Float)storyelementpickerview.getTag(s.bT)).floatValue(), h.d());
            storyelementpickerview.a(this, 0);
            O_().c().a().a(s.bA, storyelementpickerview, "fullscreen").a(null).b();
        }
    }

    public final void a(ei ei, Object obj)
    {
        obj = (iug)obj;
        if (obj == null || ((iug) (obj)).a == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        boolean flag;
        if (c == null)
        {
            c = new iqs();
        }
        b.f = c;
        obj1 = b;
        flag = false;
        if (((iqn) (obj1)).c == ((iug) (obj)).a) goto _L4; else goto _L3
_L3:
        obj1.c = ((iug) (obj)).a;
        if (((iqn) (obj1)).c != null) goto _L6; else goto _L5
_L5:
        ((iqn) (obj1)).e.clear();
        obj1.g = -1;
        if (((iqn) (obj1)).f != null)
        {
            ((iqn) (obj1)).f.a(0);
        }
_L19:
        flag = true;
_L4:
        Object obj2;
        Object obj3;
        int j;
        int k;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        if (((iug) (obj)).b != null && !((iug) (obj)).b.equals(((iqn) (obj1)).d))
        {
            obj1.d = ((iug) (obj)).b;
            k = 1;
        } else
        {
            k = 0;
        }
        if (flag || k != 0)
        {
            ((iqn) (obj1)).notifyDataSetChanged();
        }
        if (g != null)
        {
            int i = c.d;
            ei = g().getQuantityString(b.AU, i, new Object[] {
                Integer.valueOf(i)
            });
            ((TextView)g.i()).setText(ei);
        }
        if (d == null || b.g < 0 || e) goto _L8; else goto _L7
_L7:
        e = true;
        ei = d;
        j = b.g;
_L15:
        ei.setSelection(j);
_L14:
        super.R.findViewById(0x1020004).setVisibility(8);
        if (ag && super.R != null)
        {
            super.R.post(new ink(this));
        }
_L17:
        return;
_L6:
        j = 0;
        i1 = 0;
        obj2 = new iqp(((iqn) (obj1)).a);
        for (k1 = 0; k1 < ((iqn) (obj1)).c.e.length; k1++)
        {
            if (((iqn) (obj1)).c.e[k1].b != null && ((iqn) (obj1)).c.e[k1].b.a != null)
            {
                ei = ((iqn) (obj1)).c.e[k1].b.a;
            } else
            {
                ei = "";
            }
            ((iqp) (obj2)).a();
            ((iqp) (obj2)).b.add(new iqo(ei));
            for (l1 = 0; l1 < ((iqn) (obj1)).c.e[k1].a.length;)
            {
                k = i1;
                if (((iqn) (obj1)).c.e[k1].a[l1].b != null)
                {
                    ei = ((iqn) (obj1)).c.e[k1].a[l1].b;
                    i2 = ei.length;
                    j1 = 0;
                    do
                    {
                        k = i1;
                        if (j1 >= i2)
                        {
                            break;
                        }
                        obj3 = ei[j1];
                        k = i1;
                        if (ite.a(((peh) (obj3))))
                        {
                            obj3 = new iqm(((peh) (obj3)), k1, l1);
                            ((iqp) (obj2)).a(((iqm) (obj3)));
                            k = i1;
                            if (((iqn) (obj1)).f.a(((iqm) (obj3))))
                            {
                                k = i1 + 1;
                            }
                        }
                        j1++;
                        i1 = k;
                    } while (true);
                }
                j1 = k;
                i1 = j;
                if (((iqn) (obj1)).c.e[k1].a[l1].a != null)
                {
                    ei = ((iqn) (obj1)).c.e[k1].a[l1].a;
                    j2 = ei.length;
                    i2 = 0;
                    do
                    {
                        j1 = k;
                        i1 = j;
                        if (i2 >= j2)
                        {
                            break;
                        }
                        obj3 = ei[i2];
                        i1 = k;
                        j1 = j;
                        if (ite.b(((peq) (obj3))))
                        {
                            obj3 = new iqm(((peq) (obj3)));
                            ((iqp) (obj2)).a(((iqm) (obj3)));
                            i1 = k;
                            j1 = j;
                            if (((iqn) (obj1)).f.a(((iqm) (obj3))))
                            {
                                k++;
                                i1 = k;
                                j1 = j;
                                if (((iqm) (obj3)).b())
                                {
                                    j1 = j + 1;
                                    i1 = k;
                                }
                            }
                        }
                        i2++;
                        k = i1;
                        j = j1;
                    } while (true);
                }
                l1++;
                j = i1;
                i1 = j1;
            }

        }

        ((iqp) (obj2)).a();
        obj1.e = ((iqp) (obj2)).a;
        if (((iqn) (obj1)).f != null)
        {
            ((iqn) (obj1)).f.a(j);
            ((iqn) (obj1)).f.d = i1;
        }
        if (((iqn) (obj1)).b == null)
        {
            break MISSING_BLOCK_LABEL_997;
        }
        ei = ((iqn) (obj1)).e.iterator();
        j = -1;
_L10:
        do
        {
            if (!ei.hasNext())
            {
                break MISSING_BLOCK_LABEL_982;
            }
            obj2 = (iqo)ei.next();
            k = j + 1;
            j = k;
        } while (((iqo) (obj2)).c == null);
        obj2 = ((iqo) (obj2)).c.iterator();
_L12:
        j = k;
        if (!((Iterator) (obj2)).hasNext()) goto _L10; else goto _L9
_L9:
        obj3 = (iqm)((Iterator) (obj2)).next();
        if (((iqm) (obj3)).c() == null || !qlw.a(((iqm) (obj3)).c().d, ((iqn) (obj1)).b.d) || !qlw.a(((iqm) (obj3)).c().e, ((iqn) (obj1)).b.e)) goto _L12; else goto _L11
_L11:
        obj1.g = k;
        obj1.g = ((iqn) (obj1)).a(((iqn) (obj1)).g);
        continue; /* Loop/switch isn't completed */
        obj1.g = 0;
        continue; /* Loop/switch isn't completed */
_L8:
        if (f < 0) goto _L14; else goto _L13
_L13:
        ei = d;
        obj = b;
        j1 = f;
        if (((iqn) (obj)).e == null)
        {
            j = 0;
        } else
        {
            k = 0;
            i1 = 0;
            do
            {
                if (k >= ((iqn) (obj)).e.size())
                {
                    break;
                }
                obj1 = (iqo)((iqn) (obj)).e.get(k);
                if (((iqo) (obj1)).a == 1)
                {
                    j = 1;
                } else
                if (((iqo) (obj1)).c == null)
                {
                    j = 0;
                } else
                {
                    j = ((iqo) (obj1)).c.size();
                }
                i1 = j + i1;
                if (i1 > j1)
                {
                    break;
                }
                k++;
            } while (true);
            j = ((iqn) (obj)).a(Math.min(k, ((iqn) (obj)).e.size() - 1));
        }
          goto _L15
_L2:
        a = 1;
        obj = super.R;
        ei = a(q.bc);
        if (!t()) goto _L17; else goto _L16
_L16:
        obj = ((View) (obj)).findViewById(0x1020004);
        ((View) (obj)).setVisibility(0);
        obj1 = (TextView)((View) (obj)).findViewById(s.bb);
        ((TextView) (obj1)).setText(ei);
        ((TextView) (obj1)).setVisibility(0);
        ((View) (obj)).findViewById(s.ba).setVisibility(8);
        return;
        if (true) goto _L19; else goto _L18
_L18:
    }

    public final void a(String s1, mue mue, mua mua)
    {
        if (mue != null && s1 != null && O_() != null)
        {
            if (!O_().isFinishing());
        }
    }

    public final void a(moz moz1)
    {
        moz1.a("");
    }

    public final void a(rv rv)
    {
        b.a(rv, true);
    }

    public final boolean a(MenuItem menuitem)
    {
        return false;
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        h = (mmr)ae.a(mmr);
        ah = (dhk)ae.a(dhk);
    }

    public final void e(Bundle bundle)
    {
        boolean flag = false;
        super.e(bundle);
        bundle.putInt("story_load", a);
        bundle.putParcelable("story_element_selection", c);
        bundle.putBoolean("restored_position", e);
        if (b != null && d != null)
        {
            iqn iqn1 = b;
            int i1 = d.getFirstVisiblePosition();
            int i = ((flag) ? 1 : 0);
            if (iqn1.e != null)
            {
                i = ((flag) ? 1 : 0);
                if (i1 >= 0)
                {
                    if (i1 >= iqn1.e.size())
                    {
                        i = ((flag) ? 1 : 0);
                    } else
                    {
                        int k = 0;
                        i = 0;
                        while (k < i1) 
                        {
                            iqo iqo1 = (iqo)iqn1.e.get(k);
                            int j;
                            if (iqo1.a == 1)
                            {
                                j = 1;
                            } else
                            if (iqo1.c == null)
                            {
                                j = 0;
                            } else
                            {
                                j = iqo1.c.size();
                            }
                            i += j;
                            k++;
                        }
                    }
                }
            }
            bundle.putInt("num_items_prev", i);
        }
        if (ag)
        {
            bundle.putBoolean("showing_fullscreen", ag);
        }
    }

    public final void l()
    {
        super.l();
        if (a != 1) goto _L2; else goto _L1
_L1:
        View view1 = super.R;
        String s1 = a(q.bc);
        if (t())
        {
            view1 = view1.findViewById(0x1020004);
            view1.setVisibility(0);
            TextView textview = (TextView)view1.findViewById(s.bb);
            textview.setText(s1);
            textview.setVisibility(0);
            view1.findViewById(s.ba).setVisibility(8);
        }
_L4:
        ((rz)O_()).a(ai);
        return;
_L2:
        if (t())
        {
            View view = super.R;
            if (t())
            {
                view = view.findViewById(0x1020004);
                view.setVisibility(0);
                view.findViewById(s.bb).setVisibility(8);
                view.findViewById(s.ba).setVisibility(0);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onClick(View view)
    {
        byte byte0 = -1;
        if (view.getId() != s.bw) goto _L2; else goto _L1
_L1:
        iqm iqm1;
        StoryElementPickerView storyelementpickerview;
        iqm1 = (iqm)view.getTag(s.bY);
        storyelementpickerview = (StoryElementPickerView)view;
        if (c == null) goto _L2; else goto _L3
_L3:
        boolean flag;
        iqs iqs1 = c;
        int i;
        if (!storyelementpickerview.v)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (iqs1.e && !flag && iqm1.b() && iqs1.c - 1 < 5)
        {
            i = 0;
        } else
        {
            iqu iqu1 = new iqu(iqm1.c());
            if (iqm1.a())
            {
                view = iqs1.b;
            } else
            {
                view = iqs1.a;
            }
            if (iqm1.a() == flag)
            {
                view.remove(iqu1);
            } else
            {
                view.add(iqu1);
            }
            if (iqm1.b())
            {
                int j = iqs1.c;
                if (flag)
                {
                    i = 1;
                } else
                {
                    i = -1;
                }
                iqs1.c = i + j;
            }
            j = iqs1.d;
            i = byte0;
            if (flag)
            {
                i = 1;
            }
            iqs1.d = j + i;
            i = 1;
        }
        if (i == 0) goto _L5; else goto _L4
_L4:
        if (!storyelementpickerview.v)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        storyelementpickerview.v = flag;
        storyelementpickerview.invalidate();
        i = c.d;
        view = g().getQuantityString(b.AU, i, new Object[] {
            Integer.valueOf(i)
        });
        ((TextView)g.i()).setText(view);
_L2:
        return;
_L5:
        oio.a(null, g().getQuantityString(b.AW, 5, new Object[] {
            Integer.valueOf(5)
        }), a(q.aH), null).a(super.B, "dialog_alert");
        return;
    }

    public final boolean r()
    {
        boolean flag = false;
        if (ag)
        {
            ag = false;
            ((imz)O_().c().a("fullscreen")).r();
            flag = true;
        }
        return flag;
    }
}
