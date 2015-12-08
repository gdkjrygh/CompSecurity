// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.model.CameraPosition;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bq, cb, bp

final class a
    implements a
{

    private CameraPosition a;
    private bq b;

    public final void a(bp bp1, int i, cb cb1)
    {
        cb1.b(B);
        bp1.a(a, i);
    }

    public final String toString()
    {
        String s = String.valueOf(B);
        return (new StringBuilder(String.valueOf(s).length() + 0)).append(s).toString();
    }

    eraPosition(bq bq1, CameraPosition cameraposition)
    {
        b = bq1;
        a = cameraposition;
        super();
    }
}
