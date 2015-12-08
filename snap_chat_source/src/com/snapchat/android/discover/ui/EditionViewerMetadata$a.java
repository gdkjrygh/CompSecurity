// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;

import TU;
import android.net.Uri;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.discover.model.ChannelPage;

// Referenced classes of package com.snapchat.android.discover.ui:
//            EditionViewerMetadata

public static final class h
{

    public String a;
    public ChannelPage b;
    public String c;
    public MediaOpenOrigin d;
    public boolean e;
    public String f;
    public boolean g;
    public int h;
    public boolean i;
    public Uri j;
    public TU k;
    public int l;
    public int m;
    public int n;

    public final EditionViewerMetadata a()
    {
        return new EditionViewerMetadata(this, (byte)0);
    }

    public ()
    {
        d = MediaOpenOrigin.DISCOVER;
        h = -1;
    }
}
