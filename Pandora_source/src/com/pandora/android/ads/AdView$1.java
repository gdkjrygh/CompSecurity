// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.view.View;
import com.pandora.android.util.s;

// Referenced classes of package com.pandora.android.ads:
//            AdView

class a
    implements android.view.cusChangeListener
{

    final AdView a;

    public void onFocusChange(View view, boolean flag)
    {
        if (!flag)
        {
            s.a(a.getContext(), a.a);
        }
    }

    stener(AdView adview)
    {
        a = adview;
        super();
    }
}
