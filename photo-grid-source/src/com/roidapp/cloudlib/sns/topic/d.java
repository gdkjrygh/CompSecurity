// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.topic;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.bi;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.h;
import com.bumptech.glide.p;
import com.roidapp.baselib.b.a;
import com.roidapp.baselib.c.s;
import com.roidapp.baselib.view.SpaceCompat;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.b.o;
import com.roidapp.cloudlib.sns.b.w;
import com.roidapp.cloudlib.sns.e.b;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.sns.topic:
//            a, m, TriangleView

public final class d extends com.roidapp.cloudlib.sns.topic.a
{

    private final int j;

    public d(Fragment fragment, android.view.View.OnClickListener onclicklistener)
    {
        super(fragment, onclicklistener, 2);
        j = com.roidapp.cloudlib.common.d.a(fragment.getResources(), 4F);
    }

    public final int a()
    {
        if (d == null)
        {
            return 0;
        }
        if (((w)d).c != null && !((w)d).c.isEmpty())
        {
            return ((w)d).c.size() + 3;
        } else
        {
            return 2;
        }
    }

    public final int a(int i)
    {
        switch (i)
        {
        default:
            return 20;

        case 0: // '\0'
            return ((w)d).a == null ? 21 : 16;

        case 1: // '\001'
            return ((w)d).b == null || ((w)d).b.isEmpty() || ((w)d).b.size() != 5 ? 21 : 19;

        case 2: // '\002'
            return 18;
        }
    }

    public final bi a(ViewGroup viewgroup, int i)
    {
        TextView textview;
        switch (i)
        {
        case 17: // '\021'
        case 20: // '\024'
        default:
            return new s(LayoutInflater.from(c).inflate(as.ag, viewgroup, false), i);

        case 21: // '\025'
            return new s(new SpaceCompat(c), 21);

        case 16: // '\020'
            return new s(LayoutInflater.from(c).inflate(as.X, viewgroup, false), i);

        case 19: // '\023'
            return new s(new m(c), i);

        case 18: // '\022'
            textview = new TextView(viewgroup.getContext());
            break;
        }
        i = com.roidapp.cloudlib.common.d.a(viewgroup.getContext().getResources(), 8F);
        viewgroup = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
        viewgroup.topMargin = i * 2;
        viewgroup.bottomMargin = i;
        viewgroup.leftMargin = i;
        textview.setLayoutParams(viewgroup);
        textview.setText(c.getString(at.aF));
        textview.setTextSize(2, 18F);
        return new s(textview);
    }

    public final com.bumptech.glide.e a(Object obj)
    {
        obj = (n)obj;
        return h.a(b).a(((n) (obj)).a.e).g().a().b(e, e);
    }

    public final void a(bi bi, int i)
    {
        bi = (s)bi;
        ((s) (bi)).j;
        JVM INSTR tableswitch 16 20: default 44
    //                   16 45
    //                   17 44
    //                   18 44
    //                   19 412
    //                   20 441;
           goto _L1 _L2 _L1 _L1 _L3 _L4
_L1:
        return;
_L2:
        if (((w)d).a == null) goto _L1; else goto _L5
_L5:
        Object obj1;
        Object obj = (ImageView)bi.b(ar.bp);
        h.a(b).a(((w)d).a.b).b(com.roidapp.baselib.b.a.b()).a(com.bumptech.glide.load.b.e.c).g().a(new b(((ImageView) (obj))));
        obj = (TriangleView)bi.b(ar.cZ);
        bi = (TextView)bi.b(ar.bq);
        obj1 = (View)bi.getParent();
        if (!TextUtils.isEmpty(((w)d).a.d))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L7; else goto _L6
_L6:
        if (((w)d).a.i == null) goto _L9; else goto _L8
_L8:
        if (((w)d).a.h != com.roidapp.cloudlib.sns.b.e.b) goto _L11; else goto _L10
_L10:
        ((View) (obj1)).setBackgroundColor(((w)d).a.i[0]);
_L12:
        ((TriangleView) (obj)).a(((w)d).a.i[0]);
_L9:
        bi.setText(((w)d).a.d);
        ((View) (obj1)).setVisibility(0);
        return;
_L11:
        if (((w)d).a.h == com.roidapp.cloudlib.sns.b.e.a)
        {
            if (com.roidapp.baselib.c.n.g())
            {
                android.graphics.drawable.Drawable drawable = ((View) (obj1)).getBackground();
                if (!(drawable instanceof GradientDrawable))
                {
                    ((View) (obj1)).setBackground(new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, ((w)d).a.i));
                } else
                {
                    ((GradientDrawable)drawable).setColors(((w)d).a.i);
                }
            } else
            {
                ((View) (obj1)).setBackgroundDrawable(new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, ((w)d).a.i));
            }
        }
        if (true) goto _L12; else goto _L7
_L7:
        ((View) (obj1)).setVisibility(8);
        return;
_L3:
        ((m)((s) (bi)).a).a(b, ((w)d).b, h);
        return;
_L4:
        n n1;
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams;
        n1 = (n)((w)d).c.get(i - 3);
        obj1 = (ImageView)bi.b(ar.cP);
        marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)((s) (bi)).a.getLayoutParams();
        marginlayoutparams.width = e;
        marginlayoutparams.height = e;
        marginlayoutparams.rightMargin = 0;
        marginlayoutparams.leftMargin = 0;
        marginlayoutparams.bottomMargin = j;
        (i - 3) % f;
        JVM INSTR tableswitch 0 1: default 556
    //                   0 609
    //                   1 623;
           goto _L13 _L14 _L15
_L13:
        h.a(b).a(n1.a.e).g().b(com.roidapp.baselib.b.a.b()).b(e, e).a(((ImageView) (obj1)));
        a(((s) (bi)).a, n1);
        return;
_L14:
        marginlayoutparams.rightMargin = j / 2;
        continue; /* Loop/switch isn't completed */
_L15:
        marginlayoutparams.leftMargin = j / 2;
        if (true) goto _L13; else goto _L16
_L16:
    }

    public final volatile int[] b()
    {
        return (new int[] {
            e, e
        });
    }

    public final List c(int i)
    {
        i = (i - this.i) + 1;
        if (i < 0)
        {
            return a;
        }
        a(i);
        JVM INSTR tableswitch 20 20: default 40
    //                   20 45;
           goto _L1 _L2
_L1:
        return a;
_L2:
        if ((i = Math.max(0, i - 3)) < ((w)d).c.size())
        {
            return ((w)d).c.subList(i, i + 1);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final boolean e(int i)
    {
        return i == 20;
    }
}
