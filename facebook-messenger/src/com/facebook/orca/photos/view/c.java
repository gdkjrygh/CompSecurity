// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.view;

import android.content.Context;
import com.facebook.i;
import com.facebook.k;
import com.facebook.ui.images.b.m;
import com.facebook.ui.images.b.o;
import com.facebook.ui.images.cache.e;
import com.facebook.ui.images.cache.g;
import com.facebook.widget.f;
import com.facebook.widget.images.UrlImage;

// Referenced classes of package com.facebook.orca.photos.view:
//            b

public class c extends f
{

    private UrlImage a;
    private e b;

    public c(Context context)
    {
        super(context);
        a(context);
    }

    private void a(Context context)
    {
        b = e.newBuilder().a(true).a(com.facebook.ui.images.cache.f.MinScaleNonPowerOfTwo).d();
        setContentView(k.orca_photo_message_item);
        a = (UrlImage)getView(i.photo_image);
    }

    public void setPhotoMessageItem(b b1)
    {
        a.setImageParams(m.a(b1.a()).a(b).a());
    }
}
