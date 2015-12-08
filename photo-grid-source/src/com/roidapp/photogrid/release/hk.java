// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import com.roidapp.photogrid.video.HorizontalProgressViewEx;
import com.roidapp.photogrid.video.HorizontalScrollViewEx;
import com.roidapp.photogrid.video.ScrollImageViewEx;
import com.roidapp.photogrid.video.e;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, ng, hl, hm, 
//            hn, ho, hp, hq

public class hk extends Fragment
    implements android.widget.AdapterView.OnItemClickListener, e
{

    public static final String a = com/roidapp/photogrid/release/hk.getSimpleName();
    protected ng b;
    protected LayoutInflater c;
    protected PhotoGridActivity d;
    int e;
    int f;
    boolean g;
    private HorizontalScrollViewEx h;
    private ScrollImageViewEx i;
    private HorizontalProgressViewEx j;
    private int k;

    public hk()
    {
        c = null;
        h = null;
        i = null;
        j = null;
        e = 0;
        f = 0;
        g = false;
    }

    static int a(hk hk1)
    {
        return hk1.k;
    }

    static HorizontalScrollViewEx b(hk hk1)
    {
        return hk1.h;
    }

    static ScrollImageViewEx c(hk hk1)
    {
        return hk1.i;
    }

    public final void a(int l, int i1)
    {
        if (i1 != 0)
        {
            i1 = (l << 10) / i1;
            if (h != null && h.a() != null)
            {
                if (e == 0)
                {
                    e = h.a().getWidth() - h.getWidth();
                }
                if (e > 0)
                {
                    h.b(e * i1 >> 10);
                    f = 0;
                } else
                {
                    f = i1;
                }
                if (i != null && i.a() == 0)
                {
                    ScrollImageViewEx scrollimageviewex = i;
                    if (h.a().getWidth() > h.getWidth())
                    {
                        l = h.getWidth();
                    } else
                    {
                        l = h.a().getWidth();
                    }
                    scrollimageviewex.a(l);
                }
            }
            if (i != null)
            {
                scrollimageviewex = i;
                boolean flag;
                if (!g)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                scrollimageviewex.a(i1, flag);
                if (g)
                {
                    g = false;
                    return;
                }
            }
        }
    }

    public final void a(boolean flag, boolean flag1)
    {
        boolean flag2 = true;
        if (flag1)
        {
            if (i != null)
            {
                i.a(1024, false);
            }
            if (h != null)
            {
                if (e == 0)
                {
                    e = h.a().getWidth() - h.getWidth();
                }
                if (e > 0)
                {
                    h.b(e);
                }
            }
            g = true;
        }
        if (h != null)
        {
            HorizontalScrollViewEx horizontalscrollviewex = h;
            if (!flag)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            horizontalscrollviewex.a(flag);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        k = (int)getResources().getDimension(0x7f090051);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        d = (PhotoGridActivity)getActivity();
        if (!(d.b instanceof ng))
        {
            d.a(a);
            return layoutinflater.inflate(0x7f0300c8, viewgroup, false);
        }
        b = (ng)d.b;
        c = layoutinflater;
        layoutinflater = layoutinflater.inflate(0x7f0300c8, viewgroup, false);
        h = (HorizontalScrollViewEx)layoutinflater.findViewById(0x7f0d0066);
        h.a(new hl(this));
        h.a(this);
        h.setOnTouchListener(new hm(this));
        h.a(new hn(this));
        h.a(new ho(this));
        j = (HorizontalProgressViewEx)layoutinflater.findViewById(0x7f0d0333);
        i = (ScrollImageViewEx)layoutinflater.findViewById(0x7f0d0334);
        viewgroup = i;
        if (h.a().getWidth() <= h.getWidth()) goto _L2; else goto _L1
_L1:
        int l = h.getWidth();
_L4:
        viewgroup.a(l);
        i.a(new hp(this));
        j.a(i);
        j.a(new hq(this));
        if (b != null)
        {
            b.a(this);
        }
        break MISSING_BLOCK_LABEL_294;
_L2:
        l = h.a().getWidth();
        if (true) goto _L4; else goto _L3
_L3:
        viewgroup;
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (b != null)
        {
            b.a(null);
            b = null;
        }
        d = null;
        if (h != null)
        {
            h.b();
            h = null;
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int l, long l1)
    {
        boolean flag = false;
        int i1;
        try
        {
            if (d.i)
            {
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (AdapterView adapterview)
        {
            return;
        }
        i1 = (l << 10) / b.L.length;
        b.s();
        if (e > 0)
        {
            h.smoothScrollTo(e * i1 >> 10, 0);
        }
        adapterview = i;
        if (i.getVisibility() == 0)
        {
            flag = true;
        }
        adapterview.a(i1, flag);
        b.k(l);
        return;
    }

}
