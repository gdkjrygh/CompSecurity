// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.roidapp.imagelib.crop.CropImageView;

// Referenced classes of package com.roidapp.photogrid.release:
//            al, BackgroundImageCrop

final class ai extends Handler
{

    final BackgroundImageCrop a;

    ai(BackgroundImageCrop backgroundimagecrop)
    {
        a = backgroundimagecrop;
        super();
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        case 2: // '\002'
        case 4: // '\004'
        default:
            return;

        case 0: // '\0'
            (new Thread(new al(a, BackgroundImageCrop.a(a), message.arg2))).start();
            return;

        case 1: // '\001'
            if (message.obj != null)
            {
                BackgroundImageCrop.a(a, (Bitmap)message.obj);
                BackgroundImageCrop.c(a).setImageBitmap(BackgroundImageCrop.b(a));
                BackgroundImageCrop.c(a).a(BackgroundImageCrop.b(a));
                BackgroundImageCrop.c(a).invalidate();
                BackgroundImageCrop.d(a);
                BackgroundImageCrop.e(a);
                return;
            } else
            {
                a.a((Throwable)message.obj, "");
                return;
            }

        case 3: // '\003'
            message = (Uri)message.obj;
            a.a(message.getPath());
            BackgroundImageCrop.f(a);
            return;

        case 5: // '\005'
            a.a((Throwable)message.obj, "");
            return;
        }
    }
}
