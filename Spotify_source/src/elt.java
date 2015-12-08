// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import com.spotify.android.paste.widget.CardView;

public final class elt
{

    public static CardView a(Context context)
    {
        CardView cardview = new CardView(context);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0F);
        int i = context.getResources().getDimensionPixelSize(0x7f0c008c);
        layoutparams.leftMargin = i;
        layoutparams.rightMargin = i;
        cardview.setLayoutParams(layoutparams);
        return cardview;
    }
}
