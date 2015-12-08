// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;


// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            CoverImageActivity

final class a
    implements Runnable
{

    private CoverImageActivity a;

    public final void run()
    {
        a.finish();
    }

    A(CoverImageActivity coverimageactivity)
    {
        a = coverimageactivity;
        super();
    }
}
