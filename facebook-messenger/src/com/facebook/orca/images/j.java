// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.images;

import android.net.Uri;
import com.facebook.orca.photos.picking.i;
import com.facebook.ui.media.attachments.MediaResource;
import java.io.File;

// Referenced classes of package com.facebook.orca.images:
//            ThreadIconPickerActivity

class j extends i
{

    final ThreadIconPickerActivity a;

    j(ThreadIconPickerActivity threadiconpickeractivity)
    {
        a = threadiconpickeractivity;
        super();
    }

    public void a()
    {
        a.finish();
    }

    public void a(MediaResource mediaresource)
    {
        mediaresource = new File(mediaresource.d().getPath());
        ThreadIconPickerActivity.a(a, mediaresource);
    }

    public void b()
    {
        a.finish();
    }

    public void c()
    {
        ThreadIconPickerActivity.a(a, null);
    }

    public void d()
    {
        a.finish();
    }
}
