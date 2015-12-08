// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;


// Referenced classes of package com.pandora.android.view:
//            EcoGalleryAdapterView

private class <init>
    implements Runnable
{

    final EcoGalleryAdapterView a;

    public void run()
    {
        if (a.v)
        {
            if (a.getAdapter() != null)
            {
                a.post(this);
            }
            return;
        } else
        {
            EcoGalleryAdapterView.b(a);
            return;
        }
    }

    private (EcoGalleryAdapterView ecogalleryadapterview)
    {
        a = ecogalleryadapterview;
        super();
    }

    a(EcoGalleryAdapterView ecogalleryadapterview, a a1)
    {
        this(ecogalleryadapterview);
    }
}
