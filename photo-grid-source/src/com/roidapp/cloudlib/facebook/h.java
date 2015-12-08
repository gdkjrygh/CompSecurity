// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            FbAlbumListActivity

final class h
    implements android.content.DialogInterface.OnClickListener
{

    final FbAlbumListActivity a;

    h(FbAlbumListActivity fbalbumlistactivity)
    {
        a = fbalbumlistactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        FbAlbumListActivity.d(a);
    }
}
