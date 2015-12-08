// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;


// Referenced classes of package com.accuweather.android.utilities:
//            BackgroundImages

public static interface Q
{

    public abstract void onAllImagesLoaded();

    public abstract void onImageLoadError(Exception exception);

    public abstract void onSingleImageLoaded(long l, long l1);
}
