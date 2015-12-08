// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.g.b.d;
import com.bumptech.glide.load.resource.a.b;
import com.roidapp.cloudlib.ah;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            t, FbFriendListActivity

final class u extends d
{

    final t b;

    u(t t1, ImageView imageview)
    {
        b = t1;
        super(imageview);
    }

    public final void a(b b1, com.bumptech.glide.g.a.d d1)
    {
        super.a(b1, d1);
        com.roidapp.cloudlib.facebook.FbFriendListActivity.d(b.a).remove(e());
        b.a.a.sendEmptyMessage(8481);
    }

    public final void a(Exception exception, Drawable drawable)
    {
        super.a(exception, drawable);
        com.roidapp.cloudlib.facebook.FbFriendListActivity.d(b.a).remove(e());
        b.a.a.sendEmptyMessage(8481);
    }

    public final volatile void a(Object obj, com.bumptech.glide.g.a.d d1)
    {
        a((b)obj, d1);
    }

    public final void b(Drawable drawable)
    {
        super.b(drawable);
        com.roidapp.cloudlib.facebook.FbFriendListActivity.d(b.a).remove(e());
        b.a.a.sendEmptyMessage(8481);
    }

    public final void c(Drawable drawable)
    {
        super.c(drawable);
        com.roidapp.cloudlib.facebook.FbFriendListActivity.d(b.a).add(e());
        b.a.a.sendEmptyMessage(8480);
    }
}
