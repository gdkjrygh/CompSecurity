// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.TextView;
import com.spotify.mobile.android.porcelain.item.PorcelainCellItem;
import com.spotify.mobile.android.porcelain.subitem.PorcelainText;

final class dqq extends dqo
{

    dqq(dhu dhu, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize imagesize, doh doh)
    {
        super(dhu, imagesize, doh, (byte)0);
    }

    final void a(dih dih, PorcelainText porcelaintext, dqi dqi1)
    {
        dih = (dib)dih;
        if (porcelaintext != null && porcelaintext.getLineCount() > 0)
        {
            dqi1.a(dih.a(), porcelaintext.getLine(0), com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.b);
            if (porcelaintext.getLineCount() > 1)
            {
                dqi1.a(dih.b(), porcelaintext.getLine(1), com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.c);
                dih.b().setVisibility(0);
                return;
            } else
            {
                dih.b().setVisibility(8);
                return;
            }
        } else
        {
            dih.a().setText("");
            dih.b().setText("");
            return;
        }
    }

    public final volatile void a(drf drf, doj doj)
    {
        super.a((PorcelainCellItem)drf);
    }
}
