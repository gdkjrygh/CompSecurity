// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.pandora.android.activity.a;
import com.pandora.android.provider.b;
import com.pandora.radio.util.k;
import p.cw.c;

// Referenced classes of package com.pandora.android.view:
//            AudioAdViewPhone

class a
    implements android.view.r
{

    final AudioAdViewPhone a;

    public void onClick(View view)
    {
        b.a.b().o().a(com.pandora.radio.util._fld2, com.pandora.android.ads..(), null, new com.pandora.radio.data.b());
        com.pandora.android.activity.a.a((FragmentActivity)a.getContext());
    }

    (AudioAdViewPhone audioadviewphone)
    {
        a = audioadviewphone;
        super();
    }
}
