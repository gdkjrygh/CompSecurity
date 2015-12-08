// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.view.e;
import com.roidapp.cloudlib.a.a;
import com.roidapp.cloudlib.common.d;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.roidapp.photogrid.common:
//            x

public final class w
{

    private final Context a = aj.a();
    private final SharedPreferences b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;

    public w()
    {
        boolean flag1 = true;
        super();
        b = PreferenceManager.getDefaultSharedPreferences(a);
        SimpleDateFormat simpledateformat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault());
        long l;
        boolean flag;
        try
        {
            l = simpledateformat.parse("30/11/2015 24:00:00").getTime();
        }
        catch (ParseException parseexception)
        {
            l = 0x151591f4400L;
        }
        if (System.currentTimeMillis() < l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        d = com.roidapp.cloudlib.a.a.a(a).a("event", "christmas2015", false);
        if (c && b.getBoolean("tg_ani", true))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        if (d && b.getBoolean("cm_ani", true))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        f = flag;
    }

    private static void a(View aview[], int i)
    {
        boolean flag = true;
        int j = 0xffffff & i | 0xa0000000;
        com.roidapp.baselib.view.w w1 = new com.roidapp.baselib.view.w(i);
        com.roidapp.baselib.view.w w2 = new com.roidapp.baselib.view.w(j);
        w1.a();
        w1.a(aview[0].getLayoutParams().width / 2);
        w2.a();
        w2.a(aview[0].getLayoutParams().width / 2);
        StateListDrawable statelistdrawable = new StateListDrawable();
        statelistdrawable.addState(new int[] {
            0x10100a7
        }, w2);
        statelistdrawable.addState(new int[0], w1);
        aview[0].setBackgroundDrawable(statelistdrawable);
        for (i = ((flag) ? 1 : 0); i < aview.length; i++)
        {
            aview[i].setBackgroundColor(j);
        }

    }

    private void a(View aview[], int ai[])
    {
        int i = com.roidapp.cloudlib.common.d.a(a.getResources(), 2.0F);
        com.roidapp.baselib.view.w w1 = new com.roidapp.baselib.view.w(ai[0]);
        com.roidapp.baselib.view.w w3 = new com.roidapp.baselib.view.w(ai[1]);
        w1.a(i);
        w3.a(i);
        StateListDrawable statelistdrawable1 = new StateListDrawable();
        statelistdrawable1.addState(new int[] {
            0x10100a7
        }, w3);
        statelistdrawable1.addState(new int[0], w1);
        aview[0].setBackgroundDrawable(statelistdrawable1);
        w1 = new com.roidapp.baselib.view.w(ai[2]);
        w3 = new com.roidapp.baselib.view.w(ai[3]);
        w1.a(i);
        w3.a(i);
        statelistdrawable1 = new StateListDrawable();
        statelistdrawable1.addState(new int[] {
            0x10100a7
        }, w3);
        statelistdrawable1.addState(new int[0], w1);
        aview[1].setBackgroundDrawable(statelistdrawable1);
        w1 = new com.roidapp.baselib.view.w(ai[4]);
        w3 = new com.roidapp.baselib.view.w(ai[5]);
        w1.a(i);
        w3.a(i);
        statelistdrawable1 = new StateListDrawable();
        statelistdrawable1.addState(new int[] {
            0x10100a7
        }, w3);
        statelistdrawable1.addState(new int[0], w1);
        aview[2].setBackgroundDrawable(statelistdrawable1);
        if (aview[3] != null)
        {
            com.roidapp.baselib.view.w w2 = new com.roidapp.baselib.view.w(ai[6]);
            ai = new com.roidapp.baselib.view.w(ai[7]);
            w2.a(i);
            ai.a(i);
            StateListDrawable statelistdrawable = new StateListDrawable();
            statelistdrawable.addState(new int[] {
                0x10100a7
            }, ai);
            statelistdrawable.addState(new int[0], w2);
            aview[3].setBackgroundDrawable(statelistdrawable);
        }
    }

    public final void a(View view)
    {
        if (d)
        {
            view.setBackgroundColor(0xffe6f1f8);
        }
    }

    public final void a(ViewGroup viewgroup)
    {
        if (viewgroup != null)
        {
            if (e)
            {
                e e1 = new e(a);
                e1.c(120).a(0.8F).d().e().f().a(com.roidapp.cloudlib.common.d.a(a.getResources(), 30F)).b(com.roidapp.cloudlib.common.d.a(a.getResources(), 50F)).a(new int[] {
                    0x7f020431, 0x7f020432, 0x7f020433, 0x7f020434, 0x7f020435, 0x7f020436, 0x7f020437, 0x7f020438
                }).b();
                viewgroup.addView(e1);
                b.edit().putBoolean("tg_ani", false).apply();
                e = false;
                g = true;
                return;
            }
            if (f)
            {
                e e2 = new e(a);
                e2.c(200).a(0.5F).d().e().f().a(com.roidapp.cloudlib.common.d.a(a.getResources(), 10F)).b(com.roidapp.cloudlib.common.d.a(a.getResources(), 30F)).a(new int[] {
                    0x7f0205e0
                }).b();
                viewgroup.addView(e2);
                b.edit().putBoolean("cm_ani", false).apply();
                f = false;
                h = true;
                return;
            }
        }
    }

    public final transient void a(View aview[])
    {
        if (c)
        {
            a(aview, new int[] {
                -30107, 0xffe57c5b, 0xff90a4ae, 0xff81939c, 0xffa1887f, 0xff917a72, -10929, 0xffe5bf47
            });
        } else
        if (d)
        {
            a(aview, new int[] {
                0xff148f4c, 0xff118146, 0xfff14b3f, 0xffd74337, 0xfffcb537, 0xffe2a331, 0xff57519b, 0xff4e498b
            });
            if (aview[1] instanceof FrameLayout)
            {
                FrameLayout framelayout = (FrameLayout)aview[1];
                ImageView imageview = new ImageView(a);
                imageview.setImageDrawable(a.getResources().getDrawable(0x7f020003));
                android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
                layoutparams.gravity = 85;
                imageview.setLayoutParams(layoutparams);
                framelayout.addView(imageview);
            }
            if (aview[2] instanceof FrameLayout)
            {
                FrameLayout framelayout1 = (FrameLayout)aview[2];
                ImageView imageview1 = new ImageView(a);
                imageview1.setImageDrawable(a.getResources().getDrawable(0x7f020004));
                imageview1.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
                framelayout1.addView(imageview1);
            }
            if (aview[4] != null)
            {
                aview[4].setBackgroundDrawable(new x(a.getResources()));
                return;
            }
        }
    }

    public final void b(View view)
    {
        if (c)
        {
            view.setBackgroundColor(0xff8a6a54);
        } else
        if (d)
        {
            view.setBackgroundColor(0xff95c7e0);
            ((ImageView)view.findViewById(0x7f0d03a1)).setImageDrawable(a.getResources().getDrawable(0x7f020000));
            ImageView imageview = (ImageView)view.findViewById(0x7f0d03a2);
            imageview.setColorFilter(0xff000000);
            StateListDrawable statelistdrawable = new StateListDrawable();
            ColorDrawable colordrawable = new ColorDrawable(0x33000000);
            statelistdrawable.addState(new int[] {
                0x10100a7
            }, colordrawable);
            colordrawable = new ColorDrawable(0);
            statelistdrawable.addState(new int[0], colordrawable);
            imageview.setBackgroundDrawable(statelistdrawable);
            imageview = (ImageView)view.findViewById(0x7f0d03a4);
            imageview.setColorFilter(0xff000000);
            statelistdrawable = new StateListDrawable();
            colordrawable = new ColorDrawable(0x33000000);
            statelistdrawable.addState(new int[] {
                0x10100a7
            }, colordrawable);
            colordrawable = new ColorDrawable(0);
            statelistdrawable.addState(new int[0], colordrawable);
            imageview.setBackgroundDrawable(statelistdrawable);
            if (view instanceof FrameLayout)
            {
                view = (FrameLayout)view;
                ImageView imageview1 = new ImageView(a);
                imageview1.setImageDrawable(a.getResources().getDrawable(0x7f020002));
                android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
                layoutparams.gravity = 85;
                imageview1.setLayoutParams(layoutparams);
                view.addView(imageview1, 0);
                return;
            }
        }
    }

    public final void b(ViewGroup viewgroup)
    {
        while (viewgroup == null || !g && !h) 
        {
            return;
        }
        ArrayList arraylist = new ArrayList();
        int j = viewgroup.getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view = viewgroup.getChildAt(i);
            if (view instanceof e)
            {
                arraylist.add((e)view);
            }
        }

        e e1;
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); viewgroup.removeView(e1))
        {
            e1 = (e)iterator.next();
            if (e1.a())
            {
                e1.c();
            }
        }

        arraylist.clear();
        if (g)
        {
            g = false;
            return;
        } else
        {
            h = false;
            return;
        }
    }

    public final transient void b(View aview[])
    {
        if (c)
        {
            a(aview, -30107);
        } else
        if (d)
        {
            a(aview, 0xff148f4c);
            return;
        }
    }
}
