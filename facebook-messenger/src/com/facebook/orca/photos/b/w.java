// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.b;

import com.facebook.c.a.a;
import com.facebook.ui.media.attachments.MediaResource;

public class w
    implements a
{

    public final MediaResource a;
    public final int b;
    public final boolean c;

    public w(MediaResource mediaresource, int i)
    {
        this(mediaresource, i, false);
    }

    private w(MediaResource mediaresource, int i, boolean flag)
    {
        a = mediaresource;
        b = i;
        c = flag;
    }

    public w(MediaResource mediaresource, boolean flag)
    {
        this(mediaresource, 0, flag);
    }
}
