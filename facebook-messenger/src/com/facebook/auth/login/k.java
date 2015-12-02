// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.view.View;
import android.view.animation.Animation;
import com.facebook.widget.b.a;

// Referenced classes of package com.facebook.auth.login:
//            j, g, AuthFragmentLogoViewGroup

class k extends a
{

    final j a;

    k(j j1)
    {
        a = j1;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        AuthFragmentLogoViewGroup.access$400(a.b.a).setVisibility(8);
        AuthFragmentLogoViewGroup.access$300(a.b.a).setVisibility(0);
    }
}
