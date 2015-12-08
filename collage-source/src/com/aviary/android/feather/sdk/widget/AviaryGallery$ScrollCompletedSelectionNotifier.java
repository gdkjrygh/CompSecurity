// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;


// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AviaryGallery

private class <init>
    implements Runnable
{

    final AviaryGallery a;

    public void run()
    {
        if (a.A)
        {
            if (a.getAdapter() != null)
            {
                a.post(this);
            }
            return;
        } else
        {
            AviaryGallery.b(a);
            return;
        }
    }

    private (AviaryGallery aviarygallery)
    {
        a = aviarygallery;
        super();
    }

    a(AviaryGallery aviarygallery, a a1)
    {
        this(aviarygallery);
    }
}
