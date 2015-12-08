// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import com.jcp.b.b;
import com.jcp.c.ad;

// Referenced classes of package com.jcp.fragments:
//            fw, SavedCardFragment

class fx
    implements android.view.View.OnClickListener
{

    final String a;
    final fw b;

    fx(fw fw1, String s)
    {
        b = fw1;
        a = s;
        super();
    }

    public void onClick(View view)
    {
        com.jcp.fragments.SavedCardFragment.b(b.b, true);
        SavedCardFragment.a(b.b, ad.a(a), com.jcp.b.b.i(a));
    }
}
