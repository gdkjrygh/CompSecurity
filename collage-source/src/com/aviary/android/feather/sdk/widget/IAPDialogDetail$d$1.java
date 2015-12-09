// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.widget.ImageView;
import it.sephiroth.android.library.picasso.c;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            IAPDialogDetail

class b
    implements c
{

    final ImageView a;
    final int b;
    final b c;

    public void a()
    {
        a.setTag(Integer.valueOf(b));
    }

    public void b()
    {
    }

    ( , ImageView imageview, int i)
    {
        c = ;
        a = imageview;
        b = i;
        super();
    }
}
