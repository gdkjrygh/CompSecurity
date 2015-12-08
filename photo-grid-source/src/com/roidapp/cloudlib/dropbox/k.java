// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.dropbox;

import com.dropbox.client2.DropboxAPI;
import com.dropbox.client2.exception.DropboxException;
import com.roidapp.cloudlib.common.a;

// Referenced classes of package com.roidapp.cloudlib.dropbox:
//            DropBoxPhotoFragment

final class k
    implements Runnable
{

    final DropBoxPhotoFragment a;

    k(DropBoxPhotoFragment dropboxphotofragment)
    {
        a = dropboxphotofragment;
        super();
    }

    public final void run()
    {
        String s;
        try
        {
            s = DropBoxPhotoFragment.i(a).accountInfo().displayName;
        }
        catch (DropboxException dropboxexception)
        {
            dropboxexception.printStackTrace();
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        com.roidapp.cloudlib.common.a.d(a.getActivity(), s);
    }
}
