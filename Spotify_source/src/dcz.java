// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.glue.molecules.card.CardAppearance;
import com.spotify.android.glue.molecules.card.glue.CardView;

public final class dcz
    implements dcv, dcw
{

    private final CardView a;

    dcz(View view, CardAppearance cardappearance)
    {
        a = (CardView)view;
        view = a;
        com.spotify.android.glue.molecules.card.glue.CardView._cls1.a[cardappearance.ordinal()];
        JVM INSTR tableswitch 1 3: default 52
    //                   1 76
    //                   2 90
    //                   3 130;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unsupported CardAppearance: ")).append(cardappearance).toString());
_L2:
        ((CardView) (view)).b.setVisibility(8);
_L6:
        dfe.a(view);
        return;
_L3:
        dgo.a(view.getContext(), ((CardView) (view)).b, 0x7f0b015a);
        ((CardView) (view)).b.setTextColor(view.getResources().getColor(0x7f0f00f7));
        ((CardView) (view)).b.setVisibility(0);
        continue; /* Loop/switch isn't completed */
_L4:
        dgo.a(view.getContext(), ((CardView) (view)).b, 0x7f0b0161);
        ((CardView) (view)).b.setTextColor(view.getResources().getColor(0x7f0f00f7));
        ((CardView) (view)).b.setVisibility(0);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final View a()
    {
        return a;
    }

    public final void a(String s)
    {
        a.a(s);
    }

    public final void b()
    {
        CardView cardview = a;
        cardview.a.setImageResource(0);
        cardview.a("");
        cardview.b("");
        cardview.a(false);
    }

    public final void b(String s)
    {
        a.b(s);
    }

    public final ImageView c()
    {
        return a.a;
    }
}
