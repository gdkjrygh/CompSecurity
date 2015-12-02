// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.maps;

import android.graphics.drawable.Drawable;
import com.google.android.maps.OverlayItem;

// Referenced classes of package com.facebook.maps:
//            l

class i extends OverlayItem
{

    private boolean a;
    private l b;

    public void a()
    {
        a = true;
        b.a();
    }

    public void b()
    {
        a = false;
        b.b();
    }

    public Drawable getMarker(int j)
    {
        boolean flag;
        if ((j & 4) != 0 || (j & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !a)
        {
            return super.getMarker(0);
        } else
        {
            return super.getMarker(j);
        }
    }
}
