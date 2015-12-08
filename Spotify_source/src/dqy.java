// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate;
import com.spotify.mobile.android.porcelain.subitem.PorcelainImage;
import com.spotify.mobile.android.porcelain.subitem.PorcelainText;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;

public final class dqy extends dqx
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener
{

    private android.view.View.OnTouchListener k = new android.view.View.OnTouchListener() {

        private dqy a;

        public final boolean onTouch(View view, MotionEvent motionevent)
        {
            return a.a.onTouchEvent(motionevent);
        }

            
            {
                a = dqy.this;
                super();
            }
    };
    private dqh l = new dqh() {

        private dqy b;

        public final gwb a(gwb gwb1)
        {
            return gwb1.b(dqy.a(b), dqy.b(b)).b();
        }

            
            {
                b = dqy.this;
                super();
            }
    };
    private final dhu m;
    private final TextView n;
    private final int o;
    private final int p;

    public dqy(ViewGroup viewgroup, doh doh1)
    {
        this(dhv.g(viewgroup.getContext(), viewgroup), doh1);
    }

    private dqy(dhu dhu1, doh doh1)
    {
        super(dhu1.v(), doh1);
        m = (dhu)ctz.a(dhu1);
        o = a.getResources().getDimensionPixelSize(0x7f0c0158);
        p = a.getResources().getDimensionPixelSize(0x7f0c0157);
        a.setOnClickListener(this);
        a.setOnLongClickListener(this);
        dhu1 = gae.a(a.getContext());
        m.a(dhu1);
        dgo.a(a);
        n = new TextView(a.getContext());
        dhu1 = (die)m.u();
        doh1 = n;
        dhu1.d().setVisibility(0);
        dhu1.e();
        dgo.a(doh1.getContext(), doh1);
        int i = doh1.getResources().getDimensionPixelSize(0x7f0c0156);
        doh1.setPadding(i, i, i, i);
        dhu1.a().setSingleLine(false);
        dhu1.a().setMaxLines(2);
        m.e(false);
    }

    static int a(dqy dqy1)
    {
        return dqy1.o;
    }

    static int b(dqy dqy1)
    {
        return dqy1.p;
    }

    public final void a(drf drf, doj doj)
    {
        Object obj;
        Object obj1;
        doj = (drk)drf;
        obj = (ImageView)m.x();
        obj1 = doj.getAccessoryRight();
        com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate porcelainimagedelegate = super.j.a.b();
        final class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.values().length];
                try
                {
                    a[com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        boolean flag;
        if (obj1 != null)
        {
            drf = ((dru) (obj1)).getLink();
            if (((dru) (obj1)).getImage().getUrl() != null)
            {
                Assertion.b("Images in accessoryRight are not yet supported!");
            }
            porcelainimagedelegate.a(((ImageView) (obj)), ((dru) (obj1)).getImage().getPlaceHolder());
            ((ImageView) (obj)).setVisibility(0);
        } else
        {
            ((ImageView) (obj)).setVisibility(8);
            porcelainimagedelegate.a(((ImageView) (obj)));
            drf = null;
        }
        if (drf != null)
        {
            ((View) (obj)).setTag(0x7f1100e8, drf);
            ((ImageView) (obj)).setClickable(true);
            ((ImageView) (obj)).setOnClickListener(this);
            ((ImageView) (obj)).setOnTouchListener(null);
        } else
        {
            ((View) (obj)).setTag(0x7f1100e8, null);
            ((ImageView) (obj)).setClickable(false);
            ((ImageView) (obj)).setOnClickListener(null);
            ((ImageView) (obj)).setOnTouchListener(k);
        }
        drf = doj.getCaption();
        n.setText(drf);
        obj = (die)m.u();
        if (drf != null)
        {
            drf = n;
        } else
        {
            drf = null;
        }
        ((die) (obj)).a(drf);
        drf = doj.getImage();
        super.j.a.b().a(((die)m.u()).d(), drf, l, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.b, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.IconSize.a);
        drf = (dia)m.u();
        obj = doj.getText();
        drf.a(null);
        drf.b(null);
        if (obj == null || ((PorcelainText) (obj)).getLineCount() <= 0) goto _L2; else goto _L1
_L1:
        obj1 = ((PorcelainText) (obj)).getLine(0);
        drf.a(super.j.a.c().a(((dsc) (obj1))));
        if (((PorcelainText) (obj)).getLineCount() < 2) goto _L2; else goto _L3
_L3:
        obj = ((PorcelainText) (obj)).getLine(1);
        obj1 = super.j.a.c().a(((dsc) (obj)));
        _cls3.a[((dsc) (obj)).getFont().ordinal()];
        JVM INSTR tableswitch 1 4: default 376
    //                   1 530
    //                   2 530
    //                   3 530
    //                   4 563;
           goto _L4 _L5 _L5 _L5 _L6
_L4:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_563;
_L2:
        m.b(doj.isEnabled());
        m.c(super.j.a.a().a(doj.getPlayable()));
        flag = b(doj.getLink(), doj.getPlayable());
        a.setFocusable(flag);
        a.setClickable(flag);
        drf = a;
        boolean flag1;
        if (doj.getLongClickLink() != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        drf.setLongClickable(flag1);
        return;
_L5:
        if (((dsc) (obj)).getFont() == com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.b)
        {
            Logger.b("Primary text style is not supported in the second line yet", new Object[0]);
        }
        drf.b(((CharSequence) (obj1)));
          goto _L2
        drf.c(((CharSequence) (obj1)));
          goto _L2
    }

    public final void onClick(View view)
    {
        if (!a(view))
        {
            a(((drk)w()).getLink(), ((drk)w()).getPlayable());
        }
    }

    public final boolean onLongClick(View view)
    {
        return a(((drk)w()).getLongClickLink(), null);
    }
}
