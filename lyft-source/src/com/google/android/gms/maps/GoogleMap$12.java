// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.zzi;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMap

class l.zzi extends com.google.android.gms.maps.internal.ClickListener
{

    final nfoWindowClickListener a;

    public void a(zzi zzi)
    {
        a.a(new Marker(zzi));
    }
}
