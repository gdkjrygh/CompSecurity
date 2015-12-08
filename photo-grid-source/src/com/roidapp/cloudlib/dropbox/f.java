// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.dropbox;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.roidapp.cloudlib.ad;

// Referenced classes of package com.roidapp.cloudlib.dropbox:
//            DropBoxPhotoFragment

final class f
    implements Runnable
{

    final DropBoxPhotoFragment a;

    f(DropBoxPhotoFragment dropboxphotofragment)
    {
        a = dropboxphotofragment;
        super();
    }

    public final void run()
    {
        String s = DropBoxPhotoFragment.g(a).b(DropBoxPhotoFragment.f(a));
        if (!TextUtils.isEmpty(s))
        {
            Message message = DropBoxPhotoFragment.h(a).obtainMessage();
            message.what = 0;
            message.obj = s;
            DropBoxPhotoFragment.h(a).sendMessage(message);
        }
    }
}
