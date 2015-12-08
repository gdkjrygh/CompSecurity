// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageEditor

final class iw
    implements Runnable
{

    final View a;
    final ImageEditor b;

    iw(ImageEditor imageeditor, View view)
    {
        b = imageeditor;
        a = view;
        super();
    }

    public final void run()
    {
        if (ImageEditor.b(b, a))
        {
            ImageEditor.c(b, a);
            Message message = Message.obtain();
            message.what = ImageEditor.z();
            message.obj = a;
            b.h.sendMessage(message);
            return;
        } else
        {
            ImageEditor.a(b, 164);
            b.h.sendEmptyMessage(ImageEditor.i());
            return;
        }
    }
}
