// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.instagram;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.cloudlib.instagram:
//            InstagramPhotoFragment

final class n
    implements android.content.DialogInterface.OnClickListener
{

    final InstagramPhotoFragment a;

    n(InstagramPhotoFragment instagramphotofragment)
    {
        a = instagramphotofragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        InstagramPhotoFragment.a(a);
    }
}
