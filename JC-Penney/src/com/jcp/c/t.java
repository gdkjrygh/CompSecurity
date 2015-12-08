// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.maps.g;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.e;

// Referenced classes of package com.jcp.c:
//            s

class t
    implements g
{

    final s a;

    t(s s1)
    {
        a = s1;
        super();
    }

    public boolean a(e e1)
    {
        e1 = e1.a();
        e1 = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("geo:").append(((LatLng) (e1)).a).append(",").append(((LatLng) (e1)).b).toString()));
        e1.setPackage("com.google.android.apps.maps");
        s.a(a).startActivity(e1);
        return false;
    }
}
