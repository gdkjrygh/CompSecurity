// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuffXfermode;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tinder.cards.CardStackLayout;
import com.tinder.managers.ManagerApp;
import com.tinder.utils.ad;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.tinder.fragments:
//            FragmentAnchoredPopup, bd

final class g
    implements android.view.r
{

    final Canvas a[];
    final ViewGroup b;
    final Paint c;
    final PorterDuffXfermode d;
    final CardStackLayout e;
    final View f;
    final ArrayList g;
    final h h;

    public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        ManagerApp.d();
        ManagerApp.n().post(new Runnable() {

            final FragmentAnchoredPopup._cls2._cls1 a;

            public final void run()
            {
                if (a.h.a.h)
                {
                    return;
                }
                a.h.a.h = true;
                FragmentAnchoredPopup.b(a.h.a)[0] = Bitmap.createBitmap(a.h.a.d.getWidth(), a.h.a.d.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                a.a[0] = new Canvas(FragmentAnchoredPopup.b(a.h.a)[0]);
                FragmentAnchoredPopup.b(a.h.a)[0].eraseColor(0);
                a.a[0].drawColor(a.h.a.getResources().getColor(0x7f0d0109));
                Object obj = ad.a(a.b);
                a.c.setColor(-1);
                a.c.setXfermode(a.d);
                int i2 = -((ad.a(a.h.a.b(0x7f0e012e)).y - (ad.a(a.e).y + a.e.getMeasuredHeight())) / 2);
                a.a[0].drawCircle(((Point) (obj)).x + a.h.a.l.getMeasuredWidth() / 2, (float)((Point) (obj)).y + a.h.a.k + (float)((a.b.getMeasuredHeight() - a.f.getMeasuredHeight()) / 2), ((float)a.f.getMeasuredWidth() * a.h.a.f) / 2.0F, a.c);
                a.a[0].drawBitmap(FragmentAnchoredPopup.b(a.h.a)[0], 0.0F, 0.0F, null);
                a.h.a.d.setImageBitmap(FragmentAnchoredPopup.b(a.h.a)[0]);
                obj = a.g.iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    int j2 = ((Integer)((Iterator) (obj)).next()).intValue();
                    if (j2 != a.h.a.i)
                    {
                        a.h.a.b(j2).setTranslationY(i2);
                    }
                } while (true);
                obj = (android.widget.RelativeLayout.LayoutParams)a.h.a.c.getLayoutParams();
                ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(5, a.h.a.i);
                ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(7, a.h.a.i);
                a.h.a.c.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                a.h.a.g.setPivotY((float)ad.a(a.h.a.c).y - a.h.a.k / 4F);
                a.h.a.g.setPivotX(ad.a(a.h.a.l).x + a.h.a.l.getMeasuredWidth() / 2);
                FragmentAnchoredPopup.c(a.h.a);
                FragmentAnchoredPopup.d(a.h.a);
            }

            
            {
                a = FragmentAnchoredPopup._cls2._cls1.this;
                super();
            }
        });
    }

    _cls1.a(_cls1.a a1, Canvas acanvas[], ViewGroup viewgroup, Paint paint, PorterDuffXfermode porterduffxfermode, CardStackLayout cardstacklayout, View view, 
            ArrayList arraylist)
    {
        h = a1;
        a = acanvas;
        b = viewgroup;
        c = paint;
        d = porterduffxfermode;
        e = cardstacklayout;
        f = view;
        g = arraylist;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/FragmentAnchoredPopup$2

/* anonymous class */
    final class FragmentAnchoredPopup._cls2
        implements Runnable
    {

        final FragmentAnchoredPopup a;

        public final void run()
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(Integer.valueOf(0x7f0e0134));
            arraylist.add(Integer.valueOf(0x7f0e012f));
            arraylist.add(Integer.valueOf(0x7f0e0136));
            arraylist.add(Integer.valueOf(0x7f0e0130));
            arraylist.add(Integer.valueOf(0x7f0e0138));
            arraylist.add(Integer.valueOf(0x7f0e012e));
            Iterator iterator = arraylist.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                int i = ((Integer)iterator.next()).intValue();
                if (a.b(i) != null)
                {
                    a.b(i).setVisibility(4);
                }
            } while (true);
            arraylist.add(Integer.valueOf(0x7f0e0129));
            arraylist.add(Integer.valueOf(0x7f0e0128));
            FragmentAnchoredPopup.a(a, new Bitmap[1]);
            Canvas acanvas[] = new Canvas[1];
            CardStackLayout cardstacklayout = FragmentAnchoredPopup.a(a).p;
            Paint paint = new Paint();
            PorterDuffXfermode porterduffxfermode = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR);
            ViewGroup viewgroup = (ViewGroup)FragmentAnchoredPopup.a(a).q.findViewById(a.i);
            View view = viewgroup.getChildAt(0);
            a.j.addOnLayoutChangeListener(new FragmentAnchoredPopup._cls2._cls1(this, acanvas, viewgroup, paint, porterduffxfermode, cardstacklayout, view, arraylist));
        }

            
            {
                a = fragmentanchoredpopup;
                super();
            }
    }

}
