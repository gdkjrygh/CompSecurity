// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.maps;


// Referenced classes of package com.facebook.maps:
//            MapImage

class p
    implements Runnable
{

    final MapImage a;

    p(MapImage mapimage)
    {
        a = mapimage;
        super();
    }

    public void run()
    {
        MapImage.a(a, false);
        MapImage.a(a);
    }
}
