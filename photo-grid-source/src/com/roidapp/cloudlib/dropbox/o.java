// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.dropbox;

import java.util.Comparator;

// Referenced classes of package com.roidapp.cloudlib.dropbox:
//            n

final class o
    implements Comparator
{

    final n a;

    o(n n)
    {
        a = n;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (com.dropbox.client2.DropboxAPI.Entry)obj;
        obj1 = (com.dropbox.client2.DropboxAPI.Entry)obj1;
        if (((com.dropbox.client2.DropboxAPI.Entry) (obj)).isDir && !((com.dropbox.client2.DropboxAPI.Entry) (obj1)).isDir)
        {
            return -1;
        }
        if (!((com.dropbox.client2.DropboxAPI.Entry) (obj)).isDir && ((com.dropbox.client2.DropboxAPI.Entry) (obj1)).isDir)
        {
            return 1;
        }
        boolean flag;
        if (((com.dropbox.client2.DropboxAPI.Entry) (obj)).isDir)
        {
            flag = ((com.dropbox.client2.DropboxAPI.Entry) (obj1)).isDir;
        }
        return ((com.dropbox.client2.DropboxAPI.Entry) (obj)).path.compareToIgnoreCase(((com.dropbox.client2.DropboxAPI.Entry) (obj1)).path);
    }
}
