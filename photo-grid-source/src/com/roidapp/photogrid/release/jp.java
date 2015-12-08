// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageSelector

final class jp
    implements Runnable
{

    final String a;
    final int b;
    final ImageSelector c;

    jp(ImageSelector imageselector, String s, int i)
    {
        c = imageselector;
        a = s;
        b = i;
        super();
    }

    public final void run()
    {
        c.a(5);
        c.b = (String[])ImageSelector.a(c, a).toArray(new String[0]);
        c.c = new int[c.b.length];
        c.a(90);
        Message message = Message.obtain();
        message.what = 11;
        message.arg1 = b;
        ImageSelector.f(c).sendMessage(message);
    }
}
