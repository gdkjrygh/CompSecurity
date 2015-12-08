// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoView

final class pk
    implements android.content.DialogInterface.OnClickListener
{

    final PhotoView a;

    pk(PhotoView photoview)
    {
        a = photoview;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a = false;
    }
}
