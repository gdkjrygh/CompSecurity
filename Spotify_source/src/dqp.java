// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.mobile.android.porcelain.item.PorcelainCellItem;
import com.spotify.mobile.android.porcelain.subitem.PorcelainText;

final class dqp extends dqo
{

    dqp(ViewGroup viewgroup, doh doh)
    {
        super(dhv.c(viewgroup.getContext(), viewgroup), com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.a, doh, (byte)0);
    }

    final void a(dih dih, PorcelainText porcelaintext, dqi dqi1)
    {
        dih = (dhx)dih;
        if (porcelaintext != null && porcelaintext.getLineCount() > 0)
        {
            dqi1.a(dih.a(), porcelaintext.getLine(0), com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.b);
            return;
        } else
        {
            dih.a().setText("");
            return;
        }
    }

    public final volatile void a(drf drf, doj doj)
    {
        super.a((PorcelainCellItem)drf);
    }
}
