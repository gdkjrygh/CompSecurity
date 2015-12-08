// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.tinder.c:
//            n

final class <init>
    implements android.support.v4.view.Pager.g
{

    final n a;

    public final void transformPage(View view, float f)
    {
        int i = view.getWidth();
        if (f <= 1.0F)
        {
            ImageView imageview = (ImageView)view.findViewById(0x7f0e01b8);
            TextView textview = (TextView)view.findViewById(0x7f0e01ba);
            view = (TextView)view.findViewById(0x7f0e01bb);
            imageview.setTranslationX((float)((double)f * ((double)i / 1.5D)));
            textview.setTranslationX((float)(i / 1) * f);
            view.setTranslationX((float)((double)f * ((double)i / 0.5D)));
        }
    }

    (n n1)
    {
        a = n1;
        super();
    }
}
