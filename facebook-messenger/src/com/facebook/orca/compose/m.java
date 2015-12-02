// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.net.Uri;
import android.view.View;
import com.facebook.i;
import com.facebook.orca.photos.b.ab;
import com.facebook.orca.photos.b.w;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.a;
import com.facebook.widget.images.UrlImage;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

// Referenced classes of package com.facebook.orca.compose:
//            l, ComposeAttachmentContainer

class m
    implements Runnable
{

    final w a;
    final l b;

    m(l l1, w w1)
    {
        b = l1;
        a = w1;
        super();
    }

    public void run()
    {
        Iterator iterator = com.facebook.orca.compose.ComposeAttachmentContainer.a(b.a).keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (a)iterator.next();
            if (((a) (obj)).a().d().equals(a.a.d()))
            {
                obj = (UrlImage)((View)com.facebook.orca.compose.ComposeAttachmentContainer.a(b.a).get(obj)).findViewById(i.composer_attachment_item_image);
                ComposeAttachmentContainer.b(b.a).a(a, ((UrlImage) (obj)).getUploadProgressBar(), ((UrlImage) (obj)).getUploadProgressCoverView());
            }
        } while (true);
    }
}
