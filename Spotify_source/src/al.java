// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class al extends Fragment
{

    private final Runnable Y = new Runnable() {

        private al a;

        public final void run()
        {
            a.a.focusableViewAvailable(a.a);
        }

            
            {
                a = al.this;
                super();
            }
    };
    private final android.widget.AdapterView.OnItemClickListener Z = new android.widget.AdapterView.OnItemClickListener() {

        private al a;

        public final void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            a.a((ListView)adapterview, view, i, l);
        }

            
            {
                a = al.this;
                super();
            }
    };
    ListView a;
    private ListAdapter aa;
    private View ab;
    private TextView ac;
    private View ad;
    private View ae;
    private boolean af;
    private final Handler b = new Handler();

    public al()
    {
    }

    private void G()
    {
        if (a != null)
        {
            return;
        }
        Object obj = super.M;
        if (obj == null)
        {
            throw new IllegalStateException("Content view not yet created");
        }
        if (obj instanceof ListView)
        {
            a = (ListView)obj;
        } else
        {
            ac = (TextView)((View) (obj)).findViewById(0xff0001);
            if (ac == null)
            {
                ab = ((View) (obj)).findViewById(0x1020004);
            } else
            {
                ac.setVisibility(8);
            }
            ad = ((View) (obj)).findViewById(0xff0002);
            ae = ((View) (obj)).findViewById(0xff0003);
            obj = ((View) (obj)).findViewById(0x102000a);
            if (!(obj instanceof ListView))
            {
                if (obj == null)
                {
                    throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                } else
                {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
            }
            a = (ListView)obj;
            if (ab != null)
            {
                a.setEmptyView(ab);
            }
        }
        af = true;
        a.setOnItemClickListener(Z);
        if (aa != null)
        {
            obj = aa;
            aa = null;
            a(((ListAdapter) (obj)));
        } else
        if (ad != null)
        {
            a(false, false);
        }
        b.post(Y);
    }

    private void a(boolean flag, boolean flag1)
    {
        G();
        if (ad == null)
        {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (af == flag)
        {
            return;
        }
        af = flag;
        if (flag)
        {
            if (flag1)
            {
                ad.startAnimation(AnimationUtils.loadAnimation(k(), 0x10a0001));
                ae.startAnimation(AnimationUtils.loadAnimation(k(), 0x10a0000));
            } else
            {
                ad.clearAnimation();
                ae.clearAnimation();
            }
            ad.setVisibility(8);
            ae.setVisibility(0);
            return;
        }
        if (flag1)
        {
            ad.startAnimation(AnimationUtils.loadAnimation(k(), 0x10a0000));
            ae.startAnimation(AnimationUtils.loadAnimation(k(), 0x10a0001));
        } else
        {
            ad.clearAnimation();
            ae.clearAnimation();
        }
        ad.setVisibility(0);
        ae.setVisibility(8);
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = k();
        layoutinflater = new FrameLayout(viewgroup);
        bundle = new LinearLayout(viewgroup);
        bundle.setId(0xff0002);
        bundle.setOrientation(1);
        bundle.setVisibility(8);
        bundle.setGravity(17);
        bundle.addView(new ProgressBar(viewgroup, null, 0x101007a), new android.widget.FrameLayout.LayoutParams(-2, -2));
        layoutinflater.addView(bundle, new android.widget.FrameLayout.LayoutParams(-1, -1));
        viewgroup = new FrameLayout(viewgroup);
        viewgroup.setId(0xff0003);
        bundle = new TextView(k());
        bundle.setId(0xff0001);
        bundle.setGravity(17);
        viewgroup.addView(bundle, new android.widget.FrameLayout.LayoutParams(-1, -1));
        bundle = new ListView(k());
        bundle.setId(0x102000a);
        bundle.setDrawSelectorOnTop(false);
        viewgroup.addView(bundle, new android.widget.FrameLayout.LayoutParams(-1, -1));
        layoutinflater.addView(viewgroup, new android.widget.FrameLayout.LayoutParams(-1, -1));
        layoutinflater.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        return layoutinflater;
    }

    public void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        G();
    }

    public final void a(ListAdapter listadapter)
    {
        boolean flag1 = false;
        boolean flag;
        if (aa != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aa = listadapter;
        if (a != null)
        {
            a.setAdapter(listadapter);
            if (!af && !flag)
            {
                if (super.M.getWindowToken() != null)
                {
                    flag1 = true;
                }
                a(true, flag1);
            }
        }
    }

    public void a(ListView listview, View view, int i, long l)
    {
    }

    public void e()
    {
        b.removeCallbacks(Y);
        a = null;
        af = false;
        ae = null;
        ad = null;
        ab = null;
        ac = null;
        super.e();
    }

    public ListAdapter w_()
    {
        return aa;
    }

    public final ListView z_()
    {
        G();
        return a;
    }
}
