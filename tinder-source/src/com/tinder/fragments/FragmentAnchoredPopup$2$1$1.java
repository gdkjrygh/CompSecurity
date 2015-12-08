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

final class a
    implements Runnable
{

    final a a;

    public final void run()
    {
        if (a.a.a.h)
        {
            return;
        }
        a.a.a.h = true;
        FragmentAnchoredPopup.b(a.a.a)[0] = Bitmap.createBitmap(a.a.a.d.getWidth(), a.a.a.d.getHeight(), android.graphics.a);
        a.a[0] = new Canvas(FragmentAnchoredPopup.b(a.a.a)[0]);
        FragmentAnchoredPopup.b(a.a.a)[0].eraseColor(0);
        a.a[0].drawColor(a.a.a.getResources().getColor(0x7f0d0109));
        Object obj = ad.a(a.a);
        a.a.setColor(-1);
        a.a.setXfermode(a.a);
        int i = -((ad.a(a.a.a.b(0x7f0e012e)).y - (ad.a(a.a).y + a.a.getMeasuredHeight())) / 2);
        a.a[0].drawCircle(((Point) (obj)).x + a.a.a.l.getMeasuredWidth() / 2, (float)((Point) (obj)).y + a.a.a.k + (float)((a.a.getMeasuredHeight() - a.a.getMeasuredHeight()) / 2), ((float)a.a.getMeasuredWidth() * a.a.a.f) / 2.0F, a.a);
        a.a[0].drawBitmap(FragmentAnchoredPopup.b(a.a.a)[0], 0.0F, 0.0F, null);
        a.a.a.d.setImageBitmap(FragmentAnchoredPopup.b(a.a.a)[0]);
        obj = a.a.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            int j = ((Integer)((Iterator) (obj)).next()).intValue();
            if (j != a.a.a.i)
            {
                a.a.a.b(j).setTranslationY(i);
            }
        } while (true);
        obj = (android.widget.b)a.a.a.c.getLayoutParams();
        ((android.widget.c) (obj)).addRule(5, a.a.a.i);
        ((android.widget.i) (obj)).addRule(7, a.a.a.i);
        a.a.a.c.setLayoutParams(((android.view.p.c) (obj)));
        a.a.a.g.setPivotY((float)ad.a(a.a.a.c).y - a.a.a.k / 4F);
        a.a.a.g.setPivotX(ad.a(a.a.a.l).x + a.a.a.l.getMeasuredWidth() / 2);
        FragmentAnchoredPopup.c(a.a.a);
        FragmentAnchoredPopup.d(a.a.a);
    }

    ( )
    {
        a = ;
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


    // Unreferenced inner class com/tinder/fragments/FragmentAnchoredPopup$2$1

/* anonymous class */
    final class FragmentAnchoredPopup._cls2._cls1
        implements android.view.View.OnLayoutChangeListener
    {

        final Canvas a[];
        final ViewGroup b;
        final Paint c;
        final PorterDuffXfermode d;
        final CardStackLayout e;
        final View f;
        final ArrayList g;
        final FragmentAnchoredPopup._cls2 h;

        public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1)
        {
            ManagerApp.d();
            ManagerApp.n().post(new FragmentAnchoredPopup._cls2._cls1._cls1(this));
        }

            
            {
                h = _pcls2;
                a = acanvas;
                b = viewgroup;
                c = paint;
                d = porterduffxfermode;
                e = cardstacklayout;
                f = view;
                g = arraylist;
                super();
            }
    }

}
