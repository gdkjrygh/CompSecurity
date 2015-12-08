// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;


// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            CropImageView

class a
    implements Runnable
{

    final CropImageView a;

    public void run()
    {
        a.a(a.c, a.getAspectRatioIsFixed());
    }

    (CropImageView cropimageview)
    {
        a = cropimageview;
        super();
    }
}
