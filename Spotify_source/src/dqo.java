// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate;
import com.spotify.mobile.android.porcelain.item.PorcelainCellItem;
import com.spotify.mobile.android.porcelain.subitem.PorcelainImage;
import com.spotify.mobile.android.porcelain.subitem.PorcelainText;
import com.spotify.mobile.android.util.Assertion;
import java.util.Iterator;
import java.util.Map;

public abstract class dqo extends dqx
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener
{

    private android.view.View.OnTouchListener k = new android.view.View.OnTouchListener() {

        private dqo a;

        public final boolean onTouch(View view, MotionEvent motionevent)
        {
            return a.a.onTouchEvent(motionevent);
        }

            
            {
                a = dqo.this;
                super();
            }
    };
    private final com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize l;
    private dhu m;

    private dqo(dhu dhu1, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize imagesize, doh doh1)
    {
        super(dhu1.v(), doh1);
        l = (com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize)ctz.a(imagesize);
        m = dhu1;
        m.v().setOnClickListener(this);
        m.v().setOnLongClickListener(this);
        dgo.a(m.v());
        dhu1 = gae.a(m.v().getContext());
        m.a(dhu1);
        m.e(false);
    }

    dqo(dhu dhu1, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize imagesize, doh doh1, byte byte0)
    {
        this(dhu1, imagesize, doh1);
    }

    public static dqo a(ViewGroup viewgroup, doh doh1)
    {
        return new dqp(viewgroup, doh1);
    }

    private void a(ImageView imageview, dru dru1, boolean flag)
    {
        com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate porcelainimagedelegate = super.j.a.b();
        if (dru1 != null)
        {
            com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink porcelainnavigationlink = dru1.getLink();
            cvh cvh = super.j.d.a();
            boolean flag1 = false;
            do
            {
                if (!cvh.hasNext())
                {
                    break;
                }
                Pair pair = (Pair)cvh.next();
                if (pair.first == null || pair.second == null)
                {
                    Assertion.b("Invalid null extension registered. Ignoring");
                } else
                if (dru1.getExtensions().containsKey(pair.first))
                {
                    if (((dqk)pair.second).a((JsonNode)dru1.getExtensions().get(pair.first), imageview) || flag1)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                }
            } while (true);
            if (!flag1)
            {
                if (flag)
                {
                    if (dru1.getImage().getUrl() != null)
                    {
                        Assertion.b("Images in accessoryRight are not yet supported!");
                    }
                    porcelainimagedelegate.a(imageview, dru1.getImage().getPlaceHolder());
                } else
                {
                    porcelainimagedelegate.a(imageview, dru1.getImage(), l, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.IconSize.d);
                }
            }
            imageview.setVisibility(0);
            dru1 = porcelainnavigationlink;
        } else
        {
            imageview.setVisibility(8);
            porcelainimagedelegate.a(imageview);
            dru1 = null;
        }
        if (dru1 != null)
        {
            imageview.setTag(0x7f1100e8, dru1);
            imageview.setClickable(true);
            imageview.setOnClickListener(this);
            imageview.setOnTouchListener(null);
            return;
        } else
        {
            imageview.setTag(0x7f1100e8, null);
            imageview.setClickable(false);
            imageview.setOnClickListener(null);
            imageview.setOnTouchListener(k);
            return;
        }
    }

    public static dqo b(ViewGroup viewgroup, doh doh1)
    {
        return new dqq(dhv.e(viewgroup.getContext(), viewgroup), com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.a, doh1);
    }

    public static dqx c(ViewGroup viewgroup, doh doh1)
    {
        return new dqq(dhv.f(viewgroup.getContext(), viewgroup), com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.b, doh1);
    }

    public final void a(PorcelainCellItem porcelaincellitem)
    {
        a(((dih)m.u()).d(), porcelaincellitem.getAccessoryLeft(), false);
        a((ImageView)m.x(), porcelaincellitem.getAccessoryRight(), true);
        a((dih)m.u(), porcelaincellitem.getText(), super.j.a.c());
        m.c(super.j.a.a().a(porcelaincellitem.getPlayable()));
        boolean flag = b(porcelaincellitem.getLink(), porcelaincellitem.getPlayable());
        m.v().setFocusable(flag);
        m.v().setClickable(flag);
        View view = m.v();
        if (porcelaincellitem.getLongClickLink() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setLongClickable(flag);
        m.b(porcelaincellitem.isEnabled());
    }

    abstract void a(dih dih1, PorcelainText porcelaintext, dqi dqi);

    public volatile void a(drf drf, doj doj)
    {
        a((PorcelainCellItem)drf);
    }

    public void onClick(View view)
    {
        if (!a(view))
        {
            a(((PorcelainCellItem)w()).getLink(), ((PorcelainCellItem)w()).getPlayable());
        }
    }

    public boolean onLongClick(View view)
    {
        return a(((PorcelainCellItem)w()).getLongClickLink(), ((drz) (null)));
    }
}
