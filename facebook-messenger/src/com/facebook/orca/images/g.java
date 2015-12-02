// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.images;

import android.os.Parcelable;
import com.facebook.zero.ui.k;

// Referenced classes of package com.facebook.orca.images:
//            ImageSearchActivity

class g
    implements k
{

    final ImageSearchActivity a;

    g(ImageSearchActivity imagesearchactivity)
    {
        a = imagesearchactivity;
        super();
    }

    public void a(Parcelable parcelable)
    {
    }

    public void b(Parcelable parcelable)
    {
        a.finish();
    }
}
