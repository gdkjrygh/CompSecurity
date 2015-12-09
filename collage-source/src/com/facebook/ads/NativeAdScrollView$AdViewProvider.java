// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.view.View;

// Referenced classes of package com.facebook.ads:
//            NativeAdScrollView, NativeAd

public static interface 
{

    public abstract View createView(NativeAd nativead, int i);

    public abstract void destroyView(NativeAd nativead, View view);
}
