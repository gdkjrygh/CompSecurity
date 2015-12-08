// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;


// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AviaryAdapterView

private class <init>
    implements Runnable
{

    final AviaryAdapterView a;

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
            a.f();
            return;
        }
    }

    private (AviaryAdapterView aviaryadapterview)
    {
        a = aviaryadapterview;
        super();
    }

    a(AviaryAdapterView aviaryadapterview, a a1)
    {
        this(aviaryadapterview);
    }
}
