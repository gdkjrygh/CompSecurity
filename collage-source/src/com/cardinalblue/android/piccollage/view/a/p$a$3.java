// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.request.b.j;
import com.bumptech.glide.request.e;
import com.cardinalblue.android.piccollage.a.f;
import java.io.File;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            p

class b
    implements e
{

    final View a;
    final ImageView b;
    final a c;

    public boolean a(Bitmap bitmap, File file, j j, boolean flag, boolean flag1)
    {
        a.setVisibility(8);
        bitmap = b.getLayoutParams();
        bitmap.height = -2;
        b.setLayoutParams(bitmap);
        return false;
    }

    public boolean a(Exception exception, File file, j j, boolean flag)
    {
        f.a(exception);
        return false;
    }

    public volatile boolean a(Exception exception, Object obj, j j, boolean flag)
    {
        return a(exception, (File)obj, j, flag);
    }

    public volatile boolean a(Object obj, Object obj1, j j, boolean flag, boolean flag1)
    {
        return a((Bitmap)obj, (File)obj1, j, flag, flag1);
    }

    ( , View view, ImageView imageview)
    {
        c = ;
        a = view;
        b = imageview;
        super();
    }
}
