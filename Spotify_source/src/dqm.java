// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.paste.widget.CardView;
import com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate;
import com.spotify.mobile.android.porcelain.item.PorcelainCardItem;
import com.spotify.mobile.android.porcelain.subitem.PorcelainText;

public final class dqm extends dqx
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener
{

    private final CardView k;

    public dqm(ViewGroup viewgroup, doh doh1)
    {
        super(a(0x7f030040, viewgroup), doh1);
        k = (CardView)a;
        k.setOnClickListener(this);
        k.setOnLongClickListener(this);
    }

    public final void a(drf drf, doj doj)
    {
        PorcelainCardItem porcelaincarditem;
        porcelaincarditem = (PorcelainCardItem)drf;
        k.a();
        super.j.a.b().a(k.b(), porcelaincarditem.getImage(), com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.c, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.IconSize.d);
        Object obj = porcelaincarditem.getText();
        dqi dqi1 = super.j.a.c();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_424;
        }
        doj = porcelaincarditem.getTextStyle();
        drf = doj;
        if (((PorcelainText) (obj)).getLineCount() > 0)
        {
            drf = dqi1.a(((PorcelainText) (obj)).getLine(0));
            com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font font = com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.b;
            k.a(drf);
            drf = doj;
            if (((PorcelainText) (obj)).getLineCount() >= 2)
            {
                CharSequence charsequence = dqi1.a(((PorcelainText) (obj)).getLine(1));
                drf = com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.c;
                k.b(charsequence);
                drf = doj;
                if (((PorcelainText) (obj)).getLineCount() >= 3)
                {
                    obj = dqi1.a(((PorcelainText) (obj)).getLine(2));
                    drf = com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.d;
                    k.c(((CharSequence) (obj)));
                    drf = doj;
                    if (!charsequence.toString().trim().isEmpty())
                    {
                        drf = doj;
                        if (!((CharSequence) (obj)).toString().trim().isEmpty())
                        {
                            drf = com.spotify.mobile.android.porcelain.item.PorcelainCardItem.TextStyle.c;
                        }
                    }
                }
            }
        }
        doj = k;
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.porcelain.item.PorcelainCardItem.TextStyle.values().length];
                try
                {
                    a[com.spotify.mobile.android.porcelain.item.PorcelainCardItem.TextStyle.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.porcelain.item.PorcelainCardItem.TextStyle.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.porcelain.item.PorcelainCardItem.TextStyle.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[drf.ordinal()];
        JVM INSTR tableswitch 1 3: default 288
    //                   1 312
    //                   2 410
    //                   3 417;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new AssertionError((new StringBuilder("Unrecognised style ")).append(drf).toString());
_L2:
        drf = com.spotify.android.paste.widget.CardView.CardTextType.a;
_L5:
        doj.a(drf);
_L6:
        k.b(super.j.a.a().a(porcelaincarditem.getPlayable()));
        boolean flag = b(porcelaincarditem.getLink(), porcelaincarditem.getPlayable());
        k.setFocusable(flag);
        k.setClickable(flag);
        drf = k;
        if (porcelaincarditem.getLongClickLink() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        drf.setLongClickable(flag);
        return;
_L3:
        drf = com.spotify.android.paste.widget.CardView.CardTextType.b;
          goto _L5
_L4:
        drf = com.spotify.android.paste.widget.CardView.CardTextType.c;
          goto _L5
        k.c();
          goto _L6
    }

    public final void onClick(View view)
    {
        a(((PorcelainCardItem)w()).getLink(), ((PorcelainCardItem)w()).getPlayable());
    }

    public final boolean onLongClick(View view)
    {
        return a(((PorcelainCardItem)w()).getLongClickLink(), null);
    }
}
