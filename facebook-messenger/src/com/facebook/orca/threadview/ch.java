// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.net.Uri;
import com.facebook.orca.attachments.ImageAttachmentData;
import com.facebook.orca.photos.b.ab;
import com.facebook.orca.photos.b.w;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.widget.images.UrlImage;
import com.google.common.a.es;
import java.util.Iterator;

// Referenced classes of package com.facebook.orca.threadview:
//            cg, ThreadViewImageAttachmentView

class ch
    implements Runnable
{

    final w a;
    final cg b;

    ch(cg cg1, w w1)
    {
        b = cg1;
        a = w1;
        super();
    }

    public void run()
    {
        if (ThreadViewImageAttachmentView.c(b.a) != null && !ThreadViewImageAttachmentView.c(b.a).isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator;
        int i;
        iterator = ThreadViewImageAttachmentView.c(b.a).iterator();
        i = 0;
_L5:
        Object obj;
        while (iterator.hasNext()) 
        {
label0:
            {
                obj = (ImageAttachmentData)iterator.next();
                if (((ImageAttachmentData) (obj)).b().getScheme().equals("file"))
                {
                    break label0;
                }
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        UrlImage urlimage;
        obj = ((ImageAttachmentData) (obj)).b().getPath();
        obj = ((String) (obj)).substring(((String) (obj)).lastIndexOf("/"));
        urlimage = (UrlImage)b.a.getChildAt(i);
        i++;
        if (!((String) (obj)).equals(a.a.j())) goto _L1; else goto _L4
_L4:
        ThreadViewImageAttachmentView.d(b.a).a(a, urlimage.getUploadProgressBar(), urlimage.getUploadProgressCoverView());
          goto _L5
    }
}
