// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.view.View;
import com.pandora.android.activity.a;

// Referenced classes of package com.pandora.android.ads:
//            AdView

class a
    implements android.view.ickListener
{

    final AdView a;

    public void onClick(View view)
    {
        com.pandora.android.activity.a.a(AdView.b(a).D(), a.g);
    }

    (AdView adview)
    {
        a = adview;
        super();
    }
}
