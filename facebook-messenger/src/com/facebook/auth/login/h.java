// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.view.View;

// Referenced classes of package com.facebook.auth.login:
//            g, AuthFragmentLogoViewGroup

class h
    implements android.view.View.OnClickListener
{

    final g a;

    h(g g1)
    {
        a = g1;
        super();
    }

    public void onClick(View view)
    {
        a.a.onHelpClick();
    }
}
