// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.dropbox;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.cloudlib.dropbox:
//            DropBoxPhotoFragment

final class i
    implements android.content.DialogInterface.OnClickListener
{

    final DropBoxPhotoFragment a;

    i(DropBoxPhotoFragment dropboxphotofragment)
    {
        a = dropboxphotofragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        a.h();
    }
}
