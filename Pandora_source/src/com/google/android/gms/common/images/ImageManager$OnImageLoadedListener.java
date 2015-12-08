// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager

public static interface 
{

    public abstract void onImageLoaded(Uri uri, Drawable drawable, boolean flag);
}
