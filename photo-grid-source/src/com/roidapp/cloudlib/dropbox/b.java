// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.dropbox;

import com.bumptech.glide.load.a.c;
import com.dropbox.client2.DropboxAPI;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class b
    implements c
{

    private final DropboxAPI a;
    private final String b;

    public b(DropboxAPI dropboxapi, String s)
    {
        a = dropboxapi;
        b = s;
    }

    private InputStream d()
    {
        BufferedInputStream bufferedinputstream;
        try
        {
            bufferedinputstream = new BufferedInputStream(a.getThumbnailStream(b, com.dropbox.client2.DropboxAPI.ThumbSize.ICON_256x256, com.dropbox.client2.DropboxAPI.ThumbFormat.JPEG), 4096);
        }
        catch (Throwable throwable)
        {
            throw new IOException();
        }
        return bufferedinputstream;
    }

    public final Object a(int i)
    {
        return d();
    }

    public final void a()
    {
    }

    public final String b()
    {
        return b;
    }

    public final void c()
    {
    }
}
