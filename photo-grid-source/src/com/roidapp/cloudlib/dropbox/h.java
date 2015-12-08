// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.dropbox;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.roidapp.cloudlib.dropbox:
//            DropBoxPhotoFragment

final class h extends Handler
{

    final DropBoxPhotoFragment a;

    h(DropBoxPhotoFragment dropboxphotofragment)
    {
        a = dropboxphotofragment;
        super();
    }

    public final void dispatchMessage(Message message)
    {
        DropBoxPhotoFragment.a(a, (String)message.obj);
    }
}
