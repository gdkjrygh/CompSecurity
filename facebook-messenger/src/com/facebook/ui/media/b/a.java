// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.debug.log.b;
import com.facebook.http.protocol.ab;
import com.facebook.http.protocol.ad;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.d;
import com.facebook.ui.media.attachments.g;
import com.google.common.base.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

// Referenced classes of package com.facebook.ui.media.b:
//            b

public class a
{

    private final Class a = com/facebook/ui/media/b/a;
    private final Context b;
    private final com.facebook.ui.images.a.a c;
    private final com.facebook.a.a d;
    private final com.facebook.common.executors.a e;
    private final d f;

    public a(Context context, com.facebook.ui.images.a.a a1, com.facebook.a.a a2, com.facebook.common.executors.a a3, d d1)
    {
        b = context;
        c = a1;
        d = a2;
        e = a3;
        f = d1;
    }

    private Bitmap a(com.facebook.ui.media.attachments.a a1, int i)
    {
        a1 = c.a(a1, i);
        if (a1 == null)
        {
            com.facebook.debug.log.b.b(a, "Unable to read the original bitmap");
        }
        return a1;
    }

    public ab a(com.facebook.ui.media.attachments.a a1)
    {
        File file;
        switch (b.a[a1.a().c().ordinal()])
        {
        default:
            com.facebook.debug.log.b.b(a, "Unexpected attachment type");
            return null;

        case 1: // '\001'
            return new ad(new File(a1.a().f()), "image/jpeg", a1.a().j());

        case 2: // '\002'
            return new ad(new File(a1.a().d().getPath()), "video/3gpp", (new StringBuilder()).append(System.currentTimeMillis()).append(".3gp").toString());

        case 3: // '\003'
            file = new File(a1.a().d().getPath());
            break;
        }
        a1 = (new StringBuilder()).append(System.currentTimeMillis()).append("-").append(a1.a().g()).toString();
        return new ad(file, "audio/MPEG", (new StringBuilder()).append("audioclip-").append(a1).append(".mp4").toString());
    }

    public void a(MediaResource mediaresource, File file)
    {
        boolean flag;
        if (mediaresource.c() == g.PHOTO)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "The mediaResource is not of type photo");
        mediaresource = f.b(mediaresource);
        if (mediaresource != null)
        {
            WindowManager windowmanager = (WindowManager)b.getSystemService("window");
            int i = windowmanager.getDefaultDisplay().getWidth();
            i = (int)(1.1000000000000001D * (double)Math.max(windowmanager.getDefaultDisplay().getHeight(), i));
            mediaresource = a(((com.facebook.ui.media.attachments.a) (mediaresource)), i);
            if (mediaresource != null)
            {
                mediaresource = d.a(mediaresource, i);
                file = new FileOutputStream(file);
                mediaresource.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, file);
                file.flush();
                file.close();
                return;
            }
        }
    }

    public byte[] a(com.facebook.ui.media.attachments.a a1, int i, int j, int k)
    {
        Bitmap bitmap1;
        int l;
        bitmap1 = c.a(a1, i, j);
        a1 = null;
        l = 0;
_L4:
label0:
        {
label1:
            {
                {
                    if (l >= 4)
                    {
                        break label1;
                    }
                    Bitmap bitmap;
                    int i1;
                    int j1;
                    boolean flag;
                    if (bitmap1.getHeight() > j || bitmap1.getWidth() > i)
                    {
                        bitmap = d.a(bitmap1, i, j);
                    } else
                    {
                        bitmap = bitmap1;
                    }
                    i1 = -1;
                    i = 95;
                    j = 0x7fffffff;
                }
                if (i != i1)
                {
                    a1 = new ByteArrayOutputStream();
                    flag = bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i, a1);
                    j = a1.size();
                    if (j == 0 || !flag)
                    {
                        return null;
                    }
                    if (j > k)
                    {
                        break label0;
                    }
                }
                if (j > k)
                {
                    break; /* Loop/switch isn't completed */
                }
            }
            if (a1 != null && a1.size() <= k)
            {
                return a1.toByteArray();
            } else
            {
                return null;
            }
        }
        j1 = Math.max(i - 10, 50);
        i1 = i;
        i = j1;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_63;
_L1:
        i = (int)(0.75D * (double)bitmap.getWidth());
        j = (int)(0.75D * (double)bitmap.getHeight());
        l++;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
