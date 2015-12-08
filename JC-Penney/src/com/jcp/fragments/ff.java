// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.jcp.adapters.cg;
import com.jcp.b.b;
import com.jcp.model.Registry;
import com.jcp.util.au;
import com.jcp.util.bm;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            s, fi, fg, fh, 
//            fj, fk, fl

public class ff extends s
    implements android.widget.AdapterView.OnItemClickListener
{

    private Context a;
    private ListView b;
    private ListView c;
    private ImageView d;
    private ImageView e;
    private FrameLayout f;
    private FrameLayout g;
    private int h;

    public ff()
    {
        h = 0;
    }

    private void U()
    {
        ObjectAnimator objectanimator;
        ObjectAnimator objectanimator2;
        objectanimator2 = ObjectAnimator.ofFloat(b, "alpha", new float[] {
            0.0F
        });
        objectanimator = ObjectAnimator.ofFloat(c, "alpha", new float[] {
            0.0F
        });
        if (h != 0) goto _L2; else goto _L1
_L1:
        ObjectAnimator objectanimator1;
        d.setImageDrawable(a.getResources().getDrawable(0x7f020254));
        e.setImageDrawable(a.getResources().getDrawable(0x7f020050));
        objectanimator1 = objectanimator2;
_L4:
        a(objectanimator1, objectanimator);
        return;
_L2:
        if (h == 1)
        {
            d.setImageDrawable(a.getResources().getDrawable(0x7f020255));
            objectanimator1 = ObjectAnimator.ofFloat(b, "alpha", new float[] {
                1.0F
            });
            e.setImageDrawable(a.getResources().getDrawable(0x7f020050));
        } else
        {
            objectanimator1 = objectanimator2;
            if (h == 2)
            {
                e.setImageDrawable(a.getResources().getDrawable(0x7f020051));
                objectanimator = ObjectAnimator.ofFloat(c, "alpha", new float[] {
                    1.0F
                });
                d.setImageDrawable(a.getResources().getDrawable(0x7f020254));
                objectanimator1 = objectanimator2;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static int a(ff ff1)
    {
        return ff1.h;
    }

    static int a(ff ff1, int i)
    {
        ff1.h = i;
        return i;
    }

    private Registry a(String s1, String s2)
    {
        Registry registry = new Registry();
        registry.setName(s1);
        registry.setUrl(s2);
        return registry;
    }

    private void a(ObjectAnimator objectanimator, ObjectAnimator objectanimator1)
    {
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            objectanimator, objectanimator1
        });
        animatorset.setStartDelay(100L);
        animatorset.addListener(new fi(this));
        animatorset.setDuration(500L).start();
    }

    private void a(View view, int i)
    {
        f = (FrameLayout)view.findViewById(0x7f0e02c5);
        d = (ImageView)f.findViewById(0x7f0e0411);
        d.setImageDrawable(a.getResources().getDrawable(0x7f020254));
        TextView textview = (TextView)f.findViewById(0x7f0e0412);
        textview.setText(a.getString(0x7f070479));
        textview.setOnClickListener(new fg(this, i));
        b = (ListView)f.findViewById(0x7f0e0413);
        String as[] = a.getResources().getStringArray(0x7f0c001a);
        String as1[] = com.jcp.b.b.ah();
        a(b, as, as1);
        g = (FrameLayout)view.findViewById(0x7f0e02c7);
        e = (ImageView)g.findViewById(0x7f0e0411);
        e.setImageDrawable(a.getResources().getDrawable(0x7f020050));
        view = (TextView)g.findViewById(0x7f0e0412);
        view.setText(a.getString(0x7f07008c));
        view.setOnClickListener(new fh(this, i));
        c = (ListView)g.findViewById(0x7f0e0413);
        view = a.getResources().getStringArray(0x7f0c0003);
        as = com.jcp.b.b.ai();
        a(c, ((String []) (view)), as);
    }

    private void a(View view, int i, int j)
    {
        bm bm1 = new bm(view, 500, j);
        bm1.a(i);
        view.startAnimation(bm1);
    }

    private void a(ImageView imageview)
    {
        ViewTreeObserver viewtreeobserver = imageview.getViewTreeObserver();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        i().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        viewtreeobserver.addOnGlobalLayoutListener(new fj(this, displaymetrics, imageview));
    }

    private void a(ListView listview, String as[], String as1[])
    {
        listview.setOnItemClickListener(this);
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < as.length; i++)
        {
            arraylist.add(a(as[i], as1[i]));
        }

        listview.setAdapter(new cg(a, arraylist));
    }

    static void a(ff ff1, View view, int i, int j)
    {
        ff1.a(view, i, j);
    }

    static void a(ff ff1, ImageView imageview)
    {
        ff1.a(imageview);
    }

    static FrameLayout b(ff ff1)
    {
        return ff1.f;
    }

    private void b(String s1)
    {
        au.a(i(), a(0x7f0701cc), a(0x7f070049), a(0x7f070041), new fk(this, s1), new fl(this));
    }

    static FrameLayout c(ff ff1)
    {
        return ff1.g;
    }

    static ImageView d(ff ff1)
    {
        return ff1.d;
    }

    static void e(ff ff1)
    {
        ff1.U();
    }

    static ImageView f(ff ff1)
    {
        return ff1.e;
    }

    static ListView g(ff ff1)
    {
        return ff1.c;
    }

    static ListView h(ff ff1)
    {
        return ff1.b;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        i().findViewById(0x7f0e0164).setVisibility(8);
        layoutinflater = layoutinflater.inflate(0x7f030076, viewgroup, false);
        a = i();
        a(a(0x7f070347), ((android.app.Activity) (i())));
        a(((View) (layoutinflater)), ((BitmapDrawable)i().getResources().getDrawable(0x7f020254)).getBitmap().getHeight());
        return layoutinflater;
    }

    protected String a()
    {
        return "REGISTRY";
    }

    public void b()
    {
        a(a(0x7f070347));
        super.b();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        b(((Registry)adapterview.getItemAtPosition(i)).getUrl().trim());
    }
}
