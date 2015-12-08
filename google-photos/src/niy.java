// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

final class niy extends BaseAdapter
    implements android.view.View.OnClickListener, mnc, omb, oor, opp, opr, opv
{

    private static Drawable b;
    private static Drawable c;
    private static Drawable d;
    private static Drawable e;
    nja a;
    private List f;
    private Activity g;
    private LayoutInflater h;
    private mmv i;
    private String j;
    private String k;

    public niy(opd opd1)
    {
        f = new ArrayList();
        opd1.a(this);
    }

    private static boolean a(mmx mmx1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (mmx1.a("page_count", 0) > 0)
        {
            flag = flag1;
            if (!mmx1.c("logged_out"))
            {
                flag = true;
            }
        }
        return flag;
    }

    static Drawable c()
    {
        return b;
    }

    static Drawable d()
    {
        return c;
    }

    static Drawable e()
    {
        return d;
    }

    static Drawable f()
    {
        return e;
    }

    private void g()
    {
        List list;
        int l;
        int i1;
        int j1;
        f.clear();
        list = i.a();
        j1 = list.size();
        i1 = 0;
        l = 0;
_L15:
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        Object obj;
        int k1 = ((Integer)list.get(i1)).intValue();
        obj = i.a(k1);
        if (!a(((mmx) (obj))))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((mmx) (obj)).c("gplus_skinny_page")) goto _L4; else goto _L3
_L3:
        i1 = 1;
_L16:
        j = null;
        k = null;
        j1 = 0;
_L20:
        if (j1 >= list.size()) goto _L6; else goto _L5
_L5:
        String s;
        int l1;
        int i2;
        obj = (Integer)list.get(j1);
        obj = i.a(((Integer) (obj)).intValue());
        if (!a(((mmx) (obj))))
        {
            continue; /* Loop/switch isn't completed */
        }
        s = ((mmx) (obj)).b("account_name");
        if (i1 != 0)
        {
            niz niz1 = new niz(this);
            niz1.e = s;
            niz1.f = ((mmx) (obj)).b("display_name");
            niz1.g = ((mmx) (obj)).b("profile_photo_url");
            f.add(niz1);
        }
        i2 = ((mmx) (obj)).a("page_count", 0);
        l1 = 0;
_L14:
        if (l1 >= i2)
        {
            continue; /* Loop/switch isn't completed */
        }
        njb njb1;
        mmx mmx1;
        String s1;
        int j2;
        int k2;
        boolean flag;
        if (i2 == 1)
        {
            l = 0;
        } else
        if (l1 == 0)
        {
            l = 1;
        } else
        if (l1 == i2 - 1)
        {
            l = 3;
        } else
        {
            l = 2;
        }
        mmx1 = ((mmx) (obj)).d("page").d(Integer.toString(l1));
        s1 = mmx1.b("gaia_id");
        j2 = i.b(s, s1);
        if (j2 != -1 && i.a(j2).a())
        {
            j = s;
            k = s1;
            flag = true;
        } else
        {
            flag = false;
        }
        njb1 = new njb(this);
        njb1.a = l;
        njb1.e = s;
        njb1.b = s1;
        njb1.f = mmx1.b("display_name");
        njb1.g = mmx1.b("avatar_url");
        njb1.c = flag;
        if (!flag) goto _L8; else goto _L7
_L7:
        j2 = list.size();
        l = 0;
_L17:
        if (l >= j2) goto _L10; else goto _L9
_L9:
        k2 = ((Integer)list.get(l)).intValue();
        mmx1 = i.a(k2);
        if (mmx1.c("is_managed_account") || !mmx1.a()) goto _L12; else goto _L11
_L11:
        l = 1;
_L18:
        if (l == 0) goto _L8; else goto _L13
_L13:
        flag = true;
_L19:
        njb1.d = flag;
        f.add(njb1);
        l1++;
          goto _L14
_L4:
        l++;
        i1++;
          goto _L15
_L2:
        if (l > 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
          goto _L16
_L12:
        l++;
          goto _L17
_L10:
        l = 0;
          goto _L18
_L8:
        flag = false;
          goto _L19
        j1++;
          goto _L20
_L6:
        notifyDataSetChanged();
        return;
          goto _L16
    }

    public final void a(Activity activity)
    {
        g = activity;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        h = LayoutInflater.from(new ContextThemeWrapper(g, p.bD));
        i = (mmv)olm1.a(mmv);
        if (b == null)
        {
            context = g.getResources();
            b = context.getDrawable(b.Gu);
            c = context.getDrawable(b.Gx);
            d = context.getDrawable(b.Gv);
            e = context.getDrawable(b.Gw);
        }
    }

    public final void al_()
    {
        i.a(this);
        g();
    }

    public final void am_()
    {
        i.b(this);
    }

    public final boolean areAllItemsEnabled()
    {
        return false;
    }

    public final int getCount()
    {
        return f.size();
    }

    public final Object getItem(int l)
    {
        return f.get(l);
    }

    public final long getItemId(int l)
    {
        return (long)l;
    }

    public final int getItemViewType(int l)
    {
        return ((njc)f.get(l)).a();
    }

    public final View getView(int l, View view, ViewGroup viewgroup)
    {
        njc njc1 = (njc)f.get(l);
        View view1 = view;
        if (view == null)
        {
            view1 = njc1.a(h, viewgroup);
        }
        njc1.a(view1, l);
        return view1;
    }

    public final int getViewTypeCount()
    {
        return 2;
    }

    public final boolean isEnabled(int l)
    {
        return false;
    }

    public final void onClick(View view)
    {
        int l = view.getId();
        if (l == aa.O)
        {
            l = ((Integer)view.getTag()).intValue();
            view = (njb)f.get(l);
            if (!TextUtils.equals(j, ((njb) (view)).e) || !TextUtils.equals(k, ((njb) (view)).b))
            {
                a.a(((njb) (view)).e, ((njb) (view)).b);
            }
        } else
        if (l == aa.P)
        {
            int i1 = ((Integer)view.getTag()).intValue();
            view = (njb)f.get(i1);
            a.b(((njb) (view)).e, ((njb) (view)).b);
            return;
        }
    }

    public final void r()
    {
        g();
    }
}
